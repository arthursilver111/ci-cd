package com.example.prodcuts.service.mapper;

import com.example.prodcuts.dto.request.ProductRequestDto;
import com.example.prodcuts.dto.response.ProductResponseDto;
import com.example.prodcuts.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements DtoMapper<Product, ProductResponseDto, ProductRequestDto> {

    @Override
    public Product mapToModel(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setPrice(productRequestDto.getPrice());
        product.setTitle(productRequestDto.getTitle());
        return product;
    }

    @Override
    public ProductResponseDto mapToDto(Product product) {
        ProductResponseDto responseProductDto = new ProductResponseDto();
        responseProductDto.setId(product.getId());
        responseProductDto.setTitle(product.getTitle());
        responseProductDto.setPrice(product.getPrice());
        return responseProductDto;
    }
}
