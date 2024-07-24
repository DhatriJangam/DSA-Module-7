public class City {
    private int id;
    private String name;
    private Map<City, Integer> roads;

  
    public City(int id, String name) {
        this.id = id;
        this.name = name;
        this.roads = new HashMap<>();
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Map<City, Integer> getRoads() { return roads; }
}
