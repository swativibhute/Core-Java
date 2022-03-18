abstract class shape
{
	abstract void draw();
}
class Rectangle extends shape
{
	void draw(){System.out.println("drawing rectangle.");}
}
class circle extends shape
{
	void draw(){System.out.println("drawing circle.");}
}
class Abctractcls
{
	public static void main(String args[]){
	  shape s=new circle();
	  s.draw();	
	}
}