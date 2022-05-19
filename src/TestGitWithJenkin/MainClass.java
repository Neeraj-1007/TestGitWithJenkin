package TestGitWithJenkin;

public class MainClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		System.out.println("Master Commit ");
		System.out.println("Add Commit");
		int i=0;
		AdditionClass add=new AdditionClass();
		i=add.add();

		System.out.println("Master Commit");
		System.out.println("Subs Commit");

		SubstractionClass subs = new SubstractionClass();
		i = subs.subs();
		System.out.println("Master Commit");
		System.out.println("Mult Commit");
		
		MultiplicationClass mult = new MultiplicationClass();
		i = mult.mult();
		System.out.println(i);
	}

}
