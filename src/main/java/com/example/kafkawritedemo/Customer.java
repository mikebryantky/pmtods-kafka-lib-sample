package com.example.kafkawritedemo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * This is just a dummy class to be
 * used for demo purposes.
 */
public class Customer {
    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDateTime transactionDate;

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(transactionDate, customer.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, transactionDate);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
