package lab6.part5DealingWithGeneralization.task10FormTemplateMethod;

public class PastaRecipe implements CookingRecipe {
    @Override
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void addIngredients() {
        System.out.println("Adding pasta");
    }

    private void cook() {
        System.out.println("Cooking pasta");
    }

    private void serve() {
        System.out.println("Serving");
    }
}
