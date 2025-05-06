//This code conatins a method of how to skip a char from string using recursion
public class DeleteChar {
    public static void main(String[] args) {
        String name="baccadh";
        // StringBuilder modified=new StringBuilder(); Using Iteration
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)=='a'){
        //         continue;
        //     }else{
        //         modified.append(name.charAt(i));
        //     }
        // }
        // System.out.println(modified);
        System.out.println(delChar1(name));
    }
    //By passing the argument in function.
    public static void  delChar(String modified, String original){
        if(original.isEmpty()){
            System.out.println(modified);
            return;
        }  
        char ch=original.charAt(0);
        if(ch=='a'){
            delChar(modified, original.substring(1));
        }else{
            delChar(modified+ch, original.substring(1));
        }
    }

    //By not passing the argument in function.
    public static String delChar1(String original){
        if(original.isEmpty()){
            return "";
        }
        char ch=original.charAt(0);
        if(ch=='a'){
            return delChar1(original.substring(1));
        }

        return ch+delChar1(original.substring(1));
    }
}
