import java.util.Scanner;
class Student{
    private int roll;
    private float DBMS;
    private float DM;
    private  float DSA;
    private float OS;
    private  float CN;
    void setval(float a,float b, float c,float d,float e,int f){
        DBMS=a;
        DM=b;
        DSA=c;
        OS=d;
        CN=e;
        roll=f;
    }
    void display(){
        System.out.print("Roll no= "+roll+"\n");
        System.out.print("Marks in DBMS is: "+DBMS+"\n");
        System.out.print("Marks in DSA is: "+ DSA+"\n");
        System.out.print("Marks in DM is: "+DM+"\n");
        System.out.print("Marks in OS is: "+OS+"\n");
        System.out.print("Marks in CN is: "+CN+"\n");
    }

    public float percentage(){
        float sum=DBMS+DSA+OS+CN+DM;
        float per=sum/5;
        System.out.println("percentage scored by roll no "+roll+" is "+per);
        return per;
    }
    public void grade(){
        float gra=percentage();
        if(gra>=95.0){
            System.out.println("Grade scored is O");
        }
        else if(gra>=85.5&&gra<95.0){
            System.out.println("Grade scored is A");
        }
        else if(gra>=75.5&&gra<85.5){
            System.out.println("Grade scored is B");
        }
        else if(gra>=65.5&&gra<75.5){
            System.out.println("Grade scored is C");
        }
        else if(gra>=55.5&&gra<65.5){
            System.out.println("Grade scored is D");
        }
        else if(gra>=45.5&&gra<55.5){
            System.out.println("Grade scored is E");
        }
        else{
            System.out.println("Grade scored is F you are failed");
        }
    }
}
class hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter roll no");
        int f=sc.nextInt();
        System.out.println("Enter marks in DBMS");
        float a=sc.nextFloat();
        System.out.println("Enter marks in DM");
        float b=sc.nextFloat();
        System.out.println("Enter marks in DSA");
        float c=sc.nextFloat();
        System.out.println("Enter marks in OS");
        float d=sc.nextFloat();
        System.out.println("Enter marks in CN");
        float e=sc.nextFloat();
       
        s.setval(a, b, c, d, e,f);
        s.display();
        s.grade();
        sc.close();
    }
}
