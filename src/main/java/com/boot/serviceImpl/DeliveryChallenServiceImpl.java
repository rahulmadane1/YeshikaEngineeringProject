package com.boot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.DeliveryChallan;
import com.boot.repository.DeliveryChallenRepository;
import com.boot.service.DeliveryChallenService;

@Service
public class DeliveryChallenServiceImpl implements DeliveryChallenService {

	@Autowired
	DeliveryChallenRepository deliveryChallenRepository;

	@Override
	public DeliveryChallan findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryChallan findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryChallan savedeliverychallen(DeliveryChallan delivery_challen) {
		// TODO Auto-generated method stub
		return deliveryChallenRepository.save(delivery_challen);
	}

	@Override
	public void updateinvoice(DeliveryChallan delivery_challen) {
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
	public List<DeliveryChallan> findAllinvoice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isdeliverychallenExist(DeliveryChallan delivery_challen) {
		// TODO Auto-generated method stub
		return false;
	}

}
