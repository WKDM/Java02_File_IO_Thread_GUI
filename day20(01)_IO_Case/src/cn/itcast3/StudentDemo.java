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
 * 键入学生信息（学生，语文成绩，数学成绩，英语成绩）按照总分进行排序
 * 
 * 	A:创建学生对象
 * 	B:创建集合对象
 * 		TreeSet<String>
 * 	C:键盘录入学生信息存储到集合
 * 	D:遍历集合，保存到文本文档
 * */
public class StudentDemo {
	public static void main(String[] args) throws IOException {
		//创建集合对象
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
		//键入5个学生对象
		for(int x =1;x<=5;x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第"+x+"个学生信息：");			
			System.out.println("姓名：");
			String name = sc.nextLine();
			System.out.println("语文成绩：");
			int chiness = sc.nextInt();			
			System.out.println("数学成绩：");
			int math = sc.nextInt();			
			System.out.println("英语成绩：");
			int english = sc.nextInt();
			//创建学生对象
			Student s = new Student();
			s.setName(name);
			s.setChiness(chiness);
			s.setMath(math);
			s.setEnglish(english);			
			//把学生对象添加到集合对象
			ts.add(s);
		}
		//遍历集合，存储到文本文档中去
		BufferedWriter bw =new BufferedWriter(new FileWriter("data.txt"));
		bw.write("学生信息如下：");
		bw.newLine();
		bw.flush();
		bw.write("姓名，语文成绩，数学成绩，英语成绩");
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
		//释放资源
		bw.close();
		System.out.println("学生信息存储完毕");
	}
}
