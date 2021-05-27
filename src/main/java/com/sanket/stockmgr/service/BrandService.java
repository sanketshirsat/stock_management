package com.sanket.stockmgr.service;

import java.util.List;

import com.sanket.stockmgr.model.Brand;

public interface BrandService {
	
	Brand saveBrand(Brand brand) throws Exception;
	List<Brand> getAllBrands() throws Exception;
	Brand getBrand(int brandId) throws Exception;
	Brand updateBrand(Brand brand) throws Exception;
	void deleteBrand(int brandId) throws Exception;

}
