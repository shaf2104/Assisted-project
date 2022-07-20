    import java.util.ArrayList;
	import java.util.Collections;
	public class Collection {
	                public static void main(String[] args)
	                {
	                                ArrayList<Integer> value=new ArrayList<Integer>();
	                                value.add(50);
	                                value.add(98);
	                                value.add(25);
	                                value.add(100);
	                                Collections.sort(value);
	                                for(int i : value)
	                                {
	                                 System.out.println(i);        
	                                }
	                }
	}


