import java.util.LinkedList;
import java.util.Queue;

public class ServiceQueue {

    private Queue<String> queue = new LinkedList<>();

    public void addRequest(String request) {
        queue.offer(request);
        System.out.println("Service request added.");
    }

    public void processNext() {

        if (queue.isEmpty()) {
            System.out.println("No service requests available.");
            return;
        }

        String request = queue.poll();

        System.out.println("Processed request: " + request);
    }

    public void display() {

        if (queue.isEmpty()) {
            System.out.println("No service requests.");
            return;
        }

        System.out.println("\nService Requests:");

        for (String request : queue) {
            System.out.println("- " + request);
        }
    }
}