import java.util.Scanner;

//Start of code inspired from Sample Code Enums

//Week days enum
enum daysOfWeek {
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7);
	
	int num;
	
	daysOfWeek(int num) {
		this.num = num;
	}
	
	int getDays() {
		return this.num;
	}
	
	void setDays(int num) {
		this.num = num;
	}
}
//Months enum
enum monthsOfYear {
    JANUARY(1, 31),
    FEBRUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31);

    final int num;
    final int days;

    monthsOfYear(int num, int days) {
        this.num = num;
        this.days = days;
    }
}

//Holidays enum
enum holidaysOfYear {
	NEWYEARS(1,1),
	MLKJR(2, 16),
	VALENTINES(3,45),
	APRILFOOLS(4,92),
	INDEPENDENCE(5,186),
	HOLLOWEEN(6,305),
	CHRISTMAS(7,360),
	NYEVE(8,366);
	
	
	final int num;
    final int date;

    holidaysOfYear(int num, int date) {
        this.num = num;
        this.date = date;
    }
}


//Start of mainline
class JavaSoundsLikeCoffee {  
    public static void main (String[] args) {
    	Scanner userinput = new Scanner(System.in);
    	//Get user input
    	System.out.print("What day of the week is it? ");
    	int day = userinput.nextInt();
    	userinput.nextLine();
    	System.out.print("What month is it? ");
    	int month = userinput.nextInt();
    	userinput.nextLine();
    	System.out.print("What is the date? ");
    	int date = userinput.nextInt();
    	System.out.print("What is the Holiday? (1-8) ");
    	int holidayNum = userinput.nextInt();
    	userinput.nextLine();
    	//Print date
	//Starting point of code inspired from ChatGPT
    	System.out.print("Information:\n");
    	System.out.print("Day: " + daysOfWeek.values()[day - 1]);
    	System.out.print("\nMonth: " + monthsOfYear.values()[month - 1]);
    	System.out.print("\nDate: " + date);
    	System.out.print("\nHoliday: " + holidaysOfYear.values()[holidayNum - 1]);

    }
}
