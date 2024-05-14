package lab6.part5DealingWithGeneralization.task10FormTemplateMethod;

public class CakeRecipe implements CookingRecipe {
    @Override
    public void prepareRecipe() {
        addIngredients();
        bake();
        serve();
    }

    private void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }

    private void bake() {
        System.out.println("Baking the cake in the oven");
    }

    private void serve() {
        System.out.println("Serving");
    }
}
