package com.develrox.api.contacts.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * A Contact.
 */
@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Size(max = 32)
    @Column(name = "name", length = 32)
    private String name;

    @Size(max = 32)
    @Column(name = "last_name", length = 32)
    private String lastName;

    @Column(name = "birth_date")
    private Instant birthDate;

    @Size(max = 32)
    @Column(name = "gender", length = 32)
    private String gender;

    @Size(max = 32)
    @Column(name = "nickname", length = 32)
    private String nickname;

    @NotNull
    @Size(max = 128)
    @Column(name = "email", length = 128, nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "contact")
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "contact")
    private Set<Address> addresses = new HashSet<>();

    @OneToMany(mappedBy = "contact")
    private Set<Job> jobs = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Contact name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public Contact birthDate(Instant birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public Contact gender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public Contact nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public Contact email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public Contact phones(Set<Phone> phones) {
        this.phones = phones;
        return this;
    }

    public Contact addPhones(Phone phone) {
        this.phones.add(phone);
        phone.setContact(this);
        return this;
    }

    public Contact removePhones(Phone phone) {
        this.phones.remove(phone);
        phone.setContact(null);
        return this;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public Contact addresses(Set<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Contact addAddresses(Address address) {
        this.addresses.add(address);
        address.setContact(this);
        return this;
    }

    public Contact removeAddresses(Address address) {
        this.addresses.remove(address);
        address.setContact(null);
        return this;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public Contact jobs(Set<Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    public Contact addJobs(Job job) {
        this.jobs.add(job);
        job.setContact(this);
        return this;
    }

    public Contact removeJobs(Job job) {
        this.jobs.remove(job);
        job.setContact(null);
        return this;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }
        return id != null && id.equals(((Contact) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Contact{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", gender='" + getGender() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
