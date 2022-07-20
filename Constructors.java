
public class Constructors {
        String name;
        int marks;
        int a;
        public Constructors()//default constructor
        {
        a=500;
        }
        public Constructors( String name1, int marks1)//parameterized constructor
        {
                        name=name1;
                        marks=marks1;
        }
        public static void main(String[] args) {
                        Constructors input=new Constructors("shabhana",98);
                        Constructors input2=new Constructors();
                        System.out.println("Name of student is "+ input.name+" and the mark is "+input.marks);
                        System.out.println(input2.a);   
        }
        

       




}
