package com.sanket.stockmgr.service;

import java.util.List;

import com.sanket.stockmgr.model.Bill;

public interface BillService {

	Bill saveBill(Bill bill) throws Exception;
	List<Bill> getAllBills() throws Exception;
	Bill getBill(int billId) throws Exception;
	Bill updateBill(Bill bill) throws Exception;
	void deleteBill(int billId) throws Exception;
}
