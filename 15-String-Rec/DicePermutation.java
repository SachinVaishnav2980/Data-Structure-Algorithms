public class DicePermutation {
    public static void main(String[] args) {
        System.out.println(permutationDice("", 4));
    }

    public static int permutationDice(String modified, int target){
        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=target && i<=6;i++){
            count=count+permutationDice(modified+i, target-i);
        }
        return count;
    }
}
