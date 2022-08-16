package com.globallogic.superadmin.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.superadmin.repo.MerchantRepo;
import com.globallogic.superadmin.repo.ProductRepo;
import com.globallogic.superadmin.model.Product;
import com.globallogic.superadmin.repo.*;

@RestController
@RequestMapping("/product")
public class HomeController {

	@Autowired
	ProductRepo prodRepo;
	
	@Autowired
	MerchantRepo deptRepo;
	
	@Autowired
	CategoryRepo catRepo;
	
	@Autowired
	CustomerRepo custRepo;
	

	@GetMapping("/")
	public List<Product> showDetails()
	{		
		return prodRepo.findAll();	
	}

	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product  prod)
	{

		prodRepo.save(prod);
		System.err.println(prod);
		return prod;
	}
	@GetMapping("/prod/{name}")
	public List<String> showProductByCategoryName(@PathVariable("name") String cName){
		
		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);
		
		List<Product> prodName = prod.stream().filter(e -> (e.getCat().getCname()).equalsIgnoreCase(cName)).collect(Collectors.toList());
		
		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for(Product pro : prodName ) {
			name.add(pro.getPname());
		}
		return name;	
	}
	
	
}
