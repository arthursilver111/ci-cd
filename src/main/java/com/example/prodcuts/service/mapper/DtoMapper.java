package com.example.prodcuts.service.mapper;

public interface DtoMapper<P, D, T> {
    P mapToModel(T requestDto);

    D mapToDto(P model);
}
