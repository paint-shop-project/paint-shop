package com.greenteam.paintshop.services;

import com.greenteam.paintshop.dtos.ContractorsDto;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface ContractorsService {
    @Transactional
    List<String> addContractors(ContractorsDto contractorsDto);

    List<String> login(ContractorsDto contractorsDto);

    Optional<ContractorsDto> getContractorsById(Long contractorId);



    List<ContractorsDto> getAllContractors();

    @Transactional
    void deleteContractorsById(Long contractorId);

    List<String> getRoleById(Long contractorId);
}
