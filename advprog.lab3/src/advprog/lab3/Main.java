package advprog.lab3;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Booking b = new Booking(LocalDate.of(2026, 12, 1), 3, 90.0);
		System.out.println(b.getTotalCost());
	}

}
