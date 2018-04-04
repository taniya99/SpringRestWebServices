package spring.rest.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee{
	
	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empid;
	
	@Column(name="ename")
	String ename;	
        
        @Column(name="dept")
	String dept;	
	
	@Column(name="salary")
	long salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String ename,String dept, long salary) {
		super();
		this.empid = id;
		this.ename = ename;
                this.dept = dept;
		this.salary=salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int id) {
		this.empid = id;
	}
        public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
        
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}	
	
}