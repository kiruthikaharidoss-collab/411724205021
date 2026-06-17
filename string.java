import java.util.Scanner;
class string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean rotation=true;
        for(int i=0;i<str1.length();i++){
            str1=str1.substring(1)+str1.charAt(0);
            if(str1.endsWith(str2)){
                rotation=false;
                break;
            }

        }  
        if(rotation){
            System.out.println("Rotation");
        }
        else{
            System.out.println(" Not a Rotation");
        }  
    }

}