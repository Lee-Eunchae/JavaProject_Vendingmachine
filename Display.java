
// ù ȭ�鱸��, ����ڰ� �̿��� display�� ������ class

import java.util.Scanner;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class Display extends Main
{
	private static final int DISPLAY_MANAGER=0;			// ������ ��� ���� ��ȣ �ʱⰪ ����
	private static final int E_MENU = 1;				// �޴����� ��� ���� ��ȣ �ʱⰪ ����
	private static final int E_STORE = 2;				// �Ĵ���� ��� ���� ��ȣ �ʱⰪ ����
	public static final int DISPLAY_KOR=1;				// �ѽ� ���� ��ȣ �ʱⰪ ����
	public static final int DISPLAY_CHI=2;				// �߽� ���� ��ȣ �ʱⰪ ����
	public static final int DISPLAY_JAP=3;				// �Ͻ� ���� ��ȣ �ʱⰪ ����
	public static final int DISPLAY_BUN=4;				// �н� ���� ��ȣ �ʱⰪ ����
	private static final int DISPLAY_MASTER=9;			// ���� ��� ���� ��ȣ �ʱⰪ ����
	public static int inbun=0;							// �Ŵ����� ���� �ʱⰪ ����
	private static String yes;
	String selcc;
	private static int[] jumun = new int[100];			// �ֹ���ȣ ������ ����
	int nujeoktime=0;
	int temp;


	public void mainDisplay()
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("=================================================================================");
			System.out.println("|                                                                               |");
			System.out.println("|   _________________________________________________________________________   |");
			System.out.println("|   |                                                                       |   |");
			System.out.println("|   |                                                                       |   |");
			System.out.println("|   |                        <ȭ���� ��ġ�� �ּ��䢽>                       |   |");
			System.out.println("|   |                                                                       |   |");
			System.out.println("|   |                       |                       |                _      |   |");
			System.out.println("|   |                       |            ##         |               [ ]     |   |");
			System.out.println("|   |                       |           #           |       _      _[ ]_    |   |");	
			System.out.println("|   |         ****          |        *******        |     _[_]_   [     ]   |   |");
			System.out.println("|   |       *   () *        |        *     *        |    [  S  ]  [  B  ]   |   |");
			System.out.println("|   |      *  !!��  *       |        *     *        |    [  O  ]  [  E  ]   |   |");
			System.out.println("|   |      *  !!��  *       |         *   *         |    [  J  ]  [  E  ]   |   |");
			System.out.println("|   |       * !!�� *        |         *   *         |    [__U__]  [__R__]   |   |");
			System.out.println("|   |         ****          |         *****         |                       |   |");
			System.out.println("|   |                       |                       |                       |   |");
			System.out.println("|   |                       |                       |                       |   |");
			System.out.println("|   |     <RESTAURANT>      |         <CAFE>        |          <PUB>        |   |");
			System.out.println("|   |                       |                       |                       |   |");
			System.out.println("|   |_______________________|_______________________|_______________________|   |");
			System.out.println("|                                                                               |");
			System.out.println("|                   <CASH>      <COIN>      <CARD>      <CARD>                  |");
			System.out.println("|                                                                               |");
			System.out.println("|                  ********     ******      ******     ********                 |");
			System.out.println("|                  |======|     | [] |      | [] |     |======|                 |");
			System.out.println("|                  ********     ******      | [] |     ********                 |");
			System.out.println("|                                           ******                              |");
			System.out.println("|                                   <RECEIPT>                                   |");
			System.out.println("|                             =====================                             |");
			System.out.println("|                             |    ____________   |                             |");
			System.out.println("|                             |   (____________)  |                             |");
			System.out.println("|                             |                   |                             |");
			System.out.println("=================================================================================");
			
			sc.next();		
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}	
		
	}

	// �����̺�Ʈ ��� �޼ҵ�
	public void mainEvent()
	{
		Event1 ts = new Event1();
		ts.eventFirst();
		ts.eventDisplay();
	}//end mainEvent

	// �޴�����, �Ĵ���� ���� �޼ҵ�
	public void mainSelect() throws Exception
	{
		ManagerMenu mm = new ManagerMenu();	// ������ �޼ҵ� ȣ��
		Gagae gg = new Gagae();				// ���� �޼ҵ� ȣ��
		Master mast = new Master();			// ���� �޼ҵ� ȣ��
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("            ##");
			System.out.println("          #    #");
			System.out.println("        #        #");
			System.out.println("      #            #");
			System.out.println("    #    ________    #");	
			System.out.println("  #      |  ��  |      #");
			System.out.println("#        |  ��  |        #");
			System.out.println("==========WelCome==========");
			System.out.println("|      1. �޴�����        |");
			System.out.println("|      2. �Ĵ����        |");
			System.out.println("===========================");

			System.out.print("���Ͻô� ������ �Է��� �ּ��� : ");	// �޴� �� �Ĵ���� ����
			int choice;
			choice = sc.nextInt();
			System.out.println();
			

			switch (choice)
			{
				case E_MENU: userMenu(); break;				// ����� �޴� �޼ҵ� 
				case E_STORE: userStore(); break;			// ����� ���� ���� �޼ҵ�
				case DISPLAY_MANAGER: mm.menu(); break;		// ������ �޴� �޼ҵ�
				case DISPLAY_MASTER: mast.masMenu(); break;	// ����   �޴� �޼ҵ�
			}	
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			mainSelect();
		}
		
		
	}//end mainSelect
	
	//����� �޴� ���� �޼ҵ�
	public void userMenu() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Siljuck sj = new Siljuck();						// ���� Ŭ���� ��ü �ν��Ͻ� ����

		MapSet ms = new MapSet();						// ��ü �޴� set�� ��� �ν��Ͻ� ����

		MenuFind mf = new MenuFind();					// �ش� �޴��� �����ϴ� ���� ��� �ν��Ͻ� ����
		
		try
		{
			ms.mainList();									// ��ü �޴� set�� ��� �޼ҵ� ȣ��
			String str;
			
			System.out.println("\n[�޴��̸� ����]");
			System.out.println("====================");
			ms.print();										// ��ü �޴� �ߺ����� ���(��������)
			System.out.println("====================");
			System.out.println("99. ����ȭ��");
			System.out.print(">> �޴����� �Է��ϼ��� : ");
			str = sc.next();

			if (str.equals("99"))		// 99 �Է½� equals �� ���Ͽ� �������� return;
			{
				return;
			}
			
			if (!all.contains(str))
			{
				System.out.println(">> �ش� �޴��� �������� �ʽ��ϴ�.");
				System.out.println();
				System.out.println();
				return;
			}

			System.out.printf("\n[%s]\n", str);
			mf.find(str);
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			userMenu();		// userMenu() �޼ҵ�� ���ư��� �޼ҵ��� ���
		}
		
		
	}// enduserMenu

	//����� �Ĵ� ���� ���� �޼ҵ�
	public void userStore() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Gagae gg = new Gagae();			// Gagae gg Ŭ���� �ν��Ͻ� ����
		try
		{
			System.out.println("============================");
			System.out.println("1.�ѽ� (Korean Food)");
			System.out.println("2.�߽� (Chinese food )");
			System.out.println("3.�Ͻ� (Japanese food");
			System.out.println("4.�н� (flour based food)");
			System.out.println("----------------------------");
			System.out.println("99. ����ȭ��");
			System.out.println("============================");
			System.out.print("���Ͻô� ���������� �Է��� �ּ��� : ");
			String select = sc.next();
			if (select.equals("99"))
			{
				return;
			}
			
			System.out.println();
		
			
			if ("1".equals(select) || "�ѽ�".equals(select))		// 1�� �Ǵ� �ѽ��Է½� ���� ���� ����
			{
				gg.hanShow();
				System.out.println("----------------------------");
				System.out.println("99. ����ȭ��");
				System.out.println("============================");
				System.out.print( "�Ĵ��� �Է� ���ּ��� : ");
				String a = sc.next();
				if (a.equals("99"))
				{
					userStore();
				}
				if (!ghan.containsKey(a))		//ghan Ű�� ���翩�� Ȯ��
				{
				System.out.println("�Ĵ� ������ ã�� �� �����ϴ�.");
				return;
				}
				menuDisplay(a);
			
			}
		

			else if ("2".equals(select) || "�߽�".equals(select))		// 2�� �Ǵ� �߽��Է½� ���� ���� ����
			{
				gg.chiShow();

				System.out.print( "�Ĵ��� �Է� ���ּ��� : ");
				String a = sc.next();
				if (!gchi.containsKey(a))		//gchi Ű�� ���翩�� Ȯ��
				{
					System.out.println("�Ĵ� ������ ã�� �� �����ϴ�.");
					return;
				}
				menuDisplay(a);
			}

			else if ("3".equals(select) || "�Ͻ�".equals(select))		// 3�� �Ǵ� �Ͻ��Է½� ���� ���� ����
			{
				gg.japShow();

				System.out.print( "�Ĵ��� �Է� ���ּ��� : ");
				String a = sc.next();
				if (!gjap.containsKey(a))		//gjap Ű�� ���翩�� Ȯ��
				{
					System.out.println("�Ĵ� ������ ã�� �� �����ϴ�.");
					return;
				}
				menuDisplay(a);
			}

			else if ("4".equals(select) ||"�н�".equals(select))		// 4�� �Ǵ� �н��Է½� ���� ���� ����
			{
				gg.bunShow();

				System.out.print( "�Ĵ��� �Է� ���ּ��� : ");
				String a = sc.next();
				if (!gbun.containsKey(a))		//gbun Ű�� ���翩�� Ȯ��
				{
					System.out.println("�Ĵ� ������ ã�� �� �����ϴ�.");
					return;
				}
				menuDisplay(a);
			}
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			userStore();		// userStore() �޼ҵ�� ���ư��� �޼ҵ��� ���
		}
		
		
	}// end userStore()
	
	//����� �޴�����Ʈ ��� ���÷���  �޼ҵ�
	public void menuDisplay(String a) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String seld = "n";
		String abc;
		int inbun;
		try
		{
			do
			{
				Siljuck sj = new Siljuck();		// Siljuck Ŭ���� �ν��Ͻ� ����

				sj.setGname(a);					// Gname() - >���� �̸� Set

				System.out.println("=====================================================");
				System.out.printf("[     %s     ]\n",a);
				System.out.println();
				if (ghan.containsKey(a))
				{
					System.out.printf("���� : %s\n",ghan.get(a).getMaster());
					System.out.printf("��ȣ : %s\n",ghan.get(a).getTel());
					System.out.println();
					System.out.println("��ȣ\t����   \t  �ҿ�ð� \t�޴�");
					System.out.println("----------------------------------------------------");

					Iterator<Integer> it = menu.keySet().iterator();		// ghan �޴� ��ü ��� Iterator
					
					int q=1;

					while (it.hasNext())
					{
						Integer s = it.next();
						if (menu.get(s).getGagaeName().equals(a))
						{
							//System.out.printf("%2d. %10s %,10d�� %10d��\n",q++, menu.get(s).getMenuName(), menu.get(s).getPrice(), menu.get(s).getTime());

							System.out.printf("%2d. %,7d�� \t%5d�� \t%s \n",q++, menu.get(s).getPrice(), menu.get(s).getTime(), menu.get(s).getMenuName());
						}
					}
				}
				else if (gchi.containsKey(a))
				{
					System.out.printf("���� : %s\n",gchi.get(a).getMaster());
					System.out.printf("��ȣ : %s\n",gchi.get(a).getTel());
					System.out.println();
					System.out.println("��ȣ\t����   \t  �ҿ�ð� \t�޴�");
					System.out.println("----------------------------------------------------");

					Iterator<Integer> it1 = menu.keySet().iterator();		// gchi �޴� ��ü ��� Iterator
					
					int q1=1;

					while (it1.hasNext())
					{
						Integer s1 = it1.next();
						if (menu.get(s1).getGagaeName().equals(a))
						{
							System.out.printf("%2d. %,7d�� \t%5d�� \t%s \n",q1++, menu.get(s1).getPrice(), menu.get(s1).getTime(), menu.get(s1).getMenuName());
																			//����				����					�ҿ�ð�				�޴�
						}
					}
				}
				else if (gjap.containsKey(a))
				{
					System.out.printf("���� : %s\n",gjap.get(a).getMaster());
					System.out.printf("��ȣ : %s\n",gjap.get(a).getTel());
					System.out.println();
					System.out.println("��ȣ\t����   \t  �ҿ�ð� \t�޴�");
					System.out.println("----------------------------------------------------");

					Iterator<Integer> it2 = menu.keySet().iterator();			// gjap �޴� ��ü ��� Iterator
					
					int q2=1;

					while (it2.hasNext())
					{
						Integer s2 = it2.next();
						if (menu.get(s2).getGagaeName().equals(a))
						{
							System.out.printf("%2d. %,7d�� \t%5d�� \t%s \n",q2++, menu.get(s2).getPrice(), menu.get(s2).getTime(), menu.get(s2).getMenuName());
																			//����				����					�ҿ�ð�				�޴�
							//System.out.println( " "+q2++ +"."  + "\t" +menu.get(s2).getPrice() +  "��    " +menu.get(s2).getTime()+"��"+ "\t\t"+ menu.get(s2).getMenuName());
						}
					}
				}
				else if (gbun.containsKey(a))
				{
					System.out.printf("���� : %s\n",gbun.get(a).getMaster());
					System.out.printf("��ȣ : %s\n",gbun.get(a).getTel());
					System.out.println();
					System.out.println("��ȣ\t����   \t  �ҿ�ð� \t�޴�");
					System.out.println("----------------------------------------------------");
	 
					Iterator<Integer> it3 = menu.keySet().iterator();			// gbun �޴� ��ü ��� Iterator
					
					int q3=1;

					while (it3.hasNext())
					{
						Integer s3 = it3.next();
						if (menu.get(s3).getGagaeName().equals(a))
						{
							System.out.printf("%2d. %,7d�� \t%5d�� \t%s \n",q3++, menu.get(s3).getPrice(), menu.get(s3).getTime(), menu.get(s3).getMenuName());
																			//����				����					�ҿ�ð�				�޴�
						}
					}
				}
				
				System.out.println("=======================================================");
				System.out.print(" �޴��� �Է��� �ּ��� : ");
				abc = sc.next();
				
				Iterator<Integer> it = menu.keySet().iterator();
				
				int q=1;

				while (it.hasNext())
				{
					Integer s = it.next();

					if (menu.get(s).getGagaeName().equals(a) && menu.get(s).getMenuName().equals(abc))
					{
						sj.setMname(abc);									//���� Ŭ�������� �޴� �̸��� �޾ƿ�  set()
						sj.setPri(menu.get(s).getPrice());					//���� Ŭ�������� �޴��̸� Ű�� ���� �޾ƿ�  get()
						sj.setJori(menu.get(s).getTime());					//���� Ŭ�������� �޴��̸� Ű�� ���� �ð��� �޾ƿ�  get()
						sj.setGname(menu.get(s).getGagaeName());			//���� Ŭ�������� �޴��̸� Ű�� ���� �̸��� �޾ƿ�  get()

						System.out.print(">> ������ �޴��� ������ �Է����ּ��� : ");
						inbun = sc.nextInt();

						for (int e=0; e<inbun; e++)
						{
							basket.put(n++, sj);
						}
								
						System.out.print("�� �߰� �ֹ� �Ͻðڽ��ϱ�?(Y/N) : ");
						seld = sc.next();
						System.out.println();
						
						if (seld.equals("y") || seld.equals("Y"))
							jangbaguni();// ��ٱ��� �޼ҵ�
						else if (seld.equals("n") || seld.equals("N"))
						{
							
							jangMenu();
						}


						break;
					}
					else if (!it.hasNext())
						System.out.println("�� �޴��� ã�� �� �����ϴ�.\n");
				}

			}
			while (seld.equals("y") || seld.equals("Y"));
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			menuDisplay(a);
		}
		
		
	}// end menuDispaly

	// ��ٱ��� �޼ҵ� 
	public void jangbaguni() 
	{	
		int pp=0;
		int ppp=0;
		int sum=0;
		try
		{
			System.out.println("\n\t[        ��ٱ���          ]");
			System.out.println("**************************************************");

			Iterator<Integer> it = basket.keySet().iterator();
			while (it.hasNext())
			{
				pp = it.next();
				//System.out.println(pp);

				System.out.printf("%2d   | %s | %,d | \t%s(%d)\n", pp+1, basket.get(pp).getGname(), basket.get(pp).getPri(), basket.get(pp).getMname(), pp);
																	//����			�����̸�						����					�޴��̸�	����
				System.out.println();
				nujeoktime += basket.get(pp).getJori();
				sum += basket.get(pp).getPri();

				if (temp < basket.get(pp).getJori())
				{
					temp = basket.get(pp).getJori();
				}
				ppp++;
							
			}
			
			System.out.println("[���� ��� �ð�]");

			//��� �����ð� ���
			System.out.printf(" �� ��� : %.2f��\n", nujeoktime / (double)(ppp));
			nujeoktime = 0;
			ppp = 0;

			//�ִ� �����ð� ���
			System.out.printf(" �� �ִ� : %.2f��\n", (double)temp);
			temp = 0;
			System.out.printf("\n\n[�� �ݾ�] : %,d��\n", sum);
			System.out.println("**************************************************\n");
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			jangbaguni();
		}	
	}// end jangbaguni() 


	//��ٱ��� �ŷ� ���� �޼ҵ�
	public void jangMenu() throws Exception
	{	
		int cho;
		Casher ch = new Casher();
		Scanner sc = new Scanner(System.in);
		try
		{
			do
			{
				jangbaguni(); // ����� jangbaguni() �޼ҵ� ȣ��

				System.out.println(" [ ��ٱ��� �޴� ]");
				System.out.println("===================");
				System.out.println(" 1. ���� ����");
				System.out.println(" 2. �޴� ����");
				System.out.println(" 3. ���� ���");
				System.out.println("===================\n");

				System.out.print(">> �޴��� �������ּ��� : ");
				cho = sc.nextInt();

				switch (cho)
				{
				case 1: ch.cashService(); yes="y"; n=0; break;
				case 2: jangDel(); yes="n"; break;
				case 3: jangExit(); break;
				}
			}
			while (yes.equals("n") || yes.equals("N"));
			
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			jangMenu();
		}

	}// end jangMenu()

	// ��ٱ��� ���� �޼ҵ�
	public void jangDel() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int del;
		try
		{
			System.out.print(">> ������ �޴��̸� �� (�ֹ���ȣ)�� �Է����ּ��� : ");
			del = sc.nextInt();
			
			System.out.printf("\n%s | %s | %,d\n\n", basket.get(del).getGname(), basket.get(del).getMname(), basket.get(del).getPri());
			System.out.print(">> �� �޴��� �����Ͻðڽ��ϱ�?(Y/N) : ");
			yes = sc.next();
	////////////////////////////////////////////////////////////////////////////////////
			if (yes.equals("y") || yes.equals("Y"))
			{
				
/*
				Iterator<Integer> it = menu.keySet().iterator();

				while (it.hasNext())
				{
					Integer toin = it.next();
					System.out.println(basket.get(del).getMname());

					if (menu.get(toin).getMenuName().equals(basket.get(del).getMname()) && menu.get(toin).getGagaeName().equals(basket.get(del).getGname()))
					{
						menu.get(toin).setMinusSell(1);
						
					}
				}
				*/
				basket.remove(del);
	////////////////////////////////////////////////////////////////////////////////////				

				if (!basket.containsKey(del))
					System.out.println("�� �����Ǿ����ϴ�.");
				else if (basket.containsKey(del))
					System.out.println("�� �������� �ʾҽ��ϴ�.");
			}
			jangbaguni();
			
		}
		catch (Exception ex)
		{
			System.out.println("\n�ùٸ��� �Է��ּ���!\n");
			jangDel();
		}	

	}// end jangDel()
		
	// ��ٱ��� ��ü ���� �޼ҵ�
	public void jangExit()
	{
		int y;
		int k=0;
		
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print(">> ��ٱ��ϸ� ���ðڽ��ϱ�?(Y/N) : ");
			yes = sc.next();

	
			Iterator<Integer> it = basket.keySet().iterator();
			TreeMap<Integer, MenusVO> tre = new TreeMap<Integer, MenusVO>(menu);
		
		
		

			if (yes.equals("y") || yes.equals("Y"))
			{
				basket.clear();
				/*
				while (it.hasNext())
				{

					/////////////////////////////////////////
					y = it.next();

					if (!basket.containsKey(y))
					{
						k=0;
						continue;
					}
					

					while (menu.size() != k)
					{
						
						if (tre.get(k).getMenuName().equals(basket.get(y).getMname()) && tre.get(k).getGagaeName().equals(basket.get(y).getGname()))
						{
							
							menu.get(k).setMinusSell(1);
							//--number;
						}
						basket.remove(y);
						
						k++;		
						
					}
					/////////////////////////////////////////
					*/
					
						
					
				}
				n=0;
				System.out.println("��ٱ��ϰ� ��������ϴ�.");
			
			}
			catch (Exception ex)
			{
				System.out.println("\n�ùٸ��� �Է��ּ���!\n");
				jangExit();
			}

		}// end jangExit()
}


