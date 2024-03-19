package com.BikkadIT.model;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonToJava {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		Gson gson = new Gson();
		Student fromJson = gson.fromJson(new FileReader("Student.json"), Student.class);
		System.out.println(fromJson);
	}
}
