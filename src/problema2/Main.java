package problema2;

public class Main {
    public static void main(String[] args) {
        BasicMenu basicMenu = new BasicMenu();
        basicMenu.prepare();

        System.out.println("=====");

        Menu friesMenu = new FriesMenuDecorator(basicMenu);
        Menu drinkFriesMenu = new DrinkMenuDecorator(friesMenu);
        Menu fullMenu = new SauceMenuDecorator(drinkFriesMenu);
        fullMenu.prepare();
    }
}
