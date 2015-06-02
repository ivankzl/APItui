package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Persona;
import ar.edu.um.service.IPersonaService;

@RestController
public class PersonaController {

    
  	/* Trae una persona determinada 
  	 * 
  	 * http://orion2.atica.um.es/serviciosTUI/welcome/5901000000000120*/
  	 @RequestMapping(value = "/welcome/{id}", method = RequestMethod.GET)
  	 public Persona findPersonaByCredencial(@PathVariable("id") int id) {
  		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  		 IPersonaService perService = (IPersonaService) context.getBean("personaService");
  		 Persona persona = new Persona();
  		 
  	     return persona;

  	 }
  	 
  	 /*login*/
 /*	 @RequestMapping(value = "/login/{login_id}/{password}", method = RequestMethod.GET)
  	 public Persona acess(@PathVariable("login_id") int login_id, @PathVariable("password") String password ) {
  		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  		 IPersonaService perService = (IPersonaService) context.getBean("personaService");
  		 Persona persona = perService.getPersona(id);
  		 
  	     return persona;

  	 }
  	 
 */ 	 
}
