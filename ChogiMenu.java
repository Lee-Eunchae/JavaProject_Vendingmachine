
// �⺻ �Ĵ��� �����ϴ� class

import java.util.Scanner;

public class ChogiMenu extends Main
{
	public void kor()   //ghan = new TreeMap<String, GagaeVO>();  -->�ѽ� ���ʼ�������(�ڷᱸ���� ���)
   {
      ghan.put("����������",new GagaeVO(1,"������","01090170749"));    

      menu.put(num++,new MenusVO("��������","����������",6000,15));
      menu.put(num++,new MenusVO("���Ƕ��̽�","����������",4500,15));
      menu.put(num++,new MenusVO("�ҹ��Ұ��","����������",6000,10));
      menu.put(num++,new MenusVO("��ġ�","����������",7000,15));
      menu.put(num++,new MenusVO("���κ��","����������",7000,15));

      ghan.put("�����ǽӽζ�",new GagaeVO(1,"������","01030602307"));

      menu.put(num++,new MenusVO("����ӹ�","�����ǽӽζ�",7000,20));
      menu.put(num++,new MenusVO("�Ұ��ӹ�","�����ǽӽζ�",7000,15));
      menu.put(num++,new MenusVO("�ҺҰ��ӹ�","�����ǽӽζ�",8000,15));
      menu.put(num++,new MenusVO("��������","�����ǽӽζ�",6500,15));
      menu.put(num++,new MenusVO("��¡����ӹ�","�����ǽӽζ�",7000,20));   
   }

   public void jap()  //gjap = new TreeMap<String, GagaeVO>();	 -->�Ͻ� ���ʼ�������(�ڷᱸ���� ���)
   {
      gjap.put("���ø��ҿ��մϴ�",new GagaeVO(3,"��ҿ�","01084406061"));
      
      menu.put(num++,new MenusVO("��ҽ���","���ø��ҿ��մϴ�",13000,15));
      menu.put(num++,new MenusVO("Ȱ���","���ø��ҿ��մϴ�",15000,15));
      menu.put(num++,new MenusVO("����","���ø��ҿ��մϴ�",7000,10));
      menu.put(num++,new MenusVO("�����","���ø��ҿ��մϴ�",10000,10));
      menu.put(num++,new MenusVO("�����","���ø��ҿ��մϴ�",12000,15));

      gjap.put("���ø����ϴ�",new GagaeVO(3,"������","01053341073"));
      
      menu.put(num++,new MenusVO("��ҽ���","���ø����ϴ�",13500,15));
      menu.put(num++,new MenusVO("Ȱ���","���ø����ϴ�",14000,25));
      menu.put(num++,new MenusVO("����","���ø����ϴ�",6000,15));
      menu.put(num++,new MenusVO("�쵿","���ø����ϴ�",5500,10));
      menu.put(num++,new MenusVO("���ȸ","���ø����ϴ�",38000,20));
   }

	public void chi() //gchi = new TreeMap<String, GagaeVO>();	-->�߽� ���ʼ�������(�ڷᱸ���� ���)
	{
		gchi.put("������Ÿ��",new GagaeVO(2,"������","0236920369"));
		
		menu.put(num++,new MenusVO("¥���","������Ÿ��",3500,10));
		menu.put(num++,new MenusVO("«��","������Ÿ��",4000,10));
		menu.put(num++,new MenusVO("�쵿","������Ÿ��",6000,10));
		menu.put(num++,new MenusVO("������","������Ÿ��",4000,10));
		menu.put(num++,new MenusVO("«¥��","������Ÿ��",5000,15));
		menu.put(num++,new MenusVO("������","������Ÿ��",12000,20));
		menu.put(num++,new MenusVO("������","������Ÿ��",15000,25));
		
		gchi.put("�߱���������",new GagaeVO(2,"������","0238729677"));

		menu.put(num++,new MenusVO("¥���","�߱���������",5000,5));
		menu.put(num++,new MenusVO("��¥��","�߱���������",5500,7));
		menu.put(num++,new MenusVO("«��","�߱���������",5500,5));
		menu.put(num++,new MenusVO("�߱��ø�","�߱���������",7000,10));
		menu.put(num++,new MenusVO("������","�߱���������",15000,15));
		menu.put(num++,new MenusVO("������","�߱���������",6000,10));
		menu.put(num++,new MenusVO("������","�߱���������",25000,20));
	}

	public void bun() //gbun = new TreeMap<String, GagaeVO>();	-->�н� ���ʼ�������(�ڷᱸ���� ���)
	{
		gbun.put("��ä���λ�������",new GagaeVO(4,"����ä","0283512866"));

		menu.put(num++,new MenusVO("������","��ä���λ�������",3500,3));
		menu.put(num++,new MenusVO("Ƣ��","��ä���λ�������",3500,3));
		menu.put(num++,new MenusVO("����","��ä���λ�������",3000,5));
		menu.put(num++,new MenusVO("����","��ä���λ�������",700,3));
		menu.put(num++,new MenusVO("�̸�","��ä���λ�������",5000,10));
		menu.put(num++,new MenusVO("���","��ä���λ�������",4000,10));
		menu.put(num++,new MenusVO("���","��ä���λ�������",2500,5));
		
		gbun.put("�����ǿ�κн�",new GagaeVO(4,"������","0245723212"));

		menu.put(num++,new MenusVO("������","�����ǿ�κн�",2500,3));
		menu.put(num++,new MenusVO("ġ�����","�����ǿ�κн�",3000,5));
		menu.put(num++,new MenusVO("����","�����ǿ�κн�",3000,3));
		menu.put(num++,new MenusVO("�쵿","�����ǿ�κн�",4000,10));
		menu.put(num++,new MenusVO("�Ź�","�����ǿ�κн�",3000,10));
		menu.put(num++,new MenusVO("Ƣ��","�����ǿ�κн�",2500,5));
		menu.put(num++,new MenusVO("��ġ����","�����ǿ�κн�",4000,10));
	}

	public void key()   //���ʼ����� ���� ������Ű ������ �ο�
	{
		mas.put("mas11111111", "��ҿ�");
		mas.put("mas22222222", "����ä");
		mas.put("mas33333333", "������");
		mas.put("mas55555555", "������");
		mas.put("mas77777777", "������");
		mas.put("mas88888888", "������");


	}
}