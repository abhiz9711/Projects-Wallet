package om.cg.ems.DTO;
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		if(emp.empId==this.empId)
		{
			return true;
		}else
		{
			return false;
		}
	}
@Override
public int hashCode()
{
	return empId;
}
	

}
