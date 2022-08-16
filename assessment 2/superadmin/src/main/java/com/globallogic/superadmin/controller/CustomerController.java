package com.globallogic.superadmin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.superadmin.model.Customer;
import com.globallogic.superadmin.repo.CustomerRepo;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerRepo  custRepo;
	
	@GetMapping("/")
	public List<Customer> getCust()
	{
		return custRepo.findAll();
	}
	
	@PostMapping("/")
	public List<Customer> saveCust(@RequestBody Customer cust)
	{
		custRepo.save(cust);
		return custRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Customer> updateCust(@RequestBody Customer cust)
	{
		custRepo.save(cust);
		return custRepo.findAll();
	}
	
	@DeleteMapping("/{custid}")
	public List<Customer> deleteCust(@PathVariable("custid") int id)
	{
		custRepo.deleteById(id);
		return custRepo.findAll();
	}
}
