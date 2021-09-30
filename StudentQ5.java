import java.util.Scanner;

public class StudentQ5
{
    /*
    Create a class 'Student' with three data members which are name, age and address.
    The constructor of the class assigns default values name as "unknown",
    age as '0' and address as "not available". It has two member methods
     with the same name “setInfo”. First method has two parameters for name
    and age and assigns the same whereas the second method takes three parameters
    which are assigned to name, age and address respectively. Print the name, age
    and address of 10 students.
     */
    String name;
    int age;
    String address;
    StudentQ5()
    {
        name="Unknown";
        age=0;
        address="Not available";
    }
    public void setinfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setinfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class StudentQ5Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        StudentQ5 arr[]=new StudentQ5[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=new StudentQ5();
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter 1 for three inputs, 2 for two inputs 3 for no inputs:");
            int c=s.nextInt();
            if (c==1)
                arr[i].setinfo(s.next(),s.nextInt(),s.next());
            else if (c==2)
                arr[i].setinfo(s.next(),s.nextInt());
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i].name+" "+arr[i].age+" "+arr[i].address);
        }
    }
}
