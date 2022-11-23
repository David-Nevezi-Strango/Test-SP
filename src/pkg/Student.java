package pkg;

public class Student implements Element{
	String name;
	String email;
	
	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitStudent(this);
		
	}
	
	
}
