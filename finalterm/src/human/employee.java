package human;

public class employee {
	  private String EmpNO;
	  private String EmpName;
	  private String Gender;
	  private static final float WagePoint=200.0f;
	  private int TitleLevel;
	  private double wage;

	  public employee() {}
	  public employee(String EmpNO) {
		  this.setEmpNO(EmpNO);
	  }
	  public  employee(String EmpNO,String EmpName) {
		  this(EmpNO);
		  this.setEmpName(EmpName);
	  }
	  public employee(String EmpNO,String EmpName, String Gender) {
		  this(EmpNO,EmpName);
		  this.setGender(Gender);
	  }
	  public employee(String EmpNO,String EmpName, String Gender, int TitleLevel) {
		  this(EmpNO,EmpName,Gender);
		  this.setTitleLevel(TitleLevel);
	  }
	  
  public String getEmpNO() {
		return EmpNO;
	}
	public void setEmpNO(String empNO) {
		EmpNO = empNO;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getTitleLevel() {
		return TitleLevel;
	}
	public void setTitleLevel(int titleLevel) {
		if (titleLevel>50)
			TitleLevel =50;
		else if (titleLevel<=1)
		    TitleLevel = 1;
		else 
			TitleLevel=titleLevel;
	}
	public double getWage() {
		return 20000+getTitleLevel()*getWagepoint();
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public static float getWagepoint() {
		return WagePoint;
	}
	public String toString() {		
		 System.out.printf("���u�s��:%s%n ���u�m�W:%s%n ���u�ʧO:%s%n ���u¾��:%d%n",
				 this.getEmpNO().toString(),
				 this.getEmpName().toString(),
				 this.getGender().toString(),
				 this.getTitleLevel());
		 return "";
	}
}
