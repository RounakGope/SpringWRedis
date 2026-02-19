package com.springRedis.SpringRedis.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private BigDecimal price;
    private String type;
    private Integer qty;
    private Double discount;


}
