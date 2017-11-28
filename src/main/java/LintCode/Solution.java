package LintCode;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.sqrt;

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */


public class Solution {
    /*
     * @param points: a list of points
     * @param origin: a point
     * @param k: An integer
     * @return: the k closest points
     */
    public List kClosest(Point[] points, Point origin, int k) {
        // write your code here
        int x = origin.x;
        int y = origin.y;
        List<Map<String, Object>> list = new ArrayList();
        for (Point point : points) {
            int x1 = point.x;
            int y1 = point.y;
            double a = Math.pow((x1 - x), 2);
            double b = Math.pow((y1 - y), 2);
            double v = Math.sqrt(a + b);
            Map<String, Object> map = new HashMap();
            map.put("v", String.valueOf(v));
            map.put("point", point);
            list.add(map);
        }
        Collections.sort(list, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {

                Double v1 = Double.parseDouble((String) o1.get("v"));
                Double v2 = Double.parseDouble((String) o2.get("v"));
                System.out.println(v1 + "========" + v2);
                int i = v1.compareTo(v2);
                System.out.println(i);
                return i;
            }
        });
        ArrayList<Point> list1 = new ArrayList();
        for (int i = 0; i < k; i++) {
            Map<String, Object> map = list.get(i);
            Point point = (Point)map.get("point");
            list1.add(point);
        }
        Collections.sort(list1, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int x1 = o1.x;
                int y1 = o1.y;
                int x2 = o2.x;
                int y2 = o2.y;
                if (x1 == x2) {
                    int i = Integer.valueOf(y1).compareTo(Integer.valueOf(y2));
                    return i;
                }
               return 0 ;
            }
        });

     return  list1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        [[4,6],[4,7],[4,4],[2,5],[1,1]];
        Point origin = new Point(0, 0);
        Point point2 = new Point(4, 7);
        Point point1 = new Point(4, 6);

        Point point3 = new Point(1, 1);
        Point point4 = new Point(2, 5);
        Point[] points = {point1, point2, point3, point4};

        List<String> maps = solution.kClosest(points, origin,4);
        System.out.println(maps);
    }
}
