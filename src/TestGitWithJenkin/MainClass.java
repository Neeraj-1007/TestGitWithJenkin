package TestGitWithJenkin;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Master Commit");
		System.out.println("Add Commit");
		int i=0;
		AdditionClass add=new AdditionClass();
		i=add.add();
		System.out.println(i);
	}

}
