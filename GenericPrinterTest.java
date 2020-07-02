package pk24;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter=new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder=powderPrinter.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		
		GenericPrinter<Plastic> plasticPrinter=new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic=plasticPrinter.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();
		
//		GenericPrinter<Water> waterPrinter=new GenericPrinter<Water>();//WaterŸ������ ��ü����
//		waterPrinter.setMaterial(new Water());//Water������ ��ü�� ����
//		Water water=waterPrinter.getMaterial();//water�� waterprinter�� ���� ����
//		System.out.println(water);//water ���(���ο� �ִ� tostring�� ����  "���� Water �Դϴ�."���)
//		
	}

}
