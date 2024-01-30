/**
 * Interface representing a parking lot.
 */
public interface ParkingLot {
    public void park(String registrationNumber, String color);
    public void leave(int slot);
    public void status();
    public void numberWithColor(String color);
    public void getSlotNumbersForColor(String color);
    public void getSlotNumberForRegistration(String registrationNumber);
}
