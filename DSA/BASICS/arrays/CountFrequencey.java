package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencey {

    
    public static void main(String[] args) {
        int ar[] = { 1, 1, 1, 2, 2, 2, 5 };
        // frequency(ar);
        // withoutCollection(ar);
        withoutVisited(ar);
    }

    private static void frequency(int ar[]) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int e : ar) {

            // if (freqMap.containsKey(e)) {
            // freqMap.put(e, freqMap.get(e) + 1);
            // } else {
            // freqMap.put(e, 1);

            // }
            freqMap.put(e, freqMap.getOrDefault(e, 0) + 1);
        }
        System.out.print(freqMap);

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " == > " + entry.getValue());
        }
    }

    private static void withoutCollection(int ar[]) {

        boolean visited[] = new boolean[ar.length];

        int count = 0;
        for (int i = 0; i < ar.length; i++) {

            if (visited[i])
                continue;
            count = 1;

            for (int j = i + 1; j < ar.length; j++) {

                if (ar[i] == ar[j]) {

                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ar[i] + " == > " + count);
        }
    }

    private static void withoutVisited(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            boolean alreadyVisited = false;

            for (int k = 0; k < i; k++) {
                if (ar[i] == ar[k])
                    alreadyVisited = true;
            }
            if (alreadyVisited)
                continue;

            int count = 0;
            for (int j = i; j < ar.length; j++) {
                if (ar[i] == ar[j])
                    count++;
            }
            System.out.println(ar[i] + " == > " + count);

        }
    }
}
