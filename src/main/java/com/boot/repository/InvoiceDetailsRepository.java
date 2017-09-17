package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.InvoiceDetails;

public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetails, Integer> {

}
