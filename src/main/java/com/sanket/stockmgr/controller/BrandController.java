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
import org.springframework.web.bind.annotation.RestController;
import com.sanket.stockmgr.model.Brand;
import com.sanket.stockmgr.service.serviceImpl.BrandServiceImpl;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	BrandServiceImpl brandService;
	
	
	@PostMapping("/save")
	public Brand saveBrand(@RequestBody Brand brand) {
		System.out.println("Entering into saveBrand controller method with brand "+brand.toString());
		try {
			return brandService.saveBrand(brand);
		} catch (Exception e) {
			System.out.println("Exception in saveBrand method "+e);
			return null;
		}
	}
	
	@GetMapping("/getAllBrands")
	public List<Brand> getAllBrands() throws Exception {
		System.out.println("Entering into getAllBrands controller method");
		try {
			return brandService.getAllBrands();
		} catch (Exception e) {
			System.out.println("Exception in getAllBrands method "+e);
			return null;
		}
		
	}
	
	@GetMapping(path ="/getBrand/{brandId}")
	public Brand getBrand(@PathVariable("brandId") int brandId) {
		System.out.println("Entering into getBrand controller method with brand Id "+brandId);
		try {
			return brandService.getBrand(brandId);
		} catch (Exception e) {
			System.out.println("Exception in getBrand controller method "+e);
			return null;
		}
		
	}
	
	@PutMapping(path="/update/{brandId}")
	public Brand updateBrand(@PathVariable("brandId")int brandId,@RequestBody Brand brand) {
		System.out.println("Entering into updateBrand controller method with brand Id "+brandId);
		try {
			return brandService.updateBrand(brand);
		} catch (Exception e) {
			System.out.println("Exception in updateBrand controller method "+e);
			return null;
		}
		
	}
	
	@DeleteMapping(path="/delete/{brandId}")
	public void deleteBrand(@PathVariable("brandId")int brandId) {
		 
		 System.out.println("Entering into deleteBrand controller method with brand Id "+brandId);
			try {
			    brandService.deleteBrand(brandId);
			} catch (Exception e) {
				System.out.println("Exception in deleteBrand controller method "+e);
			}
			
		 
	}
}
