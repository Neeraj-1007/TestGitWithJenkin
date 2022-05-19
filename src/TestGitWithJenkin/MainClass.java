package TestGitWithJenkin;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Master Commit");
		System.out.println("Mult Commit");
		int i = 0;
		MultiplicationClass mult = new MultiplicationClass();
		i = mult.mult();
		System.out.println(i);
	}

}
