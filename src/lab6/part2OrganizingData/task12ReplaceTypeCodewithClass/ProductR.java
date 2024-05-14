package lab6.part2OrganizingData.task12ReplaceTypeCodewithClass;

public class ProductR {
    private ProductType type;
    private String name;

    public ProductR(ProductType type, String name) {
        this.type = type;
        this.name = name;
    }

    // Метод для отримання типу продукту
    public ProductType getType() {
        return type;
    }
}
