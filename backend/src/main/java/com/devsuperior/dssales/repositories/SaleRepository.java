package com.devsuperior.dssales.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dssales.dto.SaleSuccessDTO;
import com.devsuperior.dssales.dto.SaleSumDTO;
import com.devsuperior.dssales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	//JPQL from JPA
	@Query("SELECT new com.devsuperior.dssales.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller") 
	List<SaleSumDTO> amountGroupedBySeller();
	
	
	@Query("SELECT new com.devsuperior.dssales.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller") 
	List<SaleSuccessDTO> successGroupedBySeller();
	
	
	
}
