package pk24;
//java 1.5���� �Ϲݹ���
public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreePrinter printer=new ThreePrinter();
		
		Powder p1=new Powder();
		printer.setMaterial(p1);
		//�ٿ� ĳ����
		Powder p2=(Powder) printer.getMaterial();
		
		Plastic p3=new Plastic();

	}

}
