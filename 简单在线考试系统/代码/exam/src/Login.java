import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;



public class Login {
	static	String username;
	static	String userpwd;
	Teacher teacher=new Teacher();	
	public static void main(String[] args)throws Exception {
			
		try{// TODO Auto-generated method stub
	while(true){
			System.out.println("��ӭ���뿼��ϵͳ,�������û���:");
			Scanner scanner=new Scanner(System.in);
			username=scanner.nextLine();
			System.out.println("����������:");
			userpwd=scanner.nextLine();
		
			Connection con=DataOption.getConnection();
			String sql="Select * from user where username ='"+username+"' and userpwd ='"+userpwd+"'";
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(sql);
			
			
			if (rs.next()) {
				System.out.println(rs.getString("type"));
				if (rs.getString("type").equals("ѧ��")) {
					
					Student.student();
				break;
				}
				else if (rs.getString("type").equals("��ʦ")) {
					Teacher.teacher();
					break;
				}
			}
			
			else {
				System.out.println("�˺Ż�����������������룡");
				
			}
	
			rs.close();
			stat.close();
			con.close();
	}
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
}
