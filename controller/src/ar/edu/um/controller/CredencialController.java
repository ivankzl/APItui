package ar.edu.um.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.um.model.Credencial;
import ar.edu.um.service.ICredencialService;


@RestController
public class CredencialController {

    @RequestMapping("/credenciales")
    public List<Credencial> personas() {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ICredencialService creSrvice = (ICredencialService) context.getBean("credencialService");
    	
    	return null;

    }
    
    
    
}
