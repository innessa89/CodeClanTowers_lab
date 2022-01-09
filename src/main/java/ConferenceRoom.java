import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, double rate, String name) {
        super(capacity,rate);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
