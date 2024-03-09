import java.util.Scanner;
class user{
    protected float balance=0.0f;
    void setbal(float a){
        balance=a;
    }
}
class ATM extends user{
    Scanner sc=new Scanner(System.in);

    void checkbal(){
        System.out.println(balance);
    }
    void withdraw(){
        System.out.print("Enter amount to withdraw: ");
        int c=sc.nextInt();
        if(c<=balance){
            balance-=c;
        
        System.out.println("Transaction Successfully Done!");
        }
        else{
            System.out.println("Transaction Failed insufficient balance");
        }

    }
    void deposit(){
        System.out.print("Enter amount to deposit: ");
        int d=sc.nextInt();
        balance+=d;
        System.out.println("Depposition DOne!");
    }
    
}

class test{
    public static void main(String[] args){
        ATM a1=new ATM();
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i!=1){
            System.out.println("Welcome to the ATM");
            System.out.println("CHoose one of the following: ");
            System.out.println("1. Checkbalance\n2. Withdraw \n3. Deposit 4. Exit!");
            int d=sc.nextInt();
            switch(d){
                case 1:
                    a1.checkbal();
                    break;
                case 2:
                    a1.withdraw();
                    break;
                case 3:
                    a1.deposit();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter a valid choice");
                
            }
            System.out.print("Do you want to use it again o for continue 1 to end: ");
            i=sc.nextInt();
        }
        sc.close();
    }
}