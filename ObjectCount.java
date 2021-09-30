public class ObjectCount {
    int a;
    public static int count;
    {
        count++;
    }
}
class ObjectCountMain
{
    public static void main(String[] args) {
        System.out.println(ObjectCount.count);
        ObjectCount obj1=new ObjectCount();
        System.out.println(ObjectCount.count);
        ObjectCount obj2=new ObjectCount();
        System.out.println(ObjectCount.count);
    }
}
