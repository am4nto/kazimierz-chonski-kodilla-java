package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.ManyToManyFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueries() {
        //Given
        Employee employee1 = new Employee("Janusz", "Wasaty");
        Employee employee2 = new Employee("Henryk", "Brodaty");
        Company company1 = new Company("Janusz i Spolka");
        Company company2 = new Company("Jan i Synowie");
        Company company3 = new Company("Zenon i Reszta");

        employeeDao.save(employee1);
        int empl1Id = employee1.getId();
        employeeDao.save(employee2);
        int emp2Id = employee2.getId();
        companyDao.save(company1);
        int comp1Id = company1.getId();
        companyDao.save(company2);
        int comp2Id = company2.getId();
        companyDao.save(company3);
        int comp3Id = company3.getId();

        //When
        List<Employee> wasaty = employeeDao.findByLastName("Wasaty");
        List<Company> jan = companyDao.findByNameStartingWith("Jan");

        System.out.println();

        //Then
        Assert.assertEquals(1, wasaty.size());
        Assert.assertEquals(2, jan.size());

        //CleanUp
        employeeDao.delete(empl1Id);
        employeeDao.delete(emp2Id);
        companyDao.delete(comp1Id);
        companyDao.delete(comp2Id);
        companyDao.delete(comp3Id);
    }
}
