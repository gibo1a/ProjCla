package aula09;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTester {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        System.out.print(col.getClass().getSimpleName());
        System.out.printf("%12s", "1000");
        System.out.printf("%12s", "5000");
        System.out.printf("%12s", "10000");
        System.out.printf("%12s", "20000");
        System.out.printf("%12s", "40000");
        System.out.printf("%12s", "1000000" + "\n");
        System.out.print("add");
        System.out.printf("%18s",checkPerformance(col, 1000)[0]);
        System.out.printf("%12s",checkPerformance(col, 5000)[0]);
        System.out.printf("%12s",checkPerformance(col, 10000)[0]);
        System.out.printf("%12s",checkPerformance(col, 20000)[0]);
        System.out.printf("%12s",checkPerformance(col, 40000)[0]);
        System.out.printf("%12s",checkPerformance(col, 100000)[0] + "\n");
        System.out.print("search");
        System.out.printf("%15s",checkPerformance(col, 1000)[1]);
        System.out.printf("%12s",checkPerformance(col, 5000)[1]);
        System.out.printf("%12s",checkPerformance(col, 10000)[1]);
        System.out.printf("%12s",checkPerformance(col, 20000)[1]);
        System.out.printf("%12s",checkPerformance(col, 40000)[1]);
        System.out.printf("%12s",checkPerformance(col, 100000)[1] + "\n");
        System.out.print("remove");
        System.out.printf("%13s",checkPerformance(col, 1000)[2]);
        System.out.printf("%13s",checkPerformance(col, 5000)[2]);
        System.out.printf("%13s",checkPerformance(col, 10000)[2]);
        System.out.printf("%13s",checkPerformance(col, 20000)[2]);
        System.out.printf("%13s",checkPerformance(col, 40000)[2]);
        System.out.printf("%13s",checkPerformance(col, 100000)[2]);

    }
    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, add_delta, search_delta, remove_delta;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        add_delta = (stop-start)/1e6; // convert to milliseconds
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
                if (!col.contains(n)) 
                    System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        search_delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        remove_delta = (stop-start)/1e6; // convert nanoseconds to milliseconds

        double[] times = {add_delta, search_delta, remove_delta};
        return times;
    }
}
