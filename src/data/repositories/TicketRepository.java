package data.repositories;

import data.models.Tickets.Ticket;
import java.util.ArrayList;

public interface TicketRepository {

    Ticket save(Ticket ticket);

    Ticket findById(int id);

    ArrayList<Ticket> findAll();

    void deleteById(int id);

    void deleteAll();

    void delete(Ticket ticket);

    long count();
}
