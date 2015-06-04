package ar.edu.um.controller;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Aluleg;
import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;
import ar.edu.um.model.Facultad;
import ar.edu.um.model.Persona;
import ar.edu.um.service.IAlulegService;
import ar.edu.um.service.ICredencialService;
import ar.edu.um.service.IDomicilioService;
import ar.edu.um.service.IFacultadService;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

	/** 
	 *Este método recibe como parámetro el número de credencial de la persona, que se encuentra en la 
	 *tarjeta de débito. Mientras esté en localhost, se puede probar con la siguiente credencial:
	 *http://localhost:8080/welcome/4517660104006712
	 **/
	@RequestMapping(value = "/welcome/{cre_numero}", method = RequestMethod.GET)
	public RespuestaJSON findCredencial(@PathVariable("cre_numero") BigDecimal cre_numero) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		ICredencialService creService = (ICredencialService) context.getBean("credencialService");
		
		Credencial credencial = creService.findCredencialByCreNumero(cre_numero);
		System.out.println("cre_per_id de credencial = " + credencial.getCre_per_id());
		Persona persona = perService.findPersonaByPerID(credencial.getCre_per_id());
		
		IDomicilioService domService = (IDomicilioService) context.getBean("domicilioService");
		Domicilio domicilio = domService.findDomicilioByPerID(persona.getPer_ID());
		
		Content content = new Content();
		content.setLogin_id(domicilio.getDom_e_mail());
		content.setName(persona.getPer_Nombre() + " " + persona.getPer_Apellido());
		content.setPhoto("http://um.edu.ar/cursos/resources/images/marca.png");
		content.setRoles("r1");
		
		RespuestaJSON respuesta = new RespuestaJSON();
		respuesta.setContent(content);
		respuesta.setStatus("200");
	
		return respuesta;

	}
	
	/** 
	 *
	 **/
	@RequestMapping(value = "/get_user_info/{cre_numero}", method = RequestMethod.GET)
	public RespuestaJSONUserInfo getUserInfo(@PathVariable("cre_numero") BigDecimal cre_numero){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		ICredencialService creService = (ICredencialService) context.getBean("credencialService");
		
		Credencial credencial = creService.findCredencialByCreNumero(cre_numero);
		System.out.println("cre_per_id de credencial = " + credencial.getCre_per_id());
		//DE ACA SACO EL USER_ID, NOMBRE, APELLIDO
		Persona persona = perService.findPersonaByPerID(credencial.getCre_per_id());
		
		//EMAIL, TELEFONO, sacarlo del domicilio
		IDomicilioService domService = (IDomicilioService) context.getBean("domicilioService");
		Domicilio domicilio = domService.findDomicilioByPerID(persona.getPer_ID());
		
		
		IAlulegService aluService = (IAlulegService) context.getBean("alulegService");
		Aluleg aluleg = aluService.findFacultadByPerID(persona.getPer_ID());
		//ID DE LA CARRERA
		//aluleg.getALe_Car_ID();
		
		IFacultadService facuService = (IFacultadService) context.getBean("facultadService");
		Facultad facultad = facuService.findFacultadByID(aluleg.getALe_Car_ID());
		
		//content.setRlation ("alumno")
		//content.setRoles("r1");
		//STATUS ->ojo, no hay
		//content.setstatus("inventado")
		
		ContentUserInfo content = new ContentUserInfo();
		content.setUser_id(persona.getPer_ID());
		content.setEmail(domicilio.getDom_e_mail());
		content.setTlf(domicilio.getDom_Telefono());
		content.setName(persona.getPer_Nombre());
		content.setSurname(persona.getPer_Apellido());
		content.setPhoto("http://um.edu.ar/cursos/resources/images/marca.png");
		content.setAdmin_unit(facultad.getFac_Nombre());
		//RELATION ->ojo, no tenemos si es alumno o administrativo o prof...
		content.setRelation("alumnno");
		//ROLES ->ojo, no tenemos roles en la bd
		content.setRoles("r1");
		//STATUS ->ojo, no tenemos status en la bd
		content.setStatus("activo");
		
		RespuestaJSONUserInfo respuesta = new RespuestaJSONUserInfo();
		respuesta.setContent(content);
		respuesta.setStatus("200");
		
		return respuesta;
		
	}
 
}
