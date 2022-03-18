//Let us see another example of default constructor  
//which displays the default values  
//here you doesn't created constr..but compiler will create defaultly.

class DefaultConst2{  
	int id;  
	String name;  
	//method to display the value of id and name  

	void display()
		{System.out.println(id+" "+name);}  
  
	public static void main(String args[]){  
	
	//creating objects  
	DefaultConst2 s1=new DefaultConst2();  
	DefaultConst2 s2=new DefaultConst2(); 
 
	//displaying values of the object  
	s1.display();  
	s2.display();  
	}  
}  

F:\JavaProgram\Constructor>javac DefaultConst2.java

F:\JavaProgram\Constructor>java DefaultConst2
0 null
0 null