
// ������ �Ӽ��� ����ִ� class

import java.util.Hashtable;

public class GagaeVO extends Main
{
	private int kind;				// ���� ����
	private String master;			// ���� å����	
	private String tel;				// ���� ��ȭ��ȣ
	private int input=0;			// ���� �Ѹ���
	

	GagaeVO (int kind, String master, String tel)
	{
		this.kind = kind;
		this.master = master;
		this.tel = tel;
	}

	GagaeVO()
	{
		
	}


	// getter / setter -------------------------------------------
	public int getKind()
	{
		return kind;
	}
	public void setKind(int kind)
	{
		this.kind = kind;
	}


	public String getMaster()
	{
		return master;
	}
	public void setMaster(String master)
	{
		this.master = master;
	}


	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}


	public int getInput()
	{
		return input;
	}
	public void setInput(int input)
	{
		this.input += input;
	}
	//------------------------------------------------------------

}