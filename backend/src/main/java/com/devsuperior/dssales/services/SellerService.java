package com.devsuperior.dssales.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dssales.dto.SellerDTO;
import com.devsuperior.dssales.entities.Seller;
import com.devsuperior.dssales.repositories.SellerRepository;

@Service // Turn the class a component
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		
	}
}
