package practical11;

public class Emp {
	private int num;
	private String name;
	private int age;

  public Emp(int num, String name, int age) {
	  this.num = num;
	  this.name = name;
	  this.age = age;
  }
  
  public int getNum() {
      return this.num;
  }

  public String getName() {
      return this.name;
  }
  
  public int getAge() {
      return this.age;
  }
  
  @Override
  public String toString() {
	  return "num:" + num + "name:" + name + "age:" + age;
  }
}
 