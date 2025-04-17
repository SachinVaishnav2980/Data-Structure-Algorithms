public class SingleOccurence {
    public static void main(String[] args) {
        int []nums={2,3,4,1,2,1,3,6,4};
        System.out.println(Singleoccurence(nums));
    }

    public static int Singleoccurence(int []nums){
        int unique=0;
        for(int num: nums){
            unique ^= num;
        }

        return unique;
    }
}
