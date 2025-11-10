package data.repositories;

import data.models.Vehicle;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private VehicleRepositoryClass repository;

    @BeforeEach
    void setUp() {
        repository = new VehicleRepositoryClass();
    }