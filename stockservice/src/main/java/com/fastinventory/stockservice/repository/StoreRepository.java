package com.fastinventory.stockservice.repository;

import com.fastinventory.stockservice.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
