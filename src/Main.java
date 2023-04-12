import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Principal:");
        float principal = scanner.nextFloat();
        System.out.print("Annual Interest Rate:");
        float interestRate = scanner.nextFloat();
        float monthlyInterestRate = interestRate / 12 / 100;
        System.out.print("Period (Years):");
        float years = scanner.nextFloat();
                float numOfPayments = years * 12;
        //System.out.print(principal + "  " + monthlyInterestRate +"  " + numOfPayments);
        float mortgage = (float) (principal * (monthlyInterestRate * Math.pow (1+ monthlyInterestRate, numOfPayments)
                        / (Math.pow( 1 + monthlyInterestRate, numOfPayments) - 1)));

        System.out.println("Mortgage payments: $" + mortgage);
    }
}