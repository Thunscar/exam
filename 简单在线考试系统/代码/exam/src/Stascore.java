import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Stascore {
	static float avg;
	static int j;
public static void stascore()throws Exception{
	try {
		Connection con=DataOption.getConnection();
		String sql="Select * from score where score=(select max(score)from score)";
		String sql1="Select * from score where score=(select min(score)from score)";
		String sql2="Select avg(score)  from score ";
		Statement stat=con.createStatement();
		
		ResultSet rs=stat.executeQuery(sql);
		
		
		
		System.out.println("最高分：");
		while (rs.next()){
			
		System.out.println(rs.getString("name")+"分数："+rs.getString("score"));
		}
		ResultSet rs1=stat.executeQuery(sql1);
		System.out.println("最低分：");
		while (rs1.next()){
			
			System.out.println(rs1.getString("name")+"分数："+rs1.getString("score"));}
		ResultSet rs2=stat.executeQuery(sql2);
		avg=0;
		while(rs2.next()){
			avg=rs2.getFloat(1);
			}
		System.out.println("平均分："+avg);
		System.out.println("修改成功，按1返回上一级，按0退出。");
		Scanner scanner1=new Scanner(System.in);
		Scanner scanner=new Scanner(System.in);
		j=scanner.nextInt();
		if (j==0) {
			Teacher.teacher();
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
