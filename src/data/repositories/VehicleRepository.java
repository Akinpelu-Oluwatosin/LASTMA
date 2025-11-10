package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;

public interface VehicleRepository {
    Vehicle save(Vehicle vehicle);

    Vehicle findById(int id);

    ArrayList<Vehicle> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Vehicle vehicle);

    long count();
}