public class ShortestPathFinder{
    public static void main(String[] args) {
    
        Graph graph = new Graph();

        
        graph.addCity(1, "CityA");
        graph.addCity(2, "CityB");
        graph.addCity(3, "CityC");
        graph.addCity(4, "CityD");

        
        graph.addRoad(1, 2, 10); // Road between CityA and CityB with distance 10
        graph.addRoad(1, 3, 20); // Road between CityA and CityC with distance 20
        graph.addRoad(2, 3, 5);  // Road between CityB and CityC with distance 5
        graph.addRoad(2, 4, 10); // Road between CityB and CityD with distance 10
        graph.addRoad(3, 4, 2);  // Road between CityC and CityD with distance 2

        
        City source = graph.getCities().get(1);
        Map<City, Integer> distances = ShortestPathFinder.dijkstra(graph, source);

        
        printShortestPaths(distances, source);
    }

    private static void printShortestPaths(Map<City, Integer> distances, City source) {
        System.out.println("Shortest paths from " + source.getName() + ":");
        for (Map.Entry<City, Integer> entry : distances.entrySet()) {
            City city = entry.getKey();
            int distance = entry.getValue();
            System.out.println("  To " + city.getName() + ": " + distance);
        }
    }
}
