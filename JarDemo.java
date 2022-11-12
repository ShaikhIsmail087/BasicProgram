import java.awt.*;
import java.awt.event.*;
class JarDemo
{
	public static void main(String[] args){
		Frame f=new Frame();
		f.addWindowListener(new WindowAdapter()
		{
			public void windowColsing(WindowEvent e)
			{
				for(int i=1;i<=10;i++)
					System.out.println("I am closing window :"+i);
				System.exit(0);
			}
		}
		);
		f.add(new Label("I can Create Executable Jar File!!!"));
		f.setSize(500,500);
		f.setVisible(true);
	}
}
//jar -cvfm demo8.jar manifest.MF JarDemo.class JarDemo$1.class
//dir demo8.jar
//java -jar demo8.jar