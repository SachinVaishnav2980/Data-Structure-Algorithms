// package Greedy-Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingRooms2 {
    public class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a, b)->a.start-b.start);
        int n=intervals.size();
        if(n==1) return 1;
        int i=0;
        int j=1;
        int day=0;
        while (j<n) {
            int currStart=intervals.get(i).start;
            int currEnd=intervals.get(i).end;

            int nextStart=intervals.get(j).start;
            int nextEnd=intervals.get(j).end;

            if(currEnd<=nextStart){
                i=j;
            } // Overlapping
            else{
                day++;
                // keep the interval with smaller end (less chance to overlap later)
                if(currEnd>nextEnd){
                    i=j;  // keep the next interval instead of current
                }
            }
            j++;
        }
        if(day!=0){
            return day;
        }else{
            return 1;
        }
    }
}
