package com.springRedis.SpringRedis.Controller;

import com.springRedis.SpringRedis.Service.ProductServ;
import com.springRedis.SpringRedis.dto.ProductDTO;
import com.springRedis.SpringRedis.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProdController {

    @Autowired
    private ProductServ productServ;
    @GetMapping("/{id}")
    public ResponseEntity<Long> get1(@PathVariable Long id)
    {

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(id);

    }

    @PostMapping("/create")
    public ResponseEntity<Products> create(@RequestBody ProductDTO products)
    {
       com.springRedis.SpringRedis.entity.Products product = productServ.createProduct(products);
       return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(product);

    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Products> get(@PathVariable Long id)
    {

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(productServ.getProduct(id));

    }
    @GetMapping("/get")
    public ResponseEntity<List<Products>> get2()
    {

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(productServ.getAll());

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id)
    {
        productServ.deleteProduct(id);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body("Successfully deleted");

    }


}
