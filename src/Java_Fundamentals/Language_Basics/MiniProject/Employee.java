package Java_Fundamentals.Language_Basics.MiniProject;

class Employee {

    private int empNo;
    private String empName;
    private String joinDate;
    private char designationCode;
    private String department;
    private int basicSalary;
    private int hra;
    private int incomeTax;

    public Employee(int empNo, String empName, String joinDate,
                    char designationCode, String department,
                    int basicSalary, int hra, int incomeTax) {

        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.incomeTax = incomeTax;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public char getDesignationCode() {
        return designationCode;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getHra() {
        return hra;
    }

    public int getIncomeTax() {
        return incomeTax;
    }
}