package problema2;

public class MenuDecorator implements Menu {
    private final Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void prepare() {
        menu.prepare();
    }
}
