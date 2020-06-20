import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;




public class Student {
	static int count;
	static int i=1;
	static int j=0;
	static String ans;
	static double score;
	public static void student()throws Exception {
		try {
			Connection con=DataOption.getConnection();
			String sql="Select * from exam ";
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(sql);
			if (rs.next()) {
				count=rs.getInt("count");
				}
			System.out.println("登陆成功!"+Login.username+",考试将于"+rs.getString("time")+"开始.请答题:");
			String sql1="Select * from test order by rand() limit "+count;
		ResultSet rs1=stat.executeQuery(sql1);
		while (rs1.next()) {
			System.out.println(i+"."+rs1.getString("ques"));
			System.out.println("A."+rs1.getString("A"));
			System.out.println("B."+rs1.getString("B"));
			System.out.println("C."+rs1.getString("C"));
			System.out.println("D."+rs1.getString("D"));
			Scanner scanner=new Scanner(System.in);
			ans=scanner.nextLine();
			if (ans.equalsIgnoreCase(rs1.getString("answer"))) {
				j++;
			}
			i++;
		}
		System.out.println(j);
		score=100.00/count*j;	
		PreparedStatement pStatement=con.prepareStatement("insert into score (name,score) values(?,?)");
		pStatement.setString(1, Login.username);
		pStatement.setDouble(2, score);
		pStatement.executeUpdate();	
		rs.close();
		rs1.close();
		stat.close();
		con.close();
		System.out.println("考试完成，你的成绩为："+score);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}
}
