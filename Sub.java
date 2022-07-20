 class Parent {
	 class Child{
		 public void display() {
			 System.out.println("Hello world");
		 }
	 }
 }
 class Sub{
	 public static void main(String[]args) {
		 Parent.Child object = new Parent().new Child();
		 object.display();
	 }
 }
		 
           

 

               

    