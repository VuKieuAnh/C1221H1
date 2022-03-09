package template;

public class Main {
    public static void main(String[] args) {
        PageTemplate home = new HomePage();
        home.showPage();

        PageTemplate detail = new DetailPage();
        detail.showPage();
    }
}
