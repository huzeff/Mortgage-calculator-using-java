import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       final int month_In_Year = 12;
       final int precent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

       Scanner scanner = new Scanner(System.in);

       while(true) {

       System.out.print("Principal (INR 1000 to INR 1000000) : ");
       principal = scanner.nextInt();
       if(principal >= 1000 && principal <= 1_000_000){
            break;
       }
       System.out.println("enter number between 1000 to 1_000_000");
       }


       while (true) { 
           
       System.out.print("Annual Intrest Rate : ");
       float annualInterest = scanner.nextFloat();
       if(annualInterest >= 1 && annualInterest <= 100){
       monthlyInterest = annualInterest / month_In_Year / precent ;
                break;
       }
       System.out.println("enter number between 1 to 100");
       
       }


       while (true) { 
           
       System.out.print("period (years) : ");
       int years = scanner.nextInt();
       if(years >= 1 && years <= 50){
       numberOfPayments = years * month_In_Year ;
                break;
       }

       System.out.println("enter year between 1 to 50");

       }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/(Math.pow( 1 + monthlyInterest, numberOfPayments)-1));

        Currency indianRupee = Currency.getInstance("INR");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage : " + indianRupee.getDisplayName() + " " + mortgageFormatted);




    }
}