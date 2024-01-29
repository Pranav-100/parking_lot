import java.util.*;

class ParkingLotImpl implements ParkingLot {
    private int capacity;
    private TreeMap<Integer, String> parkingSlots; // Slot number to Registration Number mapping
    private HashMap<String, Integer> registrationToSlot; // Registration Number to Slot number mapping
    private HashMap<String, String> registrationToColor; // Registration Number to Car Color mapping
    private TreeSet<Integer> availableSlots;

    public ParkingLotImpl(int capacity) {
        this.capacity = capacity;
        this.parkingSlots = new TreeMap<>();
        this.registrationToSlot = new HashMap<>();
        this.registrationToColor = new HashMap<>();
        this.availableSlots = new TreeSet<>();
        for (int i = 1; i <= capacity; i++) {
            availableSlots.add(i);
        }
        System.out.println("Created a parking lot with " + capacity + " slots");
    }

    public void park(String registrationNumber, String color) {
        if (availableSlots.isEmpty()) {
            System.out.println("Sorry, parking lot is full");
            return;
        }
        int slot = availableSlots.pollFirst();
        parkingSlots.put(slot, registrationNumber);
        registrationToSlot.put(registrationNumber, slot);
        registrationToColor.put(registrationNumber, color);
        System.out.println("Allocated slot number: " + slot);
    }

    public void leave(int slot) {
        if (!parkingSlots.containsKey(slot)) {
            System.out.println("Sorry, Invalid slot Number");
            return;
        }
        String regNumber=parkingSlots.get(slot);
        parkingSlots.remove(slot);
        availableSlots.add(slot);
        registrationToSlot.remove(regNumber);
        registrationToColor.remove(regNumber);

    }
    public void status() {
        System.out.println("Slot No.\tRegistration No\t\t Colour");
        for(Map.Entry<Integer,String>map:parkingSlots.entrySet())
        {
            System.out.println(map.getKey()+"\t\t\t"+map.getValue()+"\t\t "+registrationToColor.get(map.getValue()));
        }
    }
    public void numberWithColor(String color) {
        ArrayList<String>number=new ArrayList<>();
        for(Map.Entry<String,String>map:registrationToColor.entrySet()){
            if(Objects.equals(map.getValue(), color)) {
                number.add(map.getKey());
            }
//            System.out.println(map.getKey()+"\t"+registrationNumber);
        }
//        System.out.println(number);
        String str=String.join(", ",number);
        System.out.println(str);
    }

    public void getSlotNumbersForColor(String color) {
        List<String> slots = new ArrayList<>();
        for (Map.Entry<String, String> entry : registrationToColor.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(color)) {
                slots.add(String.valueOf(registrationToSlot.get(entry.getKey())));
            }
        }
        System.out.println(String.join(", ", slots));
    }

    public void getSlotNumberForRegistration(String registrationNumber) {
        Integer slot = registrationToSlot.get(registrationNumber);
        if (slot != null) {
            System.out.println(slot);
        } else {
            System.out.println("Not found");
        }
    }

}