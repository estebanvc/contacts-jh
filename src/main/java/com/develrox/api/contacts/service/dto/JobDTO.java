package com.develrox.api.contacts.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.develrox.api.contacts.domain.Job} entity.
 */
public class JobDTO implements Serializable {
    
    private Long id;

    @Size(max = 32)
    private String profession;

    @Size(max = 32)
    private String companyName;

    @Size(max = 32)
    private String departmentName;

    @Size(max = 32)
    private String jobName;


    private Long contactId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

        JobDTO jobDTO = (JobDTO) o;
        if (jobDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), jobDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "JobDTO{" +
            "id=" + getId() +
            ", profession='" + getProfession() + "'" +
            ", companyName='" + getCompanyName() + "'" +
            ", departmentName='" + getDepartmentName() + "'" +
            ", jobName='" + getJobName() + "'" +
            ", contactId=" + getContactId() +
            "}";
    }
}
