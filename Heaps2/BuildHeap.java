package Heaps2;

import java.util.ArrayList;
import java.util.List;

public class BuildHeap {

    private ArrayList<Integer> list;
    public BuildHeap() {
        list = new ArrayList<>();
    }

    public void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public void insert(int val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(p) < list.get(index)) {
            swap(index, p);
            upheap(p);
        }
    }

    public int remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        int temp=list.get(0);
        int last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);

        if(left<list.size() && list.get(min)<list.get(left)){
            min=left;
        }

        if(right<list.size() && list.get(min)<list.get(right)){
            min=right;
        }

        if(min!=index){
            swap(min, index);
            downheap(min);
        }
    }

    //build from array
    public List<Integer> heapSort() throws Exception{
        List<Integer> data=new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public void buildHeap(int []arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i++){
            downheap(i);
        }   

    }
}
