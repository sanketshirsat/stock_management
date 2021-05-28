package com.sanket.stockmgr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.stockmgr.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
