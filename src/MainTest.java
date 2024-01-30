import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// JUnit tests for All Methods
public class MainTest {
    @Test
    public void testCreateParkingLot() {
        ParkingLotImpl parkingLotImpl = new ParkingLotImpl(5);
        assertEquals(5, parkingLotImpl.getCapacity());
    }

    @Test
    public void testPark() {
        ParkingLotImpl parkingLotImpl = new ParkingLotImpl(5);
        parkingLotImpl.park("KA-01-HH-1234", "White");
        assertEquals(1, parkingLotImpl.getParkingSlots());
    }

    @Test
    public void testLeave() {
        ParkingLotImpl parkingLotImpl = new ParkingLotImpl(5);
        parkingLotImpl.park("KA-01-HH-1234", "White");
        parkingLotImpl.leave(1);
        assertEquals(0, parkingLotImpl.getParkingSlots());
    }

    @Test
    public void testStatus() {
        ParkingLotImpl parkingLotImpl = new ParkingLotImpl(5);
        parkingLotImpl.park("KA-01-HH-1234", "White");
        parkingLotImpl.park("KA-01-HH-9999", "White");
        parkingLotImpl.status();
    }

    @Test
    public void testGetRegistrationNumbersForColor() {
        ParkingLotImpl parkingLotImpl = new ParkingLotImpl(5);
        parkingLotImpl.park("KA-01-HH-1234", "White");
        parkingLotImpl.park("KA-01-HH-9999", "White");
        assertEquals("KA-01-HH-1234, KA-01-HH-9999", parkingLotImpl.numberWithColor("White"));
    }

}
