package com.api.RFIND_api.RFIND_api.Repository;

import com.api.RFIND_api.RFIND_api.DTO.Request.EnterpriseRequest;
import com.api.RFIND_api.RFIND_api.DTO.Response.EnterpriseResponse;
import com.api.RFIND_api.RFIND_api.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
    boolean findByEmail(String email);
}
