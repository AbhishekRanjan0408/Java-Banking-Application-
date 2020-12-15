import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
	
    BankAccount obj1= new BankAccount("Abhishek Ranjan","CSE194101") ;
    obj1.showMenu();
	
	}

     }
  class BankAccount {
	  int balance ;
	  int previousTransaction ;
	  String customername ;
	  String customerId ;
	 
	  BankAccount( String cname , String cid ){  
		  customername=cname ;
		  customerId=cid ;  
		  
	  }
  
    void deposite(int amount ) {  
    	if(amount !=0 ) {
    		balance=balance+amount ;
    		previousTransaction = amount  ;
    	}
	  }
    
    void withdraw(int amount) {   
    	if(amount !=0 ) {
    		balance = balance- amount ;
    		previousTransaction = -amount ;
    	}
    }
    
    
    void getpreviousTransection() 
    {
    	if(previousTransaction>0) {
    		System.out.println("Deposite:"+previousTransaction);
    	}
    	else if(previousTransaction<0) {
    		System.out.println("Withdraw="+Math.abs(previousTransaction));  
    	}else {
    		System.out.println("No transaction occured ");
    	}
    }
    
    void showMenu() 
    {
    	
    	char option ='\0' ;  
    	Scanner scanner= new Scanner(System.in) ;
    	
    System.out.println("Welcome"+" "+customername); 
    System.out.println("Your ID is "+customerId);
    System.out.println("\n");   
    System.out.println("A. Check Balance");
    System.out.println("B. Deposite ");
    System.out.println("C. Withdraw");
    System.out.println("D. previous transaction ");
    System.out.println("E. Exit ");
    
    do 
    {
    	System.out.println("*****************************************") ;
    	System.out.println("Enter an Option ");
    	System.out.println("******************************************");
    	option=scanner.next().charAt(0);
    System.out.println("\n");
    
    switch(option ) {
    
    case 'A'  :
    	System.out.println("******************************************");
    	System.out.println("Balance="+balance);
    	System.out.println("******************************************");
    	System.out.println("\n");
    	break ;
    	
    case 'B'  :
    	
    	System.out.println("******************************************");
    	System.out.println("Enter an Amount To Deposite ");
    	System.out.println("******************************************");
        int amount =scanner.nextInt() ;
        deposite(amount) ;   
      	System.out.println("\n");
      	break ;
    	
   case 'C'  :
    	
    	System.out.println("******************************************");
    	System.out.println("Enter Amount To Withdraw");
    	System.out.println("******************************************");
    	int amount2=scanner.nextInt() ;
    	withdraw(amount2);
    	System.out.println("\n");
    	break ;
    	
   case 'D'  :
   	
   	System.out.println("******************************************");
    getpreviousTransection(); 
   	System.out.println("******************************************");
   	System.out.println("\n");
   	break ;
   	
   case 'E' :
		System.out.println("******************************************");
		break ;
    
   	default:
   		System.out.println("Invalid Option ! Please Enter Again");
   		break  ;
   }
    }
    
   while(option !='E') ;
    System.out.println("Thank You For Using Our Service ");
    }
    }
  
  
  