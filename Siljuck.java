public class Siljuck extends Main          
{
	//����(����)�� ������Ȳ�� �ϱ����� ������ Ŭ����

	private String gname;   //�����̸�
	private String mname;   //�޴��̸�
	private int pri;		//�޴� ����
	private int jori;		//�����ð�
	private int maechul=0;	//���ⷮ

	Siljuck(String gname, String mname, int pri)     
	{
	}

	Siljuck()
	{
	}

	// getter/setter
	public int getMaechul()                         //���� ���� 
	{
		return maechul;
	}
	public void setPlusMaechul(int maechul)         //���� ����
	{
		this.maechul += maechul;
	}

	public void setMinusMaechul(int maechul)        //���� ����
	{
		this.maechul -= maechul;
	}

	public void setMaechul(int maechul)
	{
		this.maechul = maechul;
	}

	public int getJori()               //�����ð�
	{ 
		return jori;
	}
	public void setJori(int jori)
	{
		this.jori = jori;
	}

	
	public String getGname()           //�����̸�
	{
		return gname;
	}
	public void setGname(String gname)
	{
		this.gname = gname;
	}
	
	public String getMname()           //�޴��̸�
	{
		return mname;
	}
	public void setMname(String mname)
	{
		this.mname = mname;
	}	

	public int getPri()                //�޴� ����
	{
		return pri;
	}
	public void setPri(int pri)
	{
		this.pri = pri;
	}	

	

}
