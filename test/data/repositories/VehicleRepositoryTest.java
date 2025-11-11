package data.repositories;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleRepositoryTest {

    private VehicleRepositoryClass repository;

    @BeforeEach
    void setUp() {
        repository = new VehicleRepositoryClass();
    }

    @Test
    void testSaveVehicle() {
        Vehicle vehicle = new Vehicle(1, "solara");
        Vehicle savedVehicle = repository.save(vehicle);

        assertNotNull(savedVehicle);
        assertEquals("solara", savedVehicle.getName());
        assertEquals(1, savedVehicle.getId());
    }


    @Test
    void deleteById() {
        Vehicle vehicle1 = new Vehicle(1, "solara");
        Vehicle vehicle2 = new Vehicle(2, "Honda");
        repository.delete(vehicle1);
        repository.delete(vehicle2);
        Vehicle foundVehicle = repository.findById(1);
        assertNull(foundVehicle);
    }

    @Test
    void testFindAll_emptyRepository() {
        ArrayList<Vehicle> allVehicles = repository.findAll();
        assertNotNull(allVehicles);
        assertEquals(0, allVehicles.size()); // repository is empty
    }

    @Test
    void testFindById_existingVehicle() {
        Vehicle vehicle1 = new Vehicle(0, "Toyota");
        Vehicle vehicle2 = new Vehicle(0, "Honda");

        repository.save(vehicle1);
        repository.save(vehicle2);
        Vehicle foundVehicle = repository.findById(vehicle2.getId());

        assertNotNull(foundVehicle);
        assertEquals("Honda", foundVehicle.getName());
        assertEquals(vehicle2.getId(), foundVehicle.getId());
    }
}



