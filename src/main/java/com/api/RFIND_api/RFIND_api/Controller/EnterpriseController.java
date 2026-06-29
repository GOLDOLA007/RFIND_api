package com.api.RFIND_api.RFIND_api.Controller;

import com.api.RFIND_api.RFIND_api.DTO.Request.EnterpriseRequest;
import com.api.RFIND_api.RFIND_api.DTO.Response.EnterpriseResponse;
import com.api.RFIND_api.RFIND_api.Service.EnterpriseService;
import com.api.RFIND_api.RFIND_api.model.Enterprise;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
@RequiredArgsConstructor
public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody EnterpriseRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(enterpriseService.create(request));
    }

    @GetMapping
    public List<EnterpriseResponse> listAll(){
        return enterpriseService.listAll();
    }
}
