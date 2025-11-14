package data.repositories;
import data.models.Vehicle;
import java.util.ArrayList;

public class VehicleRepositoryClass implements VehicleRepository {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == 0) {
            vehicle.setId(nextId++);
            vehicles.add(vehicle);
        } else {

            for (Vehicle vehicleInRepository : vehicles) {
                if (vehicleInRepository.getId() == vehicle.getId()) {
                    vehicles.remove(vehicleInRepository);
                    vehicles.add(vehicle);
                    break;
                }


            }
        }
        return vehicle;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }


    @Override
    public ArrayList<Vehicle> findAll() {
        ArrayList<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.addAll(vehicles);
        return allVehicles;
    }

    @Override
    public void deleteById(int id) {
        for (int index = 0; index < vehicles.size(); index++) {
                if (vehicles.get(index).getId() == id) {
                    vehicles.remove(index);
                    break;
                }
            }

    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}