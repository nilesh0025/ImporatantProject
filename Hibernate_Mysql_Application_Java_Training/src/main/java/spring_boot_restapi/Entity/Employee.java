package spring_boot_restapi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
int id;
@Column(name="ENAME")
String ename;
@Column(name="AGE")
int age;
@Column(name="SALARY")
int salary;
@Column(name="DESIGNTION")
String designation;
public Employee() {
	super();
}
public Employee(int id, String ename, int age, int salary, String designation) {
	super();
	this.id = id;
	this.ename = ename;
	this.age = age;
	this.salary = salary;
	this.designation = designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", age=" + age + ", salary=" + salary + ", designation="
			+ designation + "]";
}



}
