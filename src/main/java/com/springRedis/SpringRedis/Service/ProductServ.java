package com.springRedis.SpringRedis.Service;

import com.springRedis.SpringRedis.dto.ProductDTO;
import com.springRedis.SpringRedis.entity.Products;
import com.springRedis.SpringRedis.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServ {

    @Autowired
    private ProductRepo productRepo;

    public Products createProduct(ProductDTO productDTO)
    {
        Products products=new Products();
        products.setDiscount(productDTO.getDiscount());
        products.setName(productDTO.getName());
        products.setType(productDTO.getType());
        products.setPrice(productDTO.getPrice());
        products.setQty(productDTO.getQty());
        productRepo.save(products);
        return products;

    }
    public List<Products> getAll()
    {
        return productRepo.findAll();

    }

    public Products updateProduct(Long id,ProductDTO productDTO)
    {
        Products products=productRepo.findById(id).orElseThrow(()->new RuntimeException("No Such product"));
        products.setDiscount(productDTO.getDiscount());
        products.setName(productDTO.getName());
        products.setType(productDTO.getType());
        products.setPrice(productDTO.getPrice());
        products.setQty(productDTO.getQty());

        productRepo.save(products);
        return products;
    }

    public Products getProduct(Long id)
    {
        Products products=productRepo.findById(id).orElseThrow(()->new RuntimeException("No Such product"));

        return products;
    }

    public void deleteProduct(Long id)
    {

        Products products=productRepo.findById(id).orElseThrow(()->new RuntimeException("No Such product"));
        productRepo.delete(products);
    }

}
