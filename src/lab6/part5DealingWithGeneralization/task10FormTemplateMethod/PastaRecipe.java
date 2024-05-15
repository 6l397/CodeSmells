package lab6.part5DealingWithGeneralization.task10FormTemplateMethod;

public class PastaRecipe extends CookingRecipe {
    @Override
    public void prepareRecipe() {
        boilWater();
        super.prepareRecipe();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }
    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
    @Override
    public void serve() {
        System.out.println("Serving");
    }
}
