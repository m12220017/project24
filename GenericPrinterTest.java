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
		
//		GenericPrinter<Water> waterPrinter=new GenericPrinter<Water>();//Water타입으로 객체생성
//		waterPrinter.setMaterial(new Water());//Water형식의 객체로 생성
//		Water water=waterPrinter.getMaterial();//water에 waterprinter의 값을 대입
//		System.out.println(water);//water 출력(내부에 있는 tostring에 의해  "재료는 Water 입니다."출력)
//		
	}

}
