package com.sanket.stockmgr.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.stockmgr.Repository.BillRepository;
import com.sanket.stockmgr.model.Bill;
import com.sanket.stockmgr.service.BillService;

@Service
public class BillServiceImpl implements BillService
{
	@Autowired
	BillRepository billRepo;

	@Override
	public Bill saveBill(Bill bill) throws Exception {
		return billRepo.save(bill);
	}

	@Override
	public List<Bill> getAllBills() throws Exception {
		return billRepo.findAll();
	}

	@Override
	public Bill getBill(int billId) throws Exception {
		return billRepo.findById(billId).get();
	}

	@Override
	public Bill updateBill(Bill bill) throws Exception {
		return billRepo.save(bill);
	}

	@Override
	public void deleteBill(int billId) throws Exception {
		 billRepo.deleteById(billId);
	}
 
}
