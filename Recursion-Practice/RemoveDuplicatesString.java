
public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String original="aaaaaabbbbbb";
        System.out.println(remove(original));
    }

    public static String remove(String original){
        if(original.length()<=1){
            return original;
        }

        if(original.charAt(0)==original.charAt(1)){
            return remove(original.substring(1));
        }else{
            return original.charAt(0)+remove(original.substring(1));
        }
    }
}