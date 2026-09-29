import java.util.*;

public class CampusGraph {

    private HashMap<String, ArrayList<String>> graph = new HashMap<>();

    public boolean addLocation(String location) {

        if (graph.containsKey(location)) {
            return false;
        }

        graph.put(location, new ArrayList<>());
        return true;
    }

    public boolean removeLocation(String location) {

        if (!graph.containsKey(location)) {
            return false;
        }

        graph.remove(location);

        for (ArrayList<String> neighbours : graph.values()) {
            neighbours.remove(location);
        }

        return true;
    }

    public boolean addConnection(String location1, String location2) {

        if (!graph.containsKey(location1) ||
                !graph.containsKey(location2)) {
            return false;
        }

        if (location1.equals(location2)) {
            return false;
        }

        if (graph.get(location1).contains(location2)) {
            return false;
        }

        graph.get(location1).add(location2);
        graph.get(location2).add(location1);

        return true;
    }

    public boolean removeConnection(String location1, String location2) {

        if (!graph.containsKey(location1) ||
                !graph.containsKey(location2)) {
            return false;
        }

        boolean removed1 = graph.get(location1).remove(location2);
        boolean removed2 = graph.get(location2).remove(location1);

        return removed1 && removed2;
    }

    public void displayConnections() {

        if (graph.isEmpty()) {
            System.out.println("No campus locations available.");
            return;
        }

        System.out.println("\nCampus Network:");

        for (String location : graph.keySet()) {

            System.out.print(location + " -> ");

            ArrayList<String> neighbours = graph.get(location);

            if (neighbours.isEmpty()) {
                System.out.println("No connections");
            } else {
                System.out.println(String.join(", ", neighbours));
            }
        }
    }

    public void bfs(String start) {

        if (!graph.containsKey(start)) {
            System.out.println("Location not found.");
            return;
        }

        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        System.out.println("\nBFS Traversal:");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " ");

            for (String neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println();
    }

    public void dfs(String start) {

        if (!graph.containsKey(start)) {
            System.out.println("Location not found.");
            return;
        }

        HashSet<String> visited = new HashSet<>();

        System.out.println("\nDFS Traversal:");

        dfsRecursive(start, visited);

        System.out.println();
    }

    private void dfsRecursive(
            String location,
            HashSet<String> visited) {

        visited.add(location);

        System.out.print(location + " ");

        for (String neighbour : graph.get(location)) {

            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited);
            }
        }
    }
}