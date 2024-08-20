import java.util.*;
public class Atm{
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int Add_Amount =0;
        int Take_Amount =0;


        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pin number: ");
        int password=scanner.nextInt();
        if(password == pin)
        {
          System.out.println("Enter your Name: ");
          name =scanner.next();  
          System.out.println("welcome"+ " " +name);

          while(true)
          {
            System.out.println("press 1 to check your balance");
            System.out.println("press 2 to add amount");
            System.out.println("preess 3 to take amount");
            System.out.println("press 4 to take receipt");
            System.out.println("press 5 to Exit ");
              
            int opt = scanner.nextInt();
            switch(opt)
            {
                case 1:
                {
                   System.out.println("your current balance is " + balance);
                 }
                 break;
                case 2:
                {
                    System.out.println("how much amount do you want to Deposit");
                    Add_Amount = scanner.nextInt();
                    System.out.println("Successfully Deposited");
                    //this is to add balance with existing amount 
                    balance = Add_Amount + balance;
             }
                    break;
                case 3:
                {

               
                    System.out.println("how much did you want to take");
                    Take_Amount = scanner.nextInt();
                    if(Take_Amount>balance)
                    {
                        System.out.println("insufficient balance");
                        System.out.println("try less than the current amount");
                    }
                    else
                    {
                         System.out.println("successfully received");
                         balance = balance - Take_Amount; 
                    }
                }
                    break;
                case 4:
                {
                    System.out.println("welcome to Ajith ATM");
                    System.out.println(" ");
                    System.out.println("Available balance is "+ balance);
                    System.out.println("Amount deposited "+ Add_Amount);
                    System.out.println("Amount taken "+ Take_Amount);
                    System.out.println();
                    System.out.println("Thanks for coming");
                   
                }
                break;
                default:
                 {
                    System.out.println("press the number below 5");
                    break;
                 }
                

            }

            if(opt ==5)
            {
                System.out.println("Thankyou");
                break;
            }   
          }
        }
        else{
            System.out.println("Wrong pin number");
            System.out.println("please enter the valid pin number");
        }
        
    }
}