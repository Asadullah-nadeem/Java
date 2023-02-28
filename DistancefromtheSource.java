package lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class DistancefromtheSource {
    class Solution {
        static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S) {
            // Write your code here

            int dist[] = new int[V];
            Arrays.fill(dist, 100000000);

            dist[S] = 0;

            for (int i = 0; i < V - 1; i++) {

                // graph using array list
                for (ArrayList<Integer> p : adj) {
                    int src = p.get(0);
                    int dest = p.get(1);
                    int weight = p.get(2);

                    if (dist[src] != 100000000 && dist[src] + weight < dist[dest]) {
                        dist[dest] = dist[src] + weight;
                    }
                }
            }
            return dist;
        }
    }
}