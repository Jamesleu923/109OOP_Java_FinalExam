package myprogram;
import human.employee;
import human.Manager;
public class Runme {

	public static void main(String[] args) {
	    employee emp01=new employee("001","Jenny","�k", 2);
	    employee emp02=new employee("002","John","�k", 10);
	    employee emp03=new Manager("003","Tomas Trump","�k", 50,5000);	    
	 
	    System.out.println();
	    ShowData(emp01);
	    ShowData(emp02);
	    ShowData(emp03);
	}
	   //�U�謰�h��,�i��J���u,�]�i��J�D��
	public static void ShowData(employee emp) {
		emp.toString();
	}
	
}
