package com.acc.lkm.Activity;

import java.sql.*;

public class ProcessManagementSystem {

    private Connection connection;

    public ProcessManagementSystem() {
        try {
            // Establish connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Accenture", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adding new records
    public void addEmployee(String name, int departmentId, int projectId, int taskId) {
        String query = "INSERT INTO Employees (employee_name, department_id, project_id, task_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, departmentId);
            statement.setInt(3, projectId);
            statement.setInt(4, taskId);
            statement.executeUpdate();
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 // Adding new department
    public void addDepartment(String departmentName) {
        String query = "INSERT INTO Departments (department_name) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, departmentName);
            statement.executeUpdate();
            System.out.println("Department added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adding new project
    public void addProject(String projectName, int departmentId) {
        String query = "INSERT INTO Projects (project_name, department_id) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, projectName);
            statement.setInt(2, departmentId);
            statement.executeUpdate();
            System.out.println("Project added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Adding new task
    public void addTask(String taskName, int projectId, String status) {
        String query = "INSERT INTO Tasks (task_name, project_id, status) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, taskName);
            statement.setInt(2, projectId);
            statement.setString(3, status);
            statement.executeUpdate();
            System.out.println("Task added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Updating existing records
    public void updateEmployee(int employeeId, String newName, int newDepartmentId, int newProjectId, int newTaskId) {
        String query = "UPDATE Employees SET employee_name = ?, department_id = ?, project_id = ?, task_id = ? WHERE employee_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newName);
            statement.setInt(2, newDepartmentId);
            statement.setInt(3, newProjectId);
            statement.setInt(4, newTaskId);
            statement.setInt(5, employeeId);
            statement.executeUpdate();
            System.out.println("Employee updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Deleting records
    public void deleteEmployee(int employeeId) {
        String query = "DELETE FROM Employees WHERE employee_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, employeeId);
            statement.executeUpdate();
            System.out.println("Employee deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieving records
    public void retrieveEmployeesByDepartment(int departmentId) {
        String query = "SELECT * FROM Employees WHERE department_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, departmentId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                int projectId = resultSet.getInt("project_id");
                int taskId = resultSet.getInt("task_id");
                System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Project ID: " + projectId + ", Task ID: " + taskId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 // Deleting, updating, and retrieving records
    public void operateOnData(String operation, String entity, int entityId, String newName, int newDepartmentId, int newProjectId, int newTaskId, int departmentId) {
        switch (operation) {
            case "delete":
                deleteRecord(entity, entityId);
                break;
            case "update":
                updateRecord(entity, entityId, newName, newDepartmentId, newProjectId, newTaskId);
                break;
            case "retrieve":
                retrieveRecords(entity, departmentId);
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    private void deleteRecord(String entity, int entityId) {
        String query = "DELETE FROM " + entity + " WHERE " + entity + "_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, entityId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(entity + " deleted successfully.");
            } else {
                System.out.println("No " + entity + " found with ID: " + entityId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateRecord(String entity, int entityId, String newName, int newDepartmentId, int newProjectId, int newTaskId) {
        String query = "UPDATE " + entity + " SET " + entity + "_name = ?, department_id = ?, project_id = ?, task_id = ? WHERE " + entity + "_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newName);
            statement.setInt(2, newDepartmentId);
            statement.setInt(3, newProjectId);
            statement.setInt(4, newTaskId);
            statement.setInt(5, entityId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(entity + " updated successfully.");
            } else {
                System.out.println("No " + entity + " found with ID: " + entityId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void retrieveRecords(String entity, int departmentId) {
        String query = "SELECT * FROM " + entity + " WHERE department_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, departmentId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int entityId = resultSet.getInt(entity + "_id");
                String name = resultSet.getString(entity + "_name");
                int projectId = resultSet.getInt("project_id");
                int taskId = resultSet.getInt("task_id");
                System.out.println(entity + " ID: " + entityId + ", Name: " + name + ", Project ID: " + projectId + ", Task ID: " + taskId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Close connection method
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProcessManagementSystem system = new ProcessManagementSystem();

        // Add a new employee
        system.addEmployee("AJIT", 1, 1, 1);
        system.addEmployee("Subh", 2, 2, 2);
        system.addEmployee("Amith", 1, 3, 3);
        system.addEmployee("Kartik", 2, 2, 4);
        system.addEmployee("Ravi", 3, 1, 5);
        
        // Add a new department
        system.addDepartment("HR");

        // Add a new project
        system.addProject("Payroll", 1);

        // Add a new task
        system.addTask("Payroll UI", 1, "In progress");

        // Update an existing employee
        system.updateEmployee(1, "AJIT NARAYAN", 1, 2, 3);

        // Delete an employee
        system.deleteEmployee(5);

        // Retrieve employees by department
        system.retrieveEmployeesByDepartment(1);

        // Close connection
        system.close();
    }
}
