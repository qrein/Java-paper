public class MainPaper 
{

	public static void main(String[] args) throws Exception 
	{
		Paper my = new Paper();
		try 
		{
			System.out.println("\nСобственные размеры листа бумаги:");
			System.out.printf("Высота: %.1f см%nШирина: %.1f см%n", my.getHeight(), my.getWidth());
			my.setWidth(my.getWidth() / 2);
			my.setHeight(my.getHeight() / 2);		// 1м = 100 см // м*м=м2  // 100 см * 100 см = 10000 см2 = 1 м2
			System.out.printf("Площадь листа бумаги размерами %.1f x %.1f равна %.1f см (%.2f м)", my.getHeight(), my.getWidth(), my.area(), my.area()/10000);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("\nВыполнение в любом случае");
		}
		Paper a4 = new Paper(21, 29.7F);
		System.out.println("\n\nРазмеры листа бумаги A4:");
		System.out.printf("Высота: %.1f см%nШирина: %.1f см%n", a4.getHeight(), a4.getWidth());		
		System.out.printf("Площадь листа бумаги размерами %.1f x %.1f равна %.1f см (%.2f м)", a4.getHeight(), a4.getWidth(), a4.area(), a4.area()/100);
		
		Paper a3 = new Paper(-29.7F, 42);
		System.out.println("\n\nРазмеры листа бумаги A3:");
		System.out.printf("Высота: %.1f см%nШирина: %.1f см%n", a3.getHeight(), a3.getWidth());	
		System.out.printf("Площадь листа бумаги размерами %.1f x %.1f равна %.1f см (%.2f м)", a3.getHeight(), a3.getWidth(), a3.area(), a3.area()/100);
	}
}