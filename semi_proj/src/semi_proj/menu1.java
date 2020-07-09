package SOO;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class prog extends JFrame implements MouseListener{
	
	prog(){
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 600, 900);
		jp1.setBackground(Color.white);
		
		JLabel l = new JLabel(new ImageIcon("./images/a.png"));
		l.setBounds(130, 30, 300, 121);
		
		JLabel ll = new JLabel(new ImageIcon("./images/b.png"));
		ll.setBounds(25, 480, 500, 121);
		
		JLabel lll = new JLabel(new ImageIcon("./images/d.png"));
		lll.setBounds(25, 580, 500, 300);
			
		
		JButton a = new JButton(new ImageIcon("./images/mul1.png"));
		a.setBounds(20, 180, 150, 270);
		
		a.setRolloverIcon(new ImageIcon("./images/mul2.png"));
			
		
		JButton b = new JButton(new ImageIcon("./images/bibim1.png"));
		b.setBounds(200, 180, 150, 270);
		
		b.setRolloverIcon(new ImageIcon("./images/bibim2.png"));
		
		
		JButton c = new JButton(new ImageIcon("./images/hae1.png"));
		c.setBounds(380, 180 , 150, 270);
		
		c.setRolloverIcon(new ImageIcon("./images/hae2.png"));
		
		JButton d = new JButton(new ImageIcon("./images/man.png"));
		d.setBounds(149, 633 , 186, 194);
		
		JButton e = new JButton(new ImageIcon("./images/gogo.png"));
		e.setBounds(336, 633 , 186, 194);
		
		
		JButton small = new JButton(new ImageIcon("./images/so.png"));
		small.setBounds(150, 485, 125, 113);
		
		JButton middle = new JButton(new ImageIcon("./images/jung.png"));
		middle.setBounds(275, 485, 125, 113);
		
		JButton large = new JButton(new ImageIcon("./images/dae.png"));
		large.setBounds(400, 485, 125, 113);
		

		
		
//		
//		JButton e = new JButton();
//		e.setBounds(120, 150, 80, 80);
//		
//		JButton f = new JButton();
//		f.setBounds(220, 150, 80, 80);
		

		jp1.add(small);
		jp1.add(middle);
		jp1.add(d);
		jp1.add(e);
		jp1.add(l);
		jp1.add(ll);
		jp1.add(lll);
		jp1.add(a);
		jp1.add(b);
		jp1.add(c);
		
//		jp1.add(e);
//		jp1.add(f);
		
		


		
//		JPanel jp2 = new JPanel();
//		jp2.setLayout(null);
//		jp2.setBounds(300,0,600,400);
//		
//		JLabel jb1 = new JLabel("값 : ");
//		jb1.setBounds(400,200,50,50);
		
//		JLabel jb2 = new JLabel("세주니♥ : ");
//		jb2.setBounds(400,250,50,50);
		
		//jp2.add(jb1);
		//jp2.add(jb2);
		
		
		Container container =getContentPane();
		
		container.setLayout(null);
		container.add(jp1);
		//container.add(jp2);
		container.setBackground(Color.WHITE);

		
		
		setTitle("냉면선호");
		setSize(1200, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		//System.out.println("x : "+e.getX()+"y : "+e.getY());
		
	
		
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		noddleController con = new noddleController();
//		con.addMul();
		System.out.println("물냉 이벤트 체크");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}

public class menu1 {
	public static void main(String[] args) {
		new prog();
		
	}
}
