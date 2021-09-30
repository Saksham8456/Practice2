import java.util.Arrays;
import java.util.Scanner;
public class Car {
    /*
    . Create a class Car having properties manufacturer and price.
    Create three instances of the class and display the details of each car
     sorted with respect to the price.
     */
    public String manufacturer;
    public int price;
    Car(String s1,int p1)
    {
        manufacturer=s1;
        price=p1;
    }
}
class CarMain
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of Entries: ");
        int n=s.nextInt();
        Car arr[]=new Car[n];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter"+(int)(i+1)+" data");
            arr[i]=new Car(s.next(),s.nextInt());
        }
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr1[i]=arr[i].price;
            arr2[i]=arr[i].price;
        }
        Arrays.sort(arr1);
        int index=0;
        System.out.println("Data after sorting is :--");
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i]==arr2[j])
                     index=j;
            }
            System.out.println(arr[index].price+" "+arr[index].manufacturer);
        }
    }
}

