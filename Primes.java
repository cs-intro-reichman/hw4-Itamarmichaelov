public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int members = Integer.parseInt(args[0]);
        boolean[] arr1 = new boolean[members+1];
        int counter = 0;
        for( int a = 2;  a <= members;a++){
            arr1[a] = true;
        } 
        for( int i = 2 ; i <= members;i ++ ){
            for(int j = i+1 ;j <= members ;j++){
                if( j % i == 0){
                  arr1[j]= false;  
                }    
            }
            if (arr1[i] == true ) {
                System.out.println(i); 
                counter++;  
            }
        }
        System.out.println("Prime numbers up to "+members+":");
}
}
