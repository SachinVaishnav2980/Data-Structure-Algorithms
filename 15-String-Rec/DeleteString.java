public class DeleteString {
    public static void main(String[] args) {
        String name="bcdefappleghijk";
        System.out.println(delStringNotApple(name));
    }

    public static String delString(String original){
        if(original.isEmpty()){
            return "";
        }
        char ch=original.charAt(0);
        if(original.startsWith("apple")){
            return delString(original.substring(5));
        }

        return ch+delString(original.substring(1));
    }

    public static String delStringNotApple(String original){
        if(original.isEmpty()){
            return "";
        }
        char ch=original.charAt(0);
        if(original.startsWith("app") && !original.startsWith("apple")){
            return delStringNotApple(original.substring(3));
        }

        return ch+delStringNotApple(original.substring(1));
    }
}
