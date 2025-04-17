public class magicNumber {
    public static void main(String[] args) {
        System.out.println(magicnumber(7));
    }

    public static int magicnumber(int num){
        int ans=0;
        int base=5;
        while(num>0){
            int last=num & 1;
            num = num >> 1;
            ans += last*base;
            base= base*5 ;
        }
        return ans;
    }

}
