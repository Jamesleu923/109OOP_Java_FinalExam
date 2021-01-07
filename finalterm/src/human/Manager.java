package human;

public class Manager extends employee implements CommandOrder {

	float Supervisor_Differential_Pay;
	
	public Manager(String EmpNO,String EmpName, 
			String Gender, int TitleLevel,float SDP ) {
		super(EmpNO,EmpName,Gender,TitleLevel);
		this.setSupervisor_Differential_Pay(SDP);		
	}
	
	public float getSupervisor_Differential_Pay() {
		return Supervisor_Differential_Pay;
	}
	
	public void setSupervisor_Differential_Pay(float supervisor_Differential_Pay) {
		Supervisor_Differential_Pay = supervisor_Differential_Pay;
	}

	@Override
	public double getWage() {
		return 20000+getSupervisor_Differential_Pay()+getTitleLevel()*getWagepoint();
	}

	@Override
	public void ManagerOrder() {
		System.out.printf("�޲z��:%s�U�F�R�O",this.getEmpName());
		
	}
	
	@Override
	public String toString() {		
		 System.out.printf("���u�s��:%s%n ���u�m�W:%s%n ���u�ʧO:%s%n ���u¾��:%d%n �D�ޥ[��:%.2f%n",
				 this.getEmpNO().toString(),
				 this.getEmpName().toString(),
				 this.getGender().toString(),
				 this.getTitleLevel(),
				 this.getSupervisor_Differential_Pay());
		 return "";
	}

}
