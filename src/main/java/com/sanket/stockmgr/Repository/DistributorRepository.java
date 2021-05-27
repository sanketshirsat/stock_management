package com.sanket.stockmgr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.stockmgr.model.Distributors;

public interface DistributorRepository extends JpaRepository<Distributors, Integer>{

}
