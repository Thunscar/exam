import java.util.Scanner;




public class Teacher  {
	static int i;
	public static void teacher()throws Exception {
		// TODO Auto-generated method stub
System.out.println("��½�ɹ�! ��ӭ��,"+Login.username+"��ʦ��");
System.out.println("1.������");
System.out.println("2.���Թ���");
System.out.println("3.�ɼ���ѯ");
System.out.println("4.�ɼ�ͳ��");
System.out.println("5.�˳�");
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
				System.out.println("��ӭ�´�ʹ�ã���");
				break;

default:
	break;
}
	}
}
