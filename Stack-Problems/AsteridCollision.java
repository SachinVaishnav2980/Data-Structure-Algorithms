
import java.util.Arrays;
import java.util.Stack;

public class AsteridCollision {
    public static void main(String[] args) {
        int []asteroids = {10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int element:asteroids){
            boolean alive=true;
                while (alive && element<0 && !stack.isEmpty() && stack.peek()>0) {
                    int target=stack.peek();
                    if(target==-element){
                        stack.pop();
                        alive=false;
                    }else if(target<-element){
                        stack.pop();
                    }else{
                        alive=false;
                    }
                }
                if(alive){
                    stack.push(element);
                }
        }
        int []ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}
