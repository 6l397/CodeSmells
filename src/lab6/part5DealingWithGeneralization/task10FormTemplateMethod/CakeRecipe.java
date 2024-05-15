package lab6.part5DealingWithGeneralization.task10FormTemplateMethod;

public class CakeRecipe extends CookingRecipe {
    @Override
    public void prepareRecipe() {
        heatOwen();
        super.prepareRecipe();
    }

    private void heatOwen() {
        System.out.println("Heating owen...");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }

    @Override
    public void cook() {
        System.out.println("Baking the cake in the oven");
    }

    @Override
    public void serve() {
        System.out.println("Serving");
    }
}
