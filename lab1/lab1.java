import java.text.DecimalFormat;

public class lab1 {
    
    
    public static void main(String[] args) { 

        double salary = 950.00; 
        final double StateTax = 0.03;  
        final double FederalTax = 0.30; 
        double TotalWithholding; 
        double TakeHomePay; 
        final int NUM_DEPENDENTS = 3; 
        final double DependentRate = 0.05; 
        final double DependentDeduction = salary * (DependentRate * NUM_DEPENDENTS); 

        DecimalFormat df = new DecimalFormat("$#,##0.00");
 
        double OwedFed = FederalTax * salary;
        double OwedState = StateTax * salary; 

        
        System.out.println("The State Tax is: " + df.format(OwedState)); 
        System.out.println("The Federal Tax is: " + df.format(OwedFed));
        System.out.println("Dependents: " + df.format(DependentDeduction));  
        System.out.println("The Salary is: " + df.format(salary));
        TotalWithholding = OwedFed + OwedState;  
        TakeHomePay = salary - TotalWithholding + DependentDeduction;   
        System.out.println("The Take-Home Pay is: " + df.format(TakeHomePay));  



        
    }
}