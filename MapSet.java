
// �޴�����, �Ĵ���� ����� method ������ class

import java.util.Iterator;

public class MapSet extends Main
{
	public void mainList()	// '�޴� ����' ����Ʈ ��� �ÿ� ����� �޼ҵ�
	{
		Iterator<Integer> it = menu.keySet().iterator();
		while (it.hasNext())
		{
			
			Integer in = it.next();
			
			// [all] TreeSet �ڷᱸ�� : �ߺ����� �ʰ� �޴����� ���ĵ�.
			all.add(menu.get(in).getMenuName());
		}
	}// end mainList()
		
	
	// ���ĵ� �޴��� ���
	public void print()
	{
		Iterator<String> it = all.iterator();
		int i=1;

		while (it.hasNext())
		{
			System.out.printf("%d. %s\n", i++, it.next());
		}
	}// end print()



}// class MapSet