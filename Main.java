import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Bank myBank = new Bank();
        int withdrawAmount, depositAmount = 0;
        char condition = 'c';

        while(condition != 'Q'){
            System.out.println("Welcome to My Bank");
            System.out.println("Press W for withdraw amount");
            System.out.println("Press D for deposit amount");
            System.out.println("Press C for check balance");
            System.out.println("Press Q for quit");
            System.out.print("Enter Character: ");
            condition = scn.next().charAt(0);

            switch (condition){
                case 'W':
                    System.out.print("Enter Withdraw amount: ");
                    withdrawAmount = scn.nextInt();
                    myBank.withdrawAmount(withdrawAmount);
                    break;
                case 'D':
                    System.out.print("Enter Deposit amount: ");
                    depositAmount = scn.nextInt();
                    myBank.depositAmount(depositAmount);
                    break;
                case 'C':
                    System.out.println("Your Balance is " + myBank.checkBalance());
                    break;
                case 'Q':
                    System.out.println("Come Again");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}