package com.devsuperior.dssales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssales.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
