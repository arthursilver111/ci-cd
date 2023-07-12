package com.example.prodcuts.service;

import java.math.BigDecimal;
import java.util.List;
import com.example.prodcuts.model.Product;
import org.springframework.data.domain.PageRequest;

public interface ProductService extends AbstractService<Product> {
    List<Product> findAll(PageRequest pageRequest);

    List<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to, PageRequest pageRequest);
}
