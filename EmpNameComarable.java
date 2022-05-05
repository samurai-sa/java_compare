package practical11;

import java.util.Comparator;

public class EmpNameComarable implements Comparator<Emp> {
	@Override
	public int compare(Emp num1, Emp num2) {
		// valueOf 引数に指定した様々な型のカタチを String 型の文字列として返す
		return String.valueOf(num1.getName()).compareTo(num2.getName());
	}
}
