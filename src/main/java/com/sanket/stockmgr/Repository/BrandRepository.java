package com.sanket.stockmgr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.stockmgr.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
