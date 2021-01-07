package myprogram;
import human.employee;
import human.Manager;
public class Runme {

	public static void main(String[] args) {
	    employee emp01=new employee("001","Jenny","女", 2);
	    employee emp02=new employee("002","John","男", 10);
	    employee emp03=new Manager("003","Tomas Trump","男", 50,5000);	    
	 
	    System.out.println();
	    ShowData(emp01);
	    ShowData(emp02);
	    ShowData(emp03);
	}
	   //下方為多型,可放入員工,也可放入主管
	public static void ShowData(employee emp) {
		emp.toString();
	}
	
}
