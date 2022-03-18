//parameterised Constructor:

public class parameterConst{
	int id;
	String name;
	parameterConst(int i, String n){
	 id=i;
	 name=n;
	}
	
	void display(){
	 System.out.println(id + " " +name );
	}
	public static void main(String args[]){
		parameterConst obj = new parameterConst(121,"Swati");
		parameterConst obj2 = new parameterConst(122,"sneha");
		obj.display();
		obj2.display();
	}
}