package pkg;

public interface Element {
	
	public void add(Element element);
	
	public void accept(Visitor visitor);
}
