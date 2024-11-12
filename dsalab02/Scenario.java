/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;
//import java.util.*;
////Home Task 03
//class Employee{
//
//    String empName;
//    int empId;
//    
//    //Constructor
//    Employee(String empName, int empId){
//        this.empName = empName;
//        this.empId = empId;
//    }
//    //Overriding the equals method
//    @Override
//    public boolean equals(Object obj){
//        if(this == obj)
//            return true;
//        if(obj == null || obj.getClass() != this.getClass())
//            return false;
//        Employee employee = (Employee) obj;
//        //
//        return empId == employee.empId && empName.equals(employee.empName);
//    }
//    //Overriding Hashcode method
//    @Override
//    public int hashCode(){
//        return Objects.hash(empId, empName);
//    }
//    @Override
//    public String toString(){
//        return "Employee [ID: " + empId + " Name: " + empName + "]";
//    }
//}
//class EmployeeManagement{
//    public HashSet<Employee> employeeRecords;
//    
//    //Contructor to initialize the HashSet
//    EmployeeManagement(){
//        employeeRecords = new HashSet<>();
//    }
//    //Method to add a new employee
//    public boolean addeEmployee(Employee employee){
//        return employeeRecords.add(employee);
//    }
//    //Check if employee exists or not
//    public boolean employeeExists(Employee employee){
//        return employeeRecords.contains(employee);
//    }
//    //Method to display all employees
//    public void displayEmployees(){
//        if(employeeRecords.isEmpty()){
//            System.out.println("The List is Empty");
//        } else{
//            for(Employee e : employeeRecords){
//                System.out.println(e);
//            }
//        }
//    }
//}
//public class Scenario {
//    public static void main(String[] args){
//        EmployeeManagement management = new EmployeeManagement();
//        //
//        //Employee Objects
//        Employee e1 = new Employee("Tariq", 1);
//        Employee e2 = new Employee("Ahmed", 1);
//        Employee e3 = new Employee("Ali", 3);
//        Employee e4 = new Employee("Tariq", 1);
//        
//        //adding
//        System.out.println("adding employee1: " + management.addeEmployee(e1));
//        System.out.println("adding employee2: " + management.addeEmployee(e2));
//        System.out.println("adding employee3: " + management.addeEmployee(e3));
//        
//        //Checking
//        System.out.println("Checking if employee already exists: " + management.employeeExists(e3));
//        System.out.println("Checking if employee already exists: " + management.employeeExists(e4));
//        
//        //displayong all Employees
//        management.displayEmployees();
//        
//    }    
//}
