import java.util.*;

public class Main {
//    public Main(int capacity) {
//        super(capacity);
//    }
    public static void main(String[] args) {
        ParkingLotImpl parkingLotImpl = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "create_parking_lot":
                    int capacity = Integer.parseInt(parts[1]);
                    parkingLotImpl = new ParkingLotImpl(capacity);
                    break;

                case "park":
                    parkingLotImpl.park(parts[1], parts[2]);
                    break;

                case "leave":
                    int slot =Integer.parseInt(parts[1]);
                    parkingLotImpl.leave(slot);
                    break;

                case "status":
                    parkingLotImpl.status();
                    break;

                case "registration_numbers_for_cars_with_colour":
                    parkingLotImpl.numberWithColor(parts[1]);
                    break;

                case "slot_numbers_for_cars_with_colour":
                    parkingLotImpl.getSlotNumbersForColor(parts[1]);
                    break;

                case "slot_number_for_registration_number":
                    parkingLotImpl.getSlotNumberForRegistration(parts[1]);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }

    }
}
