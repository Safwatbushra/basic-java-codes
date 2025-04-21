



public class dog {
	String name, breed;
	 
	void display()
	{System.out.println(name+" "+ breed);} 
	dog( String name, String breed)
	{
		this.breed = breed;
		this.name = name;
	}
	
	void setname(String name)
	{
		this.name = name;
	}
	void setbreed(String breed)
	{
		this.breed = breed;
	}
	public static void main(String args[]) {
		dog p1 = new dog ( "spike", "bulldog" );
		 dog p2 = new dog ("pongo"," dalmatian " );
		 p1.display();
		 p2.display();
	p1.setname("maya");
	p1.setbreed("husky");
	p1.display();
	 p2.display();

}}
		 
