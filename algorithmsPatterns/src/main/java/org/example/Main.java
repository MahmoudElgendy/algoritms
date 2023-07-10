package org.example;

import org.example.mergIntervals.Interval;
import org.example.mergIntervals.MergeInterval;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list =new ArrayList<Interval>();

        list.add(new Interval(1,5));
        list.add(new Interval(4,6));
        list.add(new Interval(6,8));
        list.add(new Interval(11,15));
      var result =  MergeInterval.mergeIntervals(list);

        System.out.println("Hello world!");
    }
}