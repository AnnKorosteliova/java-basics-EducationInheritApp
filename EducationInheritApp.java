
public class EducationInheritApp {

	public static void main(String[] args) {
		
		Pupil wowStudent = new Pupil("Ann Korosteliova Alexandr", (byte)16, 9.20f, (byte)11, "N.Gheorghiu");
		wowStudent.printInfo();
		
		System.out.println();
		
		Student good_student = new Student("Ann Korosteliova Alexandr", (byte)23, 9.20f, (byte)4, "Some university", "programming");
		good_student.printInfo();
		
		System.out.println();
		
		Master master_student = new Master("Ann Korosteliova Alexandr", (byte)30, 7.64f, (byte)2, "Some university", "programming");
		master_student.printInfo();
		
	}
}

class Educated{
	private String fullname;
	protected byte age;
	private float average_grade;
	protected byte level;
	
	public Educated(){}

	public Educated(String fullname, byte age, float average_grade, byte level){
		setFullname(fullname);
		setAge(age);
		setAverage_grade(average_grade);
		setLevel(level);
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public float getAverage_grade() {
		if(average_grade >= 1.00 && average_grade <= 10.00)
			return average_grade;
		else 
			return 0;
	}

	public void setAverage_grade(float average_grade) {
		this.average_grade = average_grade;
	}

	public byte getLevel() {
		return level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}
	
	public void printInfo() { 
		System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)\n" + 
						   "> class: " + getLevel()	+ 
						   "\n> grade: " + getAverage_grade());
	}
}

class Pupil extends Educated{
	private String school_name;
	
	public Pupil(String fullname, byte age, float average_grade, byte level, String school_name){
		super(fullname, age, average_grade, level);
		this.setAge(age);
		this.setLevel(level);
		this.setSchool_name(school_name);
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public void setLevel(byte level) {
		if(level >= 1 && level <= 12)
			this.level = level;
	}
	
	public void setAge(byte age) {
		if(age >= 6 && age <= 20)
			this.age = age;
	}
	
	public void printInfo() {
		super.printInfo();
			System.out.println("> school: " + getSchool_name());
	}
}

class Student extends Pupil{
	private String university_name;
	private String speciality;
	
	public Student(String fullname, byte age, float average_grade, byte level, String university_name, String speciality){
		super(fullname, age, average_grade, level, university_name);
		this.setAge(age);
		this.setLevel(level);
		this.setUniversity_name(university_name);
		this.setSpeciality(speciality);
	}
	
	public void setLevel(byte level) {
		if(level >= 1 && level <= 7)
			this.level = level;
	}
	
	public void setAge(byte age) {
		if(age >= 19 && age <= 30)
			this.age = age;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void printInfo() {
		System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)\n" + 
				   "> class: " + getLevel()	+ 
				   "\n> grade: " + getAverage_grade() +
				   "\n> university: " + getUniversity_name() + 
					"\n> speciality: " + getSpeciality());
	}
}

class Master extends Student{
	
	public Master(String fullname, byte age, float average_grade, byte level, String university_name, String speciality){
		super(fullname, age, average_grade, level, university_name, speciality);
		this.setLevel(level);	
		this.setAge(age);
	}
	
	public void setLevel(byte level) {
		if(level >= 1 && level <= 3)
			this.level = level;
	}
	
	public void setAge(byte age) {
		if(age >= 22 && age <= 33)
			this.age = age;
	}
}