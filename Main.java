public class Main {
public static void main(String[] args) {
    MyDate date1 = new MyDate();
	MyDate date2 = new MyDate(34355555133101L);
    System.out.println("The first date is " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());
	System.out.println("The second date is: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
	}
}