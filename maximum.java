// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class maximum {
    public static void main(String[] args) {
    int[] arr=new int[]{1,3,4,7,8};
    int max=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
          max=arr[i];
        }
    }
    System.out.println(max);
    
    }
}