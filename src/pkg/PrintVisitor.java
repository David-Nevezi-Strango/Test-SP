package pkg;

public class PrintVisitor implements Visitor {
	
	public PrintVisitor() {
	}

	@Override
	public void visitYear(Year year) {
		System.out.println(year.name);
		
	}

	@Override
	public void visitGroup(Group group) {
		System.out.println("\t" + group.name);
		
	}

	@Override
	public void visitSemigroup(Semigroup semigroup) {
		System.out.println("\t\t" + semigroup.name);
		
	}

	@Override
	public void visitStudent(Student student) {
		System.out.println("\t\t\t" + student.name + ", " + student.email);
		
	}
	
}
