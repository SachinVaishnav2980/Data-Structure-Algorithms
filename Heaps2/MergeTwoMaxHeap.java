package Heaps2;

import java.util.*;

public class MergeTwoMaxHeap {
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            list.add(b[i]);
        }
        int size=list.size();
        
        for(int i=size/2-1;i>=0;i--){
            heapify(list, i, size);
        }
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=list.get(i);
        }
        
        return arr;
    }
    
    void heapify(List<Integer> list, int index, int size){
        int max=index;
        int left=2*index+1;
        int right=2*index+2;
        
        if(left<size && list.get(left)>list.get(max)){
            max=left;
        }
        
        if(right<size && list.get(right)>list.get(max)){
            max=right;
        }
        
        if(max!=index){
            swap(list, max, index);
            heapify(list, max, size);
        }
    }
    
    void swap(List<Integer> list, int first, int second){
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
