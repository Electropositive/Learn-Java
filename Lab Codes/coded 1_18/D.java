public class D 
{
    static int count=0;
	D()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        D obj1 = new D();
        D obj2 = new D();
        D obj3 = new D();
        D obj4 = new D();
        System.out.println("Number of objects created:"+count);
    }
}