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
		
		
		
		System.out.println("��߷֣�");
		while (rs.next()){
			
		System.out.println(rs.getString("name")+"������"+rs.getString("score"));
		}
		ResultSet rs1=stat.executeQuery(sql1);
		System.out.println("��ͷ֣�");
		while (rs1.next()){
			
			System.out.println(rs1.getString("name")+"������"+rs1.getString("score"));}
		ResultSet rs2=stat.executeQuery(sql2);
		avg=0;
		while(rs2.next()){
			avg=rs2.getFloat(1);
			}
		System.out.println("ƽ���֣�"+avg);
		System.out.println("�޸ĳɹ�����1������һ������0�˳���");
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
