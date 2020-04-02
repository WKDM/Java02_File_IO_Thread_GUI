package cn.itcast3;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * ����ѧ����Ϣ��ѧ�������ĳɼ�����ѧ�ɼ���Ӣ��ɼ��������ֽܷ�������
 * 
 * 	A:����ѧ������
 * 	B:�������϶���
 * 		TreeSet<String>
 * 	C:����¼��ѧ����Ϣ�洢������
 * 	D:�������ϣ����浽�ı��ĵ�
 * */
public class StudentDemo {
	public static void main(String[] args) throws IOException {
		//�������϶���
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {				
				int num = s2.getSum()-s1.getSum();
				int num2 = num ==0?s1.getChiness()-s2.getChiness():num;
				int num3 = num2 ==0?s1.getMath()-s2.getMath():num2;
				int num4 = num3 ==0?s1.getEnglish()-s2.getEnglish():num3;
				int num5 = num4 ==0?s1.getName().compareTo(s2.getName()):num4;
				return num5;
				
			}
		});
		//����5��ѧ������
		for(int x =1;x<=5;x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("�������"+x+"��ѧ����Ϣ��");			
			System.out.println("������");
			String name = sc.nextLine();
			System.out.println("���ĳɼ���");
			int chiness = sc.nextInt();			
			System.out.println("��ѧ�ɼ���");
			int math = sc.nextInt();			
			System.out.println("Ӣ��ɼ���");
			int english = sc.nextInt();
			//����ѧ������
			Student s = new Student();
			s.setName(name);
			s.setChiness(chiness);
			s.setMath(math);
			s.setEnglish(english);			
			//��ѧ��������ӵ����϶���
			ts.add(s);
		}
		//�������ϣ��洢���ı��ĵ���ȥ
		BufferedWriter bw =new BufferedWriter(new FileWriter("data.txt"));
		bw.write("ѧ����Ϣ���£�");
		bw.newLine();
		bw.flush();
		bw.write("���������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
		bw.newLine();
		bw.flush();
		for(Student student:ts){
//			bw.write(student.getName()+","+student.getChiness()+","+student.getMath()+","+student.getEnglish());
			StringBuilder studentStr = new StringBuilder();
			studentStr.append(student.getName()).append(",")
			.append(student.getChiness()).append(",")
			.append(student.getMath()).append(",")
			.append(student.getEnglish());
			bw.write(studentStr.toString());
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		bw.close();
		System.out.println("ѧ����Ϣ�洢���");
	}
}
