package data.models;

import java.time.LocalDateTime;

public class Ticket {
    private int userId;
    private Vehicle vehicle;
    private String offense;
    private boolean hasPaid;
    private Officer issuer;
    private LocalDateTime dateOfBooking =  LocalDateTime.now();
    private LocalDateTime dateOfPayment =  LocalDateTime.now();


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }
}