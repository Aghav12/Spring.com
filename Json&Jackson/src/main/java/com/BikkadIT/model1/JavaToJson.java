package com.BikkadIT.model1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		Student st = new Student();
		st.setSid(1);
		st.setSname("Rohit");
		st.setSage(30);
		st.setSrank(5);
		System.out.println(st);
		
		ObjectMapper objectMapper =new ObjectMapper();
		String string = objectMapper.writeValueAsString(st);
		System.out.println(string);
	}
}
