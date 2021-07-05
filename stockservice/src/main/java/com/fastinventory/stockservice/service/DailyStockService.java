package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.model.DailyStock;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DailyStockService {
    DailyStock getDailyStockById(Long dailyStockId);
    DailyStock createDailyStock(DailyStock dailyStock);
    DailyStock updateDailyStock(Long dailyStockId, DailyStock dailyStockRequest);
    ResponseEntity<?> deleteDailyStock(Long dailyStockId);
    List<DailyStock> getAllDailyStocks();
}
