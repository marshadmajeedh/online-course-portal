package course;

public class Material {

    private String id;
    private String name;

    public Material(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "Material id: " + id + " name: " + name;
    }

}
