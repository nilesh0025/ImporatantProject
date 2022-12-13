package spring_boot_restapi.Repository;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import spring_boot_restapi.Entity.Employee;

@Repository
@Transactional
public class Employee_Repository {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	
   public void InsertEmployee() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("eneter id");
	   int id=Integer.parseInt(sc.nextLine());
	   System.out.println("eneter name");
	   String ename=sc.nextLine();
	   System.out.println("eneter age");
	   int age=Integer.parseInt(sc.nextLine());
	   System.out.println("eneter salary");
	   int salary=Integer.parseInt(sc.nextLine());
	   System.out.println("eneter designation");
	   String designation=sc.nextLine();
	   
	   Employee e=new Employee(id,ename,age,salary,designation);
	   entitymanager.persist(e);
   }
   public Employee getEmployeeById(int id) {
		
		Employee e1=entitymanager.find(Employee.class, id);
		
		return e1;
		
	}
   public void deleteEmployee(int id) {
	   Employee e1=entitymanager.find(Employee.class, id);
	   if(e1==null) {
		   System.out.println("not found");
	   }else {
		   entitymanager.remove(e1);
	   }
   }
   public List<Employee> getAllEmployee(){
	   String query="select e from Employee e";
	return entitymanager.createQuery(query, Employee.class).getResultList();
	   
   }
   public Integer updateEmployee() {
	   String hsql = "update Employee e set ";
       Query query = entitymanager.createQuery(hsql);
       entitymanager.flush();
       Integer result = query.executeUpdate();
       entitymanager.clear();
       return result;
   }
   public List<Employee> getAllEmployees(){
	   String query="SELECT e FROM Employee e WHERE e.age > 20";
	return entitymanager.createQuery(query, Employee.class).getResultList();
	   
   }
   public List<String> getEmpname(){
       String query="select e.ENAME from Employee e";
     return  (List<String>)entitymanager.createQuery(query).getResultList();
    }
  public List<Object[]> getEmployeeNameAndAge(int id){
	  String query="select UPPER(e.ename),e.age from Employee e where e.age=?1";
	  
	  Query q=entitymanager.createQuery(query);
	  
	  q.setParameter(1, id);
	  
	  
	return (List<Object[]>)q.getResultList();
	  
  }
  public double getAverageSalary() {
	  String query="select AVG(e.salary) from Employee e";
	  
	  return (double) entitymanager.createQuery(query).getSingleResult();
			  
			  
  }
    
  public List<Object[]> getDesignationSumSalary(){
	  String query ="select SUM(e.salary) ,e.designation from Employee e GROUP BY e.designation";
	  
	  Query q=entitymanager.createQuery(query);
	  
	  return (List<Object[]>)q.getResultList();
	  
  }
  
  
}