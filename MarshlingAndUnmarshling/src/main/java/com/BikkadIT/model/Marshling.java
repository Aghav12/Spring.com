package com.BikkadIT.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Marshling {

	public static void main(String[] args) throws JAXBException {
		
		Student st = new Student();
		st.setStudentId(111);
		st.setStudentName("Santosh");
		st.setStudentRank(1);
		st.setStudentAge(30);
		System.out.println(st);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(st, System.out);
	}
}
