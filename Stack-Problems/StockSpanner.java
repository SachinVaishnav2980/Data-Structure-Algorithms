import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;
// Brute force - Worst time complexity
// class StockSpanner {


//     private ArrayList<Integer> list;
//     private int count;

//     public StockSpanner() {
//         this.list=new ArrayList<>();
//     }
    
//     public int next(int price) {
//         list.add(price);
//         count=1;
//         for(int i=list.size()-2;i>=0;i--){
//             if(list.get(i)<=price) count++;
//             else break;
//         }
//         return count;
//     }
// }

//Optimized approach
class StockSpanner {

    Stack<Map.Entry<Integer, Integer>> stack;
    int index=-1;

    public StockSpanner() {
        this.stack=new Stack<>();
    }
    
    public int next(int price) {
        index++;
        while (!stack.isEmpty() && stack.peek().getKey() <= price) {
            stack.pop();
        }
        int ans=index-(stack.isEmpty()?-1:stack.peek().getValue());
        stack.push(new AbstractMap.SimpleEntry<>(price, index));
        return ans;
    }
}