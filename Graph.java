public class Graph{
    public static void main(String[] args) {
        
        Graph graph = new Graph();

        
        graph.addCity(1, "CityA");
        graph.addCity(2, "CityB");
        graph.addCity(3, "CityC");

      
        graph.addRoad(1, 2, 10); // Road between CityA and CityB with distance 10
        graph.addRoad(2, 3, 15); // Road between CityB and CityC with distance 15

        
        printGraphDetails(graph);
    }

    private static void printGraphDetails(Graph graph) {
        for (City city : graph.getCities().values()) {
            System.out.println("City ID: " + city.getId());
            System.out.println("City Name: " + city.getName());
            System.out.println("Connected Roads:");
            for (Map.Entry<City, Integer> entry : city.getRoads().entrySet()) {
                City connectedCity = entry.getKey();
                int distance = entry.getValue();
                System.out.println("  To City: " + connectedCity.getName() + ", Distance: " + distance);
            }
            System.out.println();
        }
    }
}
