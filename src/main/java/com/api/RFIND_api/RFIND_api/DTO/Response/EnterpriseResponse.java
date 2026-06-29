package com.api.RFIND_api.RFIND_api.DTO.Response;

import com.api.RFIND_api.RFIND_api.model.Enterprise;

public record EnterpriseResponse(Long id, String cnpj, String name ) {
    public EnterpriseResponse(Enterprise enterprise){
        this(enterprise.getId(), enterprise.getCnpj(), enterprise.getName());
    }
}
