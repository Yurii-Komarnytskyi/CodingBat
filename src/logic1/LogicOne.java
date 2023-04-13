package logic1;

public class LogicOne {

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(isAsleep) return false;
		return (isMorning && isMom || !isMorning)? true : false ;
	}
	public int teenSum(int a, int b) {
//		return (a >= 13 && a <= 19 || b >= 13 && b <= 19)? 19 : a + b;
	    if (a != 13 && b != 13) {
	        return a + b;
	    } else {
	        return 19;
	    }	    
	}

	public static void main(String[] args) {
		LogicOne lo = new LogicOne();
		System.out.println(lo.teenSum(10, 13));

	}

}
