package com.develrox.api.contacts.service.mapper;


import com.develrox.api.contacts.domain.*;
import com.develrox.api.contacts.service.dto.JobDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Job} and its DTO {@link JobDTO}.
 */
@Mapper(componentModel = "spring", uses = {ContactMapper.class})
public interface JobMapper extends EntityMapper<JobDTO, Job> {

    @Mapping(source = "contact.id", target = "contactId")
    JobDTO toDto(Job job);

    @Mapping(source = "contactId", target = "contact")
    Job toEntity(JobDTO jobDTO);

    default Job fromId(Long id) {
        if (id == null) {
            return null;
        }
        Job job = new Job();
        job.setId(id);
        return job;
    }
}
