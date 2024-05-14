package lab6.part3SimplifyingConditionalExpressions.task1DecomposeConditional;

public class User {
    private boolean isLoggedIn;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean hasPermission(Resource resource) {
        return true;
    }
}
