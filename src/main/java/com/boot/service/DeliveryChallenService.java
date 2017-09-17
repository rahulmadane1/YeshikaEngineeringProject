package com.boot.service;


import java.util.List;


import com.boot.model.DeliveryChallan;


public interface DeliveryChallenService {
	
	DeliveryChallan findById(Long id);

	DeliveryChallan findByName(String name);

	DeliveryChallan savedeliverychallen(DeliveryChallan delivery_challen);

	void updateinvoice(DeliveryChallan delivery_challen);

	void deleteinvoiceById(Integer id);

	void deleteAllinvoice();

	List<DeliveryChallan> findAllinvoice();

	boolean isdeliverychallenExist(DeliveryChallan delivery_challen);

}

