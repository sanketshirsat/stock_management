package com.sanket.stockmgr.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.stockmgr.Repository.DistributorRepository;
import com.sanket.stockmgr.model.Distributors;
import com.sanket.stockmgr.service.DistributorService;

@Service
public class DistributorServiceImpl implements DistributorService {

	@Autowired
	DistributorRepository distRepo;
	
	@Override
	public List<Distributors> getAllDistributors() throws Exception {
		return distRepo.findAll();
	}

	@Override
	public Distributors getDistributor(int brandId) throws Exception {
		return distRepo.findById(brandId).get();
	}

}
