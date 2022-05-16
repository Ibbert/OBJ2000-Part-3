package Lecture9Inheritance;
class Bicycle { 
    // the Bicycle class has two fields 
    private int gear; 
    private int speed; 
          
    // the Bicycle class has one constructor 
    public Bicycle(int gear, int speed){ 
        this.gear = gear; 
        this.speed = speed; 
    } 
          
    // the Bicycle class has three methods 
    public void applyBrake(int decrement){ 
        speed -= decrement; 
    } 
          
    public void speedUp(int increment){ 
        speed += increment; 
    } 
    
    public void speedUp(){ 
        speed ++; 
    } 
    
    public void gearUp(){ 
        gear ++; 
    } 
      
    // printInfo() method to print info of Bicycle 
    public String printInfo(){ 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
} 