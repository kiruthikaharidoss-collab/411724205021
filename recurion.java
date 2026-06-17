//public class recurion{
    
    /*public static void main(String []args){
        System.out.println(   printpow(4,5));
    }

    public static int printpow(int a,int b){
        if(b<=0){
            return 1;
        }
        return a*printpow(a,b-1);
    }
}/* */
/*public class recurion{

    public static void main(String[] args) {
        System.out.println( factorialNum(5));
    }

    public static int factorialNum(int n) {

        if (n <= 0) {
            return 1; 
            
        }
      return n * factorialNum(n - 1);


}//* */
/*public class recurion {
     public static void main(String[] args) {
        printNum(7);
     }

     public static void printNum(int n){
        if(n<=0)
            return;
            
        else
           
            printNum(n-1);
            if(n%2==0){
             System.out.println(n);
        
     }
}
}//* */
//public class recurion {
     //public static void main(String[] args) {
        //printNum(7);
     //}

     //public static void printNum(int n){
        //if(n<=0)
           // return;
            
        //else
           
            //printNum(n-1);
            // System.out.println(n);
        
     //}
//}
public class recurion{
     public static void main(String[] args) {
        printNum(7);
     }

     public static void printNum(int n){
        if(n<=0)
            return;
            
        else
            System.out.println(n);

           
            printNum(n-1);
     }
}

