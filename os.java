import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;

public class os extends JFrame implements ActionListener 
{
	public static JRadioButton r1 = new JRadioButton("Contiguous ");
	public static JRadioButton r2 = new JRadioButton("Indexed");
	public static JButton bt1 = new JButton("Allocate");
	public static JButton bt2 = new JButton("Allocate");
	public static JButton bt3 = new JButton("Allocate");
	public static JButton bt4 = new JButton("Allocate");
	public static JButton bt5 = new JButton("Allocate");
	public static JButton bt6 = new JButton("Allocate");
	public static JButton bt7 = new JButton("Enter Again");
	 
	public static JFrame frame = new JFrame("Allocation Methods");
	public static void main(String args[]) throws Exception
	{
		new os();
	}
	

	os()
	{
		ButtonGroup bg = new ButtonGroup();
		JButton btn;
		
		JLabel l0;
		JLabel l1;
		JLabel l2;
		btn = new JButton("PROCEED");
		
		l0 = new JLabel("File");
		l0.setForeground(Color.black);
		l0.setFont(new Font("Serif", Font.PLAIN, 60));	
		l0.setBounds(200,200, 400, 65);


		l1 = new JLabel("Allocation ");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Serif", Font.PLAIN, 60));	
		l1.setBounds(200,300, 400, 65);

		l2 = new JLabel("Methods");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Serif", Font.PLAIN, 60));	
		l2.setBounds(200, 400, 400, 65);
		bg.add(r1);												bg.add(r2);
		r1.setBounds(950, 300, 400, 40);
		r2.setBounds(950, 350, 400, 40);
		frame.add(r1);			frame.add(r2);			frame.add(l1);			frame.add(l2);			frame.add(l0);	frame.add(btn);
		frame.setSize(1360, 730);						frame.setLayout(null);							frame.setVisible(true);
		btn.addActionListener(this);
		btn.setBounds(950, 550, 100, 30);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(os.r1.isSelected())
		{
			contiguous();
		}
		else if(os.r2.isSelected())
		{
			indexeed();
		}

	}

	public void contiguous()
	{
		
		
		JFrame frame1 = new JFrame("Contiguous Allocation");
		frame1.setSize(1360, 730);		frame1.setLayout(null);	frame1.setVisible(true);
		JLabel ind=new JLabel("Contiguous File Allocation"); ind.setBounds(120,30,900,60);ind.setFont(new Font("Serif", Font.PLAIN, 50));
		frame1.add(ind);
		JTextField tf1 = new JTextField();		tf1.setBounds(900, 200, 100, 25);	frame1.add(tf1);
		JTextField tf2 = new JTextField();		tf2.setBounds(900, 235, 100, 25);	frame1.add(tf2);
		JTextField tf3 = new JTextField();		tf3.setBounds(900, 270, 100, 25);	frame1.add(tf3);
		JTextField tf4 = new JTextField();		tf4.setBounds(900, 305, 100, 25);	frame1.add(tf4);
		JTextField tf5 = new JTextField();		tf5.setBounds(900, 340, 100, 25);	frame1.add(tf5);

		JTextField t1 = new JTextField();		t1.setBounds(1050, 200, 100, 25);	frame1.add(t1);
		JTextField t2 = new JTextField();		t2.setBounds(1050, 235, 100, 25);	frame1.add(t2);
		JTextField t3 = new JTextField();		t3.setBounds(1050, 270, 100, 25);	frame1.add(t3);
		JTextField t4 = new JTextField();		t4.setBounds(1050, 305, 100, 25);	frame1.add(t4);
		JTextField t5 = new JTextField();		t5.setBounds(1050, 340, 100, 25);	frame1.add(t5);

		JLabel labb = new JLabel("Start Index"); labb.setBounds(900,150,100,40);    frame1.add(labb);
		JLabel lab1 = new JLabel("Length "); lab1.setBounds(1050,150,100,40);   	frame1.add(lab1);
		JTextField[] fields = new JTextField[24];
		for (int i = 0; i < 4; i++)
		{
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+(i*100),120,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
			frame1.add(fields[i]);
		}

		for (int i = 4; i < 8; i++)
		{
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-4)*100),200,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		   frame1.add(fields[i]);
		}

		for (int i = 8; i < 12; i++) 
		{
			fields[i] = new JTextField("    "+i);
			fields[i].setBounds(120+((i-8)*100),280,70,70);
			fields[i].setEditable(false);
			fields[i].setBackground(Color.RED);
 			frame1.add(fields[i]);
		}

			for (int i = 12; i < 16; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-12)*100),360,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 16; i < 20; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-16)*100),440,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 20; i < 24; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-20)*100),520,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}
		
		bt1.setBounds(1200,200,100,25);	frame1.add(bt1);
		bt1.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    	String index=tf1.getText();
    	String count=t1.getText();
		JPanel jj =new JPanel();
 		int s=Integer.parseInt(index);		int c=Integer.parseInt(count);
 		int memory=24;
		int y=0;		
 		try
 		{
 			if(memory>0)
 			{for(y=0;y<c;y++)
 				{fields[s+y].setBackground(Color.GREEN); }
 			memory=memory-(c-s);
 			
 		}
 		}	
 		catch(Exception r)
 		{
 			JOptionPane.showMessageDialog(jj,"Memory Not Available Enter Again","Error", JOptionPane.ERROR_MESSAGE);
 			contiguous();
 		}
 		}
    	});

    	bt2.setBounds(1200,235,100,25);	frame1.add(bt2);
		bt2.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    	String index=tf2.getText();
    	String count=t2.getText();
		JPanel jj =new JPanel();
 		int s=Integer.parseInt(index);		int c=Integer.parseInt(count);
 		int memory=24;
		int y=1;		
 		try
 		{
 			if(memory>0)
 			{for(y=0;y<c;y++)
 				fields[s+y].setBackground(Color.GREEN);
 			memory=memory-(c-s);}
 		}	
 		catch(Exception r)
 		{
 			JOptionPane.showMessageDialog(jj,"Memory Not Available Enter Again","Error", JOptionPane.ERROR_MESSAGE);
 			contiguous();
 		}
 		}  
    	});

    	bt3.setBounds(1200,270,100,25);	frame1.add(bt3);
		bt3.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
 		String index=tf3.getText();
    	String count=t3.getText();
		JPanel jj =new JPanel();
 		int s=Integer.parseInt(index);		int c=Integer.parseInt(count);
 		int memory=24;
		int y=1;		
 		try
 		{
 			if(memory>0)
 			{for(y=0;y<c;y++)
 				fields[s+y].setBackground(Color.GREEN);
 			memory=memory-(c-s);}
 		}	
 		catch(Exception r)
 		{
 			JOptionPane.showMessageDialog(jj,"Memory Not Available Enter Again","Error", JOptionPane.ERROR_MESSAGE);
 			contiguous();
 		}
 		  
        } 
    	  
    	});

    	bt4.setBounds(1200,305,100,25);	frame1.add(bt4);
		bt4.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    	String index=tf4.getText();
    	String count=t4.getText();
		JPanel jj =new JPanel();
 		int s=Integer.parseInt(index);		int c=Integer.parseInt(count);
 		int memory=24;
		int y=1;		
 		try
 		{
 			if(memory>0)
 			{for(y=0;y<c;y++)
 				fields[s+y].setBackground(Color.GREEN);
 			memory=memory-(c-s);}
 		}	
 		catch(Exception r)
 		{
 			JOptionPane.showMessageDialog(jj,"Memory Not Available Enter Again","Error", JOptionPane.ERROR_MESSAGE);
 			contiguous();
 		}
 		}  
    	
    	});

    	bt5.setBounds(1200,340,100,25);	frame1.add(bt5);
		bt5.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    	String index=tf5.getText();
    	String count=t5.getText();
		JPanel jj =new JPanel();
 		int s=Integer.parseInt(index);		int c=Integer.parseInt(count);
 		int memory=24;
		int y=1;		
 		try
 		{
 			if(memory>0)
 			{for(y=0;y<c;y++)
 				fields[s+y].setBackground(Color.GREEN);
 			memory=memory-(c-s);}
 		}	
 		catch(Exception r)
 		{
 			JOptionPane.showMessageDialog(jj,"Memory Not Available Enter Again","Error", JOptionPane.ERROR_MESSAGE);
 			contiguous();
 		}
 		}});
		}

		void indexeed()
		{
		JFrame frame1 = new JFrame("Indexed Allocation");
		JLabel indd=new JLabel("Indexed using memory table"); indd.setBounds(120,30,900,60);indd.setFont(new Font("Serif", Font.PLAIN, 50));
		frame1.add(indd);
		frame1.setSize(1360, 730);		frame1.setLayout(null);	frame1.setVisible(true);
		JLabel llo=new JLabel("Physical"); llo.setBounds(900,130,100,25);frame1.add(llo);
		JTextField tf0 = new JTextField("0");		tf0.setBounds(900, 160, 100, 25);	frame1.add(tf0);	tf0.setEditable(false);
		JTextField tf1 = new JTextField("1");		tf1.setBounds(900, 190, 100, 25);	frame1.add(tf1);	tf1.setEditable(false);
		JTextField tf2 = new JTextField("2");		tf2.setBounds(900, 220, 100, 25);	frame1.add(tf2);	tf2.setEditable(false);
		JTextField tf3 = new JTextField("3");		tf3.setBounds(900, 250, 100, 25);	frame1.add(tf3);	tf3.setEditable(false);
		JTextField tf4 = new JTextField("4");		tf4.setBounds(900, 280, 100, 25);	frame1.add(tf4);	tf4.setEditable(false);
		JTextField tf5 = new JTextField("5");		tf5.setBounds(900, 310, 100, 25);	frame1.add(tf5);	tf5.setEditable(false);
		JTextField tf6 = new JTextField("6");		tf6.setBounds(900, 340, 100, 25);	frame1.add(tf6);	tf6.setEditable(false);
		JTextField tf7 = new JTextField("7");		tf7.setBounds(900, 370, 100, 25);	frame1.add(tf7);	tf7.setEditable(false);
		JTextField tf8 = new JTextField("8");		tf8.setBounds(900, 400, 100, 25);	frame1.add(tf8);	tf8.setEditable(false);
		JTextField tf9 = new JTextField("9");		tf9.setBounds(900, 430, 100, 25);	frame1.add(tf9);	tf9.setEditable(false);
		JTextField tf10 = new JTextField("10");		tf10.setBounds(900,460, 100, 25);	frame1.add(tf10);	tf10.setEditable(false);
		
		JLabel ss=new JLabel("Start"); ss.setBounds(1140,160,100,25);frame1.add(ss);
		JLabel ll=new JLabel("Next Block"); ll.setBounds(1020,130,100,25);frame1.add(ll);
		
		JTextField t0 = new JTextField();		t0.setBounds(1020, 160, 100, 25);	frame1.add(t0);	
		JTextField t1 = new JTextField();		t1.setBounds(1020, 190, 100, 25);	frame1.add(t1);	
		JTextField t2 = new JTextField();		t2.setBounds(1020, 220, 100, 25);	frame1.add(t2);	
		JTextField t3 = new JTextField();		t3.setBounds(1020, 250, 100, 25);	frame1.add(t3);	
		JTextField t4 = new JTextField();		t4.setBounds(1020, 280, 100, 25);	frame1.add(t4);	
		JTextField t5 = new JTextField();		t5.setBounds(1020, 310, 100, 25);	frame1.add(t5);	
		JTextField t6 = new JTextField();		t6.setBounds(1020, 340, 100, 25);	frame1.add(t6);	
		JTextField t7 = new JTextField();		t7.setBounds(1020, 370, 100, 25);	frame1.add(t7);	
		JTextField t8 = new JTextField();		t8.setBounds(1020, 400, 100, 25);	frame1.add(t8);	
		JTextField t9 = new JTextField();		t9.setBounds(1020, 430, 100, 25);	frame1.add(t9);	
		JTextField t10 = new JTextField();		t10.setBounds(1020,460, 100, 25);	frame1.add(t10);

		JTextField[] fields = new JTextField[24];
		for (int i = 0; i < 4; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+(i*100),120,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

		for (int i = 4; i < 8; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-4)*100),200,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 8; i < 12; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-8)*100),280,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 12; i < 16; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-12)*100),360,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 16; i < 20; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-16)*100),440,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}

			for (int i = 20; i < 24; i++) {
		   fields[i] = new JTextField("    "+i);
		   fields[i].setBounds(120+((i-20)*100),520,70,70);
		   fields[i].setEditable(false);
		   fields[i].setBackground(Color.RED);
 		  
  			 frame1.add(fields[i]);
			}
			
		
		bt6.setBounds(900,500,100,25);		frame1.add(bt6);	
		bt6.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){ 
		
    	
    	String c0=t0.getText();		int aaa=Integer.parseInt(c0);
    	int c=aaa;		
 		int k=0;
 		try{

 		do{
 		for(k=0;k<=10;k++)
 		{	
 			if(k==c)
 			{	
 		
 				fields[k].setBackground(Color.GREEN);
 				if(k==1)	{String c1=t1.getText();		int bbb=Integer.parseInt(c1);		 c=bbb;}
 				if(k==2)	{String c2=t2.getText();		int ccc=Integer.parseInt(c2);	 	 c=ccc;}
 				if(k==3)	{String c3=t3.getText();		int ddd=Integer.parseInt(c3); 	 	 c=ddd;}
 				if(k==4)	{String c4=t4.getText();		int eee=Integer.parseInt(c4);		 c=eee;}
 				if(k==5)	{String c5=t5.getText();		int fff=Integer.parseInt(c5); 	   	 c=fff;}
 				if(k==6)	{String c6=t6.getText();		int ggg=Integer.parseInt(c6);	     c=ggg;}
 				if(k==7)	{String c7=t7.getText();		int hhh=Integer.parseInt(c7);        c=hhh;}
 				if(k==8)	{String c8=t8.getText();		int iii=Integer.parseInt(c8);        c=iii;}
 				if(k==9)	{String c9=t9.getText();		int jjj=Integer.parseInt(c9);        c=jjj;}
 				if(k==10)	{String c10=t10.getText();	    int kkk=Integer.parseInt(c10);       c=kkk;}


 			}
 		}
 		}while(c!=-1);	
 		

    	
		}
		catch(Exception ff)
		{
			System.out.println(ff);
		}
	
		}});

		bt7.setBounds(1020,500,100,25);		frame1.add(bt7);	
		bt7.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){

    	indexeed(); 
		}});


		}

}
	


	



