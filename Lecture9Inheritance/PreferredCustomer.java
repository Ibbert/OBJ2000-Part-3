package Lecture9Inheritance;

public class PreferredCustomer extends Customer{
    
   double discountRate;
   public PreferredCustomer(int id, double bal, double rate){
      super(id, bal);
      discountRate = rate;
   }
   
   @Override
   public void display(){
      super.display();
      System.out.println("   Discount rate is " + discountRate);
   }
   
   
   public void display(int i, double t){
      super.display();
      System.out.println("   Discount rate is " + discountRate);
   }
}