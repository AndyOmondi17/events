package models;

import java.util.Objects;

public class Bookings {
    private int id;
    private int payment;

    public Bookings(int payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookings that = (Bookings) o;
        return payment == that.payment &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payment,id);
    }
}
