package com.example.unimagdalena.bicycleRental.service.implementations;

import com.example.unimagdalena.bicycleRental.common.mappers.UsuarioMapper;
import com.example.unimagdalena.bicycleRental.data.repository.UsuarioRepository;
import com.example.unimagdalena.bicycleRental.service.interfaz.UsuarioService;
import com.example.unimagdalena.bicycleRental.web.models.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioResponse> getAllUsers() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper.MAPPER::toUsuarioResponse)
                .toList();
    }
}
