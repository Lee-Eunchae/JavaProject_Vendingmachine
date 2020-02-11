// ���� ������ class

import java.util.Scanner;
import java.util.Iterator;

public class Casher extends Main
{

	private static int won50000 = 100;
	private static int won10000 = 100;
	private static int won5000 = 100;
	private static int won1000 = 100;
	private static int won500 = 100;

	Casher(int won50000, int won10000, int won5000, int won1000, int won500) // Casher ����� ���� ������(�Ķ���� ��)
	{
		this.won50000 = won50000;
		this.won10000 = won10000;
		this.won5000 = won5000;
		this.won1000 = won1000;
		this.won500 = won500;
	}

	Casher()	// Casher ����� ���� ������
	{
	}

	// getter/setter ------------------------------------------

	public int getWon50000()
	{
		return won50000;
	}
	public void setWon50000(int won50000)
	{
		this.won50000 = won50000;
	}


	public int getWon10000()
	{
		return won10000;
	}
	public void setWon10000(int won10000)
	{
		this.won10000 = won10000;
	}
	

	public int getWon5000()
	{
		return won5000;
	}
	public void setWon5000(int won5000)
	{
		this.won5000 = won5000;
	}
	

	public int getWon1000()
	{
		return won1000;
	}
	public void setWon1000(int won1000)
	{
		this.won1000 = won1000;
	}

	
	public int getWon500()
	{
		return won500;
	}
	public void setWon500(int won500)
	{
		this.won500 = won500;
	}

//=========================================================================================

	public void cashService() throws Exception		//-- �ŷ��� display�� ��� ó���� �Ѳ����� �ϴ� �޼ҵ�
	{
		Scanner sc = new Scanner (System.in);	
		int ch;										//-- �������� �̿뿡 ���� ���� ���� ����
		int a,b,c,d,e;								//-- ����� �ż��Է� ���� ����
		int menus = 0; //test��						//-- ����� �ֹ� ǰ�� ���� ���� �ݾ� ���� ����
		String answer;								//-- Y/N ���ÿ� ���� ����
		String phone;
		Display diss = new Display();				//-- Display �ν��Ͻ� ����

		// ��ٱ����� ����ִ� ǰ����� ������ ���� �ڷᱸ���� �� ��� ����
		// ���� �Ŀ��� ��ٱ��ϸ� �� ����ָ�, �޴� �ڷᱸ���ȿ� �ִ� �޴� ������ �ν��Ͻ� ���� ���ⷮ �Ӽ��� �ֽ�ȭ ��

		Iterator<Integer> it = basket.keySet().iterator();	//-- ��ٱ��� ���Ŀ� Iterator �ν��Ͻ� ����
		Iterator<Integer> its;

		while (it.hasNext())
		{
			int inp = it.next();
			today.put((today.size()+inp), basket.get(inp));
			menus += basket.get(inp).getPri();
			
			its = menu.keySet().iterator();
			while (its.hasNext())
			{
				int inn = its.next();
				if (basket.get(inp).getGname().equals(menu.get(inn).getGagaeName()) && basket.get(inp).getMname().equals(menu.get(inn).getMenuName()))
				{
					menu.get(inn).setPlusSell(1);
					break;
				}
			}
			
		}

	
		basket.clear();
		n=0;
		// ��ٱ��� key�� �ʱ�ȭ
		System.out.println(basket.size());
		
		// �������� Display ���
		System.out.println("=============================");
		System.out.println("|       [���� ����]       |");
		System.out.println("|         1. ����           |");
		System.out.println("|         2. ī��           |");
		System.out.println("=============================");
		System.out.print(  "(1~2��)���� ����� ������ �ּ��� : ");
		ch = sc.nextInt();
		
			// ���� ���� �̿�
		if (ch ==1)
		{
			int sum=0;
			
			do
			{
				System.out.printf("������ �ݾ� : %,d��",menus);		//-- ���� ������ ��ٱ����� �ѱݾ�
			
				System.out.println("[���� ȭ��]");

				System.out.print("�� ������ (�ż�) : ");
				a = sc.nextInt();
				System.out.print("������ (�ż�) : ");
				b = sc.nextInt();
				System.out.print("�� õ���� (�ż�) : ");
				c = sc.nextInt();
				System.out.print("õ���� (�ż�) : ");
				d = sc.nextInt();
				System.out.print("����� (����) : ");
				e = sc.nextInt();

				sum += (a*50000) + (b*10000) + (c*5000) + (d *1000) + (e * 500);	//-- �Է��� �ż���� �ݾ� ����

				System.out.printf("�޴� ���� : %,d��\n",menus);
				System.out.printf("�Է��� �ѱݾ� : %,d��\n",sum);
				
				if ((sum-menus)<0)		//-- �Է��� �ݾ��� ������ �� �ݾ��� �߰��� �� �ִ� ��ȸ�� ����
				{
					Thread.sleep(1000);
					System.out.println("�Ա��� �ܾ��� �����մϴ�");
					System.out.print("�߰��� �ݾ��� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
					answer = sc.next();

					if (!answer.equals("Y")&&!answer.equals("y"))
					{
						System.out.println("�ٽ� �ŷ��� �̿��� �ֽʽÿ�. �����մϴ�.");
						return;	
					}
				}
			}
			while ((sum-menus)<0);// end do while()

				//-- �ż� ���ݺ�����(�Ž�����)���� ����
				setWon50000(getWon50000() + a);
				setWon10000(getWon10000() + b);
				setWon5000(getWon5000() + c);
				setWon1000(getWon1000() + d);
				setWon500(getWon500() + e);
				
				//-- �Ž������� ������������ �Ž��� �ִ� �ý���
				int aa=0;
				int bb=0;
				int cc=0;
				int dd=0;
				int ee=0;
				int tot = sum-menus;

				while (tot>=50000)
				{
					if (getWon50000()==0)
						break;

					tot -= 50000;
					aa++;
				}

				while (tot>=10000)
				{
					if (getWon10000()==0)
						break;

					tot -= 10000;
					bb++;
				}

				while (tot>=5000)
				{
					if (getWon5000()==0)
						break;

					tot -= 5000;
					cc++;
				}

				while (tot>=1000)
				{
					if (getWon1000()==0)
						break;

					tot -= 1000;
					dd++;
				}

				while (tot>=500)
				{
					if (getWon500()==0)
						break;

					tot -= 500;
					ee++;
				}

				//-- tot�� 0���� �ȱ��� ��� �Ž������� ������ ��Ȳ�̹Ƿ� �ŷ��� �ٽ� �����ϵ��� �ȳ�
			if (tot>0)
			{
				System.out.println("\n���Ǳ��� �Ž������� �����մϴ�.\n\n");
				System.out.println("�˼��մϴ�. �����ڿ� �������ֽʽÿ�.");

				System.out.println("�ݾ��� ��ȯ�ϰڽ��ϴ�.\n");
				setWon50000(getWon50000() - a);
				setWon10000(getWon10000() - b);
				setWon5000(getWon5000() - c);
				setWon1000(getWon1000() - d);
				setWon500(getWon500() - e);
				return;

			}

			//-- ������ �Ϸ�Ǹ� �Ž����� ���� �� ��ŭ ���� �������� ����.
			setWon50000(getWon50000() - aa);
			setWon10000(getWon10000() - bb);
			setWon5000(getWon5000() - cc);
			setWon1000(getWon1000() - dd);
			setWon500(getWon500() - ee);
			
			System.out.printf("�Ž����� : %,d ��\n", (sum-menus)); 

			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		// ī�� ���� �̿�
		if (ch == 2)
		{
			System.out.println("[ī�� ����]");
			System.out.println("ī�带 �־��ּ���. (�ƹ�Ű�� ��������) ");
			sc.next();
			System.out.println("���� ������ �Դϴ�...");
			Thread.sleep(2000);
			System.out.printf("%,d ���� ���� �Ϸ� �Ǿ����ϴ�.\n",menus);
		}
		Thread.sleep(1000);
	}
	// �Ž����� ��Ȳ ���
	public void cashRestPrint()
	{
		System.out.println();
		System.out.println("==[1. �Ž����� ��Ȳ]==");
		System.out.println("----------------------");
		System.out.printf("���� 5������ : %d ��\n", getWon50000());
		System.out.printf("���� 1������ : %d ��\n", getWon10000());
		System.out.printf("���� 5õ���� : %d ��\n", getWon5000());
		System.out.printf("���� 1õ���� : %d ��\n", getWon1000());
		System.out.printf("���� 5��� : %d ��\n", getWon500());
		System.out.println("======================\n\n");
	}
	// �Ž����� ���� �޼ҵ�
	public void cashRestUp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("=============[2. �Ž����� ����]=============");
		System.out.println("--------------------------------------------");
		System.out.print(">> ������ �ż� Ȥ�� ������ �Է��ϼ���(5����, 1����, 5õ��, 1õ��, 500�� ��)(���� ����) : ");
		setWon50000(getWon50000() + sc.nextInt());
		setWon10000(getWon10000() + sc.nextInt());
		setWon5000(getWon5000() + sc.nextInt());
		setWon1000(getWon1000() + sc.nextInt());
		setWon500(getWon500() + sc.nextInt());
		System.out.println(">> �Ϸ�Ǿ����ϴ�.");
		System.out.println();
		System.out.println();
	}
	// �Ž����� ȸ�� �޼ҵ�
	public void cashRestGet() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("============[3. �Ž����� ȸ��]============");
		System.out.println("------------------------------------------");
		
		System.out.print(">> ȸ���ϰ� ���� ���� ���ʷ� �Է����ּ���.\n\n");

		System.out.print(">> 50000������ ������ �Է����ּ���.\n");
		int get50000 = sc.nextInt();	
		System.out.print(">> 10000������ ������ �Է����ּ���.\n");
		int get10000 = sc.nextInt();						
		System.out.print(">> 5000������ ������ �Է����ּ���.\n");
		int get5000 = sc.nextInt();	
		System.out.print(">> 1000������ ������ �Է����ּ���.\n");
		int get1000 = sc.nextInt();
		System.out.print(">> 500������ ������ �Է����ּ���.\n");
		int get500 = sc.nextInt();	

		if (getWon50000() >= get50000 && getWon10000() >= get10000 && getWon5000() >= get5000 && getWon1000() >= get1000 && getWon500() >= get500)
		{
			setWon50000(getWon50000() - get50000);
			setWon10000(getWon10000() - get10000);
			setWon5000(getWon5000() - get5000);
			setWon1000(getWon1000() - get1000);
			setWon500(getWon500() - get500);
			System.out.println(">> �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			System.out.println();
		}
		else if (getWon50000() < get50000 || getWon10000() < get10000 || getWon5000() < get5000 || getWon1000() < get1000 || getWon500() < get500)
		{
			System.out.print(">> ȸ�� ������ �ִ�ġ�� ���� �������ðڽ��ϱ�?(Y/N) : ");
			String yesorno = sc.next();
			if (yesorno.equals("Y") || yesorno.equals("y"))
			{
				setWon50000(getWon50000() - getWon50000());
				setWon10000(getWon10000() - getWon10000());
				setWon5000(getWon5000() - getWon5000() );
				setWon1000(getWon1000() - getWon1000() );
				setWon500(getWon500() - getWon500()  );
				System.out.println(">> �Ϸ�Ǿ����ϴ�.");
				System.out.println();
				System.out.println();
			}
			else if (yesorno.equals("N") || yesorno.equals("n"))
			{
				System.out.print(">> ȸ���� ���� �ٽ� Ȯ�����ּ���.\n\n");
			}
		}	
	}// end cashRestGet()
}// end Casher

