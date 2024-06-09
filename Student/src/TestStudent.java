//blue print of a Student Class
class Student
{
    //Has-A part //instance/object variables => //HEAP area
    String sid;
    String name;
    int age;
    char gender;
    String Standard;
    String email;
    String address;
    
    //Does part //instance methods
    public void study(){}
    public void play(){}
    public void eat(){}
    public void sleep(){}
}

//Test class for testing the code
public class TestStudent{
	//variables devlared inside a class and outside a method such variables are called as the instance variables.
	//if the value of the variables changes from object to object such variables are called instance variables.
	int x; //default value is 0
    
    //Driving code 
    public static void main (String[] args) { 
    	
    	//local variable
    	//primitive variables are used to represent primitive values.
    	int x = 10;
    	
        //reference varialbes are used to refer objects	//object creation
        Student std = new Student();
        Student std1 = new Student();
        
        System.out.println(std);//hashcode
        System.out.println(std1);//hashcode
        
        
        std.sid = "S001";
        std.name = "sidduganesh";
        std.gender = 'M';
        std.age=22;
        std.email="sidduganeshengineer@gmail.com";
        std.address="vnpally,gandipet,r.r.dist";
        
        
        
        
    }
}