package com.develrox.api.contacts.repository;

import com.develrox.api.contacts.domain.Job;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Job entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
