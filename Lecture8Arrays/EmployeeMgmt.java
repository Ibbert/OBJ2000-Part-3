package Lecture8Arrays;


public class EmployeeMgmt{
    
    public static void main(String[] args){
        final int START_NUM = 101;
	final double STARTING_SALARY = 15_000;
        
        Employee[] emps = new Employee[7];
        
	for(int x = 0; x < emps.length; ++x)
	   emps[x] = new Employee(START_NUM + x,STARTING_SALARY);
	  
	for(int x = 0; x < emps.length; ++x){
	   emps[x].setSalary(35000);
	}  
	
	emps[0].setSalary(45000);
	
	for(Employee worker : emps){
	    System.out.println("Salary of the employee with id:" 
	                       + worker.getEmpNum() + " is " 
	                       + worker.getSalary() + " NOK");
	}

    }
  
}
