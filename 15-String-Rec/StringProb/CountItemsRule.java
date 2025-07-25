//Count Items Matching a Rule
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CountItemsRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        System.out.println(countMatches(items, "type", "phone"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            List<String> item=items.get(i);
            if(ruleKey.equals("type")){
                if(item.get(0).equals(ruleValue)){
                    count++;
                }
            }else if(ruleKey.equals("color")){
                if(item.get(1).equals(ruleValue)){
                    count++;
                }
            }else{
                if(item.get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}
