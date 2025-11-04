import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoundTrip {

    static class Interval{
        long L;
        long R:
        int optimal;

        Interval(long L, long R, int optimal){
            this.L=L;
            this.R=R;
            this.optimal=optimal;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            long R0=sc.nextLong();
            long X=sc.nextLong();
            long D=sc.nextLong();
            int n=sc.nextInt();
            String s=sc.next();

            List<Interval> curr=new ArrayList<>();
            curr.add(new Interval(R0, R0, 0));

            for(char ch=s.toCharArray()){

                List<Interval> next=new ArrayList<>();

                for(Interval iv:curr){
                    long L=iv.L;
                    long R=iv.R;
                    int optimal=iv.optimal;

                    if(ch=='1'){
                        long newL=Math.max(0, L-D);
                        long newR=R+D;
                        next.add(new Interval(newL, newR, optimal+1));
                    }else{
                        if(R<X){
                            long newL=Math.max(0, L-D);
                            long newR=R+D;
                            next.add(new Interval(newL, newR, optimal+1));
                        }else if(L>=X){
                            next.add(new Interval(L, R, optimal));
                        }else{
                            long leftL = L;
                            long leftR = X - 1;
                            long newL = Math.max(0, leftL - D);
                            long newR = leftR + D;
                            next.add(new Interval(newL, newR, cnt + 1));

                            long rightL = X;
                            long rightR = R;
                            next.add(new Interval(rightL, rightR, cnt));
                        }
                    }
                }
                curr = merge(next);
            }
            int ans = 0;
            for (Interval iv : curr){
                ans = Math.max(ans, iv.cnt);
                System.out.println(ans);
            }
        }
        sc.close();
    }

    static List<Interval> merge(List<Interval> arr) {
        if (arr.isEmpty()) return arr;

        arr.sort((a, b) -> Long.compare(a.L, b.L));

        List<Interval> res = new ArrayList<>();
        Interval prev = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            Interval cur = arr.get(i);

            if (cur.L <= prev.R) {
                prev.R = Math.max(prev.R, cur.R);
                prev.cnt = Math.max(prev.cnt, cur.cnt);
            } else {
                res.add(prev);
                prev = cur;
            }
        }
        res.add(prev);
        return res;
    }
}