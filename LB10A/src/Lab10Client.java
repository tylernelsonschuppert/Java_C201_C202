/*
 * Update your documentation here
 * This is class Lab10Client.  It has a main method to create objects from the
 * superclass Employee and also from subclasses SalariedEmployee and 
 * HourlyEmployee.
 */
public class Lab10Client{
    public static void main(String[] args){
       
       //Testing the superclass constructors and methods: 
       System.out.println("Testing SuperClass Employee:\n");
       Employee baseEmp1 = new Employee("Tyler", "Nelson");
       Employee baseEmp2 = new Employee("Fred", "Flintstone");
       
       System.out.println(baseEmp1); //invoking the toString method
       System.out.println(baseEmp2);
       
       //Testing the subclass Salaried Employee constructors and methods:
       System.out.println("Testing SubClass SalariedEmployee:\n");
       SalariedEmployee salEmp1 = new SalariedEmployee("Tyler", "Cameron", "CTO", 1000000.00);
       SalariedEmployee salEmp2 = new SalariedEmployee("Barney", "Rubble",
                                                   "Supervisor", 75000.00);
       
       System.out.println(salEmp1);
       System.out.println(salEmp2);
       
       //Testing the subclass Hourly Employee constructors and methods:
       System.out.println("Testing SubClass HourlyEmployee:\n");
       HourlyEmployee houEmp1 = new HourlyEmployee("John", "Doe", 10.00, 40.00);
       HourlyEmployee houEmp2 = new HourlyEmployee("Jane", "Doe", 10.00, 60.00);
	   
	   System.out.println(houEmp1);
       System.out.println(houEmp2);
    }
}
/*
 * copy and paste your output here

********* AFTER WORD DOC #3 ********* 

run:
Testing SuperClass Employee:

Superclass Employee constructor no-arg invoked
Superclass Employee constructor w/args invoked

Employee: not set not set  Date Hired: Sun Nov 18 14:59:07 EST 2018

Employee: Fred Flintstone  Date Hired: Sun Nov 18 14:59:07 EST 2018
Testing SubClass SalariedEmployee:

Superclass Employee constructor no-arg invoked
Subclass SalariedEmployee const. no-arg invoked
Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked

Salaried Employee print method 
Employee: not set not set  Date Hired: Sun Nov 18 14:59:07 EST 2018
Title: no title set  Salary: 50000.0


Salaried Employee print method 
Employee: Barney Rubble  Date Hired: Sun Nov 18 14:59:07 EST 2018
Title: Supervisor  Salary: 75000.0

BUILD SUCCESSFUL (total time: 0 seconds)


********* AFTER WORD DOC #4 ********* 

run:
Testing SuperClass Employee:

Superclass Employee constructor w/args invoked
Superclass Employee constructor w/args invoked

Employee: Tyler Nelson  Date Hired: Sun Nov 18 15:00:13 EST 2018

Employee: Fred Flintstone  Date Hired: Sun Nov 18 15:00:13 EST 2018
Testing SubClass SalariedEmployee:

Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked
Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked

Salaried Employee print method 
Employee: Tyler Cameron  Date Hired: Sun Nov 18 15:00:13 EST 2018
Title: CTO  Salary: 1000000.0


Salaried Employee print method 
Employee: Barney Rubble  Date Hired: Sun Nov 18 15:00:13 EST 2018
Title: Supervisor  Salary: 75000.0

BUILD SUCCESSFUL (total time: 0 seconds)



********* AFTER WORD DOC #5 ********* 
run:
Testing SuperClass Employee:

Superclass Employee constructor w/args invoked
Superclass Employee constructor w/args invoked

Employee: Tyler Nelson  Date Hired: Sun Nov 18 15:20:17 EST 2018

Employee: Fred Flintstone  Date Hired: Sun Nov 18 15:20:17 EST 2018
Testing SubClass SalariedEmployee:

Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked
Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked

Employee: Tyler Cameron  Date Hired: Sun Nov 18 15:20:17 EST 2018
Title: CTO  Salary: 1000000.0


Employee: Barney Rubble  Date Hired: Sun Nov 18 15:20:17 EST 2018
Title: Supervisor  Salary: 75000.0

BUILD SUCCESSFUL (total time: 0 seconds)



********* AFTER WORD DOC #6/#7 ********* 

run:
Testing SuperClass Employee:

Superclass Employee constructor w/args invoked
Superclass Employee constructor w/args invoked

Employee: Tyler Nelson  Date Hired: Sun Nov 18 16:16:42 EST 2018

Employee: Fred Flintstone  Date Hired: Sun Nov 18 16:16:42 EST 2018
Testing SubClass SalariedEmployee:

Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked
Superclass Employee constructor w/args invoked
Subclass SalariedEmployee const. w/args invoked

Employee: Tyler Cameron  Date Hired: Sun Nov 18 16:16:42 EST 2018
Title: CTO  Salary: 1000000.0


Employee: Barney Rubble  Date Hired: Sun Nov 18 16:16:42 EST 2018
Title: Supervisor  Salary: 75000.0

Testing SubClass HourlyEmployee:

Superclass Employee constructor w/args invoked
Subclass HourlyEmployee const. w/args invoked
Superclass Employee constructor w/args invoked
Subclass HourlyEmployee const. w/args invoked

Employee: John Doe  Date Hired: Sun Nov 18 16:16:42 EST 2018
Hours Worked: 40.0  Pay Rate: 10.0
Gross Pay: 400.0

Employee: Jane Doe  Date Hired: Sun Nov 18 16:16:42 EST 2018
Hours Worked: 60.0  Pay Rate: 10.0
Gross Pay: 700.0
BUILD SUCCESSFUL (total time: 0 seconds)

*/