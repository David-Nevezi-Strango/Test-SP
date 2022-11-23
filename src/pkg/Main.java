package pkg;

public class Main {

	public static void main(String[] args) {
		Element info3 = new Year("Informatica 3");
		Element group1 = new Group("Grupa 1");
		Element group2 = new Group("Grupa 2");
		Element semigroup11 = new Semigroup("Semigrupa 1.1");
		Element semigroup12 = new Semigroup("Semigrupa 1.2");
		semigroup11.add(new Student("Popescu I", "popescu@acme.edu"));
		semigroup11.add(new Student("Ionescu E", "ionescu@acme.edu"));
		semigroup12.add(new Student("Vasilescu I", "vasilescu@acme.edu"));
		semigroup12.add(new Student("Georgescu E", "georgescu@acme.edu"));
		group1.add(semigroup11);
		group1.add(semigroup12);
		info3.add(group1);
		info3.add(group2);
				
		Visitor printVisitor = new PrintVisitor();
		info3.accept(printVisitor);
	}

}
