import static java.lang.System.out;  
import java.lang.reflect.Method;  
import java.lang.reflect.InvocationTargetException; 
import javax.swing.*;  

class Simple{
	private void message(){System.out.println("Hello Java");}
private void cube(int n){System.out.println(n*n*n);}  	}
interface My{}
class Test1
{
	public void printName(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[] args)throws ClassNotFoundException,
	InstantiationException,NoSuchMethodException,IllegalAccessException,InvocationTargetException
	{  
		Class c=Simple.class;  
		Object obj=c.newInstance();  
  
		Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
		m.setAccessible(true);  
		m.invoke(obj,4);
		/*Class c=Class.forName("Simple");
		Object o= c.newInstance();  
		Method m =c.getDeclaredMethod("message", null);  
		m.setAccessible(true);  
		m.invoke(o, null);*/
		
		System.out.println(c.getName());
		Simple s=new Simple();
		Test1 t=new Test1();
		t.printName(s);
		Class c1=boolean.class;
		System.out.println(c1.getName());
		Class c2=Test1.class;
		System.out.println(c.getName());
		try
		{
			/*Class c3=Class.forName("Simple");
			Simple s1=(Simple)c3.newInstance();
			
			s1.message();
			System.out.println(c3.isInterface());  */
     
			Class c4=Class.forName("My");  
			System.out.println(c4.isPrimitive());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}