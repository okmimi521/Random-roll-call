import java.util.Random;
import java.util.Scanner;

public class RandomRollCall {

	public static void main(String[] args) {
		System.out.println("--------随机点名器--------");
		// 创建一个存储多个同学名字的容器（数组）
		String[] students = new String[3];
		
		/**
		 * 1.存储全班同学名字
		 * 	创建一个存储多个同学名字的容器（数组） 
		 *  键盘输入每个同学的名字，存储到容器中（数组）
		 */
		//键盘输入多个同学名字存储到容器中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("存储第"+i+"个名称：");
			students[i] = sc.next();
		}
		
		/**
		 * 2打印全班同学每一个人的名字
		 */
		//遍历数组，得到每个同学名字
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			//打印同学名字
			System.out.println("第"+i+"个学生名称：" + name);
		}
		
		/**
		 * 3.在班级总人数范围内，随机产生一个随机数
		 */
		//根据数组长度，获取随机索引
		int index = new Random().nextInt(students.length);
		//通过随机索引从数组中获取名称
		String name = students[index];
		//返回随机点到的名称
		System.out.println(name);
		
	}

}
