package com.accenture.lkm.ui;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.business.bean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;

@SuppressWarnings("resource")
public class UITester {

    public static void main(String[] args) {
        EmployeeService employeeService = null;
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/cst-main-config.xml");
            employeeService = (EmployeeService) applicationContext.getBean("employeeServiceImpl");

            deleteEmployeeByName(employeeService);
            updateEmployeeSalaryByRole(employeeService);
            getEmployeeDetailsWithin(employeeService);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteEmployeeByName(EmployeeService employeeService) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the employee to delete: ");
            String name = scanner.nextLine().trim(); // Read the name of the employee from user input

            Integer deleteCount = employeeService.deleteEmployeeByName(name);
            if (deleteCount > 0) {
                System.out.println("Employee(s) with name '" + name + "' deleted successfully.");
            } else {
                System.out.println("No employee found with the name '" + name + "'.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateEmployeeSalaryByRole(EmployeeService employeeService) {
        try {
            String role = "Manager"; // Specify the role for which salary needs to be updated
            Double newSalary = 5000.0; // Specify the new salary
            Integer updateCount = employeeService.updateEmployeeSalaryWithRole(role, newSalary);
            if (updateCount > 0) {
                System.out.println("Salary updated successfully for employees with role '" + role + "'.");
            } else {
                System.out.println("No employees found with the role '" + role + "'.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getEmployeeDetailsWithin(EmployeeService employeeService) {
        try {
            Calendar calendar = Calendar.getInstance();
            Date currentDate = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, -7); 
            Date startDate = calendar.getTime();
            calendar.setTime(currentDate);
            calendar.add(Calendar.DAY_OF_YEAR, 7); 
            Date endDate = calendar.getTime();

            List<EmployeeBean> employeeList = employeeService.getEmployeeDetailsWithin(startDate, endDate);
            if (employeeList != null && !employeeList.isEmpty()) {
                System.out.println("Employees within the specified date range:");
                for (EmployeeBean employee : employeeList) {
                    System.out.println("Employee ID: " + employee.getId());
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Role: " + employee.getRole());
                    System.out.println("Salary: " + employee.getSalary());
                    System.out.println("---------------------------");
                }
            } else {
                System.out.println("No employees found within the specified date range.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
