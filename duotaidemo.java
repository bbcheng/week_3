interface animal
{
	abstract void eat();
}

class cat implements animal
{
	public void eat()
	{
		System.out.println("����");
	}
}

class dog implements animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
}

class Fun
{
	public static void fun(animal c)
	{
		c.eat();
	}
}

class duotaidemo 
{
	public static void main(String[] args) 
	{
	/*	animal c = new cat();
		c.eat();
		fun(c);	*/

	/*	dog d = new dog();
		d.eat();
		fun(d);	*/

		Fun f = new Fun();
		f.fun(new cat());
		f.fun(new dog());
	}

	/*
	public static void fun(dog d)
	{
		d.eat();
	}
	*/

	/*	animal a = new cat();//����ת��
	if(a instanceof cat)
		cat c = (cat)a;	//����ת��
	*/
}
