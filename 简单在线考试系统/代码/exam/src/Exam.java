import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Scanner;




public class Exam {
static String data;
static String i;
static int j;
public static void exam ()throws Exception{
	try {
		System.out.println("�����Ծ���������������������");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextLine();
		System.out.println("���ÿ���ʱ�䣬��ʽ��2020-00-00 00:00:00 ������ʱ�䣺");
		data=scanner.nextLine();
		
		Connection con=DataOption.getConnection();
		PreparedStatement pStatement=con.prepareStatement("update exam set time=?,count=?" );
		pStatement.setString(1, data);
		pStatement.setString(2, i);
		pStatement.executeUpdate();	
		con.close();
		System.out.println("�޸ĳɹ�����1������һ������0�˳���");
		Scanner scanner1=new Scanner(System.in);
		j=scanner.nextInt();
		if (j==0) {
			Teacher.teacher();
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	


	}
	
}

