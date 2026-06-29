package com.api.RFIND_api.RFIND_api.Service;

import com.api.RFIND_api.RFIND_api.DTO.Request.EnterpriseRequest;
import com.api.RFIND_api.RFIND_api.DTO.Response.EnterpriseResponse;
import com.api.RFIND_api.RFIND_api.Repository.EnterpriseRepository;
import com.api.RFIND_api.RFIND_api.model.Enterprise;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnterpriseService{
    private final EnterpriseRepository enterpriseRepository;

    public List<EnterpriseResponse> listAll(){
        List<EnterpriseResponse> listResponse = new ArrayList<>();
        for (Enterprise enterprise : enterpriseRepository.findAll()){
            EnterpriseResponse enterpriseResponse = new EnterpriseResponse(enterprise);
            listResponse.add(enterpriseResponse);
        }
        return listResponse;
    }

    public EnterpriseResponse create(EnterpriseRequest request){
        Enterprise enterprise = new Enterprise(request);
        enterpriseRepository.save(enterprise);
        return new EnterpriseResponse(enterprise);
    }
}
