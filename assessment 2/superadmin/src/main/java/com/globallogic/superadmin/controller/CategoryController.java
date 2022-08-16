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

import com.globallogic.superadmin.model.Category;
import com.globallogic.superadmin.repo.CategoryRepo;


@RestController
@RequestMapping("/category")
public class CategoryController {

	
	@Autowired
	CategoryRepo  catRepo;
	
	@GetMapping("/")
	public List<Category> getCat()
	{
		return catRepo.findAll();
	}
	
	@PostMapping("/")
	public List<Category> saveCat(@RequestBody Category cat)
	{
		catRepo.save(cat);
		return catRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Category> updateCat(@RequestBody Category cat)
	{
		catRepo.save(cat);
		return catRepo.findAll();
	}
	
	@DeleteMapping("/{cid}")
	public List<Category> deleteCat(@PathVariable("cid") int id)
	{
		catRepo.deleteById(id);
		return catRepo.findAll();
	}
	

	
}
