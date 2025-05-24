//This program finds the first uppercase letter in a string.

public class FirstUpperCase {
    public static void main(String[] args) {
        String name="geeksforgeeKs";
        System.out.println(firstUppercaseLetter(name));
    }

    public static Character firstUppercaseLetter(String s){
        if(s.isEmpty()){
            return '0';
        }
        char ch=s.charAt(0);
        if(Character.isUpperCase(ch)){
            return ch;
        }
        return firstUppercaseLetter(s.substring(1));
    }
}
