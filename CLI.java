import java.util.Map;
import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add City");
            System.out.println("2. Add Road");
            System.out.println("3. Find Shortest Path");
            System.out.println("4. Detect Cycles");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter city id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter city name: ");
                    String name = scanner.next();
                    graph.addCity(id, name);
                    break;
                case 2:
                    System.out.print("Enter first city id: ");
                    int cityId1 = scanner.nextInt();
                    System.out.print("Enter second city id: ");
                    int cityId2 = scanner.nextInt();
                    System.out.print("Enter road distance: ");
                    int distance = scanner.nextInt();
                    graph.addRoad(cityId1, cityId2, distance);
                    break;
                case 3:
                    System.out.print("Enter source city id: ");
                    int sourceId = scanner.nextInt();
                    City source = graph.getCities().get(sourceId);
                    if (source != null) {
                        Map<City, Integer> distances = ShortestPathFinder.dijkstra(graph, source);
                        for (Map.Entry<City, Integer> entry : distances.entrySet()) {
                            System.out.println("Distance from " + source.getName() + " to " + entry.getKey().getName() + " is " + entry.getValue());
                        }
                    } else {
                        System.out.println("Source city not found.");
                    }
                    break;
                case 4:
                    if (CycleDetector.hasCycle(graph)) {
                        System.out.println("Graph contains a cycle.");
                    } else {
                        System.out.println("No cycle detected.");
                    }
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
