class This1
{  
	public static void main(String args[])
	{  
		Student s1=new Student(1);  
		Student s2=new Student(2);  
		s1.display();  
		s2.display();  
	}
}  
public class Student
{  
	int rollno;  

	Student(int rollno)
	{  
		this.rollno=rollno;   
	}  
	void display()
	{System.out.println(rollno);}  
}  
  








	