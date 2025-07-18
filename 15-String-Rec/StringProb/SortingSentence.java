public class SortingSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String []arr=s.split(" ");
        String res[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String x=arr[i];
            int pos=x.charAt(x.length()-1)-'0';
            res[pos-1]=x.substring(0, x.length()-1);
        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<res.length;i++){
            s1.append(res[i]);
            if(i!=res.length-1) s1.append(" ");
        }
        return s1.toString();
    }
}
