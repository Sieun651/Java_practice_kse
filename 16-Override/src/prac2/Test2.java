package prac2;

public class Test2 extends Sales {
	int amount;		//개별 품목에 대한 총액
	
	public void setProcess() {
		amount = qty * cost;
	}
	
	public void getDisplay() {
		int resultSales = (int)(amount - amount * Sales.getDiscount());
		System.out.println(article + "\t" + resultSales);
	}	
}
