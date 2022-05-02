package practical11;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		Emp emp2 = new Emp(2, "鈴木 二郎", 40);
		Emp emp3 = new Emp(3, "山田 花子", 19);
		Emp emp4 = new Emp(4, "橋本 士郎", 31);
		Emp emp5 = new Emp(5, "高橋 五郎", 54);
		Emp emp6 = new Emp(6, "吉田 歩", 22);
		Emp emp7 = new Emp(7, "和田 花", 30);
		Emp emp8 = new Emp(8, "山崎 連", 28);
		Emp emp9 = new Emp(9, "三浦 一美", 33);
		
		ArrayList<Emp> lists = new ArrayList<Emp>();
		lists.add(new Emp(1, "田中 太郎", 20));
	    lists.add(emp2);
	    lists.add(emp3);
	    lists.add(emp4);
	    lists.add(emp5);
	    lists.add(emp6);
	    lists.add(emp7);
	    lists.add(emp8);
	    lists.add(emp9);
	    
	    System.out.print("ソートする基準を選んでください。[1:社員番号（昇順） 2:社員名（昇順）3:社員番号（降順）9:終了]");
	    Scanner scanner = new Scanner(System.in);
	    int select_num = scanner.nextInt();	  
	    
	    switch(select_num) {
	    	case 1:
	    		 lists.sort(new EmpComarable());
//	    		 lists.sort(Comparator.comparing(Emp::getNum));
	    		for (Emp l : lists) {
	    	        System.out.println("社員番号：" + l.getNum() + "社員名：" + l.getName() + "年齢：" + l.getAge());
	    	    }
	    		break;
	    	case 2:
	    		 lists.sort(new EmpNameComarable());
//	    		 lists.sort(Comparator.comparing(Emp::getName));
		    		for (Emp l : lists) {
		    	        System.out.println("社員番号：" + l.getNum() + "社員名：" + l.getName() + "年齢：" + l.getAge());
		    	    }
	    		break;
	    	case 3:
	    		 lists.sort(new EmpComarable().reversed());
//	    		 lists.sort(Comparator.comparing(Emp::getNum).reversed());
		    		for (Emp l : lists) {
		    	        System.out.println("社員番号：" + l.getNum() + "社員名：" + l.getName() + "年齢：" + l.getAge());
		    	    }
	    		break;
	    	case 9:
	    		break;
	    }	    
	}
}
