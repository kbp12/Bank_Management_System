//<editor-fold defaultstate="collapsed" desc="comment">

package javaapplication2;

import java.util.Scanner;

public class Bank_App
{
    String name;
    int acc_no;
    long con_no;
    String adderess;
    static int ROI=10;
    int balance;
    static int bank_acc_count=0;
    static int bank_acc_num[]={244,245,246,247,248,249,250,251,251,253,254};
    Scanner sc=new Scanner(System.in);
    
    
    void createAccount()
    {
        System.out.println("!!!Welcome dear customer!!!");
        System.out.println("\nEnter your name");
        name=sc.nextLine();
        System.out.println("\nEnter your address");
        adderess=sc.nextLine();
        System.out.println("\nEnter your contact number");
        con_no=sc.nextLong();
        System.out.println("\n!!!Your account is created successfully!!!");
        System.out.println("\nYour account number is "+bank_acc_num[bank_acc_count]);
        bank_acc_count++;
    }
    
    void deposit()
    {
        int amount;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("\nYour amount is debited successfully");
    }
    
    void withdraw()
    {
        int amount;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("Your balnce is low...\n!!!INVALID Transaction");
        }
        else {
            balance = balance - amount;
            System.out.println("\nYour amount is withdrawed successfully");
        }
       
    }
    
    void computeInterest()
    {
        int amount;
        int time;
        int SI;
        System.out.println("\nEnter your amount:");
        amount=sc.nextInt();
        System.out.println("\nEnter number of years:");
        time=sc.nextInt();
        SI=(amount*time*ROI)/100;
        System.out.println("\nRate of interest is:"+ROI);
        System.out.println("According to above rates value of simple interest is:"+SI);
    }
    
    void display()
    {
        System.out.println("Name of Accountant   :   "+name);
        System.out.println("Current balance      :   "+balance);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank_App b[]=new Bank_App[10];
        int no=0;
        int flag=0;
        int acc;
        int n=1;
        
        for(int i=0;i<10;i++)
        {
            b[i]=new Bank_App();
        }
        do
        {
            n++;
            System.out.println("1.Create account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Compute Interest");
            System.out.println("5.Display Balance");
            
            System.out.println("\nEnter your choice");
            int ch=sc.nextInt();
            
            
            switch(ch)
            {
                case 1:
                    if(no>9)
                    {
                        System.out.println("!!!sorry for your inconvenience dear user we can procced your request please try again later!!!");
                        no++;
                    }
                    else
                    {
                        b[no].createAccount();
                        no++;
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        if(acc==Bank_App.bank_acc_num[i])
                        {
                            b[i].deposit();
                            flag=1;
                            break;
                            
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                        flag=0;
                    }
                    break;
                    
                    
                case 3:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        if(acc==Bank_App.bank_acc_num[i])
                        {
                            b[i].withdraw();
                            flag=1;
                            break;
                            
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        if(acc==Bank_App.bank_acc_num[i])
                        {
                            b[i].computeInterest();
                            flag=1;
                            break;
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Enter your account number:");
                    acc =sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        if(acc==Bank_App.bank_acc_num[i])
                        {
                            b[i].display();
                            flag=1;
                            break;
                        }
                    }
                    
                    if(flag==0)
                    {
                        System.out.println("\n!!!You are not registred customer....Registere yourself first");
                    }
                    
                    break;
                    
                default:
                    System.out.println("\n!!!Dear dustomer you entered wrong choice");
            }
            System.out.println("Do you want to coninue 1/0:");
            n=sc.nextInt();
        }while(n==1);
        
    }
}
//</editor-fold>
