package Heaps2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class CourseSchedule3 {
    
    public static void main(String[] args) {
        int [][]courses = {
            {100,200},
            {200,1300},
            {1000,1250},
            {2000,3200}
        };
        System.out.println(scheduleCourse(courses));

    }
    
        public static int scheduleCourse(int[][] courses) {
            Arrays.sort(courses, (a,b)->a[1]-b[1]);

            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

            int totalTime=0;
            for(int c[]:courses){
                int dur=c[0];
                int lastDay=c[1];

                totalTime+=dur;
                pq.add(dur);

                if(totalTime>lastDay){
                    totalTime-=pq.poll();
                }
            }
            return pq.size();
        }
}
