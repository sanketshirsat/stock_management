package com.sanket.stockmgr.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.stockmgr.Repository.BrandRepository;
import com.sanket.stockmgr.model.Brand;
import com.sanket.stockmgr.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	BrandRepository brandRepo;
	
	@Override
	public Brand saveBrand(Brand brand) throws Exception {
		return brandRepo.save(brand);
	}

	@Override
	public List<Brand> getAllBrands() throws Exception {
		return brandRepo.findAll();
	}

	@Override
	public Brand getBrand(int brandId) throws Exception {
		return brandRepo.findById(brandId).get();
	}

	@Override
	public Brand updateBrand(Brand brand) throws Exception {
		return brandRepo.save(brand);
	}

	@Override
	public void deleteBrand(int brandId) throws Exception {
		brandRepo.deleteById(brandId);
	}


}
