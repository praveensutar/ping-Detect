import javax.net.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.*; 
import java.awt.event.*;
 
 
 public class response extends JFrame implements ActionListener
{ 
	response(String s,int a, int b)
	{
	 
	 setBounds(a,b,900,200);
	 show(true);
	 setLayout(null);
	 
	 JLabel l1=new JLabel(""+s);
	 JButton b1 = new JButton("Exit All");
	 l1.setBounds(10,10,1000,30);
	 b1.setBounds(200,60,100,50);
	 add(l1);
	 add(b1);
	 b1.addActionListener(this);
	}
 
 public void actionPerformed(ActionEvent a)
 {System.exit(0);}
 
    public static void main(String[] args) { 
    
    
    try {
			File file = new File("Reply.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line = bufferedReader.readLine();
			int a=50;
				int b=100;
				int c=100;
				int d=100;int i=0;
			while(!line.equals("\0"))
			{
			/*while (i<=5) {
				
				stringBuffer.append(line);
				stringBuffer.append("\n");*/
				//JOptionPane.showMessageDialog(null,line);
				hello h1=new hello(line,a,b);
				a=a+70; b=b+60;
				i++;
				//JOptionPane.showMessageDialog(null,line);
				
				//}
				
				line = bufferedReader.readLine();
			}
			//JOptionPane.showMessageDialog(null,stringBuffer);
			
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
   // JOptionPane.showMessageDialog(null,
    //"You are Hacked......");
   
        System.out.println("\n Programmer Ends.....");
       
    }
}