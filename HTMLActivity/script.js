// JavaScript Functionality:

//Implement interactive features using JavaScript:
//Add functionality to the "Add Employee" and "View Employees" 
//form to allow administrators to create new employee records.



// Sample array to store employee data (replace with actual implementation)
let employees = [];

// Function to add a new employee
function addEmployee(event) {
    event.preventDefault(); // Prevent form submission

    // Get form input values
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const department = document.getElementById('department').value;
    const role = document.getElementById('role').value;

    // Create new employee object
    const newEmployee = {
        name: name,
        email: email,
        department: department,
        role: role
    };

    // Add new employee to the array
    employees.push(newEmployee);

    // Clear form fields
    document.getElementById('name').value = '';
    document.getElementById('email').value = '';
    document.getElementById('department').value = '';
    document.getElementById('role').value = '';

    // Update employee list
    displayEmployees();
}

// Function to display employees
function displayEmployees() {
    const employeeList = document.getElementById('employeeList');
    employeeList.innerHTML = ''; // Clear previous content

    // Loop through employees array and display each employee
    employees.forEach(employee => {
        const listItem = document.createElement('li');
        listItem.textContent = `Name: ${employee.name}, Email: ${employee.email}, Department: ${employee.department}, Role: ${employee.role}`;
        employeeList.appendChild(listItem);
    });
}

// Function to initialize the application
function initialize() {
    // Add event listener to the "Add Employee" form
    document.getElementById('addEmployeeForm').addEventListener('submit', addEmployee);
    
    // Add event listener to the "View Employees" button
    document.getElementById('viewEmployeesBtn').addEventListener('click', displayEmployees);
}

// Call initialize function when the DOM is loaded
document.addEventListener('DOMContentLoaded', initialize);
