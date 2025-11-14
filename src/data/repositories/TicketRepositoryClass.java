package data.repositories;

import data.models.Tickets.Ticket;
import java.util.ArrayList;

public class TicketRepositoryClass implements TicketRepository {

    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public Ticket save(Ticket ticket) {
        if (ticket.getId() != 0) {
            for (int index = 0; index < tickets.size(); index++) {
                if (tickets.get(index).getId() == ticket.getId()) {
                    tickets.set(index, ticket);

                    return ticket;
                }
            }
        } else {

            ticket.setId(idCounter++);
            tickets.add(ticket);
        }
        return ticket;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Ticket> findAll() {
        return new ArrayList<>(tickets);
    }

    @Override
    public void deleteById(int id) {
        tickets.removeIf(ticket -> ticket.getId() == id);
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }

    @Override
    public void delete(Ticket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public long count() {
        return tickets.size();
    }
}