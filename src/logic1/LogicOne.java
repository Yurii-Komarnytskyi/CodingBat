package logic1;

public class LogicOne {

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep)
			return false;
		return (isMorning && isMom || !isMorning) ? true : false;
	}

	public int teenSum(int a, int b) {
		return (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : a + b;
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend && cigars >= 40)
			return true;
		return (!(cigars >= 40 && cigars <= 60)) ? false : true;
	}

	public int dateFashion(int you, int date) {
		return (you <= 2 || date <= 2) ? 0 : (you >= 8 || date >= 8) ? 2 : 1;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		int upperLimit = (isSummer) ? 100 : 90;
		return temp >= 60 && temp <= upperLimit;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int extraSpeed = isBirthday ? 5 : 0;
		return (speed > 81 + extraSpeed) ? 2 : (speed <= 60 + extraSpeed) ? 0 : 1;

	}
	public int sortaSum(int a, int b) {
		return (a + b >= 10 && a + b <= 19)? 20 : a + b;
	}
	public String alarmClock(int day, boolean vacation) {
		if(day > 0 && day < 6) return (vacation)? "10:00" : "7:00" ;
		return (vacation)?  "off" : "10:00";
	}
	public boolean love6(int a, int b) {
		return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6)? true : false;  
	}
	public boolean in1To10(int n, boolean outsideMode) {
		if(outsideMode) return (n <= 1 || n >= 10)? true : false;
		return (n >= 1 && n <= 10)? true : false;  
	}

	public boolean specialEleven(int n) {
		return n % 11 == 0 || n % 11 == 1;
	}
	public boolean more20(int n) {
		return n % 20 <= 2 && n % 20 != 0;
	}
	public boolean old35(int n) {
		return (n % 3 == 0) != (n % 5 == 0);
	}
	public boolean less20(int n) {
		return n % 20 == 18 || n % 20 == 19; 
	}


	public static void main(String[] args) {
		LogicOne lo = new LogicOne();
		System.out.println(lo.less20(40));

	}

}