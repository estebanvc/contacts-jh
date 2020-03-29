package com.develrox.api.contacts.service;

import com.develrox.api.contacts.domain.Phone;
import com.develrox.api.contacts.repository.PhoneRepository;
import com.develrox.api.contacts.service.dto.PhoneDTO;
import com.develrox.api.contacts.service.mapper.PhoneMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Phone}.
 */
@Service
@Transactional
public class PhoneService {

    private final Logger log = LoggerFactory.getLogger(PhoneService.class);

    private final PhoneRepository phoneRepository;

    private final PhoneMapper phoneMapper;

    public PhoneService(PhoneRepository phoneRepository, PhoneMapper phoneMapper) {
        this.phoneRepository = phoneRepository;
        this.phoneMapper = phoneMapper;
    }

    /**
     * Save a phone.
     *
     * @param phoneDTO the entity to save.
     * @return the persisted entity.
     */
    public PhoneDTO save(PhoneDTO phoneDTO) {
        log.debug("Request to save Phone : {}", phoneDTO);
        Phone phone = phoneMapper.toEntity(phoneDTO);
        phone = phoneRepository.save(phone);
        return phoneMapper.toDto(phone);
    }

    /**
     * Get all the phones.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<PhoneDTO> findAll() {
        log.debug("Request to get all Phones");
        return phoneRepository.findAll().stream()
            .map(phoneMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one phone by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<PhoneDTO> findOne(Long id) {
        log.debug("Request to get Phone : {}", id);
        return phoneRepository.findById(id)
            .map(phoneMapper::toDto);
    }

    /**
     * Delete the phone by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Phone : {}", id);
        phoneRepository.deleteById(id);
    }
}
