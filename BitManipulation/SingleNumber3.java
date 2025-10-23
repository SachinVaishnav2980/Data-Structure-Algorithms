package BitManipulation;

import java.util.PriorityQueue;

public class SingleNumber3 {

    public static void main(String[] args) {
        
    }
    public int[] singleNumber(int[] nums) {
        long xor=0;
        for(int element:nums) xor=xor^element;

        long rightMost = xor & (-xor);
        int b1=0;
        int b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & rightMost) != 0){ 
                b1=b1^nums[i];
            }
            else{
                b2=b2^nums[i];
            }
        }

        return new int[]{b1, b2};
           
    }

    class Pair<F, S>{
        F first;
        S second;

        public Pair(F first, S second){
            this.first=first;
            this.second=second;
        }
    }

    public int trapRainWater(int[][] heightMap) {
        int n=heightMap.length;
        int m=heightMap[0].length;
        boolean visited[][]=new boolean[n][m];
        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> pq =new PriorityQueue<>((a, b) -> a.first - b.first);
        int [][]dir={{0,-1},{-1,0},{0,1},{1,0}};

        for(int i=0;i<n;i++){
            pq.add(new Pair<>(heightMap[i][0], new Pair<>(i, 0)));
            pq.add(new Pair<>(heightMap[i][m-1], new Pair<>(i, m-1)));
            visited[i][0]=true;
            visited[i][m-1]=true;
        }

        for(int j=0;j<m-1;j++){
            pq.add(new Pair<>(heightMap[0][j], new Pair<>(0, j)));
            pq.add(new Pair<>(heightMap[n-1][j], new Pair<>(n-1, j)));
            visited[0][j]=true;
            visited[n-1][j]=true;
        }

        int level=0;
        int water=0;
        while (!pq.isEmpty()) {
            int height=pq.peek().first;
            int i=pq.peek().second.first;
            int j=pq.peek().second.second;
            pq.poll();

            level=Math.max(level, height);

            for (int[] d : dir) {
                int ni = i + d[0];
                int nj = j + d[1];
                if (isValid(ni, nj, n, m) && !visited[ni][nj]) { 
                    visited[ni][nj] = true;                      
                    int neighbour = heightMap[ni][nj];
                    if (neighbour < level) {
                        water += level - neighbour;
                    }
                    pq.add(new Pair<>(Math.max(neighbour, level), new Pair<>(ni, nj)));
                }
            }
        }
        return water;
    }

    boolean isValid(int i, int j, int n, int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
}
