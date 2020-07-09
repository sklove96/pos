package SOO; 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
//2. 이윤화면 
public class POSPanel2 extends JPanel {
	JButton[] MBtn = new JButton[5];
	String[] menu = {
			"물냉면", "비빔냉면","회냉면",
			"왕만두","숯불고기"};
	int[] price = {
			1000,1000,1000,
			1000,1000};
	JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"선택취소","전체취소","총그릇수","총 매출"}; // {"쿠폰","선택취소","전체취소","총 매출"};
	String [] ColName = {"메뉴","그릇수","매출금액"};
	String [][] Data ;
	int count =1;
	DefaultTableModel model = new DefaultTableModel(Data,ColName);
	JTable table = new JTable(model);
	
	//POS 패널 판
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.WHITE);
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(50);
			table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 15));
			add(new JScrollPane(table));
		}
	}
	
	//메뉴의 패널 판 
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(4,3,3,3));
			setBackground(Color.WHITE);
			for(int i=0;i<MBtn.length;i++) {
				MBtn[i]= new JButton(menu[i]);
				add(MBtn[i]);
			}
		}
	}
	
	class StrBtn extends JPanel{
		StrBtn(){
			setBackground(Color.WHITE);
			setLayout(new GridLayout(1,4,3,3));
			
			for(int i=0;i<Str.length;i++) {
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	
	public POSPanel2() {
		setLayout(null);
		setBackground(Color.WHITE);
		MenuBtn mbtn = new MenuBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		
		//금액란
		tf.setSize(450, 70);
		tf.setLocation(50, 480);
		add(tf);
		
		sc.setSize(500, 500);
		sc.setLocation(25, 20);
		add(sc);
		
		mbtn.setSize(400, 430);
		mbtn.setLocation(530, 23);
		add(mbtn);
		
		sbtn.setSize(400, 70);
		sbtn.setLocation(530, 480);
		add(sbtn);
		
		//메뉴추가
		for(int i=0;i<MBtn.length;i++) {
			final int index =i;
			MBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],count,price[index]});
				}
			});
		}
		//쿠폰
//		SBtn[0].addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton MBtn = (JButton)e.getSource();
//				table.setValueAt(0, table.getSelectedRow(), 2);
//			}
//		});
		
			//선택취소
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.removeRow(table.getSelectedRow());
			}
		});
		
		
		//전체취소
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
			}
		});
		
		//총그릇수 버튼
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 1);
				}
				tf.setText(String.valueOf(" 총 그릇수 : "+sum));
				tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
			}
		});
		
		//총매출버튼
		SBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2);
				}
				tf.setText(String.valueOf(" 총 매출 : "+sum));
				tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
			}
		});
	}
}

