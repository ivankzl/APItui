package ar.edu.um.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Credencial;
import ar.edu.um.model.Persona;
import ar.edu.um.service.ICredencialService;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

	/*
	 * Trae una persona determinada
	 * 
	 * http://orion2.atica.um.es/serviciosTUI/welcome/5901000000000120
	 * Probar con
	 * 
	 * http://localhost:8080/welcome/4517660104006712
	 */
	@RequestMapping(value = "/welcome/{cre_numero}", method = RequestMethod.GET)
	public RespuestaJSON findCredencial(@PathVariable("cre_numero") BigDecimal cre_numero) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonaService perService = (IPersonaService) context.getBean("personaService");
		ICredencialService creService = (ICredencialService) context.getBean("credencialService");
		
		Credencial credencial = creService.findCredencialByCreNumero(cre_numero);
		System.out.println("cre_per_id de credencial = " + credencial.getCre_per_id());
		Persona persona = perService.findPersonaByPerID(credencial.getCre_per_id());
		
		Content content = new Content();
		content.setLogin_id(persona.getPer_Nombre());
		content.setName(persona.getPer_Nombre() + " " + persona.getPer_Apellido());
		content.setPhoto("url-foto");
		content.setRoles("r1");
		
		RespuestaJSON respuesta = new RespuestaJSON();
		respuesta.setContent(content);
		respuesta.setStatus("200");
	
		return respuesta;

	}
 
}
