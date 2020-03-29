package com.develrox.api.contacts.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.develrox.api.contacts.domain.Address} entity.
 */
public class AddressDTO implements Serializable {
    
    private Long id;

    @Size(max = 32)
    private String name;

    @Size(max = 255)
    private String textAddress;


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

    public String getTextAddress() {
        return textAddress;
    }

    public void setTextAddress(String textAddress) {
        this.textAddress = textAddress;
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

        AddressDTO addressDTO = (AddressDTO) o;
        if (addressDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), addressDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", textAddress='" + getTextAddress() + "'" +
            ", contactId=" + getContactId() +
            "}";
    }
}
