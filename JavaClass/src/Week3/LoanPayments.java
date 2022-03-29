package Week3;

public class LoanPayments {
    public static void main(String[] args){
        double monthlyPayment, loanAmount = 100000.0, monthlyInterestRate = 0.005;
        int numOfYears = 30;

        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / (Math.pow((1 + monthlyInterestRate), numOfYears * 12)));

        System.out.println("Monthly payment is: " + monthlyPayment);
    }
}
