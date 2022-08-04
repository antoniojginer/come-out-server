package com.partyapp.query.user.company.service;

import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.query.user.base.service.IBaseUserQueryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyQueryService implements ICompanyUserQueryService {

    @Override
    public CompanyUserDTO getUser(Long id) {
        // TODO
        return null;
    }

    @Override
    public List<CompanyUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
