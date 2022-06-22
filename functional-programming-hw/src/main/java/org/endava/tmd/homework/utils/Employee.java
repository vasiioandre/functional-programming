package com.homework.utils;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
@EqualsAndHashCode
public class Employee {

    private final String firstName;
    private final String surname;
    private final LocalDate dateOfBirth;
    private final Company company;
    private final BigDecimal salary;
    private final Address homeAddress;
    private final Optional<Address> correspondenceAddress;

    Employee(String firstName, String surname, LocalDate dateOfBirth, Company company, BigDecimal salary, Address homeAddress, Address correspondenceAddress) {
        this.firstName = Utils.notNull(firstName);
        this.surname = Utils.notNull(surname);
        this.dateOfBirth = Utils.notNull(dateOfBirth);
        this.company = Utils.notNull(company);
        this.salary = Utils.notNull(salary);
        this.homeAddress = Utils.notNull(homeAddress);
        this.correspondenceAddress = Optional.ofNullable(correspondenceAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Company getCompany() {
        return company;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Optional<Address> getCorrespondenceAddress() {
        return correspondenceAddress;
    }

}
