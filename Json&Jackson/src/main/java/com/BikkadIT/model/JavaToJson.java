package com.BikkadIT.model;

import com.google.gson.Gson;

public class JavaToJson {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setSid(111);
		st.setSname("Santosh");
		st.setSage(30);
		st.setSrank(1);
		System.out.println(st);
		
		Gson gson = new Gson();
		String json = gson.toJson(st);
		System.out.println(json);
	}
}
