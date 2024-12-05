public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        char[] arr1 =  new char[str.length()];
        for(int i= 0; i < str.length(); i++ ){

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                
                    arr1[i] = (char)(str.charAt(i)+32);
                               
            }
            else{
                arr1[i]=str.charAt(i);
            }
        }
        
        String lowString = "" ;
        {
        for (int j = 0 ; j < arr1.length;j++ ){
            lowString += arr1[j];
        }
        if (lowString.length() == arr1.length) {
            return lowString;
        }
        return null;
    }
    }
    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1.length() >= str2.length()) {
            for (int i =0 ; i<= str1.length()-str2.length();i++){
                boolean match = true;
                for( int j =0; j < str2.length();j++){
                    if ( str1.charAt(i+j) != str2.charAt(j)){
                        match=false;
                        break;
                    }
                }
                if (match) {
                    return true;
                    
                }  
                  
                        
                    
                }
            }
        
        
        return false;
    }
}

