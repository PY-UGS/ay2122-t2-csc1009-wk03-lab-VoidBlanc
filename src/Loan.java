package main.lab03and04;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){

        double interest = (this.annualInterestRate/100) / 12.0;
        double payment = (this.loanAmount * interest) / (1.0 - (1.0/ Math.pow((1.0 + interest), this.numberOfYears * 12.0)));
        return payment;
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * this.numberOfYears * 12;
    }

}
