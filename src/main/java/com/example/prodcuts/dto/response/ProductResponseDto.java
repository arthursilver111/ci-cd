package com.example.prodcuts.dto.response;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
}
