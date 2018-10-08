
public class QAConsulting {
	
	static QAConsulting result;
	
	String name;
	int age;
	String location;
	
	private QAConsulting() {
		name = "This guyyy";
		age = 21;
		location = "Manchester";
	}
	
	private QAConsulting(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public static QAConsulting createObject() {
		if(result == null) {
			result = new QAConsulting();
		}
		
		return result;
	}
	
	public static QAConsulting createObjectWithPar(String name, int age, String location) {
		if(result == null) {
			result = new QAConsulting(name, age, location);
		}
		
		return result;
	}
	
	public String toString(QAConsulting x) {
		return "Name: " + x.name + "\nAge: " + x.age + "\nLocation :" + x.location;
		
	}

}
