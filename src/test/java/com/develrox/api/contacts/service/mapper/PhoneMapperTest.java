package com.develrox.api.contacts.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PhoneMapperTest {

    private PhoneMapper phoneMapper;

    @BeforeEach
    public void setUp() {
        phoneMapper = new PhoneMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(phoneMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(phoneMapper.fromId(null)).isNull();
    }
}
