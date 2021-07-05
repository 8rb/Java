package com.fastinventory.stockservice.repository;

import com.fastinventory.stockservice.model.DailyStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyStockRepository extends JpaRepository<DailyStock, Long> {
}
