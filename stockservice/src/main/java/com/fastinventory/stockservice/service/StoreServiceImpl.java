package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.exception.ResourceNotFoundException;
import com.fastinventory.stockservice.model.Store;
import com.fastinventory.stockservice.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("StoreServiceImpl")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public Store getStoreById(Long StoreId) {
        return storeRepository.findById(StoreId).orElseThrow(() -> new ResourceNotFoundException("Store", "Id", StoreId));
    }

    @Override
    public Store createStore(Store Store) {
        return storeRepository.save(Store);
    }

    @Override
    public Store updateStore(Long StoreId, Store StoreRequest) {
        Store store = storeRepository.findById(StoreId)
                .orElseThrow(() -> new ResourceNotFoundException("Store", "Id", StoreId));
        store.setName(StoreRequest.getName());
        store.setLocation(StoreRequest.getLocation());
        store.setPhone(StoreRequest.getPhone());
        return storeRepository.save(store);
    }

    @Override
    public ResponseEntity<?> deleteStore(Long StoreId) {
        Store store = storeRepository.findById(StoreId)
                .orElseThrow(() -> new ResourceNotFoundException("Store", "Id", StoreId));
        storeRepository.delete(store);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }
}
