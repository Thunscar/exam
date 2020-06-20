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
		System.out.println("设置试卷题数，请输入总题数：");
		Scanner scanner=new Scanner(System.in);
		i=scanner.nextLine();
		System.out.println("设置考试时间，格式：2020-00-00 00:00:00 请输入时间：");
		data=scanner.nextLine();
		
		Connection con=DataOption.getConnection();
		PreparedStatement pStatement=con.prepareStatement("update exam set time=?,count=?" );
		pStatement.setString(1, data);
		pStatement.setString(2, i);
		pStatement.executeUpdate();	
		con.close();
		System.out.println("修改成功，按1返回上一级，按0退出。");
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

