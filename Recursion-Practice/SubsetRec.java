import java.util.ArrayList;
public class SubsetRec {
    public static void main(String[] args) {
        int []arr={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        subset(0, list, arr, ans);
        System.out.println(ans);
    }

    public static void subset(int index, ArrayList<Integer> list, int []arr, ArrayList<ArrayList<Integer>> ans){
        if(index==arr.length){
            // System.out.println(list);
            ans.add(new ArrayList<>(list));  //add a copy of the current subset
            // System.out.println(ans);
            return;
        }

        list.add(arr[index]);
        subset(index+1, list, arr, ans);
        list.remove(list.size()-1);
        subset(index+1, list, arr, ans);
    }

    // Imagine you're writing entries in a journal:
    // result.add(current) is like writing in one notebook and saying “this page is Day 1, this page is Day 2,” but you're always writing on the same page — when you look back, all days are the same.
    // result.add(new ArrayList<>(current)) is like photocopying the page each day and saving the photocopy — so even if the original changes, the saved copies are preserved.
}
