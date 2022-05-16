public class MainPaper 
{

	public static void main(String[] args) throws Exception 
	{
		Paper my = new Paper();
		try 
		{
			System.out.println("\n����������� ������� ����� ������:");
			System.out.printf("������: %.1f ��%n������: %.1f ��%n", my.getHeight(), my.getWidth());
			my.setWidth(my.getWidth() / 2);
			my.setHeight(my.getHeight() / 2);		// 1� = 100 �� // �*�=�2  // 100 �� * 100 �� = 10000 ��2 = 1 �2
			System.out.printf("������� ����� ������ ��������� %.1f x %.1f ����� %.1f �� (%.2f �)", my.getHeight(), my.getWidth(), my.area(), my.area()/10000);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("\n���������� � ����� ������");
		}
		Paper a4 = new Paper(21, 29.7F);
		System.out.println("\n\n������� ����� ������ A4:");
		System.out.printf("������: %.1f ��%n������: %.1f ��%n", a4.getHeight(), a4.getWidth());		
		System.out.printf("������� ����� ������ ��������� %.1f x %.1f ����� %.1f �� (%.2f �)", a4.getHeight(), a4.getWidth(), a4.area(), a4.area()/100);
		
		Paper a3 = new Paper(-29.7F, 42);
		System.out.println("\n\n������� ����� ������ A3:");
		System.out.printf("������: %.1f ��%n������: %.1f ��%n", a3.getHeight(), a3.getWidth());	
		System.out.printf("������� ����� ������ ��������� %.1f x %.1f ����� %.1f �� (%.2f �)", a3.getHeight(), a3.getWidth(), a3.area(), a3.area()/100);
	}
}