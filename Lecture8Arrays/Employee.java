package Lecture8Arrays;

public class Employee{
    
   private int empNum;
   private double empSal;
   
   Employee(int e, double s){
      empNum = e;
      empSal = s;
   }
   
   public int getEmpNum(){
      return empNum;
   }  

   public double getSalary(){
      return empSal;
   }
   
   public void setSalary(double newSalary){
      empSal = newSalary;
   }
   
}
