import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(true)
        {
            ParkingLot parkingLot=null;
            String command=in.nextLine();
            String part[]=command.split(" ");

            switch (part[0])
            {
                case "create_parking_lot":
                    int size=Integer.parseInt(part[1]);
                    parkingLot=new ParkingLot(size);
//                    parkingLot.allocate();
                    break;
            }
        }

    }
}
