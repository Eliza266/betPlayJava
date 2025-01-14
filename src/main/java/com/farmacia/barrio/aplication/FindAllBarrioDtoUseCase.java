package com.farmacia.barrio.aplication;

import java.util.List;

import com.farmacia.barrio.domain.emtity.BarrioDto;
import com.farmacia.barrio.domain.service.BarrioService;

public class FindAllBarrioDtoUseCase {
    private final BarrioService barrioService;


    public FindAllBarrioDtoUseCase(BarrioService barrioService) {
        this.barrioService = barrioService;
    }
   

    public List<BarrioDto> execute(){
        return barrioService.findAllBarrioDto();
    }
}
