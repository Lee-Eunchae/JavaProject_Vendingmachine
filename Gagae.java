
// ����, �޴��� �߰�/���Ű� ������ class
// �Ĵ���� ���ý� ������ �Ĵ� ���

import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;


public class Gagae extends Main			
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	public static String nameG;			// ���� �̸� ���� ����
	private static String nameM;			// �޴� �̸� ���� ����
	public static int kind;					// ���� ���� ���� ����
	String n;								// do~while �� ���� ����((y/n)����)
	String mkey;
	
// ��,��,��,�н� �� ���� ��� �޼ҵ�=======================================	

	// addGhan �ѽĴ� ���� ���
	public void addGhan() throws IOException			
	{
		Display dis = new Display();

		System.out.println("\n=======[1.���� ���]=======");
		System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
		// �Ĵ� �̸� �Է�
		nameG = br.readLine();
	
		ghan.put(nameG, new GagaeVO());			// �̸��� key�� �Ĵ� ���� ����
		
		ghan.get(nameG).setKind(dis.DISPLAY_KOR);

		System.out.print(">> ������ �̸��� �Է��ϼ��� : ");
		ghan.get(nameG).setMaster(br.readLine());

		System.out.print(">> ������ ��ȭ��ȣ�� �Է��ϼ��� : ");
		ghan.get(nameG).setTel(br.readLine());

		addMenu();		// �޴� �߰� method ȣ��

		if (ghan.containsKey(nameG) || mas.containsKey(mkey))
			System.out.println("�� ������ ���������� ��ϵǾ����ϴ�.\n\n");
		else if (!gbun.containsKey(nameG))
			System.out.println("�� ������ �߰����� �ʾҽ��ϴ�.\n\n");
	}
	//--------------------------------------------- addGhan �ѽĴ� ���� ���


	// addGchi �߽Ĵ� ���� ���
	public void addGchi() throws IOException			
	{
		Display dis = new Display();

		System.out.println("\n=======[1.���� ���]=======");
		System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
	
		nameG = br.readLine();
	
		gchi.put(nameG, new GagaeVO());
		
		gchi.get(nameG).setKind(dis.DISPLAY_CHI);

		System.out.print(">> ������ �̸��� �Է��ϼ��� : ");
		gchi.get(nameG).setMaster(br.readLine());

		System.out.print(">> ������ ��ȭ��ȣ�� �Է��ϼ��� : ");
		gchi.get(nameG).setTel(br.readLine());

		addMenu();		

		if (gchi.containsKey(nameG) || mas.containsKey(mkey))
			System.out.println("�� ������ ���������� ��ϵǾ����ϴ�.\n\n");
		else if (!gbun.containsKey(nameG))
			System.out.println("�� ������ �߰����� �ʾҽ��ϴ�.\n\n");
	}
	// --------------------------------------------addGchi �߽Ĵ� ���� ���


	// addGjap �ϽĴ� ���� ���
	public void addGjap() throws IOException			
	{
		Display dis = new Display();

		System.out.println("\n=======[1.���� ���]=======");
		System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
		
		nameG = br.readLine();
	
		gjap.put(nameG, new GagaeVO());	
		
		gjap.get(nameG).setKind(dis.DISPLAY_JAP);

		System.out.print(">> ������ �̸��� �Է��ϼ��� : ");
		gjap.get(nameG).setMaster(br.readLine());

		System.out.print(">> ������ ��ȭ��ȣ�� �Է��ϼ��� : ");
		gjap.get(nameG).setTel(br.readLine());

		addMenu();	

		if (gjap.containsKey(nameG) || mas.containsKey(mkey))
			System.out.println("�� ������ ���������� ��ϵǾ����ϴ�.\n\n");
		else if (!gbun.containsKey(nameG))
			System.out.println("�� ������ �߰����� �ʾҽ��ϴ�.\n\n");
	}
	// --------------------------------------------addGjap �ϽĴ� ���� ���


	// addGbun �н� ���� ���
	public void addGbun() throws IOException			
	{
		Display dis = new Display();

		System.out.println("\n=======[1.���� ���]=======");
		System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
		// �Ĵ� �̸� �Է�
		nameG = br.readLine();
	
		gbun.put(nameG, new GagaeVO());	

		gbun.get(nameG).setKind(dis.DISPLAY_BUN);

		System.out.print(">> ������ �̸��� �Է��ϼ��� : ");
		gbun.get(nameG).setMaster(br.readLine());

		System.out.print(">> ������ ��ȭ��ȣ�� �Է��ϼ��� : ");
		gbun.get(nameG).setTel(br.readLine());

		addMenu();	

		if (gbun.containsKey(nameG) || mas.containsKey(mkey))
			System.out.println("�� ������ ���������� ��ϵǾ����ϴ�.\n\n");
		else if (!gbun.containsKey(nameG))
			System.out.println("�� ������ �߰����� �ʾҽ��ϴ�.\n\n");
	}
	// ------------------------------------------- addGbun �н� ���� ���
	


// 	��,��,��,�н� �� �Ĵ� ���� �޼ҵ�======================================= 

	public void delGhan() throws IOException		// �Ĵ� ���� method
	{							
		do
		{
			System.out.println("\n=======[��������]=======");
			System.out.print(">> ���� �̸��� �Է��ϼ��� : ");
			nameG = br.readLine();
			
			if (ghan.containsKey(nameG))
			{	
				System.out.print(">> ������Ű�� �Է��ϼ��� : ");
				mkey = br.readLine();

				if (mas.get(mkey).equals(ghan.get(nameG).getMaster()))
				{
					ghan.remove(nameG);
					System.out.printf("\n�� [ %s ] ������ ���������� �����Ǿ����ϴ�.\n\n", nameG);
				}
				else if (!mas.get(mkey).equals(ghan.get(nameG).getMaster()) || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
			else if (!ghan.containsKey(nameG))
				System.out.print("�� �ش� ������ �������� �ʽ��ϴ�.\n\n"); 

			System.out.print(">> ���� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
			n = br.readLine();
			System.out.println();
		}
		while (n.equals("y"));
	}
	// -----------------------------------------------delGhan �ѽĴ� ����


	// delGchi �߽Ĵ� ����
	public void delGchi() throws IOException		
	{								
		do
		{
			System.out.println("\n=======[��������]=======");
			System.out.print(">> ���� �̸��� �Է��ϼ���. : ");
			nameG = br.readLine();
		
			if (ghan.containsKey(nameG))
			{		
				System.out.print(">> ������Ű�� �Է��ϼ��� : ");
				mkey = br.readLine();

				if (mas.get(mkey).equals(gchi.get(nameG).getMaster()))
				{
					gchi.remove(nameG);
					System.out.printf("\n�� [ %s ] ������ ���������� �����Ǿ����ϴ�.\n\n", nameG);
				}
				else if (!mas.get(mkey).equals(gchi.get(nameG).getMaster()) || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
			else if (!ghan.containsKey(nameG))
				System.out.print("�� �ش� ������ �������� �ʽ��ϴ�.\n\n"); 

			System.out.print(">> ���� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
			n = br.readLine();
			System.out.println();
		}
		while (n.equals("y"));
	}
	// -----------------------------------------------delGchi �߽Ĵ� ����
	

	// delGjap �ϽĴ� ����
	public void delGjap() throws IOException		
	{								
		do
		{
			System.out.println("\n=======[��������]=======");
			System.out.print(">> ���� �̸��� �Է��ϼ���. : ");
			nameG = br.readLine();
		
			if (ghan.containsKey(nameG))
			{	
				System.out.print(">> ������Ű�� �Է��ϼ��� : ");
				mkey = br.readLine();
					
				System.out.printf("%s", gjap.get(nameG).getMaster());
				if (mas.get(mkey).equals(gjap.get(nameG).getMaster()))
				{
					gjap.remove(nameG);
					System.out.printf("\n�� [ %s ] ������ ���������� �����Ǿ����ϴ�.\n\n", nameG);
				}
				else if (!mas.get(mkey).equals(gjap.get(nameG).getMaster()) || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
			else if (!gjap.containsKey(nameG))
				System.out.print("�� �ش� ������ �������� �ʽ��ϴ�.\n\n"); 

			System.out.print(">> ���� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
			n = br.readLine();
			System.out.println();
		}
		while (n.equals("y"));
	}
	// -----------------------------------------------delGjap �ϽĴ� ����


	// delGbun �н��� ����
	public void delGbun() throws IOException		
	{						
		do
		{
			System.out.println("\n=======[��������]=======");
			System.out.print(">> ���� �̸��� �Է��ϼ���. : ");
			nameG = br.readLine();
		
			if (gbun.containsKey(nameG))
			{	
				System.out.print(">> ������Ű�� �Է��ϼ��� : ");
				mkey = br.readLine();

				if (mas.get(mkey).equals(gbun.get(nameG).getMaster()))
				{
					gbun.remove(nameG);
					System.out.printf("\n�� [ %s ] ������ ���������� �����Ǿ����ϴ�.\n\n", nameG);
				}
				else if (!mas.get(mkey).equals(gbun.get(nameG).getMaster()) || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
			else if (!gbun.containsKey(nameG))
				System.out.print("�� �ش� ������ �������� �ʽ��ϴ�.\n\n"); 

			System.out.print(">> ���� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
			n = br.readLine();
			System.out.println();
		}
		while (n.equals("y"));
	}
	// -----------------------------------------------delGbun �н� ����


	// 	�޴� ��� �޼ҵ�========================================================
	public void addMenu() throws IOException	
	{		
			
		Display dis = new Display();
		
		if (!ghan.containsKey(nameG) && !gchi.containsKey(nameG) && !gjap.containsKey(nameG) && !gbun.containsKey(nameG))
			System.out.println("�� �ش� ������ �������� �ʽ��ϴ�.\n\n");
		else if (ghan.containsKey(nameG) || gchi.containsKey(nameG) || gjap.containsKey(nameG) || gbun.containsKey(nameG))
		{		
			System.out.print(">> ������Ű�� �Է��ϼ��� : ");
			mkey = br.readLine();
			System.out.println();
					
			if (kind==dis.DISPLAY_KOR)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(ghan.get(nameG).getMaster()))
				{
					System.out.println("\n=================[�޴� �߰�]=================");
					do
					{
						System.out.print(">> �޴� �̸�, ����, �����ð��� �Է��ϼ��� : ");
						nameM = sc.next();
						int pri = sc.nextInt();
						int tim = sc.nextInt();

						menu.put(num++, new MenusVO(nameM, nameG, pri, tim));

						if (menu.containsKey(menu.size()-1))										// menu�� ũ�⸦ �̿��� key ���� (num=0)	// Iterator�� ��ü ����
							System.out.println("�� �޴��� ���������� �߰��Ǿ����ϴ�.\n\n");
						else
							System.out.println("�� �޴��� �߰����� �ʾҽ��ϴ�.\n\n");

						System.out.print(">> �޴� �Է��� ����Ͻðڽ��ϱ�? (y/n) : ");
						n = br.readLine();
						System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(ghan.get(nameG).getMaster()) )
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			else if (kind==dis.DISPLAY_CHI)
			{
				if (mas.get(mkey).equals(gchi.get(nameG).getMaster()))
				{
					System.out.println("\n=================[�޴� �߰�]=================");
					do
					{
						System.out.print(">> �޴� �̸�, ����, �����ð��� �Է��ϼ��� : ");
						nameM = sc.next();
						int pri = sc.nextInt();
						int tim = sc.nextInt();

						menu.put(num++, new MenusVO(nameM, nameG, pri, tim));

						if (menu.containsKey(menu.size()-1))										// menu�� ũ�⸦ �̿��� key ���� (num=0)	// Iterator�� ��ü ����
							System.out.println("�� �޴��� ���������� �߰��Ǿ����ϴ�.\n\n");
						else
							System.out.println("�� �޴��� �߰����� �ʾҽ��ϴ�.\n\n");

						System.out.print(">> �޴� �Է��� ����Ͻðڽ��ϱ�? (y/n) : ");
						n = br.readLine();
						System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.get(mkey).equals(gchi.get(nameG).getMaster())  || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			else if (kind==dis.DISPLAY_JAP)
			{
				if (mas.get(mkey).equals(gjap.get(nameG).getMaster()))
				{
					System.out.println("\n=================[�޴� �߰�]=================");
					do
					{
						System.out.print(">> �޴� �̸�, ����, �����ð��� �Է��ϼ��� : ");
						nameM = sc.next();
						int pri = sc.nextInt();
						int tim = sc.nextInt();

						menu.put(num++, new MenusVO(nameM, nameG, pri, tim));

						if (menu.containsKey(menu.size()-1))										// menu�� ũ�⸦ �̿��� key ���� (num=0)	// Iterator�� ��ü ����
							System.out.println("�� �޴��� ���������� �߰��Ǿ����ϴ�.\n\n");
						else
							System.out.println("�� �޴��� �߰����� �ʾҽ��ϴ�.\n\n");

						System.out.print(">> �޴� �Է��� ����Ͻðڽ��ϱ�? (y/n) : ");
						n = br.readLine();
						System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.get(mkey).equals(gjap.get(nameG).getMaster())  || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			else if (kind==dis.DISPLAY_BUN)
			{
				if (mas.get(mkey).equals(gbun.get(nameG).getMaster()))
				{
					System.out.println("\n=================[�޴� �߰�]=================");
					do
					{
						System.out.print(">> �޴� �̸�, ����, �����ð��� �Է��ϼ��� : ");
						nameM = sc.next();
						int pri = sc.nextInt();
						int tim = sc.nextInt();

						menu.put(num++, new MenusVO(nameM, nameG, pri, tim));

						if (menu.containsKey(menu.size()-1))										// menu�� ũ�⸦ �̿��� key ���� (num=0)	// Iterator�� ��ü ����
							System.out.println("�� �޴��� ���������� �߰��Ǿ����ϴ�.\n\n");
						else
							System.out.println("�� �޴��� �߰����� �ʾҽ��ϴ�.\n\n");

						System.out.print(">> �޴� �Է��� ����Ͻðڽ��ϱ�? (y/n) : ");
						n = br.readLine();
						System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.get(mkey).equals(gbun.get(nameG).getMaster())  || !mas.containsKey(mkey))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
		}
	}


	// �޴� ���� �޼ҵ� ===========================================================	
	public void delMenu() throws IOException
    {

		Display dis = new Display(); 
      
		if (!ghan.containsKey(nameG) && !gchi.containsKey(nameG) && !gjap.containsKey(nameG) && !gbun.containsKey(nameG))   
			 System.out.print("�� �ش� �Ĵ��� �������� �ʽ��ϴ�.\n\n");
		else if (ghan.containsKey(nameG) || gchi.containsKey(nameG) || gjap.containsKey(nameG) || gbun.containsKey(nameG))
		{   
			System.out.print(">> ������Ű�� �Է��ϼ��� : ");
			mkey = br.readLine();
			System.out.println();

			if (kind==dis.DISPLAY_KOR)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(ghan.get(nameG).getMaster()))
				{
					System.out.println("\n=======[�޴� ����]=======");         
					do
					{
						 System.out.print(">> �޴��� �Է��ϼ��� : ");
						 nameM = br.readLine();

						 Iterator<Integer> itt = menu.keySet().iterator(); 
						 while (itt.hasNext())
						 {
							 Integer jong = itt.next();
							 if (menu.get(jong).getMenuName().equals(nameM) && menu.get(jong).getGagaeName().equals(nameG))
							 {
								 menu.remove(jong);
								 System.out.print("�� �޴��� ���������� �����Ǿ����ϴ�.\n\n");
								 break;
							 }
							 else if (! itt.hasNext())
								 System.out.print("�� �ش� �޴��� �������� �ʽ��ϴ�.\n\n");
						 }
						 System.out.print(">> �޴� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
						 n = br.readLine();
						 System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(ghan.get(nameG).getMaster()) )
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			if (kind==dis.DISPLAY_CHI)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gchi.get(nameG).getMaster()))
				{
					System.out.println("\n=======[�޴� ����]=======");         
					do
					{
						 System.out.print(">> �޴��� �Է��ϼ��� : ");
						 nameM = br.readLine();

						 Iterator<Integer> itt = menu.keySet().iterator(); 
						 while (itt.hasNext())
						 {
							 Integer jong = itt.next();
							 if (menu.get(jong).getMenuName().equals(nameM) && menu.get(jong).getGagaeName().equals(nameG))
							 {
								 menu.remove(jong);
								 System.out.print("�� �޴��� ���������� �����Ǿ����ϴ�.\n\n");
								 break;
							 }
							 else if (! itt.hasNext())
								 System.out.print("�� �ش� �޴��� �������� �ʽ��ϴ�.\n\n");
						 }
						 System.out.print(">> �޴� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
						 n = br.readLine();
						 System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gchi.get(nameG).getMaster()) )
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			if (kind==dis.DISPLAY_JAP)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gjap.get(nameG).getMaster()))
				{
					System.out.println("\n=======[�޴� ����]=======");         
					do
					{
						 System.out.print(">> �޴��� �Է��ϼ��� : ");
						 nameM = br.readLine();

						 Iterator<Integer> itt = menu.keySet().iterator(); 
						 while (itt.hasNext())
						 {
							 Integer jong = itt.next();
							 if (menu.get(jong).getMenuName().equals(nameM) && menu.get(jong).getGagaeName().equals(nameG))
							 {
								 menu.remove(jong);
								 System.out.print("�� �޴��� ���������� �����Ǿ����ϴ�.\n\n");
								 break;
							 }
							 else if (! itt.hasNext())
								 System.out.print("�� �ش� �޴��� �������� �ʽ��ϴ�.\n\n");
						 }
						 System.out.print(">> �޴� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
						 n = br.readLine();
						 System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gjap.get(nameG).getMaster()) )
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");


			}
			if (kind==dis.DISPLAY_BUN)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gbun.get(nameG).getMaster()))
				{
					System.out.println("\n=======[�޴� ����]=======");         
					do
					{
						 System.out.print(">> �޴��� �Է��ϼ��� : ");
						 nameM = br.readLine();

						 Iterator<Integer> itt = menu.keySet().iterator(); 
						 while (itt.hasNext())
						 {
							 Integer jong = itt.next();
							 if (menu.get(jong).getMenuName().equals(nameM) && menu.get(jong).getGagaeName().equals(nameG))
							 {
								 menu.remove(jong);
								 System.out.print("�� �޴��� ���������� �����Ǿ����ϴ�.\n\n");
								 break;
							 }
							 else if (! itt.hasNext())
								 System.out.print("�� �ش� �޴��� �������� �ʽ��ϴ�.\n\n");
						 }
						 System.out.print(">> �޴� ������ ����Ͻðڽ��ϱ�? (y/n) : ");
						 n = br.readLine();
						 System.out.println();
					}
					while (n.equals("y"));
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gbun.get(nameG).getMaster()) )
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");
			}
		}
	}

	

// Display���� �Ĵ���� ���ý� ������ �Ĵ� ��� �޼ҵ�====================================
	public void hanShow()
	{
		System.out.println(" ====[ �ѽĴ� ]==== \n");
		Iterator<String> it1 = ghan.keySet().iterator();
		int i=1;
		while (it1.hasNext())
		{
			String s1 = it1.next();
			System.out.printf("%d. %s\n",i++, s1);
		}
		System.out.println();
	}


	public void chiShow()
	{
		System.out.println(" ====[ �߽Ĵ� ]==== \n");
		int i=1;
		Iterator<String> it2 = gchi.keySet().iterator();
		while (it2.hasNext())
		{
			String s2 = it2.next();
			System.out.printf("%d. %s\n", i++, s2);
		}
		System.out.println();

	}


	public void japShow()
	{
		System.out.println(" ====[ �ϽĴ� ]==== \n");
		int i=1;
		Iterator<String> it3 = gjap.keySet().iterator();
		while (it3.hasNext())
		{
			String s3 = it3.next();
			System.out.printf("%d. %s\n", i++, s3);
		}
		System.out.println();

	}


	public void bunShow()
	{
		System.out.println(" ====[ �н��� ]==== \n");
		int i=1;
		Iterator<String> it4 = gbun.keySet().iterator();
		while (it4.hasNext())
		{
			String s4 = it4.next();
			System.out.printf("%d. %s\n", i++, s4);
		}
		System.out.println();

	}

} // end - public class Gagae extends Main