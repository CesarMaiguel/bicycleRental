package com.example.unimagdalena.bicycleRental.service.implementations;

import com.example.unimagdalena.bicycleRental.common.mappers.RutaMapper;
import com.example.unimagdalena.bicycleRental.data.repository.RutaRepository;
import com.example.unimagdalena.bicycleRental.service.interfaz.RutaService;
import com.example.unimagdalena.bicycleRental.web.models.RutasResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class RutaServiceImpl implements RutaService {

    private final RutaRepository rutaRepository;

    @Override
    public List<RutasResponse> getAllRutas() {
        return rutaRepository.findAll()
                .stream()
                .map(RutaMapper.MAPPER::toRutaResponse)
                .toList();
    }
}
