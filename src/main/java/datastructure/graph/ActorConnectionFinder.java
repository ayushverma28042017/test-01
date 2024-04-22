package datastructure.graph;

import java.util.*;

class MovieGraph {
    private Map<String, List<String>> adjacencyList;

    public MovieGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(String actor1, String actor2) {
        adjacencyList.computeIfAbsent(actor1, k -> new ArrayList<>()).add(actor2);
        adjacencyList.computeIfAbsent(actor2, k -> new ArrayList<>()).add(actor1);
    }

    public boolean haveWorkedTogether(String actor1, String actor2) {
        Set<String> visited = new HashSet<>();
        return dfs(actor1, actor2, visited);
    }

    private boolean dfs(String currentActor, String targetActor, Set<String> visited) {
        visited.add(currentActor);

        if (currentActor.equals(targetActor)) {
            return true;
        }

        if (adjacencyList.containsKey(currentActor)) {
            for (String neighbor : adjacencyList.get(currentActor)) {
                if (!visited.contains(neighbor) && dfs(neighbor, targetActor, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class ActorConnectionFinder {
    public static void main(String[] args) {
        MovieGraph movieGraph = new MovieGraph();

        // Add movie relationships (actors worked together)
        movieGraph.addEdge("Actor1", "Actor2");
        movieGraph.addEdge("Actor1", "Actor3");
        movieGraph.addEdge("Actor2", "Actor4");
        movieGraph.addEdge("Actor3", "Actor5");
        movieGraph.addEdge("Actor4", "Actor6");

        // Example usage
        String actor1 = "Actor1";
        String actor2 = "Actor8";

        boolean haveWorkedTogether = movieGraph.haveWorkedTogether(actor1, actor2);

        if (haveWorkedTogether) {
            System.out.println(actor1 + " and " + actor2 + " have worked together.");
        } else {
            System.out.println(actor1 + " and " + actor2 + " have not worked together.");
        }
    }
}