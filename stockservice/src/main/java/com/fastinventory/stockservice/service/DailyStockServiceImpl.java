package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.model.DailyStock;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DailyStockServiceImpl")
public class DailyStockServiceImpl implements DailyStockService {
    @Override
    public DailyStock getDailyStockById(Long dailyStockId) {
        return null;
    }

    @Override
    public DailyStock createDailyStock(DailyStock dailyStock) {
        return null;
    }

    @Override
    public DailyStock updateDailyStock(Long dailyStockId, DailyStock dailyStockRequest) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteDailyStock(Long dailyStockId) {
        return null;
    }

    @Override
    public List<DailyStock> getAllDailyStocks() {
        return null;
    }
}
