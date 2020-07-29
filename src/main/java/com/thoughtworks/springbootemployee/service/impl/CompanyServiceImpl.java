package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;
    @Override
    public void addCompany(Company company) {

    }

    @Override
    public List<Company> getCompanies() {
        return null;
    }

    @Override
    public Boolean deleteEmployeesOfCompany(Integer companyId) {
        return null;
    }

    @Override
    public void updateCompany(Company company) {

    }

    @Override
    public Company getCompany(Integer companyId) {
        return null;
    }

    @Override
    public List<Company> queryCompanyByPage(Integer page, Integer pageSize) {
        return null;
    }
}
