/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsalab02;

//import java.util.*;
//////Lab Task 03
////Comparator
//class Employee{
//    int empId;
//    String empName;
//    String empGender;
//    int yearOfJoining;
//    
//    Employee(int empId, String empName, String empGender, int yearOfJoining){
//        this.empId = empId;
//        this.empName = empName;
//        this.empGender = empGender;
//        this.yearOfJoining = yearOfJoining;
//    }
//    
//    @Override
//    public String toString(){
//        return "Employee [ ID: "+ empId +" NAME: " + empName + " GENDER: " + empGender + " JOINING YEAR: " + yearOfJoining + " ]";
//    }
//}

//Comparable
//class Employee implements Comparable<Employee>{
//    int empId;
//    String empName;
//    String empGender;
//    int yearOfJoining;
//    
//    Employee(int empId, String empName, String empGender, int yearOfJoining){
//        this.empId = empId;
//        this.empName = empName;
//        this.empGender = empGender;
//        this.yearOfJoining = yearOfJoining;
//    }
//    
//    @Override
//    public String toString(){
//        return "Employee [ ID: "+ empId +" NAME: " + empName + " GENDER: " + empGender + " JOINING YEAR: " + yearOfJoining + " ]";
//    }
//
//    public int compareTo(Employee that) {
//        if(this.yearOfJoining > that.yearOfJoining)
//            return 1;
//        else
//            return -1;
//        
//    }
//}
//public class Employees {
//    public static void main(String[] args){
//        ArrayList<Employee> empList = new ArrayList<>();
//        //add elements through constructors
//        empList.add(new Employee(01, "Tariq", "Male", 2023));
//        empList.add(new Employee(01, "Ali", "Male", 2022));
//        empList.add(new Employee(01, "Ahmed", "Male", 2021));
//        empList.add(new Employee(01, "Aun", "Male", 2020));
//        empList.add(new Employee(01, "Sania", "Female", 2019));
//        
//        //Print the employee list
//        for(Employee e : empList){
//            System.out.println(e);
//        }
//        System.out.println();
//        //Sorted according to year Of Joining through coomparator
//        Comparator<Employee> myComp = new Comparator<Employee>(){
//            public int compare(Employee i, Employee j){
//                if(i.yearOfJoining > j.yearOfJoining)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//        Collections.sort(empList, myComp);
//        //Sorting through comparable
////        Collections.sort(empList);
//        for(Employee e : empList){
////            System.out.println("Sorted List: " + e);
//              System.out.println("Sorted List: " + e);
//        }
//    }
//}
