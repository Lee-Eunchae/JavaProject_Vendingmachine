
// �޴��� �Ӽ��� �����ִ� class

class MenusVO extends Main
{
	
	private String menuname;	// �޴� �̸�
	private String gagaename;	// ���� �̸� 
	private int price;			// ����
	private int time;			// �����ð�
	private int sell=0;			// �Ǹŷ�

	MenusVO(String menuname, String gagaename, int price, int time)
	{
		this.menuname = menuname;
		this.gagaename = gagaename;
		this.price = price;
		this.time = time;
	}

	MenusVO(String menuname)
	{
		this.menuname = menuname;
	}

	MenusVO()
	{
		
	}
	
// getter/setter ------------------------------------------------------
	public String getMenuName()
	{
		return menuname;
	}
	public void setMenuName(String menuname)
	{
		this.menuname = menuname;
	}	

	public String getGagaeName()
	{
		return gagaename;
	}
	public void setGagaeName(String gagaename)
	{
		this.gagaename = gagaename;
	}	

	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}	


	public int getTime()
	{
		return time;
	}
	public void setTime(int time)
	{
		this.time = time;
	}


	public int getSell()
	{
		return sell;
	}
	public void setPlusSell(int sell)
	{
		this.sell += sell;
	}
	public void setMinusSell(int sell)
	{
		this.sell -= sell;
	}
//-----------------------------------------------------------


}// end class MenusVO