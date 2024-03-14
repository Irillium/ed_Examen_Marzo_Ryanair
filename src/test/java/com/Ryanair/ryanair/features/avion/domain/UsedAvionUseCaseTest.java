package com.Ryanair.ryanair.features.avion.domain;

import com.Ryanair.ryanair.features.avion.data.StubTrueAvionDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsedAvionUseCaseTest {

    private UsedAvionUseCase usedAvionUseCase;
    @BeforeEach
    void setUp() {
    }
    @Test
    void CuandoExisteYEstaAsignadoDevuelveTrue(){
        //Given
        usedAvionUseCase=new UsedAvionUseCase(new StubTrueAvionDataRepository());
        //When
        //Then
        Assertions.assertTrue(usedAvionUseCase.execute("2345"));
    }
    @Test
    void CuandoNoExisteoNoEstaAsignadoDevuelveNull(){
        //Given
        usedAvionUseCase=new UsedAvionUseCase(new StubTrueAvionDataRepository());
        //When
        //Then
        Assertions.assertFalse(usedAvionUseCase.execute("3884"));
    }

    @AfterEach
    void tearDown() {
        usedAvionUseCase=null;
    }
}