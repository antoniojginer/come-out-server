package com.partyapp.query.user.company.service;

import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.query.user.base.service.IBaseUserQueryService;

import java.util.List;

public interface ICompanyUserQueryService extends IBaseUserQueryService {
    @Override
    public CompanyUserDTO getUser(Long id);
    @Override
    public List<CompanyUserDTO> getAllUsers();

}
