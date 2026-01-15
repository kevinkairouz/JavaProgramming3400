

public class ProgramChallenge {

    public static void p1(){ 

        String name = "Kevin"; 
        int age = 21; 
        double annualPay = 145000;  

        System.out.print("My name is " + name + ", "); 
        System.out.println("my age is " + age + " and"); 
        System.out.print("I hope to earn " + annualPay + " per year."); 



    } 

    public static void p2(){ 
        String firstName = "Kevin"; 
        String middleName = "Michael"; 
        String lastName = "Kairouz"; 

        char firstInitial = 'K'; 
        char middleInitial = 'M'; 
        char lastInitial = 'K'; 
        
        System.out.println(firstName + " " + middleName + " " + lastName); 
        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);   
    } 
    public static void p3(){
        System.out.println("Kevin Michael Kairouz"); 
        System.out.println("I live at 4617 6th Avenue, Brooklyn, NY 11220"); 
        System.out.println("917-319-5306"); 
        System.out.println("My major is Computer Science");
    }

    public static void p5(){
        int num1 = 62; 
        int num2 = 99;
        int sum = num1 + num2; 
        System.out.println("The sum of 62 and 99 is: " + sum);


    }
    public static void main(String[] args) { 

        p1(); 
        System.out.println(); 
        System.out.println();
        p2();  
        System.out.println();  
        System.out.println();
        p3(); 
        System.out.println();  
        System.out.println();
        p5();
    }

    
    
}
