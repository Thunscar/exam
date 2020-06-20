import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Addtest {
	static String qus;
	static String A;
	static String B;
	static String C;
	static String D;
	static String answer;
public static void addtest()throws Exception{
	try {
		System.out.println("请输入题目：");
		Scanner scanner=new Scanner(System.in);
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
		PreparedStatement pStatement=con.prepareStatement("insert into test (ques,A,B,C,D,answer) values(?,?,?,?,?,?)");
		pStatement.setString(1, qus);
		pStatement.setString(2, A);
		pStatement.setString(3, B);
		pStatement.setString(4, C);
		pStatement.setString(5, D);
		pStatement.setString(6, answer);
		pStatement.executeUpdate();
	pStatement.close();
	System.out.println("题目添加成功！");
	con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
