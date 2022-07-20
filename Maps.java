	import java.util.HashMap;
	public class Maps {
	                public static void main(String[] args)
	                {
	                                HashMap<String,Integer> input=new HashMap<String,Integer>();
	                                input.put("Tamil",98);
	                                input.put("English",100);
	                                input.put("Maths",89);
	                for( String i : input.keySet() )
	                {
	                                System.out.println(i+"- "+input.get(i));
	                }
	                }
	}


