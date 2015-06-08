package ar.edu.um.controller;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Aluleg;
import ar.edu.um.model.Content;
import ar.edu.um.model.ContentTuiList;
import ar.edu.um.model.ContentUserInfo;
import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;
import ar.edu.um.model.Facultad;
import ar.edu.um.model.Persona;
import ar.edu.um.model.RespuestaJSON;
import ar.edu.um.model.RespuestaJSONTuiList;
import ar.edu.um.model.RespuestaJSONUserInfo;
import ar.edu.um.model.TuiList;
import ar.edu.um.service.IAlulegService;
import ar.edu.um.service.ICredencialService;
import ar.edu.um.service.IDomicilioService;
import ar.edu.um.service.IFacultadService;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

	/** 
	 * Url: http://<base_url>/welcome/user_id/
	   Devuelve: Json con los siguientes atributos:
       ▪ status: <status code>
       ▪ content
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
	 * Parámetros:
	 * ▪ login_id (GET) Identificador del usuario para el acceso a servicios privados.
	 * ▪password (GET) Contraseña de la cuenta de usuario.
	 * Url: https://<base_url>/login/login_id/password
	 * Devuelve: Json con los siguientes atributos:
	 * ▪ status: <status code>
	 * ▪ session_token: Token de sesión para el acceso a los métodos privados
	 * 
	 **/
//<<<<<<< HEAD
	//@RequestMapping(value = "/login/{login_id}/{password}", method = RequestMethod.GET)
	//public RespuestaJSONLogin login(@PathVariable("login_id") String login_id, @PathVariable("password") String password){
	//	RespuestaJSONLogin respuesta;// = validarLogin(login_id, password);

		//return respuesta;
	//}
//=======
	/*
	@RequestMapping(value = "/login/{login_id}/{password}", method = RequestMethod.GET)
	public RespuestaJSONLogin login(@PathVariable("login_id") String login_id, @PathVariable("password") String password){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		RespuestaJSONLogin respuesta = perService.validarLogin(login_id, password);
		
		return respuesta;
	}
	*/
//>>>>>>> 24e13898f82db340655c556306e611e54a046803
	
	
	/** 
	 * Parámetros:
	 * ▪ user_id (GET) Identificador del usuario para el acceso a servicios privados.
	 * Url: https://<base_url>/get_user_info/user_id
	 * Devuelve: Json con los siguientes atributos:
	 * ▪ status: <status code>
	 * ▪ content: Json con los atributos: user_id, email, tlf, name, surname, photo, admin_unit, relation, roles, status.
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
		Facultad facultad = facuService.findFacultadByID(aluleg.getALe_Fac_ID());
		System.out.println("aluleg = " + aluleg);
		System.out.println("facultad = " + facultad);
		
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
	
	/** 
	 * Parámetros:
	 * ▪ user_id (GET) Identificador del usuario para el acceso a servicios privados.
	 * Url: https://<base_url>/get_tui_list/user_id
	 * Devuelve: Json con los siguientes atributos:
	 * ▪ status: <status code>
	 * ▪ content: Json con los atributos: bookings.Bookings: tui_id, status, delivery_date, delivery place_coordinates, delivery_place_name, expiration_date
	 * 
	 **/
	
	@RequestMapping(value = "/get_tui_list/{cre_numero}", method = RequestMethod.GET)
	public RespuestaJSONTuiList getTuiList(@PathVariable("cre_numero") BigDecimal cre_numero){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICredencialService creService = (ICredencialService) context.getBean("credencialService");
		
		Credencial credencial = creService.findCredencialByCreNumero(cre_numero);
		
		ContentTuiList content = new ContentTuiList();
		TuiList tuiList = new TuiList();
		
		tuiList.setUser_id(cre_numero);
		tuiList.setStatus(credencial.getCre_estado());
		//de aca en mas esta todo hardcodeado. Deberíamos agregar campos a  la BD
		tuiList.setDelivery_date("2014/05/05");
		tuiList.setDelivery_place_coordinates("30.0226560, -1.1744329");
		tuiList.setDelivery_place_name("Tesorería");
		tuiList.setExpiration_date("2017/05/05");
		
		content.setTuiList(tuiList);
		
		RespuestaJSONTuiList respuesta = new RespuestaJSONTuiList();
		respuesta.setContent(content);
		respuesta.setStatus("200");
		return respuesta;
	}
 
}
