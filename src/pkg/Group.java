package pkg;

import java.util.ArrayList;

public class Group implements Element{
	String name;
	ArrayList<Element> semigroups;
	
	
	
	public Group(String name) {
		this.name = name;
		this.semigroups = new ArrayList<Element>();
	}

	@Override
	public void add(Element element) {
		if(semigroups.size() < 2) {
			semigroups.add(element);
		} else {
			System.out.println("Eroare: nu se mai poate adauga o noua subgrupa la aceasta grupa!");
		}
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitGroup(this);
		for(Element element: semigroups) {
			element.accept(visitor);
		}
		
	}

}
