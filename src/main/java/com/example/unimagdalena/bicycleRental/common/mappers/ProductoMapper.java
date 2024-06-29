package com.example.unimagdalena.bicycleRental.common.mappers;

import com.example.unimagdalena.bicycleRental.data.entities.Producto;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductoMapper {

    ProductoMapper MAPPER = Mappers.getMapper(ProductoMapper.class);

    ProductoResponse toProductoResponse(Producto productoEntity);

}