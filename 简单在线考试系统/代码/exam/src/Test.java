import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test {
	static int i;
	static int j;
public static void test()throws Exception{
	try {
		Connection con=DataOption.getConnection();
		String sql="Select * from test ";
		Statement stat=con.createStatement();
		o:while (true){
		ResultSet rs1=stat.executeQuery(sql);
		while (rs1.next()) {
			System.out.println(rs1.getString("id")+"."+rs1.getString("ques"));
			System.out.println("A."+rs1.getString("A"));
			System.out.println("B."+rs1.getString("B"));
			System.out.println("C."+rs1.getString("C"));
			System.out.println("D."+rs1.getString("D"));}
		 
		System.out.println("1.������Ŀ");
		System.out.println("2.ɾ����Ŀ");
		System.out.println("3.�޸���Ŀ");
		System.out.println("4.������һ��");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextInt();
		switch (i) {
		case 1:Addtest.addtest();
			System.out.println("������һ���˵���������0");
			j=scanner.nextInt();
			if (j==0) {
				break;
			}
			
		case 2:Deltest.deltest();
		System.out.println("������һ���˵���������0");
		j=scanner.nextInt();
		if (j==0) {
			break;
		}
		
		case 3:Updatetest.uptest();
		
		System.out.println("������һ���˵���������0");
		j=scanner.nextInt();
		if (j==0) {
			break;
		}
		case 4:
			Teacher.teacher();
			break o;

		default:
			break;
		}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
}
}
