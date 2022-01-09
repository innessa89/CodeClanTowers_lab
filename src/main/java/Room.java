import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;
    private double rate;

    public Room(int capacity, double rate) {
        this.capacity = capacity;
        this.rate=rate;
        this.guests=new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) throws Exception {
        if(capacity>guests.size()){
            guests.add(guest);
        }else {
            throw new Exception("Not enough capacity");
        }
    }

    public void removeGuest(Guest guest) throws Exception {
        if(guests.contains(guest)) {
            guests.remove(guest);
        }else{
            throw new Exception("The guest is not in the room");
        }
    }

    public int getNumberOfGuest(){
        return guests.size();
    };

    public double getRate() {
        return rate;
    }


}
