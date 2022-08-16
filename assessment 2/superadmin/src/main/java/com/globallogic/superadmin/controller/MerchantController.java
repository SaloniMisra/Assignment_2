package com.globallogic.superadmin.controller;
import java.util.List;

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

import com.globallogic.superadmin.model.Merchant;
import com.globallogic.superadmin.repo.MerchantRepo;



@RestController
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	MerchantRepo  merRepo;
	
	@GetMapping("/")
	public List<Merchant> getMer()
	{
		return merRepo.findAll();
	}
	
	@PostMapping("/")
	public List<Merchant> saveMer(@RequestBody Merchant mer)
	{
		merRepo.save(mer);
		return merRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Merchant> updateMer(@RequestBody Merchant mer)
	{
		merRepo.save(mer);
		return merRepo.findAll();
	}
	
	@DeleteMapping("/{mid}")
	public List<Merchant> deleteMer(@PathVariable("mid") int id)
	{
		merRepo.deleteById(id);
		return merRepo.findAll();
	}
	
	
}
