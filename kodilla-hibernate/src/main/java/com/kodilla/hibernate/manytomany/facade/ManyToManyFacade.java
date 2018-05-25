package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

@Component
public class ManyToManyFacade {

    @Autowired private CompanyDao companyDao;
    @Autowired private EmployeeDao employeeDao;

    @PersistenceContext
    private EntityManager em;

    public List<Company> findCompany(String namePart) {
        String name = "%" + namePart + "%";
       return companyDao.findByName(name);
    }

    public List<Employee> findEmployee(String namePart) {
        String name = "%" + namePart + "%";
        return employeeDao.findByName(name);
    }
}
