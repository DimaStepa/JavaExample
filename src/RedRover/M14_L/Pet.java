package RedRover.M14_L;

public class Pet implements IName {

    private final String kind;
    private final String name;

    public String getKind() {
        return kind;
    }

    @Override
    public String getName() {
        return name;
    }

    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }
}
