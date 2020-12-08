package ru.stqa.pfr.adressbook.tests;

public class ContactDetails {
    private final String firstName;
    private final String lastName;
    private final String telephoneHome;
    private final String email;

    public ContactDetails(String firstName, String lastName, String telephoneHome, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneHome = telephoneHome;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneHome() {
        return telephoneHome;
    }

    public String getEmail() {
        return email;
    }
}
