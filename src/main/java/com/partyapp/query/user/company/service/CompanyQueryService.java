package com.partyapp.query.user.company.service;

import com.partyapp.commons.dataAccess.query.user.company.CompanyUserDAO;
import com.partyapp.commons.entities.user.company.CompanyUserDTO;
import com.partyapp.commons.mapper.QueryMapper;
import com.partyapp.query.user.base.service.IBaseUserQueryService;
import com.partyapp.query.user.company.dataAccess.ICompanyUserQueryDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyQueryService implements ICompanyUserQueryService {

    @Autowired
    private QueryMapper queryMapper;

    @Autowired
    private ICompanyUserQueryDA companyUserQueryDA;

    @Override
    public CompanyUserDTO getUser(Long id) {
        CompanyUserDAO companyUserDAO = companyUserQueryDA.getCompanyUser(id);
        CompanyUserDTO companyUser = queryMapper.toCompanyUserDetailDto(companyUserDAO);
        return companyUser;
    }

    @Override
    public List<CompanyUserDTO> getAllUsers() {
        // TODO
        return null;
    }
}
