package Codsoft;
import java.util.Scanner;

class atm{

    float balance;
    int pin= 1234;
    public void checkpin(){

        System.out.println("Enter the PIN:");
        Scanner scanner = new Scanner(System.in);
        int userpin=scanner.nextInt();

        if(userpin == pin){
            menu();
        }
        else{
            System.out.println("Invalid PIN");
            menu();
        }

        scanner.close();
    }

    public void menu(){
        System.out.println("Enter 1 to check Account Balance");
        System.out.println("Enter 2 to Withdraw Money");
        System.out.println("Enter 3 to Deposit Money");
        System.out.println("Enter 4 to Exit");
        System.out.println("Enter your Choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice=scanner.nextInt();

        if(choice==1){
            checkBalance();
        }

        else if(choice==2){
            withdrawMoney();
        }

        else if(choice==3){
            depositMoney();
        }

        else if(choice==4){
            return;
        }

        else{
            System.out.println("Enter a Valid Choice");
        }
        scanner.close();
    }

    public void checkBalance(){

        System.out.println("BALANCE: " +balance);
        menu();

    }

    public void withdrawMoney(){

        System.out.println("Enter amount to be withdrawn: ");
        Scanner scanner = new Scanner(System.in);
        float amount=scanner.nextFloat();

        if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Money Withdrawn Successfully");
            
        }

        menu();

        scanner.close();

    }
    public void depositMoney(){

        System.out.println("Enter the Amount to be Deposited: ");
        Scanner scanner = new Scanner(System.in);
        float amount=scanner.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successfully");
        menu();

        scanner.close();

    }


}

public class AtmMAchine {
    public static void main(String[] args){

    Scanner scanner=new Scanner(System.in); 
    atm obj = new atm();
    obj.checkpin();

    scanner.close();
    }
}
