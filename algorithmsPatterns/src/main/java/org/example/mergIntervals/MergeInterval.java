package org.example.mergIntervals;

import java.util.ArrayList;
import java.util.List;


public class MergeInterval {


//    public static List<Interval> mergeIntervals(List<Interval> intervals) {
//        // Replace this placeholder return statement with your code
//        var result = new ArrayList<Interval>();
//        result.add(intervals.get(0));
//        int counter = 0;
//        for (int i = 1; i < intervals.size(); i++) {
//            var first =  result.get(counter);
//            var second =intervals.get(i);
//            if (isOverlapped(first,second)) {
//                result.set(counter, getmMergedinterval(first, second));
//            }else {
//                counter++;
//                result.add(intervals.get(i));
//            }
//
//        }
//        return result;
//    }


    private static boolean isOverlapped(Interval interval1, Interval interval2) {
        if (interval2.start > interval1.end)
            return false;
        return true;
    }

    private static Interval getmMergedinterval(Interval interval, Interval interval1) {
        return new Interval(Math.min(interval.start, interval1.start), Math.max(interval.end, interval1.end));
    }

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 0) {
            return result;
        }
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval lastAddedInterval = result.get(result.size() - 1);
            int currStart = intervals.get(i).getStart();
            int currEnd = intervals.get(i).getEnd();
            int prevEnd = lastAddedInterval.getEnd();
            if (currStart <= prevEnd) {
                lastAddedInterval.setEnd(Math.max(currEnd, prevEnd));
            } else {
                result.add(new Interval(currStart, currEnd));
            }
        }
        return result;
    }


}

