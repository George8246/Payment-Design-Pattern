package paymentmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Please Enter The Payment Method "
                + "(Cash, Check or Credit)");

        String typeOfPayment = x.next();

        //checking the type of payment to create the necessary Object
        switch (typeOfPayment) {
            case "Cash":
            case "cash":
                Cash cash = new Cash(20, 30);
                PCash pcash = new PCash();
                pcash.printReceipt(cash.amount);
                break;
            case "Check":
            case "check":
                Check check = new Check(20, "George", "George123");
                PCheck pcheck = new PCheck();
                ACheck acheck = new ACheck();
                pcheck.printReceipt(check.amount);
                acheck.authorized();
                break;
            case "Credit":
            case "credit":
                Credit credit = new Credit(22, "George", "Debit", "22-11-2022");
                ACredit acredit = new ACredit();
                acredit.authorized();
                break;
            default:
                System.out.println("please type the correct input (Cash, Check or Credit)");
                break;

        }
    }
}
