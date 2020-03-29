package com.develrox.api.contacts.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.develrox.api.contacts.domain.Phone} entity.
 */
public class PhoneDTO implements Serializable {
    
    private Long id;

    @Size(max = 32)
    private String name;

    @Size(max = 16)
    private String number;


    private Long contactId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PhoneDTO phoneDTO = (PhoneDTO) o;
        if (phoneDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), phoneDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PhoneDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", number='" + getNumber() + "'" +
            ", contactId=" + getContactId() +
            "}";
    }
}
