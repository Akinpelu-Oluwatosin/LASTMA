package data.repositories;

import data.models.Tickets.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryClassTest {

    private TicketRepositoryClass repository;

    @BeforeEach
    void setUp() {
        repository = new TicketRepositoryClass();
    }
    @Test
    void testSave() {
        Ticket ticket = new Ticket("ONE-WAY", 35000);
        Ticket savedTicket = repository.save(ticket);

        assertEquals(1, repository.count());
        assertEquals(1, savedTicket.getId());
        assertEquals("ONE-WAY", savedTicket.getEvent());
    }
    @Test
    void testFindById() {
        Ticket ticket = new Ticket("OVER-SPEEDING", 20000);
        repository.save(ticket);

        Ticket found = repository.findById(1);
        assertNotNull(found);
        assertEquals("OVER-SPEEDING", found.getEvent());
    }

    @Test
    void testFindAll() {
        Ticket t1 = new Ticket("ONE-WAY", 35000);
        Ticket t2 = new Ticket("BRT-LANE", 20000);

        repository.save(t1);
        repository.save(t2);

        ArrayList<Ticket> allTickets = repository.findAll();
        assertEquals(2, allTickets.size());
    }
    @Test
    void testDeleteById() {
        Ticket t1 = new Ticket("Illegal turn",  6000.0);
        Ticket t2 = new Ticket("No-Seatbelt",  4000.0);

        repository.save(t1);
        repository.save(t2);
        assertEquals(2, repository.count());

        repository.deleteById(1);
        assertEquals(1, repository.count());
        assertNull(repository.findById(1));
    }

    @Test
    void testDelete() {
        Ticket t1 = new Ticket("Illegal turn",  6000.0);
        Ticket t2 = new Ticket("No-Seatbelt",  4000.0);

        repository.save(t1);
        repository.save(t2);

        repository.delete(t1);
        assertEquals(1, repository.count());
        assertNull(repository.findById(t1.getId()));
    }
    @Test
    void testDeleteAll() {
        Ticket t1 = new Ticket("Illegal turn",  6000.0);
        Ticket t2 = new Ticket("No-Seatbelt",  4000.0);

        assertEquals(0, repository.count());

        repository.deleteAll();
        assertEquals(0, repository.count());
    }

}