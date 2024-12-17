package customer;

import java.util.Scanner;

public class Member {

	//メンバーの属性
	public String name; // 氏名
	public String area; // 居住地
	public String age; // 年齢

	public Member(String name, String area, int age) {
		super();
		this.name = name;
		this.area = area;
		this.age = age;
	}

	//会員情報の表示
	public void showInfo() {
		System.out.println("氏名:" + name + "　" + age + "才　" + area);

	}

	//会員情報の入力
	public static Object[] add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("氏名は？");
		String name = sc.nextLine();
		System.out.println("年齢は？");
		String age = sc.nextLine();
		Object[] person = {name, age};
		return person;
		
		
		
	}
	
		
	

	
	
	
}
