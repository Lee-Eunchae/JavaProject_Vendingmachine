
// �̺�Ʈ �⺻ ����
// ������, ������ �̺�Ʈ�� �߰�/����/���� �ϰ� ������ class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;


public class Event1 extends Main
{
	 
    private static String names;			// �����̸�
	private static String evs;				// �����̺�Ʈ
	private static String con;				// yes, no
	public static final int E_MASTER =1;	//������ �̺�Ʈ �������   
	public static final int E_STORE =2;     //���� �̺�Ʈ �������


	public void eventMasterm()   //��ü�̺�Ʈ -- �⺻����
	{
		master.put("1","Ű����ũ�� ���� ���ǻ��� �Ǵ� ������� �� 010-7338-1257 ��");
	}


	public void eventStorem()  //�����̺�Ʈ -- �⺻����
	{
		ht.put("��ä���λ�������","���ɽð� ����(12:00~14:00) ���ǽ� ��¥!!");
		ht.put("���ø����ϴ�", "�̴Ͽ쵿 ���� �ڿ����̺�Ʈ��");
		ht.put("����������", "SNS ȫ���� ����� ��¥!!!");
		ht.put("�����ǽӽζ�","�湮����� ���� 2+1!!");
		ht.put("�߱���������","��1�ֳ� �̺�Ʈ�� ������ 2000�� ����!!");		
	}

	public void eventFirst()  //��ü ���� ������ִ� �޼ҵ�
	{
		System.out.println("\t\t�ءء� ��ü ���� �ءء�\n");
		Iterator<String> it =master.keySet().iterator();

		while (it.hasNext())
		{
			String s = it.next();
			System.out.printf("%3s. %s\n\n", s, master.get(s));
		}
		System.out.println();	
	}
		

	public void eventDisplay()  //���� �̺�Ʈ ������ִ� �޼ҵ�
	{
		System.out.println("====================[�ۿ����� Ư�� �̺�Ʈ��]====================\n");
		Iterator<String> it = ht.keySet().iterator();

		while (it.hasNext())
		{
			String s = it.next();
			System.out.printf("%s : %s\n\n", s, ht.get(s));
		}
		System.out.println("================================================================\n");
	}


	public void eventSel()throws IOException  //�����ڰ� (������, ����)�̺�Ʈ �����ϴ� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("[�̺�Ʈ �������]");
		System.out.println("1. ������");
		System.out.println("2. ����");
		System.out.print(">> �Է� : ");
		int a = Integer.parseInt(br.readLine());

		switch (a)
		{
		case E_MASTER : eventMaster();break;
		case E_STORE : eventStore();break;	
		}		
	}


	public void eventMaster()throws IOException  //������ �̺�Ʈ �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("\n1. �̺�Ʈ ����");
		System.out.println("2. �̺�Ʈ �߰�");
		System.out.println("3. �̺�Ʈ ����");
		System.out.print(">> �Է� : ");
		int a = Integer.parseInt(br.readLine());

		if (a==1)   // ������ �̺�Ʈ �����޴� �� ���� �Էµ� ���������� ����
		{
			System.out.println("\t\t  [������ �̺�Ʈ ���� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ������ �̺�Ʈ��==\n");

			Iterator<String> it = master.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%3s. %s\n\n", s, master.get(s));
			}
			System.out.println();

			System.out.print(">> ������ ��ȣ �Է� : ");    //��ü���� ������ ��ȣ �Է¹���
			names = br.readLine();                  

			if (!master.containsKey(names))
				System.out.println("\n�� ��ȣ�� �������� �ʽ��ϴ�.\n\n");  //�Է¹��� ������������ �ȳ�
			else
			{
				System.out.print(">> ������ �̺�Ʈ �����Է� : ");
				evs =br.readLine();

				master.put(names,evs);

				System.out.println("�� ���������� �����Ǿ����ϴ�.\n\n");
			}
		}
		else if (a==2)  //������ �̺�Ʈ �߰� �޴�
		{
			System.out.println("\t\t  [������ �̺�Ʈ �߰� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ������ �̺�Ʈ��==\n");

			Iterator<String> it = master.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%s : %s\n\n", s, master.get(s));
			}
			System.out.println();

			System.out.print(">> �߰��� ��ȣ �Է� : ");  
			names = br.readLine();
			System.out.print(">> �߰��� �̺�Ʈ ���� : ");
			evs = br.readLine();

			master.put(names,evs);

			System.out.println("�� ���������� �߰��Ǿ����ϴ�.\n\n");
		}
		else if (a==3)   //������ �̺�Ʈ ��ü ���� �޴�
		{
			System.out.println("\t\t  [������ �̺�Ʈ ���� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ������ �̺�Ʈ��==\n");

			Iterator<String> it = master.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%s : %s\n\n", s, master.get(s));
			}
			System.out.println();

			System.out.println("1.��ü���� / 2.�κл���");
			System.out.print(">> �Է� : ");
			String b = br.readLine();

			if (b.equals("1"))  //1�� ������ ��ü����
			{
				System.out.print(">> ���� ��ü���� �Ͻðڽ��ϱ�?(Y/N) : ");
				con=br.readLine();

				if (con.equals("y") || con.equals("Y"))
				{
					ht.clear();
					System.out.println("�� ��ü�����Ǿ����ϴ�.\n\n");
				}
				else 
					return;
			}
			else if(b.equals("2"))  //2�� ������ �κл���
			{
				System.out.print(">> ������ ��ȣ �Է� : ");
				names = br.readLine();

				if (!master.containsKey(names))
					System.out.println("\n�� ��ȣ�� �������� �ʽ��ϴ�.\n\n");
				else
				{
					System.out.print(">> ���� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					con=br.readLine();
					
					if (con.equals("y") || con.equals("Y"))
					{
						master.remove(names);
						System.out.println("�� �����Ǿ����ϴ�.\n\n");
					}
					else
						return;
				}
			}
		}
	}


	public void  eventStore()throws IOException   //���� �̺�Ʈ ���� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		Display dis = new Display();
		Gagae gg = new Gagae();

		System.out.println("\n1. �̺�Ʈ ����");
		System.out.println("2. �̺�Ʈ �߰�");
		System.out.println("3. �̺�Ʈ ����");
		System.out.print(">> �Է� : ");
		int a = Integer.parseInt(br.readLine());

		if (a==1)  //���Ը� ã�� �̺�Ʈ �����ϴ� ����
		{
			System.out.println("\t\t  [���� �̺�Ʈ ���� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ���� �̺�Ʈ��==\n");

			Iterator<String> it = ht.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%s : %s\n\n", s, ht.get(s));
			}
			System.out.println();
			
			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> ������ ���� ���� ���� : ");
			gg.kind = Integer.parseInt(br.readLine());
			System.out.println();

			System.out.print(">> ������ ������ �Է� : ");
			names = br.readLine();

			if (!ht.containsKey(names))
				System.out.println("\n�� ������ �������� �ʽ��ϴ�.\n\n");
			else if (ht.containsKey(names))
			{

				//�ڽ��� ���Ը� ���� �� �� �ֵ��� ������Ű �Է��ϵ��� �� - Ʋ���� ��������
				System.out.print(">> ������Ű�� �Է��ϼ��� : ");      
				String mkey = br.readLine();	
				System.out.println();
				
				if (gg.kind == dis.DISPLAY_KOR)
				{
					if (mas.containsKey(mkey) && mas.get(mkey).equals(ghan.get(names).getMaster()))
					{
						System.out.print(">> ������ �̺�Ʈ ���� : ");
						evs = br.readLine();

						ht.put(names,evs);
						System.out.println("�� ���������� �����Ǿ����ϴ�.\n\n");  //�������
					}
					else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(ghan.get(names).getMaster()))
						System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������				
				}
				else if (gg.kind == dis.DISPLAY_CHI)
				{
					if (mas.containsKey(mkey) && mas.get(mkey).equals(gchi.get(names).getMaster()))
					{
						System.out.print(">> ������ �̺�Ʈ ���� : "); //�������
						evs = br.readLine();

						ht.put(names,evs);
						System.out.println("�� ���������� �����Ǿ����ϴ�.\n\n");
					}
					else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gchi.get(names).getMaster()))
						System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");		//��������	
				}
				else if (gg.kind == dis.DISPLAY_JAP)
				{
					if (mas.containsKey(mkey) && mas.get(mkey).equals(gjap.get(names).getMaster()))
					{
						System.out.print(">> ������ �̺�Ʈ ���� : "); //�������
						evs = br.readLine();

						ht.put(names,evs);
						System.out.println("�� ���������� �����Ǿ����ϴ�.\n\n"); 
					}
					else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gjap.get(names).getMaster()))
						System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������		
				}
				else if (gg.kind == dis.DISPLAY_BUN)
				{
					if (mas.containsKey(mkey) && mas.get(mkey).equals(gbun.get(names).getMaster()))
					{
						System.out.print(">> ������ �̺�Ʈ ���� : "); //�������
						evs = br.readLine();

						ht.put(names,evs);
						System.out.println("�� ���������� �����Ǿ����ϴ�.\n\n");
					}
					else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gbun.get(names).getMaster()))
						System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������			
				}
			}
		
				
		}
		else if (a==2) //���Ը� ã�� �̺�Ʈ �߰��ϴ� ����
		{
			System.out.println("\t\t  [���� �̺�Ʈ �߰� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ���� �̺�Ʈ��==\n");

			Iterator<String> it = ht.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%s : %s\n\n", s, ht.get(s));
			}
			System.out.println();

			System.out.println("1. �ѽķ�	2. �߽ķ�	3. �Ͻķ�	4.�нķ�");
			System.out.print(">> �߰��� ���� ���� ���� : ");
			gg.kind = Integer.parseInt(br.readLine());
			System.out.println();

			System.out.print(">> �߰��� ������ �Է� : ");
			names = br.readLine();
			
			//������Ű�� �Է¹ް� �Է¿����� ��������.
			System.out.print(">> ������Ű�� �Է��ϼ��� : ");
			String mkey = br.readLine();	
			System.out.println();
			
			if (gg.kind == dis.DISPLAY_KOR)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(ghan.get(names).getMaster()))
				{
					System.out.print(">> �߰��� �̺�Ʈ ���� : ");  //�������
					evs = br.readLine();

					ht.put(names,evs);
					System.out.println("�� ���������� �߰��Ǿ����ϴ�.\n\n");  //��������
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(ghan.get(names).getMaster()))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");						
			}
			else if (gg.kind == dis.DISPLAY_CHI)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gchi.get(names).getMaster()))
				{
					System.out.print(">> �߰��� �̺�Ʈ ���� : "); //�������
					evs = br.readLine();

					ht.put(names,evs);
					System.out.println("�� ���������� �߰��Ǿ����ϴ�.\n\n");
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gchi.get(names).getMaster()))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������		
			}
			else if (gg.kind == dis.DISPLAY_JAP)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gjap.get(names).getMaster()))
				{
					System.out.print(">> �߰��� �̺�Ʈ ���� : ");   //�������
					evs = br.readLine();

					ht.put(names,evs);
					System.out.println("�� ���������� �߰��Ǿ����ϴ�.\n\n");
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gjap.get(names).getMaster()))
						System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������		
				}
			else if (gg.kind == dis.DISPLAY_BUN)
			{
				if (mas.containsKey(mkey) && mas.get(mkey).equals(gbun.get(names).getMaster()))
				{
					System.out.print(">> �߰��� �̺�Ʈ ���� : ");  //�������
					evs = br.readLine();

					ht.put(names,evs);
					System.out.println("�� ���������� �߰��Ǿ����ϴ�.\n\n");
				}
				else if (!mas.containsKey(mkey) || !mas.get(mkey).equals(gbun.get(names).getMaster()))
					System.out.println("�� �ش� ������ ���� ������ �����ϴ�.\n");	//��������		
			}
			
		
		}
		else if (a==3)   //���� �̺�Ʈ �����ϴ� ����
		{
			System.out.println("\t\t  [���� �̺�Ʈ ���� �޴�]\n");
			System.out.println("\t\t ==������ �Էµ� ���� �̺�Ʈ��==\n");

			Iterator<String> it = ht.keySet().iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.printf("%s : %s\n\n", s, ht.get(s));
			}
			System.out.println();

			System.out.println("1.��ü���� / 2.�κл���");
			System.out.print(">> �Է� : ");
			String b = br.readLine();

			if (b.equals("1"))  //�����̺�Ʈ ��ü����
			{
				System.out.println(">> ���� ��ü���� �Ͻðڽ��ϱ�?(Y/N)");
				con=br.readLine();

				if (con.equals("y") || con.equals("Y"))
				{
					ht.clear();
					System.out.println("�� ��ü�����Ǿ����ϴ�.\n\n");
				}
				else return;
			}
			else if(b.equals("2")) //�����̺�Ʈ �κл���
			{
				System.out.print(">> ������ ������ �Է� : ");
				names = br.readLine();

				if (!ht.containsKey(names))
					System.out.println("\n�� �ش� Ű���尡 �������� �ʽ��ϴ�.\n\n");
				else
				{
					System.out.print(">> ���� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
					con=br.readLine();
					
					if (con.equals("y") || con.equals("Y"))
					{
						ht.remove(names);
						System.out.println("�� �����Ǿ����ϴ�.\n\n");
					}
					else
						return;
				}
			}
		}
	}
}
