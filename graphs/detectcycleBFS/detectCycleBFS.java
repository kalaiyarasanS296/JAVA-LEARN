package graphs.detectcycleBFS;
import java.util.*;

class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class detectCycleBFS {
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
                                     boolean vis[])
        {
            Queue<Node> q =  new LinkedList<>();
            q.add(new Node(s, -1));
            vis[s] = true;

            // until the queue is empty
            while(!q.isEmpty())
            {
                // source node and its parent node
                int node = q.peek().first;
                int par = q.peek().second;
                q.remove();

                // go to all the adjacent nodes
                for(Integer it: adj.get(node))
                {
                    if(vis[it]==false)
                    {
                        q.add(new Node(it, node));
                        vis[it] = true;
                    }

                    // if adjacent node is visited
                    // and is not its own parent node
                    else if(par != it)
                        return true;
                }
            }

            return false;
        }

        public static boolean isCycle(int V,
                                      ArrayList<ArrayList<Integer>> adj)
        {
            boolean vis[] = new boolean[V];
            Arrays.fill(vis,false);


            for(int i=0;i<V;i++)
                if(vis[i]==false)
                    if(checkForCycle(adj, i,vis))
                        return true;

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
//            adj.get(1).add(2);
//            adj.get(2).add(1);
//            adj.get(2).add(3);
//            adj.get(3).add(2);

            boolean ans = isCycle(6, adj);
            if (ans == true)
                System.out.println("Cycle Present");
            else
                System.out.println("Cycle Not Present");
        }
    }


