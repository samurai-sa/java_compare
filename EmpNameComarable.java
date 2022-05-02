package practical11;

import java.util.Comparator;

public class EmpNameComarable implements Comparator<Emp> {
	@Override
	public int compare(Emp num1, Emp num2) {
		return String.valueOf(num1.getName()).compareTo(num2.getName());
	}
}
