package pk24;


public class GenericMethod {
	
	
	public static <T,V> double makeRectangle(Point<T, V>p1,Point<T, V>p2) {
		double left=((Number)p1.getX()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		double width=right-left;
		double heigh=bottom-top;

		return Math.abs(width*heigh);
	}
	

	public static void main(String[] args) {
		
		Point<Integer, Double> p1=new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2=new Point<Integer, Double>(10, 10.0);
		
		double rect=GenericMethod.makeRectangle(p1, p2);
		System.out.println("�������� ������� �簢���� ���̴�: "+rect+"�Դϴ�.");
	}

}
