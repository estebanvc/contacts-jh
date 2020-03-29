package com.develrox.api.contacts.service.mapper;


import com.develrox.api.contacts.domain.*;
import com.develrox.api.contacts.service.dto.PhoneDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Phone} and its DTO {@link PhoneDTO}.
 */
@Mapper(componentModel = "spring", uses = {ContactMapper.class})
public interface PhoneMapper extends EntityMapper<PhoneDTO, Phone> {

    @Mapping(source = "contact.id", target = "contactId")
    PhoneDTO toDto(Phone phone);

    @Mapping(source = "contactId", target = "contact")
    Phone toEntity(PhoneDTO phoneDTO);

    default Phone fromId(Long id) {
        if (id == null) {
            return null;
        }
        Phone phone = new Phone();
        phone.setId(id);
        return phone;
    }
}
