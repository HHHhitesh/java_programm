class EmployeeId
{
	private int empId;

	public void setEmpId(int eId)
	{
		empId=eId;
	}
	public int getEmpId()
	{
		return empId;
	}
}
class Test330
{
	public static void main(String[]args)
	{
		EmployeeId e=new EmployeeId();
		e.setEmpId(101);
		// System.out.println(e.empId);
	}
}