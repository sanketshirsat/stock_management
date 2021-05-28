package com.sanket.stockmgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.stockmgr.model.Bill;
import com.sanket.stockmgr.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {

	@Autowired
	BillService billserve;
	
	@PostMapping("/save")
	public Bill savebill(@RequestBody Bill bill) {
		System.out.println("Entering into savebill controller method with bill "+bill.toString());
		try {
			return billserve.saveBill(bill);
		} catch (Exception e) {
			System.out.println("Exception in savebill method "+e);
			return null;
		}
	}
	
	@GetMapping("/getAllBills")
	public List<Bill> getAllBills() throws Exception {
		System.out.println("Entering into getAllbills controller method");
		try {
			return billserve.getAllBills();
		} catch (Exception e) {
			System.out.println("Exception in getAllbills method "+e);
			return null;
		}
		
	}
	
	@GetMapping(path ="/getBill/{billId}")
	public Bill getBill(@PathVariable("billId") int billId) {
		System.out.println("Entering into getBill controller method with bill Id "+billId);
		try {
			return billserve.getBill(billId);
		} catch (Exception e) {
			System.out.println("Exception in getbill controller method "+e);
			return null;
		}
		
	}
	
	@PutMapping(path="/update/{billId}")
	public Bill updateBill(@PathVariable("billId")int billId,@RequestBody Bill bill) {
		System.out.println("Entering into updatebill controller method with bill Id "+billId);
		try {
			return billserve.updateBill(bill);
		} catch (Exception e) {
			System.out.println("Exception in updatebill controller method "+e);
			return null;
		}
		
	}
	
	@DeleteMapping(path="/delete/{billId}")
	public void deleteBill(@PathVariable("billId")int billId) {
		 
		 System.out.println("Entering into deletebill controller method with bill Id "+billId);
			try {
				billserve.deleteBill(billId);
			} catch (Exception e) {
				System.out.println("Exception in deletebill controller method "+e);
			}
			
		 
	}
}
