package practical11;

import java.util.Comparator;

public class EmpComarable implements Comparator<Emp> {
	
	@Override
	public int compare(Emp num1, Emp num2) {
		return Integer.valueOf(num1.getNum()).compareTo(num2.getNum());
	}
}
