import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Updatetest {
	static String qus;
	static String A;
	static String B;
	static String C;
	static String D;
	static String answer;
	static String id;
	public static void uptest()throws Exception{
		try {
			System.out.println("请输入要修改的题目号：");
			Scanner scanner=new Scanner(System.in);
			id=scanner.nextLine();
			System.out.println("请输入题目：");
			qus=scanner.nextLine();
			System.out.println("请输入选项：");
			System.out.println("A.");
			A=scanner.nextLine();
			System.out.println("B.");
			B=scanner.nextLine();
			System.out.println("C.");
			C=scanner.nextLine();
			System.out.println("D.");
			D=scanner.nextLine();
			System.out.println("请输入正确答案：");
			answer=scanner.nextLine();
			Connection con=DataOption.getConnection();
			PreparedStatement pStatement=con.prepareStatement("update test set ques=?,A=?,B=?,C=?,D=?,answer=? where id=?" );
			pStatement.setString(1, qus);
			pStatement.setString(2, A);
			pStatement.setString(3, B);
			pStatement.setString(4, C);
			pStatement.setString(5, D);
			pStatement.setString(6, answer);
			pStatement.setString(7, id);
			pStatement.executeUpdate();	
			pStatement.close();
			System.out.println("修改成功！");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
