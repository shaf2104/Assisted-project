
public class Arrays {
	public static void main(String[]args) {
		{
         String[] name = {"bala", "karthi", "swetha", "akash"};//single dimensional array
         for (int i = 0; i < name.length; i++)
            {
              System.out.println(name[i]);
            }
            int[][] datas = { {10, 20, 30, 40}, {50, 60, 70} };//multidimensional array
            int a = datas[1][2];
           System.out.println(a); 
          }
	}

}
