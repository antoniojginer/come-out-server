package com.partyapp.query.user.company.dataAccess;

import com.partyapp.commons.dataAccess.query.user.company.CompanyUserDAO;
import com.partyapp.query.user.company.dataAccess.jpaReporsitory.CompanyUserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyUserQueryDA implements ICompanyUserQueryDA {

    @Autowired
    private CompanyUserQueryRepository companyUserQueryRepository;

    @Override
    public CompanyUserDAO getCompanyUser(Long id) {
        try {
            Optional<CompanyUserDAO> companyUserDAO = companyUserQueryRepository.findById(id);
            if (!companyUserDAO.isEmpty()) {
                return companyUserDAO.get();
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting company user"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Company user not found"
        );

    }

    @Override
    public List<CompanyUserDAO> getAllCompanyUsers() {
        try {
            List<CompanyUserDAO> companyUsers = companyUserQueryRepository.findAll();
            if (!companyUsers.isEmpty()) {
                return companyUsers;
            }
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error getting all company users"
            );
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Empty result in getAllCompanyUsers query"
        );
    }
}
