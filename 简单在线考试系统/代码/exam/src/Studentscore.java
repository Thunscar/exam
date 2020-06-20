import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Studentscore {
	static int i;
public static void studentscore()throws Exception{
	try {
		Connection con=DataOption.getConnection();
		String sql="Select * from score ";
		Statement stat=con.createStatement();
		
		ResultSet rs1=stat.executeQuery(sql);
		while (rs1.next()) {
			System.out.println("姓名:"+rs1.getString("name")+"    "+"成绩："+rs1.getString("score"));
		}
		System.out.println("返回上一级菜单，请输入0");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		if (i==0) {
			Teacher.teacher();
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
