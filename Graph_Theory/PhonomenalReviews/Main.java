import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, LinkedList<Integer>> graph;
    static int[][]dist;
    static int[] parent;

    public static void BFS(int start){
        int vert = graph.keySet().size();
        boolean[]flag = new boolean[vert];
        Queue<Integer> q = new LinkedList<>();
        parent = new int[vert];
        q.add(start);
        flag[start] = true;

        while(!q.isEmpty()){

            int next = q.poll();

            LinkedList<Integer> eval = graph.get(next);

            for (int i = 0; i < eval.size(); i++) {
                if(!flag[next]){
                    flag[next] = true;
                    q.add(eval.get(i));
                    parent[eval.get(i)] = next;
                }
            }

        }

        // backtrack over all of the vertices
        for (Integer a : graph.keySet()) {
            dist[start][a] = backTrack(start, a, 0);
        }

    }

    public static int backTrack(int start, int x, int count){
        if(start == x){
            return count;
        }
        if(dist[start][x] != 0){
            return dist[start][x];
        }
        return backTrack(start, parent[x], count+1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vert = scan.nextInt();
        int pho = scan.nextInt();
        int[]phoRest = new int[pho];
        graph = new HashMap<>();
        for (int i = 0; i < pho; i++) {
            phoRest = new int[pho];
        }

        for (int i = 0; i < vert; i++) {
            int start = scan.nextInt();
            int dest = scan.nextInt();
            graph.putIfAbsent(start, new LinkedList<>());
            graph.get(start).add(dest);
        }

        for (int a : phoRest) {
            BFS(a);
        }

        int min = Integer.MAX_VALUE;
        for (int a : phoRest) {
            for (int b : phoRest) {
                for (int c : phoRest) {
                    min = Integer.min(min, dist[a][b] + dist[b][c]);
                }
            }
        }
        System.out.println(min);
    }
}
