package com.example.unimagdalena.bicycleRental.common.mappers;

import com.example.unimagdalena.bicycleRental.data.entities.Usuario;
import com.example.unimagdalena.bicycleRental.web.models.UsuarioResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper MAPPER = Mappers.getMapper(UsuarioMapper.class);

    UsuarioResponse toUsuarioResponse(Usuario usuarioEntity);

}