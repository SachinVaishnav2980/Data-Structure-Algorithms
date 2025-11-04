import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCalendar2 {
    public static void main(String[] args) {
        
    }

    class MyCalendarTwo {
        List<int []> doubleBooked;
        List<int []> overallBooking;

        public MyCalendarTwo() {
            doubleBooked=new ArrayList<>();
            overallBooking=new ArrayList<>();
        }
    
        public boolean book(int startTime, int endTime) {
            //Check if tripple booking is not goint to happen
            for(int []element:doubleBooked){
                if(checkOverlap(element[0], element[1], startTime, endTime)){
                    return false;  //Triple booking created
                }
            }

            //check if it is creating double booking
            for(int []element:overallBooking){
                if(checkOverlap(element[0], element[1], startTime, endTime)){
                    doubleBooked.add(findOverlappedRegion(element[0], element[1], startTime, endTime));
                }
            }
            overallBooking.add(new int[]{startTime, endTime});
            return true;
        }

        boolean checkOverlap(int currStart, int currEnd, int startTime, int endTime){
        return Math.max(currStart, startTime)<Math.min(currEnd, endTime);
    }

    int [] findOverlappedRegion(int currStart, int currEnd, int startTime, int endTime){
        return new int[]{Math.max(currStart, startTime), Math.min(currEnd, endTime)};
    }
    }

    
}
