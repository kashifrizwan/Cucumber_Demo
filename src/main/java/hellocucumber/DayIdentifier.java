package hellocucumber;

public class DayIdentifier {

    public String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }
        return "Nope";
    }

}