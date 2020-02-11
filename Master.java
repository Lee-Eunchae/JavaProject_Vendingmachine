
// ���ָ�带 ������ class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Iterator;

public class Master extends Main
{
	private static final int MASTER_GAGAE = 1;		//-- ���� ���� �߰�/����

	private static final int GAGAE_PLUS = 5;		//-- ���� ���� �߰�
	private static final int GAGAE_MINUS = 6;		//-- ���� ���� ����

	private static final int MASTER_MENU = 2;		//-- ���� �޴� �߰�/����

	private static final int MENU_PLUS = 7;			//-- ���� �޴� �߰�
	private static final int MENU_MINUS = 8;		//-- ���� �޴� ����

	private static final int MASTER_TODAY = 3;		//-- ���� ���� ����

	private static final int MASTER_EVENT = 4;		//-- ���� �̺�Ʈ �߰�/����

	private static int select;						//-- ���� Integer
	private static String selectS;					//-- ���� String
	static String pass;								//-- masterKey �Է� ���� ���� ����

	// BufferedReader �ν��Ͻ� ����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	

	// ���ָ�� ���� Display�� �޼ҵ�
	public void masMenu()
	{
		try
		{
			// MasterKey �Է� �ޱ�
			System.out.print("\n>> Master Key �� �Է��ϼ��� : ");
			pass = br.readLine();
			System.out.println(mas.get(pass));

			
			// MasterKey�� �̹� ����� �Ǿ� �ִ��� Ȯ��
			if (mas.containsKey(pass))
			{
				System.out.println(">> �����Ǿ����ϴ�.");
				System.out.println();
				System.out.println();
			}
			else if (!mas.containsKey(pass))
			{
				System.out.println(">> ������ �� �����ϴ�.");
				System.out.println();
				System.out.println();
				return;
			}

			// Event1 �ν��Ͻ� ����
			Event1 ts = new Event1();
			
			// 99�� ������ �� ����ȭ������ ���ư� �� �ִ� �ݺ��� ����
			do
			{
				System.out.println("=====================");
				System.out.println("   [���� ���]");
				System.out.println("1. ���� ��� ����");
				System.out.println("2. �޴� �߰� ����");
				System.out.println("3. ���� ���� ��Ȳ");
				System.out.println("4. �̺�Ʈ �߰� ����");
				System.out.println("---------------------");
				System.out.println("99. ����ȭ��");
				System.out.println("=====================");
				System.out.print(">> (1~4��) �����ϼ��� : ");
				select();
				

				switch (select)
				{
					case MASTER_GAGAE: gagaeMenu(); break;		// ���� ��� ����
					case MASTER_MENU: menuMenu(); break;		// �޴� �߰� ����
					case MASTER_TODAY: masterToday(); break;	// ���� ���� ��Ȳ
					case MASTER_EVENT: ts.eventStore();break;	// �̺�Ʈ �߰� ����
					case EXIT: return;							// 99��
				
				}
			}
			while (true);
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			masMenu();
		}
		

			
		
	}// end masMenu()


	// �Է¹޴� �޼ҵ� ����
	public void select() throws IOException
	{

		select = Integer.parseInt(br.readLine());

	}// end select()

	// ���� �߰� ���� Display �޼ҵ�
	public void gagaeMenu()
	{
		try
		{
			System.out.println("\n[�߰� ����]");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.println("---------------------");
			System.out.println("99. ����ȭ��");
			System.out.println("=====================");
			System.out.print("(1,2) �����ϼ���. : ");
			
			select();

			switch (select + 4)
			{
				case GAGAE_PLUS: gagaePlus(); break;
				case GAGAE_MINUS: gagaeMinus(); break;
				case EXIT +4 : masMenu(); break;
			
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			gagaeMenu();
		}
			
		
	}// end gagaeMenu()
	
	// ���� �߰� �޼ҵ�
	public void gagaePlus()
	{	
		try
		{
			Gagae gg = new Gagae();
			Display dis = new Display();

			// ������ ����� ������ �� ����
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> �Ĵ� ������ �����ϼ��� : ");
			gg.kind = Integer.parseInt(br.readLine());
			
			switch (gg.kind)
			{
			case 1: gg.addGhan(); break;	// �ѽ�
			case 2: gg.addGchi(); break;	// �߽�
			case 3: gg.addGjap(); break;	// �Ͻ�
			case 4: gg.addGbun(); break;	// �н�
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			gagaePlus();
		}
		
		

	}// end gagaePlus()

	// ���� ���� �޼ҵ�
	public void gagaeMinus()
	{	
		try
		{
			// ���� �ν��Ͻ� ����
			Gagae gg = new Gagae();

			// ����� ������ ������ �� ����
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> �Ĵ� ������ �����ϼ��� : ");
			gg.kind = Integer.parseInt(br.readLine());
			
			switch (gg.kind)
			{
				case 1: gg.delGhan(); break;	// �ѽ�
				case 2: gg.delGchi(); break;	// �߽�
				case 3: gg.delGjap(); break;	// �Ͻ�
				case 4: gg.delGbun(); break;	// �н�
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			gagaeMinus();
		}
			
		
	}//end gagaeMinus()

	// �޴� �߰� ���� �޼ҵ�
	public void menuMenu()
	{
		try
		{
			System.out.println("\n [�߰� ����]");
			System.out.println("--------------");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.print("(1,2) �����ϼ���. : ");

			select();

			switch (select + 6)
			{
				case MENU_PLUS: menuPlus(); break;		// �޴� �߰�
				case MENU_MINUS: menuMinus(); break;	// �޴� ����	
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			menuMenu();
		}
			
		
		
	}// end menuMenu()

	// �޴� �߰� �޼ҵ�
	public void menuPlus()
	{
		try
		{
			// Gagae �ν��Ͻ� ����
			Gagae gg = new Gagae();

			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");
			gg.kind = Integer.parseInt(br.readLine());
		
			System.out.print("\n>> ���� �̸��� �Է��ϼ��� :");
			gg.nameG = br.readLine();
			
			// �޴� �߰� �޼ҵ� ȣ��(Gagae Ŭ����)
			gg.addMenu();
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			menuPlus();
		}
		
		
	}// end menuPlus()


	// �޴� ���� �޼ҵ�
	public void menuMinus()
	{
		try
		{
			// Gagae �ν��Ͻ� ����
			Gagae gg = new Gagae();

			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");
			gg.kind = Integer.parseInt(br.readLine());

		
			System.out.print("\n>> ���� �̸��� �Է��ϼ��� :");
			gg.nameG = br.readLine();
			
			// �޴� ���� �޼ҵ� ȣ��(Gagae Ŭ����)
			gg.delMenu();
				
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			menuMinus();
		}
		
		
	}// end menuMinus()

	// ���� ���� ���� ��� �޼ҵ�
	public void masterToday()
	{
		
		try
		{	

			// ���� ���� ��¿� ���� ����
			int z=1;
		
			// Gagae �ν��Ͻ� ����
			Gagae gg = new Gagae();
			String kstr = "";	//-- masterKey �Է� �ޱ�� ���� ����
			System.out.println();
			System.out.print("�Ĵ��̸��� �Է����ּ��� : ");
			String gstr = br.readLine();	//-- �Ĵ��̸� �Է� �ޱ�� ���� ����
			System.out.print("Master Key �� �Է����ּ��� : ");
			kstr = br.readLine();

			// ���ʿ� ���� masterKey�� �������� �ʴ� ������ �����Ϸ��� �� �� �Ÿ��� �ִ� ����
			if (!(pass.equals(kstr)))
			{
				System.out.println("�ٸ� ������ ������ �̿��Ͻ� �� �����ϴ�.");
				return;
			}
			
			// ��ϵ��� ���� masterKey�� ���� �������� ����
			if (ghan.containsKey(gstr))
			{
				if (!ghan.get(gstr).getMaster().equals(mas.get(kstr)))
				{
					System.out.println("Ȯ���� �� �����ϴ�.");
					return;
				}
			}
			else if (gchi.containsKey(gstr))
			{
				if (!gchi.get(gstr).getMaster().equals(mas.get(kstr)))
				{
					System.out.println("Ȯ���� �� �����ϴ�.");
					return;
				}
			}
			else if (gjap.containsKey(gstr))
			{
				if (!gjap.get(gstr).getMaster().equals(mas.get(kstr)))
				{
					System.out.println("Ȯ���� �� �����ϴ�.");
					return;
				}
			}
			else if (gbun.containsKey(gstr))
			{
				if (!gbun.get(gstr).getMaster().equals(mas.get(kstr)))
				{
					System.out.println("Ȯ���� �� �����ϴ�.");
					return;
				}
			}
			else
			{
				System.out.println("�ش� �Ĵ� Ȥ�� Ű�� �������� �ʽ��ϴ�.");
				return;
			}
				
				
			
			// ���� ���� ��Ȳ(�ش� ���ֿ� ���ؼ�) ���
			System.out.println();
			System.out.printf("['%s' ���Ͻ�����Ȳ]\n",gstr);
			System.out.println("=============================================\n");
			System.out.println("��ȣ   ���Ը�\t\t�Ǹŷ�\t����\t�޴���");
			
			Iterator<Integer> it = today.keySet().iterator();	// ���� �ѽ��� ���� �ڷᱸ���� ���� Iterator
			Iterator<Integer> its = menu.keySet().iterator();	// �޴� �ڷᱸ���� ���� Iterator
			Iterator<String> itss = todayList.iterator();		// ���� �ѽ������� �ߺ��� �κ��� ���ֱ� ���� set���� ��ȯ Iterator


			// ���� ���� �޴�����Ʈ�� ���� �̸�����Ʈ �ߺ����� �ʵ��� ���
			while (it.hasNext())
			{
				int ipp = it.next();
				todayList.add(today.get(ipp).getMname());
				todayGagae.add(today.get(ipp).getGname());

			}

			// �޴� Iterator �缱��
			its = menu.keySet().iterator();
			while (its.hasNext())		
			{
				Integer toin = its.next();
				

				// �ߺ����� ���� ���Ͻ��� Iterator
				itss = todayList.iterator();
				while (itss.hasNext())
				{
					String toint = itss.next();

					// ���� �޴��̸��� �����̸����� �����ϸ� �� ������ ���
					if (menu.get(toin).getMenuName().equals(toint) && menu.get(toin).getGagaeName().equals(gstr))
					{
						System.out.printf("%2d. [%s] \t %d��\t%,d\t%s\t\n", z++, menu.get(toin).getGagaeName(), menu.get(toin).getSell(), menu.get(toin).getPrice(), menu.get(toin).getMenuName());
					}
				}
			}
			System.out.println("\n=============================================");
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			masterToday();
		}
		

		
		

	}// end masterToday()
}// class Master