import java.util.Date;
import java.util.Scanner;

public class LoanApp{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interest = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(interest, years, loanAmount);
        double monthly = Math.round(loan.getMonthlyPayment()*100.0)/100.0;
        double total = Math.round(loan.getTotalPayment()*100.0)/100.0;
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + monthly);
        System.out.println("The total payment is " + total);
    }

}