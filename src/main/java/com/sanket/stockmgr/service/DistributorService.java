package com.sanket.stockmgr.service;

import java.util.List;

import com.sanket.stockmgr.model.Distributors;

public interface DistributorService {

	List<Distributors> getAllDistributors() throws Exception;
	Distributors getDistributor(int brandId) throws Exception;
	
}
