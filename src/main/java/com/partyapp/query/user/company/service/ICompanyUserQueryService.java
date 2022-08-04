package com.partyapp.query.user.company.service;

import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.query.user.base.service.IBaseUserQueryService;

import java.util.List;

public interface ICompanyUserQueryService extends IBaseUserQueryService {
    public CompanyUserDTO getUser(Long id);
    public List<CompanyUserDTO> getAllUsers();
}
