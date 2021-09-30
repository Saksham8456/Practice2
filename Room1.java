import java.util.Scanner;
public class Room1 {
    /*
    Design a class Room that has properties AC_ON, HOME_THEATRE_ON,
     FAN_ON and LIGHT_ON that stores Boolean values to indicate
     whether the appliance is ON or OFF.
     Design a menu driven program in java that puts ON/OFF the
      corresponding appliances and gives appropriate message.
      If the total power consumed is more than 2kW, show a message Overload.
      Assume AC consumes 1200 watts, Home Theatre consumes 600 watts,
    Fan consumes 400 watts and light consumes 100 watt
     */
    public boolean AC_ON, HOME_THEATRE_ON, FAN_ON, LIGHT_ON;

    public void InputBoolean() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter AC puts:");
        AC_ON = s.nextBoolean();
        System.out.println("Enter HOME_THEATRE puts:");
        HOME_THEATRE_ON = s.nextBoolean();
        System.out.println("Enter FAN puts:");
        FAN_ON = s.nextBoolean();
        System.out.println("Enter LIGHT puts:");
        LIGHT_ON = s.nextBoolean();
    }

    public void Consumption() {
        int pow = 0;
        if (AC_ON == true)
            pow += 1200;
        if (HOME_THEATRE_ON == true)
            pow += 600;
        if (FAN_ON == true)
            pow += 400;
        if (LIGHT_ON == true)
            pow += 100;
        if (pow > 2000)
            System.out.println("/POwer OVerloading/");
        else
            System.out.println("Total power consumtion is --> " + pow);
    }
}
class RoomMain
{
    public static void main(String[] args)
    {
        Room1 obj=new Room1();
        obj.InputBoolean();
        obj.Consumption();

    }
}
