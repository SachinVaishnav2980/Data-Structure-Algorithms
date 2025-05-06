

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    // public static boolean isPalindrome(String s) {
    //     String original=resultantString(s);
    //     int i=0;
    //     int j=original.length()-1;
    //     while(i<=j){
    //         if(original.charAt(i)==original.charAt(j)){
    //             i++;
    //             j--;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static String resultantString(String s){
    //     String newS=s.toLowerCase();
    //     newS = newS.replaceAll("[^a-zA-Z0-9]", "");
    //     return newS;
    // }

    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char first=s.charAt(i);
            char last=s.charAt(j);
            if(!Character.isLetterOrDigit(first)){
                i++;
            }else if(!Character.isLetterOrDigit(last)){
                j--;
            }else{
                if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                    return false;
                }
                i++;
                j--;
            }
        }return true;
    }
}
