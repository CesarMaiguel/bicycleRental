package com.example.unimagdalena.bicycleRental.common.mappers;

import com.example.unimagdalena.bicycleRental.data.entities.Ruta;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RutaMapper {

    RutaMapper MAPPER = Mappers.getMapper(RutaMapper.class);

    RutasResponse toRutaResponse(Ruta rutaEntity);

}