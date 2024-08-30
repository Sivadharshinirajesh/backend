package com.day1demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/users")
	public String getUsers() {
		return "Hi Spring boot";
	}
	
    @GetMapping("/name")
    public String getName() {
	   return"Sivadharshini";
}
    
    @GetMapping("/age")
    public int getAge() {
	   return 22;
}
    @GetMapping("/siva")
    public Map<String,String> getSiva(){
    Map<String,String>siva=new HashMap<>();
    siva.put("Name","Sivadharshini");
    siva.put("Age", "22");
    siva.put("Address", "chennai");
    siva.put("d.o.b", "22");
    siva.remove("Address");
    return siva;
    }
    @GetMapping("/mark")
    public int addmark(@RequestParam("a")int op1,@RequestParam("b")int op2) {
    	return op1+op2;
    	
    }
    @GetMapping("/string")
    public String addstring(@RequestParam("c")String op3,@RequestParam("d")String op4) {
    	return op3+op4;
    }
    @GetMapping("/sub")
    public int addsub(@RequestParam("a")int op5,@RequestParam("b")int op6) {
    	return op5-op6;
    }
    @GetMapping ("/multi/{a}/{b}")
    public int multi(@PathVariable("a")int op7,@PathVariable("b")int op8) {
    	return op7*op8;
    }
    @GetMapping("/div")
    public int div(@RequestParam("a")int op9,@RequestParam("b")int op10) {
    	return op9/op10;
    }
}
