
public class Main {
	public static void main(String args[]){ 
		SuperDepartment obj= new SuperDepartment ();
		 AdminDepartment obj1=new AdminDepartment ();
		 System.out.print("Welocome to ");
		 obj1.departmentName();
		 obj1.getTodaysWork();
		 obj1.getWorkDeadline();
		 obj.isTodayAHoliday();
		 System.out.print("\n");
		 
		 
		 HrDepartment obj2=new HrDepartment ();
		 System.out.print("Welocome to ");
		 obj2.departmentName();
		 obj2. doActivity();
		 obj2.getTodaysWork();
		 obj.isTodayAHoliday();
		 System.out.print("\n");
		 
		 TechDepartment obj3=new TechDepartment ();
		 System.out.print("Welocome to ");
		 obj3.departmentName();
		 obj3. getTodaysWork();
		 obj3.getWorkDeadline();
		 obj3.getTechStackInformation();
		 obj.isTodayAHoliday();
		}
}


