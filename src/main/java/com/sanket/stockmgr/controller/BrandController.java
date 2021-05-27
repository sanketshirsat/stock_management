package com.sanket.stockmgr.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.stockmgr.Repository.BrandRepository;
import com.sanket.stockmgr.model.Brand;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	BrandRepository brandRepo;
	
	
	@PostMapping("/save")
	public Brand saveBrand(@RequestBody Brand brand) {
		return brandRepo.save(brand);
	}
	
	@GetMapping("/getAllBrands")
	public List<Brand> getAllBrands() {
		return brandRepo.findAll();
	}
	
	@GetMapping(path ="/getBrand/{brandId}")
	public Brand getBrand(@PathVariable("brandId") int brandId) {
		System.out.println("Inside getBrand with pathprarm "+brandId);
		return brandRepo.findById(brandId).get();
	}
	
	@PutMapping(path="/update/{brandId}")
	public Brand updateBrand(@PathVariable("brandId")int brandId,@RequestBody Brand brand) {
		System.out.println(brand.toString());
		return brandRepo.save(brand);
	}
	
	@DeleteMapping(path="/delete/{brandId}")
	public void deleteBrand(@PathVariable("brandId")int brandId) {
		 brandRepo.deleteById(brandId);
		 
	}
}
