package lab6.part2OrganizingData.task13ReplaceTypeCodewithSubclasses;

public abstract class ProductS {
    private String name;

    public ProductS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void process();
}
