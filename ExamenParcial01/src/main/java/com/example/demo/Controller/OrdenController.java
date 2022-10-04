package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.OrdenService;

@RestController
@RequestMapping("/api/orden")
public class OrdenController {
	@Autowired
	private OrdenService perser;
	
	@GetMapping("/all01")
	public List<Map<String, Object>> readAll2(){
		return perser.readAll2();
	}
	

}
