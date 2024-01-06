 /**
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday

	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/given_year, inclusive.
	    // Prints each date dd/mm/given_year in a separate line. If the day is a Sunday, prints "Sunday".
		int target_year = Integer.parseInt(args[0]);
		String optional_day_of_the_week_to_print = "";
	 	while (year <= target_year ) {
			if (year == target_year) {
				if (dayOfWeek == 1) {
					optional_day_of_the_week_to_print = " Sunday";
				} else {
					optional_day_of_the_week_to_print = "";
				}
				System.out.println(dayOfMonth + "/" + month + "/" + year + optional_day_of_the_week_to_print);
			}
			advance();
		}

	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfWeek < 7){
			dayOfWeek ++;
		}
		else{
			dayOfWeek = 1;
		}
		if (dayOfMonth < nDaysInMonth(month, year)){
			dayOfMonth++;
		}
		else {
			if (month < 12){
				month ++;
			}
			else {
				month = 1;
				year ++;
			}
			dayOfMonth = 1;
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && ( year % 100 != 0 )) || (year % 400 == 0 ) ){
			return true;
		}
		else {
			return false;
		}
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int num_of_days = 0;
		if (month == 2) {
			if (isLeapYear(year)) {
				num_of_days = 29;
			} else {
				num_of_days = 28;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11){
			num_of_days = 30;
		}
		else{
			num_of_days = 31;
		}
		return num_of_days;
	}
}