package pkg;

import java.util.ArrayList;

public class Year implements Element{
	String name;
	ArrayList<Element> groups;
	
	
		
	public Year(String name) {
		this.name = name;
		this.groups = new ArrayList<Element>();
	}

	@Override
	public void add(Element element) {
		this.groups.add(element);
		
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

		visitor.visitYear(this);
		for (Element element: groups) {
			element.accept(visitor);
		}
		
	}
}
