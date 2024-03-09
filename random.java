import java.util.Random;
import java.util.Scanner;

 class RandomNumber{

  //function to check user input;
  public static void numcheck(){
    Random random = new Random();
   
    int randomnumber = random.nextInt(100) + 1; // Generates random int from 0 to 99, +1 for 1 to 100
    
    int count=0;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<10;i++){
      System.out.printf("Enter a number between 1& 100: ");
      int x=sc.nextInt();
      if(x<randomnumber){
        System.out.println(x+" is less than computer number");
        
      }
      else if(x>randomnumber){
        System.out.println(x+" is grater than computer random");
      }
      else{
        System.out.println("You guessed it right\n Your score is "+(10-i));
        count=1;
        break;
      }
      sc.close();
    }
    if(count==0){
      System.out.println("You couldn't guessed it right\n Better luck next time");
    }
  }


  public static void main(String[] args) {
    //driver code
    Scanner sc=new Scanner(System.in);
    int s=0;
    while(s==0){
    System.out.println("\n\nWelcome to the game in this game user will enter a number which if\nis equal to number thought by computer then you will win\n");
    System.out.println("You will be given 10 chances and computer will give you\n hint about your choosed number\n");
    System.out.println(" ");
    System.out.print("Press 1 to play the game and 0 to exit:- ");
    int choice=sc.nextInt();
    if(choice==1){
      numcheck();
    }
    else{
      break;
    }
    System.out.print("Do you want to play again 1 for yes 0 for no:- ");
    choice=sc.nextInt();
    if(choice==1){
      s=0;
    }
    else{
      s=1;
    }    
  }
  sc.close();
}
}