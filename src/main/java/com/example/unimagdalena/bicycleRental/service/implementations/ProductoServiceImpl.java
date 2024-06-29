package com.example.unimagdalena.bicycleRental.service.implementations;

import com.example.unimagdalena.bicycleRental.common.mappers.ProductoMapper;
import com.example.unimagdalena.bicycleRental.data.repository.ProductoRepository;
import com.example.unimagdalena.bicycleRental.service.interfaz.ProductoService;
import com.example.unimagdalena.bicycleRental.web.models.ProductoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<ProductoResponse> getAllProducts() {
        return productoRepository.findAll()
                .stream()
                .map(ProductoMapper.MAPPER::toProductoResponse)
                .toList();
    }
}
