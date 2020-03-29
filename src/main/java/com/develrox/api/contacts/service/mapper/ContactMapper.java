package com.develrox.api.contacts.service.mapper;


import com.develrox.api.contacts.domain.*;
import com.develrox.api.contacts.service.dto.ContactDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Contact} and its DTO {@link ContactDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {


    @Mapping(target = "phones", ignore = true)
    @Mapping(target = "removePhones", ignore = true)
    @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "removeAddresses", ignore = true)
    @Mapping(target = "jobs", ignore = true)
    @Mapping(target = "removeJobs", ignore = true)
    Contact toEntity(ContactDTO contactDTO);

    default Contact fromId(Long id) {
        if (id == null) {
            return null;
        }
        Contact contact = new Contact();
        contact.setId(id);
        return contact;
    }
}
