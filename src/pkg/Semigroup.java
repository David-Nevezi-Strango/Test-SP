package pkg;

import java.util.ArrayList;

public class Semigroup implements Element{
	String name;
	ArrayList<Element> students;
	
	
	public Semigroup(String name) {
		this.name = name;
		this.students = new ArrayList<Element>();
	}

	@Override
	public void add(Element element) {
		if(students.size() < 15) {
			this.students.add(element);
		}else {
			System.out.println("Eroare, nu se mai poate adauga un student nou la aceasta subgrupa!");
		}
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSemigroup(this);
		for(Element element: students) {
			element.accept(visitor);
		}
		
	}
	
	public int getCount() {
		return students.size();
	}

}
