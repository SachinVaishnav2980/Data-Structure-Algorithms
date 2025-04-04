public class LinearSearchString {
    public static void main(String[] args) {
        String str="Sachin";
        char target='h';
        int ans=linearSearchString(str, target);
        System.out.println(ans);
    }

    public static int linearSearchString(String name, char target){
        if(name.length()==0){
            return -1;
        }

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
