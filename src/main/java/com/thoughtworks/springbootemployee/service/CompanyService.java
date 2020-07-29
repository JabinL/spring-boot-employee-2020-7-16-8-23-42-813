package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;

import java.util.List;

public interface CompanyService {
    void addCompany(Company company);

    List<Company> getCompanies();

    Boolean deleteEmployeesOfCompany(Integer companyId);

    void updateCompany(Company company);

    Company getCompany(Integer companyId);

    List<Company> queryCompanyByPage(Integer page, Integer pageSize);

}
