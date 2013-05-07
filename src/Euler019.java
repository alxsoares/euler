public class Euler019 {
	public static void main(String[] args) {
		// Counting Sundays
		// index of monday is 0, so it's 6 for sunday

		int day = 0; // 1900-01-01 was a monday
		day = (day + 366) % 7; // jump to 1901-01-01

		int sundays = 0;

		for (int year = 1901; year < 2001; year++) {
			// januar
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// februar
			if (day == 6)
				sundays++;
			int febDays = 28;
			if (year % 400 == 0) {
				febDays = 29;
			} else if (year % 100 == 0) {
				febDays = 28;
			} else if (year % 4 == 0) {
				febDays = 29;
			}
			day += febDays;
			day %= 7;
			// maerz
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// april
			if (day == 6)
				sundays++;
			day += 30;
			day %= 7;
			// mai
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// juni
			if (day == 6)
				sundays++;
			day += 30;
			day %= 7;
			// juli
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// august
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// september
			if (day == 6)
				sundays++;
			day += 30;
			day %= 7;
			// oktober
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
			// november
			if (day == 6)
				sundays++;
			day += 30;
			day %= 7;
			// dezember
			if (day == 6)
				sundays++;
			day += 31;
			day %= 7;
		}
		System.out.println(sundays);
	}
}