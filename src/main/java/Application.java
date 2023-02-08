import dao.CityDAOImpl;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

public class Application {
    public static void main(String[] args) {
        CityDAOImpl cityDAO = new CityDAOImpl();
        City city = new City("Сталинград");
        // cityDAO.add(city);
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee("Леон","Леонов","m",27,city);
        employeeDAO.add(employee);
        cityDAO.delete(cityDAO.getById(4));
//        employeeDAO.deleteEmployee(employeeDAO.getById(13));


    }
}