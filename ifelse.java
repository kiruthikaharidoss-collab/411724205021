import java.util.Scanner;
class ifelse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mark");
        int mark=sc.nextInt();
        if(mark>=100 && mark>=90){
            System.out.println("Grade A");
        }
        else if(mark>=89 && mark<=75){
            System.out.println("Grade B");
        }
        else if(mark>=74 && mark<=60){
            System.out.println("Grade C");
        }
        else if(mark>=59 && mark<=50){
            System.out.println("Grade D");
        }
        else if(mark>=49 && mark<=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}