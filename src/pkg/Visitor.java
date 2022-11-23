package pkg;

public interface Visitor {
	public void visitYear(Year year);
	
	public void visitGroup(Group group);
	
	public void visitSemigroup(Semigroup semigroup);
	
	public void visitStudent(Student student);
}
