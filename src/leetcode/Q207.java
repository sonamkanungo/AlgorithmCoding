package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by kanunso on 4/25/17.
 */
public class Q207 {

    public static void main(String[] args) {
        int num = 4;

        int[][] courses = {{1, 0}, {2, 0}, {3, 2}};


    }

    public void canFinish(int num, int[][] courses) {

        HashMap<Integer, ArrayList<Integer>> courseGraph = buildGraph(courses);

        ArrayList<Integer> visiting = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();


    }

    public HashMap<Integer, ArrayList<Integer>> buildGraph(int[][] courses) {
        HashMap<Integer, ArrayList<Integer>> courseGraph = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> coursesValue;
        for (int i = 0; i <= courses.length - 1; i++) {
            coursesValue = (courseGraph.containsKey(courses[i][1])) ? courseGraph.get(courses[i][1]) : new ArrayList<>();
            coursesValue.add(courses[i][0]);
            courseGraph.put(courses[i][1], coursesValue);
        }
        return courseGraph;
    }


    public boolean attendCourse(HashMap<Integer, ArrayList<Integer>> courseGraph, Integer course, HashSet<Integer> visiting, HashSet<Integer> visited) {
        if (visiting.contains(course)) {
            return false;
        }

        if (visited.contains(course)) {
            return true;
        }

        return true;
    }












}
