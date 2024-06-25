package com.acc.lkm.activity1Test;
import com.acc.lkm.activity1.Employee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmployeeTest {
    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee("Ajit", 30, 50000.0);
    }

    @Test
    public void testValidEmployeeCreation() {
        assertNotNull(employee);
        assertEquals("Ajit", employee.getName());
        assertEquals(30, employee.getAge());
        assertEquals(50000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void testEmployeeIsNull() {
        employee = null;
        assertNull(employee);
    }

    @AfterEach
    public void tearDown() {
        employee = null; 
    }

    @BeforeAll
    public static void init() {
        
        System.out.println("Setting up resources before all tests...");
    }

    @AfterAll
    public static void cleanup() {
      
        System.out.println("Cleaning up resources after all tests...");
    }

    @RepeatedTest(3)
    public void testRepeatedValidEmployeeCreation() {
        // Test creating employee object multiple times with valid data
        Employee repeatedEmployee = new Employee("Subhajit", 25, 60000.0);
        assertNotNull(repeatedEmployee);
        assertEquals("Subhajit", repeatedEmployee.getName());
        assertEquals(25, repeatedEmployee.getAge());
        assertEquals(60000.0, repeatedEmployee.getSalary(), 0.01);
    }

    @RepeatedTest(3)
    public void testRepeatedEmployeeIsNull() {
        // Test if employee object is null multiple times
        employee = null;
        assertNull(employee);
    }
}