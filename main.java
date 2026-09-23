import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            double roundedValue = Math.round(futureValue * 100.0) / 100.0;
            System.out.println(years + "     " + roundedValue);
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}