import java.util.ArrayList;


public class TelephoneComb {
    public static void main(String[] args) {
        System.out.println(letterCombinationsList("", "23"));
    }

    public static void letterCombinations(String modified, String original) {
        if(original.isEmpty()){
            System.out.println(modified);
            return ;
        }

        int digit=original.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            letterCombinations(modified+ch, original.substring(1));
        }
    }

    public static ArrayList<String> letterCombinationsList(String modified, String original) {
        if(original.isEmpty()){
            ArrayList<String> modifList=new ArrayList<>();
            modifList.add(modified);
            return modifList;
        }

        int digit=original.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(letterCombinationsList(modified+ch, original.substring(1)));
        }
        return list;
    }
}
