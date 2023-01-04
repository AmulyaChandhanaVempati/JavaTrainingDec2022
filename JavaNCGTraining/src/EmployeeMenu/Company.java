package EmployeeMenu;

public class Company
{
    private Employee[] employees;
    private int index = 0;
    public Company(int n)
    {
       employees = new Employee[n];
    }
    public boolean addEmployee(Employee emp)
    {
        if(index < employees.length)
        {
            employees[index++]=new Employee(emp.getEmpid(),emp.getEname(),emp.getSalary(),emp.getMobileNo(),emp.getEmailId());
            return true;
        }
        return false;
    }
    public boolean modifyEmployee(Employee emp)
    {
        for(Employee e : employees)
        {
             if(e!=null && e.getEmpid()==emp.getEmpid())
             {
                  e.setEname(emp.getEname());
                  e.setSalary(emp.getSalary());
                  e.setMobileNo(emp.getMobileNo());
                  e.setEmailId(emp.getEmailId()); 
                  return true;           
             }
        }
        return false;
    }
    public boolean deleteEmployee(int empid)
    {
         for(int i=0;i<index;i++)
         {
            if(employees[i].getEmpid()==empid)
            {
                for(int j=i;j<index-1;j++)
                    employees[j]=employees[j+1];
                index--;
                return true;          
            } 
         }    
         return false;   
    }
    public Employee findEmployeeById(int empid)
    {
         for(int i=0;i<index;i++)
           if(employees[i].getEmpid()==empid)
               return employees[i];
         return null; 
    }
    public Employee[] getAllEmployees()
    {
        return java.util.Arrays.copyOfRange(employees, 0, index);
    }
}