package com.partyapp.query.user.company.controller;

import com.partyapp.commons.entities.user.LoginDTO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.query.user.base.controller.IBaseUserQueryController;

import java.util.List;

public interface ICompanyUserQueryController extends IBaseUserQueryController <CompanyUserDTO> {
    @Override
    public CompanyUserDTO getUser(Long id);
    @Override
    public List<CompanyUserDTO> getAllUsers();
}
