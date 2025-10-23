import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> outer=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            outer.add(rowGenerator(i));
        }   
        return outer;
    }

    List<Integer> rowGenerator(int row){
        List<Integer> inner=new ArrayList<>();
        inner.add(1);
        int res=1;
        for(int col=1;col<row;col++){
            res=res*(row-col);
            res=res/col;
            inner.add(res);
        }
        return inner;
    }

    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> outer=new ArrayList<>();
    //     for(int i=1;i<=numRows;i++){
    //         if(i==1){
    //             List<Integer> inner=new ArrayList<>();
    //             inner.add(1);
    //             outer.add(inner); 
    //         }else if(i==2){
    //             List<Integer> inner=new ArrayList<>();
    //             inner.add(1);
    //             inner.add(1);
    //             outer.add(inner);
    //         }else{
    //             List<Integer> inner=new ArrayList<>();
    //             inner.add(1);
    //             List<Integer> prev=outer.get(outer.size()-1);
    //             for(int j=0;j<prev.size();j++){
    //                 if(j+1<prev.size()){
    //                     inner.add(prev.get(j)+prev.get(j+1));
    //                 }
    //             }
    //             inner.add(1);
    //             outer.add(inner);
    //         }
    //     }
    //     return outer;
    // }
}
