package design;
import databases.ConnectToSqlDB;
import databases.User;
import databases.UserEmployee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;



public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
		EmployeeInfo employee1 = new EmployeeInfo(111);
		employee1.departements();
		employee1.assignDepartment();
		employee1.calculateSalary();
		employee1.calculateEmployeeBonus(4);
		employee1.calculateEmployeePension();


		ConnectToSqlDB connect = new ConnectToSqlDB();

		connect.insertProfileToSqlTable(new User("Mahmud", "008", "Bangladeshi"),
				"employeeInfo", "NAMEc", "IDc", "NTIONc");

		List<User> list = ConnectToSqlDB.readUserProfileFromSqlTable();
		for (User user : list) {
			System.out.println(user.getName() + " " + user.getEmployeeID() + " " + user.getNationality());
		}

	}
}