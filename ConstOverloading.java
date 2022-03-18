// Constructor Overloading;

public class ConstOverloading{
	int id;
	String name;
	int age;
	ConstOverloading(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	ConstOverloading(int i, String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println(id + " "+name +" "+age );
	}

	public static void main(String args[]){
	 	ConstOverloading obj = new ConstOverloading(121,"swati",24);
		ConstOverloading obj2 = new ConstOverloading(25,"sneha");
		obj.display();
		obj2.display();
	}

}

//F:\JavaProgram\Constructor>javac ConstOverloading.java

//F:\JavaProgram\Constructor>java ConstOverloading
//121 swati 24
//25 sneha 0