package com.partyapp.query.user.company.controller;

import com.partyapp.commons.entities.user.base.BaseUserDTO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.query.user.company.service.ICompanyUserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/company")
public class CompanyQueryController implements ICompanyUserQueryController {

    @Autowired
    private ICompanyUserQueryService companyUserQueryService;

    @Override
    @GetMapping("/{id}")
    public CompanyUserDTO getUser(@PathVariable("id") Long id) {
        return companyUserQueryService.getUser(id);
    }
    public List<CompanyUserDTO> getAllUsers() {
        return companyUserQueryService.getAllUsers();
    }
}
