// package Greedy-Problems;

import java.lang.classfile.instruction.DiscontinuedInstruction.RetInstruction;
import java.util.List;

public class MeetingRooms {

    public class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // [(0,30),(5,10),(15,20)]
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n=intervals.size();
        int i=0;
        int j=1;
        while (j<n) {
            int currStart=intervals.get(i).start;
            int currEnd=intervals.get(i).end;

            int nextStart=intervals.get(j).start;
            int enxtEnd=intervals.get(j).end;


            //Overlaping
            if(nextStart<currEnd && nextStart>=currStart){
                return false;
            }
            i=j;
            j++;
        }
        return true;
    }
}
