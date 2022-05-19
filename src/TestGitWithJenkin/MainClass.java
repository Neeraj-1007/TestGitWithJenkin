package TestGitWithJenkin;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Master Commit");
		System.out.println("Subs Commit");

		int i = 0;
		SubstractionClass subs = new SubstractionClass();
		i = subs.subs();
		System.out.println(i);
	}

}
