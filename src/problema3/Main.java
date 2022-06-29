package problema3;

public class Main {
    public static void main(String[] args) {
        JavaDev user1 = new JavaDev("Adina");
        JavaDev user2 = new JavaDev("Adrian");
        JavaDev user3 = new JavaDev("Alex");
        JavaDev user4 = new JavaDev("Diana");

        Devtalks devtalks = new Devtalks();

        user1.subscribe(devtalks);
        user2.subscribe(devtalks);
        user3.subscribe(devtalks);

        devtalks.setMessage("Buy Tickets for DevTalks tech conference and expo conference.");
        devtalks.notifyObservers();

        System.out.println(" ====== ");
        user3.unsubscribe(devtalks);
        user4.subscribe(devtalks);

        devtalks.setMessage("Agenda. Check out the different topics");
        devtalks.notifyObservers();
    }
}
