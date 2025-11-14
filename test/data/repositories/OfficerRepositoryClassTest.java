package data.repositories;

import data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class OfficerRepositoryClassTest {

    private OfficerRepositoryClass repository;
    private Officer officer1;
    private Officer officer2;

    @BeforeEach
    void setUp() {
        repository = new OfficerRepositoryClass();

        officer1 = new Officer();
        officer1.setName("Tosin");
        officer1.setRank("Sergent");

        officer2 = new Officer();
        officer2.setName("Micheal");
        officer2.setRank("Captain");
    }
    @Test
    void testSave() {
        Officer savedOfficer = repository.save(officer1);
        assertNotNull(savedOfficer);
        assertEquals(1, savedOfficer.getUserId());
        assertEquals(1, repository.count());
    }
    @Test
    void testFindById() {
        repository.save(officer1);
        repository.save(officer2);

        Officer found = repository.findById(1);
        assertNotNull(found);
        assertEquals("Tosin", found.getName());

        Officer notFound = repository.findById(100);
        assertNull(notFound);
    }
    @Test
    void testFindAll() {
        repository.save(officer1);
        repository.save(officer2);

        ArrayList<Officer> allOfficers = repository.findAll();
        assertEquals(2, allOfficers.size());
        assertEquals("Micheal", allOfficers.get(1).getName());
    }
    @Test
    void testDeleteById() {
        repository.save(officer1);
        repository.save(officer2);

        repository.deleteById(1);

        assertEquals(1, repository.count());
        assertNull(repository.findById(1));
    }
    @Test
    void testDeleteOfficer() {
        repository.save(officer1);
        repository.save(officer2);

        repository.delete(officer1);

        assertEquals(1, repository.count());
        assertNull(repository.findById(officer1.getUserId()));
    }
    @Test
    void testCount() {
        assertEquals(0, repository.count());
        repository.save(officer1);
        repository.save(officer2);
        assertEquals(2, repository.count());
    }

}