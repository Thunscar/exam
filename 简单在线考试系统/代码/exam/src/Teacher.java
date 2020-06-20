import java.util.Scanner;




public class Teacher  {
	static int i;
	public static void teacher()throws Exception {
		// TODO Auto-generated method stub
System.out.println("登陆成功! 欢迎你,"+Login.username+"老师！");
System.out.println("1.题库管理");
System.out.println("2.考试管理");
System.out.println("3.成绩查询");
System.out.println("4.成绩统计");
System.out.println("5.退出");
Scanner scanner=new Scanner(System.in);
i=scanner.nextInt();
switch (i) {
case 1:
	Test.test();
	break;
	case 2:
		Exam.exam();
		break;
		case 3:
			Studentscore.studentscore();
			break;
		case 4:
			Stascore.stascore();
			break;
			case 5:
				System.out.println("欢迎下次使用！！");
				break;

default:
	break;
}
	}
}
