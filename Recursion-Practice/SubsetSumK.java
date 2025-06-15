import java.util.ArrayList;
public class SubsetSumK {
    public static void main(String[] args) {
        int []arr={10,1,2,7,6,1,5};
        int k=8;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=subsetList(arr, k, 0, list, 0);
        System.out.println(ans);
        // System.out.println(subsetcount(arr, k, 0, 0));


    }
    public static ArrayList<ArrayList<Integer>> subsetList(int []arr, int k, int index, ArrayList<Integer> list, int sum){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        subsetK(arr, k, index, list, sum, ans);
        return ans;
    }

    public static void subsetK(int []arr, int k, int index, ArrayList<Integer> list, int sum, ArrayList<ArrayList<Integer>> ans){
        if(index==arr.length){
            if(sum==k){
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
        list.add(arr[index]);
        sum+=arr[index];
        subsetK(arr, k, index+1, list, sum, ans);
        list.remove(list.size()-1);
        sum-=arr[index];
        subsetK(arr, k, index+1, list, sum, ans);
    }

    //return only one subset 
    // public static ArrayList<ArrayList<Integer>> subsetList(int []arr, int k, int index, ArrayList<Integer> list, int sum){
    //     ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    //     subsetK(arr, k, index, list, sum, ans);
    //     return ans;
    // }

    // public static boolean subsetK(int []arr, int k, int index, ArrayList<Integer> list, int sum, ArrayList<ArrayList<Integer>> ans){
    //     if(index==arr.length){
    //         if(sum==k){
    //             ans.add(new ArrayList<>(list));
    //             return true;
    //         }
    //         return false;
    //     }
    //     list.add(arr[index]);
    //     sum+=arr[index];
    //     if(subsetK(arr, k, index+1, list, sum, ans)==true){
    //         return true;
    //     }
    //     list.remove(list.size()-1);
    //     sum-=arr[index];
    //     if(subsetK(arr, k, index+1, list, sum, ans)==true){
    //         return true;
    //     }
    //     return false;
    // }

    // Count subsequences
    public static int subsetcount(int []arr, int k, int index, int sum){
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr[index];
        int left=subsetcount(arr, k, index+1, sum);
        sum-=arr[index];
        int right=subsetcount(arr, k, index+1, sum);
        return left+right;
    }

}
