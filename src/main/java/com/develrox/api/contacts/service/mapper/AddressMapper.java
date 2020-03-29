package com.develrox.api.contacts.service.mapper;


import com.develrox.api.contacts.domain.*;
import com.develrox.api.contacts.service.dto.AddressDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Address} and its DTO {@link AddressDTO}.
 */
@Mapper(componentModel = "spring", uses = {ContactMapper.class})
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {

    @Mapping(source = "contact.id", target = "contactId")
    AddressDTO toDto(Address address);

    @Mapping(source = "contactId", target = "contact")
    Address toEntity(AddressDTO addressDTO);

    default Address fromId(Long id) {
        if (id == null) {
            return null;
        }
        Address address = new Address();
        address.setId(id);
        return address;
    }
}
