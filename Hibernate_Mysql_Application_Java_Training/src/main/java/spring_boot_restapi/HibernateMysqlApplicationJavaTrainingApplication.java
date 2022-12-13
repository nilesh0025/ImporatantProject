package spring_boot_restapi;

import javax.swing.colorchooser.AbstractColorChooserPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_boot_restapi.Config.Spring_Configuration;
import spring_boot_restapi.Entity.Dog;
import spring_boot_restapi.Entity.Employee;
import spring_boot_restapi.Repository.Employee_Repository;

@SpringBootApplication
public class HibernateMysqlApplicationJavaTrainingApplication implements CommandLineRunner{

	
	
	@Autowired
	Employee_Repository erepo;
	public static void main(String[] args) {
		SpringApplication.run(HibernateMysqlApplicationJavaTrainingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ApplicationContext a=new AnnotationConfigApplicationContext(Spring_Configuration.class);
//		Dog d=a.getBean(Dog.class);
//		d.bark();
		
		//erepo.InsertEmployee();
		//System.out.println(erepo.getEmployeeById(1));
		//erepo.deleteEmployee(11);
		//erepo.getAllEmployee().stream().filter(e->e.getAge()>20).forEach(System.out::println);
		//erepo.updateEmployee();
		//erepo.getAllEmployees().stream().forEach(System.out::println);;
	//	erepo.getEmpname().stream().forEach(System.out::print);;
		erepo.getEmployeeNameAndAge(25).stream().forEach(e->System.out.print(e[0]+" "+e[1]));
		//System.out.println(erepo.getAverageSalary()); 
		//erepo.getDesignationSumSalary().stream().forEach(e->System.out.println(e[0]+" "+e[1]));
	}

}
