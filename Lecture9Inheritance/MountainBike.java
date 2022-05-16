package Lecture9Inheritance;


class MountainBike extends Bicycle { 
      
    // the MountainBike subclass adds one more field 
    private int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public MountainBike(int gear,int speed, 
                        int startHeight){ 
        // invoking base-class(Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    // the MountainBike subclass adds one more method 
    public void setHeight(int newValue) { 
        seatHeight = newValue; 
    }  
      
    // overriding printInfo() method 
    // of Bicycle to print more info 
    @Override
    public String printInfo(){ 
        return (super.printInfo()+ 
                "\nseat height is "+seatHeight); 
    } 
      
}