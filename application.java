class application{
    public static void main(String[] args){
        int amount=3800;
        if(amount%100!=0){
            System.out.println("Amount not sufficient");
        }
        int fivecount=amount/500;
        amount=amount-500 * fivecount;
        int twocount=amount/200;
        amount=amount-200*twocount;
        int onecount=amount/100;
        amount=amount-100*onecount;
        if(amount==0){
            System.out.println("Dispensive Amount");
        }
        else{
            System.out.println("Cannot Dispensive");
        }


    }
}