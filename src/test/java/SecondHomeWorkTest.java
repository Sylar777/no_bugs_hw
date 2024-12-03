import hw.second.*;
import org.junit.jupiter.api.Test;

public class SecondHomeWorkTest {
    @Test
    public void BookTest() {
        Book book = new Book("The Lord of the Rings", "J.R.E. Tolkien", 1000);
        book.setAuthor("J.R.R. Tolkien");
        book.setPrice(2000);

        book.printInfo();
    }

    @Test
    public void PersonTest() {
        Person person1 = new Person("J.R.R. Tolkien", 1892);
        Person person2 = new Person("George R.R. Martin", 1948);

        person1.printInfo();
        person2.printInfo();
    }

    @Test
    public void CarTest() {
        Car car = new Car("BMW", "X5", 2021);
        car.setPrice(2400000);

        car.printCarInfo();
    }

    @Test
    public void ProductTest() {
        Product product = new Product("Milk", "Food", 50, 25.5);
        product.setQuantity(30);

        product.printProductInfo();
    }

    @Test
    public void StudentTest() {
        Student student1 = new Student("John", 0, 18);
        Student student2 = new Student("Jane", 1, 19);
        Student student3 = new Student("Bob", 2, 20);
        Student[] students = new Student[]{student1, student2, student3};

        for (Student student : students) {
            student.printStudentDetails();
        }
    }

    @Test
    public void CurrencyTest() {
        Currency currency = new Currency("RUB", 105.0);
        currency.printCurrencyInfo();
        currency.convertToUSD(1001);
    }

    @Test
    public void PhoneTest() {
        Phone phone = new Phone("Apple", "iPhone 12", 150000);
        phone.applyDiscount(10);

        phone.printPhoneDetails();
    }

    @Test
    public void EmployeeTest() {
        Employee employee1 = new Employee("John", "Doe", 100000);
        Employee employee2 = new Employee("Jane", "Wood", 120000);

        employee1.increaseSalary(15);
        employee2.increaseSalary(15);

        employee1.printEmployeeInfo();
        employee2.printEmployeeInfo();
    }

    @Test
    public void TriangleTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printTriangleInfo();
    }

    @Test
    public void PlayerTest() {
        Player player = new Player("John", 4, 25);
        player.levelUp();
        player.addScore(5);
        player.printPlayerInfo();
    }

    @Test
    public void RectangleTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.printRectangleInfo();
    }

    @Test
    public void CustomerTest() {
        Customer customer = new Customer("John", "Doe");
        customer.addPurchase("Milk");
        customer.addPurchase("Bread");
        customer.addPurchase("Butter");
        customer.printPurchaseHistory();
    }

    @Test
    public void CompanyTest() {
        Company company = new Company("Apple", 12000, 1000000);
        company.printCompanyInfo();
    }

    @Test
    public void CircleTest() {
        Circle circle = new Circle(5);
        circle.printCircleInfo();
    }
}
