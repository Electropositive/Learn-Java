import javax.swing.*;
import java.util.Scanner;

public class l7 {
    class Room{
        int l = 10, b = 15, h = 17;
        int beds = 2;
        float bill = 4.456f;
        int appilances = 4;
        String flooring = "wooden";
        float flooring_cost = 1.75f;
        float service_cost = 5.0f;
        float GST = 0.18f;

        void volume(){
            System.out.println("Volume of the room is: " + (l * b * h) + "m.sq.");
        }
        int roomsRequired(int people){
            return (people+1)/ beds;
        }
        float elecBill(int hours ){
            float ammount = hours*bill*appilances;
            return ammount;
        }
        int calc_bill(int people, int hours){
            int totalRooms = roomsRequired(people);
            int  totalBill = totalRooms * (int)(elecBill(hours) + (flooring_cost*hours) + service_cost);
            return (int)(totalBill + totalBill*GST);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hours: ");
        int hours = scanner.nextInt();
        System.out.print("Peoples: ");
        int people = scanner.nextInt();

        l7 obj = new l7();
        l7.Room obj2 = obj.new Room();
        int bill = obj2.calc_bill(people, hours);

        System.out.println("\nYour total bill would be " + bill + "$");
    }
}
