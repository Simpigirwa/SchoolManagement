package test.entities;

import java.util.ArrayList;
import java.util.List;

import entities.all.School;
import entities.all.Student;
import entities.all.Teacher;

public class TestSchoolManagement {
	public static void main(String[] args) {
		//creation  of teachers
		Teacher joas =new Teacher(1, "Niyitegeka Jean Joas", 300000);
		Teacher emmy =new Teacher(2, "Bizimana Emmanuel", 230000);
		Teacher k =new Teacher(3, "Kamana Jean Aime", 145000);

		List<Teacher>teacherList=new ArrayList<Teacher>();
		teacherList.add(joas);
		teacherList.add(emmy);
		teacherList.add(k);

		//System.out.println(teacherList);
		//System.out.println(teacherList.get(1).getSalary());
		Student d=new Student(1,"Karenzi David",1);
		Student v=new Student(2,"SIMPIGIRWA Venant",2);
		Student kk=new Student(3,"Kami Keren",3);

		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(d);
		studentList.add(v);
		studentList.add(kk);

		//Information about school

		School mipc= new School(teacherList, studentList);

		Teacher m=new Teacher(5, "Mary Magdalen", 184567);
		mipc.addTeacher(m);

		//System.out.println(teacherList);

		d.payFees(165726);
		v.payFees(350000);
		kk.payFees(250000);

		System.out.println("MIPC has earned Frw "+mipc.getTotalMoneyEarned());

		//make payment
		System.out.println("-------Making School pay salary");
		joas.receiveSalary(joas.getSalary());
		System.out.println("MIPC has spent "+joas.getSalary()+" for salary "+joas.getName()+" and now has Frw "
				+ ""+mipc.getTotalMoneyEarned());
		m.receiveSalary(m.getSalary());
		System.out.println("MIPC has spent "+m.getSalary()+" for salary "+m.getName()+" and now has Frw "
				+mipc.getTotalMoneyEarned());
		System.out.println(k);
		emmy.receiveSalary(emmy.getSalary());
		kk.payFees(5000);
		System.out.println(emmy);
		System.out.println(mipc.getTotalMoneyEarned());
	}
}
