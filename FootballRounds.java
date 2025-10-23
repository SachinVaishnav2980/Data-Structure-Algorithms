    import java.util.Scanner;
    public class FootballRounds {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int n=sc.nextInt();
                int ans=rounds(n);
                System.out.println(ans);
            }
        }   

        static int rounds(int n){
            int winnerGroup=n;
            int looserGroup=0;
            int rounds=0;

            //initial division
            if(n%2==0){
                rounds++;
                winnerGroup=looserGroup=n/2;
            }else{
                rounds++;
                winnerGroup=n/2+1;
                looserGroup=n/2;
            }

            //Both group have more than 1 teams
            while (winnerGroup!=1 || looserGroup!=1) {
                rounds++;
                int temp=0;
                if(winnerGroup%2==0){
                    temp+=winnerGroup/2;
                    winnerGroup=winnerGroup/2;

                }else{
                    temp+=winnerGroup/2;
                    winnerGroup=winnerGroup/2+1;
                }

                if(looserGroup%2==0){
                    looserGroup=looserGroup/2;
                }else{
                    looserGroup=looserGroup/2+1;
                }

                looserGroup+=temp;
            }

            //either winnerGroup has more than 1 team
            while (winnerGroup!=1) {
                rounds++;
                int temp=0;
                if(winnerGroup%2==0){
                    temp+=winnerGroup/2;
                    winnerGroup=winnerGroup/2;

                }else{
                    temp+=winnerGroup/2;
                    winnerGroup=winnerGroup/2+1;
                }
                looserGroup+=temp;
            }

            //or looserGroup has more than 1 team
            while (looserGroup!=1) {
                rounds++;
                if(looserGroup%2==0){
                    looserGroup=looserGroup/2;
                }else{
                    looserGroup=looserGroup/2+1;
                }
            }

            return rounds+1;
        }
    }
