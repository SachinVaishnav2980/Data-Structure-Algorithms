package Heaps2;

import java.util.*;

public class FindKClosestElement {

    public static void main(String[] args) {
        
    }

    //Brute Force...
    // class Pair{
    //     int first;
    //     int second;

    //     public Pair(int first, int second){
    //         this.first=first;
    //         this.second=second;
    //     }
    // }

    // public List<Integer> findClosestElements(int[] arr, int k, int x) {
    //     PriorityQueue<Pair> pq = new PriorityQueue<>(
    //     (a, b) -> a.first == b.first ? b.second - a.second : b.first - a.first
    // );
    //     for(int i=0;i<arr.length;i++){
    //         pq.add(new Pair(Math.abs(arr[i] - x), arr[i]));
    //         if(pq.size()>k){
    //             pq.poll();
    //         }
    //     }
    //     List<Integer> res=new ArrayList<>();
    //     while (!pq.isEmpty()) {
    //         res.add(pq.peek().second);
    //         pq.poll();
    //     }
    //     Collections.sort(res);
    //     return res;
    // }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=floor(arr, x);
        int n=arr.length;
        int j=i+1;
        List<Integer> list=new ArrayList<>();
        while (k>0 && i>=0 && j<n){
            if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)){
                list.add(arr[i]);
                i--;
            }else{
                list.add(arr[j]);
                j++;
            }
            k--;
        }
        while (k>0 && i>=0){
            list.add(arr[i--]);
            k--;
        }
        while (k>0 && j<n){
            list.add(arr[j++]);
            k--;
        }

        Collections.sort(list);
        return list;


    }

    int floor(int []arr, int x){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
