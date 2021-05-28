package com.sanket.stockmgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.stockmgr.model.Distributors;
import com.sanket.stockmgr.service.DistributorService;

@RestController
@RequestMapping("/distributor")
public class DistributorController{
	
	@Autowired
	DistributorService distService;
	
	@GetMapping("/getAllDistributors")
	public List<Distributors> getAllDistributors() throws Exception {
		System.out.println("Entering into getAllDistributors controller method");
		try {
			return distService.getAllDistributors();
		} catch (Exception e) {
			System.out.println("Exception in getAllDistributors method "+e);
			return null;
		}
		
	}
	
	@GetMapping(path ="/getDistributor/{distId}")
	public Distributors getDistributor(@PathVariable("distId") int distId) {
		System.out.println("Entering into getDistributor controller method with distId Id "+distId);
		try {
			return distService.getDistributor(distId);
		} catch (Exception e) {
			System.out.println("Exception in getDistributor controller method "+e);
			return null;
		}
		
	}

}
