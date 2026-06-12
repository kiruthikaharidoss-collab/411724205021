import java.util.Scanner;
class kiru{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a price");
        int price=sc.nextInt();
        System.out.println("Enter a distance");
        int distance=sc.nextInt();
        System.out.println(priceDistance(price,distance));
    }
        public static String priceDistance(int price,int distance){
            if(distance>10){
            return "No Delivery";
        }
        else if(price>1000){
            return "Free Delivery";
        }
        else if(price>500 && distance<5){
            return "Free Delivery";
        }
        else{
            return "Delivery Charge:100";
        }
        }
        
}