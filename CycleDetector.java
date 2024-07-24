public class CycleDetector{
    public static void main(String[] args) {
      
        Graph graph = new Graph();

        // Add cities to the graph
        graph.addCity(1, "CityA");
        graph.addCity(2, "CityB");
        graph.addCity(3, "CityC");
        graph.addCity(4, "CityD");

      
        graph.addRoad(1, 2, 10); // Road between CityA and CityB with distance 10
        graph.addRoad(2, 3, 15); // Road between CityB and CityC with distance 15
        graph.addRoad(3, 4, 20); // Road between CityC and CityD with distance 20
        graph.addRoad(4, 1, 25); // Road between CityD and CityA with distance 25

        
        boolean containsCycle = CycleDetector.hasCycle(graph);

      
        if (containsCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
