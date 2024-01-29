import java.io.*;
import java.util.*;

public class Main {
    private static  ParkingLotImpl parkingLotImpl=null;
    public static void main(String[] args) {
        if (args.length == 0) {
            // Interactive mode
            userInteractive();
        } else if (args.length == 1) {
            // File mode
            String filename = args[0];
            fileMode(filename);
        } else {
            System.out.println("Usage:");
            System.out.println("Interactive mode: java Main");
            System.out.println("File mode: java Main <filename>");
        }
    }

    private static void userInteractive() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }
            processCommand(command);
        }
        scanner.close();
    }

    private static void fileMode(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                processCommand(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        userInteractive();
    }

    private static void processCommand(String command) {
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
                parkingLotImpl.leave(Integer.parseInt(parts[1]));
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
