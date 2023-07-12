package com.example.prodcuts.service;

import org.springframework.data.domain.PageRequest;

public interface SortParserService {
    PageRequest createPageRequest(Integer count, Integer page, String sortBy);
}
