
// �� �ڷᱸ�� ���� �� �ʱ�ȭ -> ��κ��� class���� ����ϴ� class
// main method �����ϴ� class

import java.util.Hashtable;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Main
{
	//-- �ڷᱸ�� ����
	//	 ��� Ŭ�������� Main Ŭ������ ��ӹ޾� �����ϱ� ���ؼ� static �� ���
	static TreeMap<String,String> mas;
	static TreeMap<String, GagaeVO> ghan;
	static TreeMap<String, GagaeVO> gchi;
	static TreeMap<String, GagaeVO> gjap;
	static TreeMap<String, GagaeVO> gbun;
	static TreeMap<String, GagaeVO> glMap;
	static Hashtable<String,String> ht;
	static TreeMap<String,String> master;
	static TreeSet<String> todayList;
	static TreeMap<Integer, Siljuck> today;
	static TreeSet<String> todayGagae;
	static TreeMap<Integer, Siljuck> basket;

	static TreeMap<Integer, MenusVO> menu;

	static TreeSet<String> all;

	static int n = 0;
	static int num = 0;
	static int number = 0; 
	final int EXIT = 99;
	

	public static void main(String[] args) throws Exception
	{

		ghan = new TreeMap<String, GagaeVO>();		// �ѽ� ���� ������
		gchi = new TreeMap<String, GagaeVO>();		// �߽� ���� ������
		gjap = new TreeMap<String, GagaeVO>();		// �Ͻ� ���� ������
		gbun = new TreeMap<String, GagaeVO>();		// �н� ���� ������

		glMap = new TreeMap<String, GagaeVO>();		// test �ڷᱸ��
		
		mas = new TreeMap<String,String>();			// ���� ���� �ν��Ͻ� ����	(������Ű �߱�)
		ht = new Hashtable<String,String>();		// ���� �̺�Ʈ �ν��Ͻ� ����
		master = new TreeMap<String,String>();		// ������ �̺�Ʈ �ν��Ͻ� ����

		all = new TreeSet<String>();				// '�Ĵ����' menu ����Ʈ �ν��Ͻ� ���� (MapSet Ŭ�������� ���)
		todayList = new TreeSet<String>();			// �ѽ��� ��Ÿ����
		todayGagae = new TreeSet<String>();			// �ν��Ͻ��� �ڷᱸ��
		

		today = new TreeMap<Integer, Siljuck>();	// ������ ���� �ν��Ͻ�����(�ҿ�,��ä)
		basket = new TreeMap<Integer, Siljuck>();	// ��ٱ��Ͽ� �ν��Ͻ� ����

		menu = new TreeMap<Integer,MenusVO>();		// �޴� �ν��Ͻ� ����

		Event1 ev1 = new Event1();					// �̺�Ʈ �ν��Ͻ� ����

		ev1.eventStorem();							// �̺�Ʈ �ʱ⼳��(��ü����)
		ev1.eventMasterm();							// �̺�Ʈ �ʱ⼳��(���� �� ����Ʈ)

		Display dis = new Display();				// Display �ν��Ͻ� ����


// �� �޴� �ʱ� ���� ---------------------------
		ChogiMenu chm = new ChogiMenu();				// �ʱ�޴� �ν��Ͻ� ����
		chm.kor();										// �ѽ�
		chm.chi();										// �߽�
		chm.jap();										// �Ͻ�
		chm.bun();										// �н�
		chm.key();										// ������Ű
//-----------------------------------------------

		do
		{
			dis.mainDisplay();							// ����ȭ��
			dis.mainEvent();							// �̺�Ʈ����ȭ�� ���
			dis.mainSelect();							// ���ݽ��� �ڵ�							
					
		}
		while (true);
	}
}
