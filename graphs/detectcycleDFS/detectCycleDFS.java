package graphs.detectcycleDFS;
import java.util.*;
class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class detectCycleDFS {
         public static boolean dfs(int node, int parent,
                                   boolean vis[],
                                   ArrayList<ArrayList<Integer>>
                adj) {
            vis[node] = true;
            // go to all adjacent nodes
            for(int adjacentNode: adj.get(node)) {
                if(vis[adjacentNode]==false) {
                    if(dfs(adjacentNode, node, vis, adj) == true)
                        return true;
                }
                // if adjacent node is visited and is not its own parent node
                else if(adjacentNode != parent)
                    return true;
            }
            return false;
        }
        // Function to detect cycle in an undirected graph.
        public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            boolean vis[] = new boolean[V];
            for(int i = 0;i<V;i++) {
                if(vis[i] == false) {
                    if(dfs(i, -1, vis, adj) == true)
                        return true;
                }
            }
            return false;
        }

        public static void main(String[] args)
        {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                adj.add(new ArrayList < > ());
            }
            adj.get(0).add(1);
            adj.get(1).add(0);
            adj.get(0).add(2);
            adj.get(2).add(0);
            adj.get(1).add(3);
            adj.get(3).add(1);
            adj.get(2).add(4);
            adj.get(4).add(2);
            adj.get(3).add(5);
            adj.get(5).add(3);
            adj.get(4).add(5);
            adj.get(5).add(3);

            boolean ans = isCycle(6, adj);
            if (ans == true)
                System.out.println("Cycle Present");
            else
                System.out.println("Cycle Not Present");
        }

    }

