package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.model.Store;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StoreService {
    Store getStoreById(Long StoreId);
    Store createStore(Store Store);
    Store updateStore(Long StoreId, Store StoreRequest);
    ResponseEntity<?> deleteStore(Long StoreId);
    List<Store> getAllStores();
}
