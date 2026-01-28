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

// 4. Write Java code to perform the following:
// • Calculate state withholding tax at 3.0% and federal withholding tax at 30.0%
// • Calculate dependent deductions at 5.0% of the employee’s salary for each dependent.
// • Calculate total withholding.
// • Calculate take-home pay as salary minus total withholding plus deductions.
// • Declare constants for each of the percentages above and assign the values to them.
// • Remember to convert percentages to decimals.
// • Use the DecimalFormat class to express the results to two decimal places.
// 5. Save the source code in a directory of your choice.
// 6. Compile the program and fix any syntax errors that may exist.
// 7. Execute the program. You should get the following output:
// • The State Tax is: $28.50
// • The Federal Tax is: $285.00
// • Dependents: $142.50
// • The Salary is: $950.00
// • The Take-Home Pay is: $779.00
// 8. Submit the source code in blackboard for testing