package com.m2i.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EleveJDBCTemplate eleveJdbcTemplate = (EleveJDBCTemplate)context.getBean("eleveJdbcTemplate");
		
		System.out.println("----------------- Création -----------------");
		eleveJdbcTemplate.create("Anaïs", 21);
		eleveJdbcTemplate.create("Pierjean", 22);
		eleveJdbcTemplate.create("Cinna", 23);
		eleveJdbcTemplate.create("Aurélien", 5);
		
		System.out.println("----------------- Liste des élèves -----------------");
		List<Eleve>eleves = eleveJdbcTemplate.listEleves();
		for(Eleve record:eleves){
			System.out.println("ID : " + record.getId());
			System.out.println("Nom : " + record.getNom());
			System.out.println("Age : " + record.getAge());
		}
		
		System.out.println("----------------- Mise à jour -----------------");
		eleveJdbcTemplate.update(2, 33);
		
		System.out.println("----------------- Liste des élèves mis à jour -----------------");
		Eleve eleve = eleveJdbcTemplate.getEleve(2);
		System.out.println("Nom : " + eleve.getNom());
		System.out.println("Age : " + eleve.getAge());
		
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(HelloM2iConfig.class);
//		HelloM2i helloM2i = context.getBean(HelloM2i.class);
//		helloM2i.setMessage("Hello M2i");
//		helloM2i.getMessage();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
//		textEditor.spellChecker();
		
//		HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld");
//		obj1.getMessage1();
//		obj1.getMessage2();
		
		
//		HelloPoec obj2 = (HelloPoec)context.getBean("helloPoec");
//		obj2.getMessage1();
//		obj2.getMessage2();
//		obj2.getMessage3();
		// ((AbstractApplicationContext) context).registerShutdownHook();
		
		
	}
}
