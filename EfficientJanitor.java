import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class EfficientJanitor {

    public static int efficientJanitor(List<Float> weight) {

        Collections.sort(weight);

        int lo = 0;
        int hi =  weight.size() - 1;
        int count = 0;

        while (lo < hi) {

            if (weight.get(lo) + weight.get(hi) > 3.0) {
                hi = hi - 1;
                count ++;
            }     else {
                lo = lo + 1;
                hi = hi - 1;
                count ++;
            }  if ( lo == hi ) {
                count ++;
            }
        }
        return count;
    }


public static void main(String[] args) {
    ArrayList<Float> weight = new ArrayList<Float>();
    weight.add(1.01f);
    weight.add(2.01f);
    weight.add(1.51f);
    weight.add(1.21f);
    weight.add(2.95f);
    weight.add(1.06f);
    weight.add(2.23f);
    System.out.println(EfficientJanitor.efficientJanitor(weight));
}
}