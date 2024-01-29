import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class ParkingLot{

    int capacity;
    TreeMap<Integer,String>allocationTreeMap;
    HashMap<Integer,Integer>registrationNumberMap;
    HashMap<String,Integer>colorMap;
    HashSet<Integer>availableSlots;
    ParkingLot(int capacity)
    {
        this.capacity=capacity;
        this.allocationTreeMap=new TreeMap<>();
        this.colorMap=new HashMap<>();
        this.availableSlots=new HashSet<>();

        for(int i=1;i<=capacity;i++)
            availableSlots.add(i);

        System.out.println("Created a parking lot with " + capacity + " slots");
    }
}