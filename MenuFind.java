// �޴����� ���ý� �ش� �޴��� �Ĵ�� ����ϴ� class

import java.util.Iterator;
import java.util.Scanner;

public class MenuFind extends Main
{


	public int i=1;		//-- ������ ���� ����
	String sunteack;	//-- ���ÿ� ���� ����
	

	// ���ϴ� �޴��� �������� �� �� �޴��� �������ִ� �Ĵ��� ã�� �޼ҵ�
	public void find(String st) throws Exception
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// menu �ڷᱸ�� Iterator
		Iterator<Integer> it = menu.keySet().iterator();

		// Display �ν��Ͻ� ����
		Display di = new Display();
		
		// �޴��� ���ϰ� �ִ� �Ĵ��� ���
		while (it.hasNext())
		{
			Integer in = it.next();

			if (menu.get(in).getMenuName().equals(st))
				System.out.printf("%d. %s\n", i++, menu.get(in).getGagaeName());	
		}
		i=1;	// i �ʱ�ȭ

		// ���̾� ���ϴ� �Ĵ����� ����
		System.out.print(">> ���ϴ� �Ĵ��� �Է��ϼ��� : ");
		sunteack = sc.next();
		System.out.println();

		di.menuDisplay(sunteack);
		
		System.out.println();
	}// end find()

	// �ش� �޴��� ������ �ִ� ������ ������ �������ִ� �޼ҵ�
	public int findInt(String st) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Iterator<Integer> it = menu.keySet().iterator();
		Display di = new Display();
		
		
		
		while (it.hasNext())
		{
			Integer in = it.next();

			if (menu.get(in).getMenuName().equals(st))
				i++;	
		}
		return i;
	}// end findInt()


}// class MenuFind