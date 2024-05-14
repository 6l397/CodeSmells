package lab6.part2OrganizingData.task12ReplaceTypeCodewithClass;

public class ProductType {
    public static final ProductType TYPE1 = new ProductType(1);
    public static final ProductType TYPE2 = new ProductType(2);
    public static final ProductType TYPE3 = new ProductType(3);

    private final int code;

    private ProductType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
