package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);


    public void processSearchEmp(String string) throws SearchProcessingExceptions {
        boolean wasError = false;
        try {
            List<Employee> employes = employeeDao.retrieveEmployes(string);
            if (employes.size() == 0) {
                LOGGER.error(SearchProcessingExceptions.ERR_EMPL_NOT_FOUND);
                wasError = true;
                throw new SearchProcessingExceptions(SearchProcessingExceptions.ERR_EMPL_NOT_FOUND);
            }
            LOGGER.info("Employees were found");
                    for(Employee employee : employes){
                        System.out.println(employee.getFirstname() + " " + employee.getFirstname());
                    }
        } finally {
            if (wasError) {
                LOGGER.info("No employee " + string);
            }
        }
    }

    public void processSearchComp(String string) throws SearchProcessingExceptions {
        boolean wasError = false;
        try {
            List<Company> companies = companyDao.retrieveCompany(string);
            if (companies.size() == 0) {
                LOGGER.error(SearchProcessingExceptions.ERR_COMP_NOT_FOUND);
                wasError = true;
                throw new SearchProcessingExceptions(SearchProcessingExceptions.ERR_COMP_NOT_FOUND);
            }
            LOGGER.info("Companies were found");
            for(Company company : companies){
                System.out.println(company.getName());
            }
        } finally {
            if (wasError) {
                LOGGER.info("No company " + string);
            }
        }
    }
}

