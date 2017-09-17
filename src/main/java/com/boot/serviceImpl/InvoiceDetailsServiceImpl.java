package com.boot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.InvoiceDetails;
import com.boot.repository.InvoiceDetailsRepository;
import com.boot.service.InvoiceDetailsService;

@Service
public class InvoiceDetailsServiceImpl implements InvoiceDetailsService {
	
	@Autowired
	InvoiceDetailsRepository invoiceDetailsRepository;

	@Override
	public InvoiceDetails findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceDetails findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceDetails saveinvoicedetail(InvoiceDetails invoiceDetails) {
		// TODO Auto-generated method stub
		return invoiceDetailsRepository.save(invoiceDetails);
	}

	@Override
	public void updateinvoice(InvoiceDetails invoiceDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteinvoiceById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllinvoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InvoiceDetails> findAllinvoice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isinvoiceExist(InvoiceDetails invoiceDetails) {
		// TODO Auto-generated method stub
		return false;
	} 

}