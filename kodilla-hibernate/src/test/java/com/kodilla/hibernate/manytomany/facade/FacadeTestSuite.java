package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private ManyToManyFacade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindcompany() {
        //Given
        Company fajnaFirma = new Company("Fajna Firma");
        Company nowaSpolka = new Company("Nowa Spolka");
        Company someCompany = new Company("Some Company");
        List<Integer> companyIds = new LinkedList<>();

        companyDao.save(fajnaFirma);
        companyIds.add(fajnaFirma.getId());
        companyDao.save(nowaSpolka);
        companyIds.add(nowaSpolka.getId());
        companyDao.save(someCompany);
        companyIds.add(someCompany.getId());

        //When
        List<Company> irm = facade.findCompany("irm");

        //Then
        Assert.assertEquals(1, irm.size());

        //CleanUp
        for (int id : companyIds) {
            companyDao.delete(id);
        }

    }
    @Test
    public void testFindEmployee() {
        //Given
        Employee marjan = new Employee("Marjan", "Nowak");
        Employee zenon = new Employee("Zenon", "Jankowski");
        Employee onofry = new Employee("Onufry", "Ziemowid");
        List<Integer> employeeIds = new LinkedList<>();

        employeeDao.save(marjan);
        employeeIds.add(marjan.getId());
        employeeDao.save(zenon);
        employeeIds.add(zenon.getId());
        employeeDao.save(onofry);
        employeeIds.add(onofry.getId());

        //When
        List<Employee> jan = facade.findEmployee("jan");

        //Then
        Assert.assertEquals(2, jan.size());

        //CleanUp
        for (int id : employeeIds) {
            employeeDao.delete(id);
        }
    }
}
