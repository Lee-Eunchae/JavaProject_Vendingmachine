
// �����ڸ�带 ������ class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

public class ManagerMenu extends Main
{
	// BufferedReader �ν��Ͻ� ����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static final int MANAGER_MASTERIN = 1;		//-- ���� ���
	private static final int MANAGER_MASTEROUT = 2;		//-- ���� ����

	private static final int MANAGER_GAGAE = 3;			//-- ���� ��� ����
	
	private static final int GAGAE_PLUS = 8;			//-- ���� ���
	private static final int GAGAE_MINUS = 9;			//-- ���� ����

	private static final int MANAGER_MENU = 4;			//-- �޴� �߰� ����

	private static final int MENU_PLUS = 10;			//-- �޴� �߰�
	private static final int MENU_MINUS = 11;			//-- �޴� ����

	private static final int MANAGER_TODAY = 5;			//-- ���� �� ����
	private static final int MANAGER_EVENT = 6;			//-- �̺�Ʈ �߰�/����

	private static final int MANAGER_CASH = 7;			//-- ���� ����
	private static final int CASH_REST = 12;			//-- �Ž����� ��Ȳ
	private static final int CASH_UP = 13;				//-- �Ž����� ����
	private static final int CASH_GET = 14;				//-- �Ž����� ȸ��

	//final int EXIT = 99;


	private static final String managerKey = "1234asdf";//-- �Ŵ��� ��й�ȣ ����
	
	public static int select;							//-- ���� ����(Integer)
	private static String selectS;						//-- ���� ����(String)

	// menu Display �޼ҵ�
	public void menu()
	{
		
		try
		{
			System.out.print("\n>> ��й�ȣ�� �Է��ϼ��� : ");
			String pass = br.readLine();
			
			// �Էµ� ��й�ȣ�� ��ϵǾ��ִ� ��й�ȣ ��
			if (pass.equals(managerKey))
				System.out.println("�� �����Ǿ����ϴ�.\n\n");
			else if (!pass.equals(managerKey))
			{
				System.out.println("�� ������ �� �����ϴ�.\n\n");
				return;
			}

			// Event1 �ν��Ͻ� ����
			Event1 ts = new Event1();

			// 99���� ������ �� �������� ���ư� �� �ִ� �ݺ��� ����
			do
			{
				System.out.println("=====================");
				System.out.println(" [������ ���]");
				System.out.println("1. ���� ���");
				System.out.println("2. ���� ����");
				System.out.println("3. ���� ��� ����");
				System.out.println("4. �޴� �߰� ����");
				System.out.println("5. ���� ���� �� ��Ȳ");
				System.out.println("6. �̺�Ʈ �߰� ����");
				System.out.println("7. ���� ����");
				System.out.println("--------------------");
				System.out.println("99. ����ȭ��");
				System.out.println("====================");
				System.out.print(">> (1~7��) �����ϼ��� : ");

				
				
				select();

				switch (select)
				{
					case MANAGER_MASTERIN: masterKeyIn(); break;
					case MANAGER_MASTEROUT: masterKeyOut(); break;
					case MANAGER_GAGAE: MgagaeMenu(); break;
					case MANAGER_MENU: MmenuMenu(); break;
					case MANAGER_TODAY: managerToday(); break;
					case MANAGER_EVENT: eventControl(); break;
					case MANAGER_CASH: cashMenu(); break;
					case EXIT: return;
				}
		
			}while (true);

		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			menu();
		}
			
		
	
		
		
	}// end menu()


	public void select() throws IOException
	{
		select = Integer.parseInt(br.readLine());
	}



	// ���� �߰� ���� �޼ҵ�
	public void MgagaeMenu()
	{
		try
		{
			System.out.print(">> ��й�ȣ�� �Է��ϼ��� : ");
			String temp = br.readLine();
			
			// �Էµ� ��й�ȣ�� ������ ��й�ȣ ��
			if (temp.equals(managerKey))
				System.out.println("�� �����Ǿ����ϴ�.\n\n");
			else if (!temp.equals(managerKey))
			{
				System.out.println("�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.\n\n");
				return;
			}

			System.out.println("\n[�߰� ����]");
			System.out.println("-------------");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.print("(1,2) �����ϼ���. : ");

			// ���ù� ȣ��
			select();

			switch (select + 7)
			{
				case GAGAE_PLUS: MgagaePlus(); break;		//-- ���� �߰�
				case GAGAE_MINUS: MgagaeMinus(); break;		//-- ���� ����
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MgagaeMenu();
		}
			
	}// end MgagaeMenu()
		

	// ���� �߰� �޼ҵ�
	public void MgagaePlus()
	{	
		// Gagae �ν��Ͻ� ����
		Gagae gg = new Gagae();
		try
		{
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");

			// ���� ���� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.kind = Integer.parseInt(br.readLine());
			
			switch (gg.kind)
			{
				case 1: gg.addGhan(); break;
				case 2: gg.addGchi(); break;
				case 3: gg.addGjap(); break;
				case 4: gg.addGbun(); break;

			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MgagaePlus();
		}
		
	}// end MgagaePlus()


	public void MgagaeMinus()
	{
		// Gagae �ν��Ͻ� ����
		Gagae gg = new Gagae();
		try
		{
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");

			// ���� ���� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.kind = Integer.parseInt(br.readLine());
			
			switch (gg.kind)
			{
				case 1: gg.delGhan(); break;
				case 2: gg.delGchi(); break;
				case 3: gg.delGjap(); break;
				case 4: gg.delGbun(); break;
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MgagaeMinus();
		}
		
		
	}// end MmenuMenu()

	// �޴� �߰� ���� �޼ҵ�
	public void MmenuMenu()
	{
		
		try
		{
			System.out.println("\n[�߰� ����]");
			System.out.println("-------------");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.print("(1,2) �����ϼ���. : ");
			
			// select �޼ҵ� ȣ��
			select();

			switch (select + 9)
			{
				case MENU_PLUS: MmenuPlus(); break;		//-- �޴� �߰�
				case MENU_MINUS: MmenuMinus(); break;	//-- �޴� ����	
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MmenuMenu();
		}
		
		
	}


	public void MmenuPlus()
	{
		// Gagae �ν��Ͻ� ����
		Gagae gg = new Gagae();
		try
		{
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");

			// ���� ���� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.kind = Integer.parseInt(br.readLine());

			System.out.print("\n>> ���� �̸��� �Է��ϼ��� :");
			// ���� �̸� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.nameG = br.readLine();

			// �޴� �߰� �޼ҵ� ȣ��(Gagae Ŭ����)
			gg.addMenu();
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MmenuPlus();
		}

		
	}// end MmenuPlus()

	// �޴� ���� �޼ҵ�
	public void MmenuMinus()
	{
		// Gagae �ν��Ͻ� ����
		Gagae gg = new Gagae();
		try
		{
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ���� ������ �����ϼ��� : ");
			// ���� ���� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.kind = Integer.parseInt(br.readLine());

			System.out.print("\n>> ���� �̸��� �Է��ϼ��� : ");
			// ���� �̸� ������ �Է¹ޱ�(Gagae Ŭ����)
			gg.nameG = br.readLine();
			
			// �޴� �߰� �޼ҵ� ȣ��(Gagae Ŭ����)
			gg.delMenu();
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			MmenuMinus();
		}

		
	}// end MmenuMinus()
///////////////////////////////////////////////////////////////
	
	// ���� ��� �޼ҵ�
	public void masterKeyIn()
	{
		// Random �ν��Ͻ� ����
		Random rd = new Random();

		// masterKey �������� ����
		String temp = "mas";

		// ���� ���� Iterator
		Iterator<String> it = mas.keySet().iterator();
		
		try
		{
			System.out.println("\n [1. ���� ���]");
			System.out.println("--------------------------");
			System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
			// ���� �̸� �Է�
			String n = br.readLine();


			while (it.hasNext())
			{
				if (mas.get(it.next()).equals(n))
				{
					System.out.println("�̹� ��ϵǾ��ִ� �����Դϴ�.");
					return;
				}
			}

			
			System.out.printf("[%s] �̸����� ����Ͻðڽ��ϱ�?(Y/N) : ", n);
			// (Y/N) �Է¹ޱ�
			selectS = br.readLine();
			

			if (!selectS.equals("y") && !selectS.equals("Y"))
			{
				System.out.println("�ٽ� �̿����ֽñ� �ٶ��ϴ�.\n\n");
				return;
			}

			// �����ĺ��� mas + ����8�ڸ� ���� ����
			for (int i=0; i<8; i++)
			{
				temp += rd.nextInt(10);
			}
			System.out.printf("[%s] Master Key�� �߱޵Ǿ����ϴ�.\n\n\n",temp);

			mas.put(temp,n);
			System.out.println(mas.containsKey(temp));
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			masterKeyIn();
		}

	}// end masterKeyIn()

	// ���� ����
	public void masterKeyOut()
	{
		try
		{
			System.out.println("\n [2. ���� ����]");
			System.out.print(">> �ش� ������ Master Key�� �Է��ϼ��� : ");
			// MasterKey �Է¹ޱ�
			String temp = br.readLine();		

			// ���������� �ش� �Է������� ���� �� ���
			if (mas.containsKey(temp))
			{
				System.out.printf(">> [%s], ������ �����Ͻðڽ��ϱ�?(Y/N) : ", mas.get(temp));
				String sel = br.readLine();
				if (sel.equals("y") || sel.equals("Y"))
				{
					// ���������� ���ִ� ��� ���� ����
					Iterator<String> it = ghan.keySet().iterator();
					while (it.hasNext())
					{
						String in = it.next();
						if (ghan.get(in).getMaster().equals(mas.get(temp)))
						{
							ghan.remove(in);	
							break;
						}
					}

					Iterator<String> it1 = gchi.keySet().iterator();
					while (it1.hasNext())
					{
						String in = it1.next();
						if (gchi.get(in).getMaster().equals(mas.get(temp)))
						{
							gchi.remove(in);	
							break;
						}
					}

					Iterator<String> it2 = gjap.keySet().iterator();
					while (it2.hasNext())
					{
						String in = it2.next();
						if (gjap.get(in).getMaster().equals(mas.get(temp)))
						{
							gjap.remove(in);	
							break;
						}
					}

					Iterator<String> it3 = gbun.keySet().iterator();
					while (it3.hasNext())
					{
						String in = it3.next();
						if (gbun.get(in).getMaster().equals(mas.get(temp)))
						{
							gbun.remove(in);	
							break;
						}
					}
					
					// ���� ������Ű ���� ����
					mas.remove(temp);
					System.out.println("�� �����Ǿ����ϴ�.");
				}
				else if (!sel.equals("y") && !sel.equals("Y"))
					System.out.println("�� �������� �ʾҽ��ϴ�.");
			}
			else if (!mas.containsKey(temp))
				System.out.println("�� �ش� ���ִ� ��ϵǾ����� �ʽ��ϴ�.");

			System.out.println();
			System.out.println();
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			masterKeyOut();
		}

		
	}// end masterKeyOut()

	// ���� ���� �޼ҵ�
	public void cashMenu()
	{
		// Casher �ν��Ͻ� ����
		Casher ch = new Casher();
		
		try
		{
			System.out.println();
			System.out.println("==[7. ���� ����]==");
			System.out.println("------------------");
			System.out.println("1. �Ž����� ��Ȳ");
			System.out.println("2. �Ž����� ����");
			System.out.println("3. �Ž����� ȸ��");
			System.out.print(">> (1~3 ��) �����ϼ��� : ");

			select();

			switch (select+11)
			{
				case CASH_REST: ch.cashRestPrint(); break;
				case CASH_UP: ch.cashRestUp(); break;
				case CASH_GET: ch.cashRestGet(); break;
			}
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			cashMenu();
		}
			
		

		
	}// end cashMenu()


	// �̺�Ʈ ���� �޼ҵ�
	public void eventControl() throws IOException
	{
		// Event1 �ν��Ͻ� ����
		Event1 ts = new Event1();

		// �̺�Ʈ ���� �޼ҵ� ȣ��
		ts.eventSel();	

	}// end eventControl()	
	
	// ������ ���� �� ���� Ȯ�� �޼ҵ�
	public void managerToday() throws IOException
	{
		Iterator<Integer> it;	// ���ý��� �޴�(�ߺ����)
		Iterator<String> its;	// ���ý��� �޴�
		Iterator<Integer> itc;	// �޴� ����Ʈ

		// MenuFind �ν��Ͻ� ����
		MenuFind mf = new MenuFind();

		// ��� ��ȣ ���� ����
		int z=1;

		// Gagae �ν��Ͻ� ����
		Gagae gg = new Gagae();
		
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String kstr = br.readLine();
		
		// ������ �Էµ� ��й�ȣ�� �Է¹޴� ��й�ȣ�� ������ ��
		if (!managerKey.equals(kstr))
		{
			System.out.println("Ȯ���� �� �����ϴ�.");
			return;
		}
		System.out.println();
		System.out.println(" [���� �� ���� ��Ȳ]\n");
		System.out.println("===============================================");
		System.out.println("��ȣ   ���Ը�\t\t�Ǹŷ�\t����\t�޴���");
		
		// ���� �� ���� Iterator
		it = today.keySet().iterator();

		// ���� ���� �޴�, ���� ���� ���� �ߺ����� �����ϱ�
		while (it.hasNext())
		{
			Integer toint = it.next();
			todayList.add(today.get(toint).getMname());
			todayGagae.add(today.get(toint).getGname());
		}
		System.out.println();
		// �޴� Iterator
		itc = menu.keySet().iterator();
			
		// �޴��� ���� ������ ���ؼ� �ش�Ǵ� �޴��� ���
		while (itc.hasNext())
		{
			
			Integer toin = itc.next();
			

			its = todayList.iterator();
		
			while (its.hasNext())
			{
				
				String sss = its.next();
				if (menu.get(toin).getMenuName().equals(sss) && todayGagae.contains(menu.get(toin).getGagaeName()))
				{
					System.out.printf("%2d. [%s] \t %d��\t%,d\t%s\t\n", z++, menu.get(toin).getGagaeName(), menu.get(toin).getSell(), menu.get(toin).getPrice(), menu.get(toin).getMenuName());
					break;
				}

			}
			
			
		
		}
		System.out.println("\n===============================================");
		// ���� ���� �޴�, ���� ���� ���� ����
		todayList.clear();
		todayGagae.clear();
			

	}// end managerToday()

}// class Manager