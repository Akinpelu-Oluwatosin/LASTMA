package data.repositories;

import data.models.Officer;
import java.util.ArrayList;

public class OfficerRepositoryClass {

    private ArrayList<Officer> officers = new ArrayList<>();
    private int nextId = 1;

    public Officer save(Officer officer) {
        if (officer.getUserId() == 0) {
            officer.setUserId(nextId++);
            officers.add(officer);
        } else {

            for (int index = 0; index < officers.size(); index++) {
                if (officers.get(index).getUserId() == officer.getUserId()) {
                    officers.set(index, officer);
                    return officer;
                }
            }

            officers.add(officer);
        }
        return officer;
    }


    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getUserId() == id) {
                return officer;
            }
        }
        return null;
    }


    public ArrayList<Officer> findAll() {
        return officers;
    }


    public void deleteById(int id) {
        Officer found = findById(id);
        if (found != null) {
            officers.remove(found);
        }
    }


    public void deleteAll() {
        officers.clear();
    }

    public void delete(Officer officer) {
        officers.remove(officer);
    }

    public long count() {
        return officers.size();
    }
}