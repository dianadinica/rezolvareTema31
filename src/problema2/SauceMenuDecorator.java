package problema2;

public class SauceMenuDecorator extends MenuDecorator {
    public SauceMenuDecorator(Menu menu) {
        super(menu);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding a sauce");
    }
}
