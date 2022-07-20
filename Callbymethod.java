
public class Callbymethod {
        public void disp1()//without parameter
        {
                        System.out.println("Hello world");
        }
        public void disp2(int value)//with parameter
        {
                        System.out.println("value is:"+value);
        }
        static int disp1(int x, int y) //method overloading
        {
                          return x + y;
        }
        static double disp2(double x, double y) 
        {
        return x + y;
        }
                        
public static void main(String[] args)
{
        Callbymethod obj=new Callbymethod();
        obj.disp1();
        obj.disp2(100);
        int value1 = disp1(100, 50);
          double value2 = disp2(10.5, 7.9);
          System.out.println("int: " + value1);
          System.out.println("double: " + value2);
}
}

