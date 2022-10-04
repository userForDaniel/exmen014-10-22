package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductoService;
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	@Autowired
	private ProductoService prod;
	@GetMapping("/all01")
	public List<Map<String, Object>> readAll2(){
		return prod.readAll2();
	}

}
