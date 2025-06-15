public class StringPermutation {
    public static void main(String[] args) {
        String original="abc";
        permutation("", original);

    }

    public static void permutation(String modified, String original){
        if(original.isEmpty()){
            System.out.println(modified);
            return;
        }

        for(int i=0;i<=modified.length();i++){
            char ch=original.charAt(0);
            String f=modified.substring(0, i);
            String s=modified.substring(i, modified.length());
            permutation(f+ch+s, original.substring(1));
        }
    }
}
