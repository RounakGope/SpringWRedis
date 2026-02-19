package com.springRedis.SpringRedis.repository;

import com.springRedis.SpringRedis.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long> {
}
