package SOO;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class Possystem {
    int count = 0;
    String show = "";
 
    public Possystem() {
 
        // 디자인단
        // 프레임 설정단
        JFrame frame = new JFrame("냉면선호 주문결제 화면");
        
//        Container contentPane = frame.getContentPane();
//        contentPane.add(pNorth, "EAST");
        
        
        frame.setBounds(0, 0, 700, 900); //모니터화면위치 가로, 세로, 폭, 높이 
        frame.setBackground(Color.black);
 
        // 폰트
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18); //숫자 폰트 크기
        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22); //담기는 화면 텍스트 크기 
 
       
        // 북쪽
        Panel pNorth = new Panel();
  
        pNorth.setBackground(new Color(255, 255, 215)); //RGB색상값 //new Color(255, 255, 215)상아색 //40, 150, 210하늘색//글자색 setForeground
        pNorth.setLayout(null);
        pNorth.setSize(200, 500); //컴포넌트 크기
        pNorth.setFont(font);
 
        // 배열 설정 부분
        String menu[] = { "물냉면", "비빔냉면", "회냉면", "왕만두", "쌈고기", "면추가" }; //비빔냉면은 4글자라 단가에서 숫자...밀어져
        int price[] = {6000, 6000, 7000, 4000, 4000, 1000};
        JButton bt[] = new JButton[menu.length];
        TextField suja[] = new TextField[menu.length];
        Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        Label l[] = new Label[menu.length];
        ImageIcon icon[] = new ImageIcon[menu.length];
 
        // 버튼 설정 부분
        for (int i = 0; i < menu.length; i++) {
 
            // 냉면 버튼
            bt[i] = new JButton(menu[i]);
            if (i < 3) {
                bt[i].setBounds(25 + i * 150, 30, 100, 100); //25맨앞열사이간격 + i+150비냉물냉네모칸사이간격, 50맨위행사이간격, 100, 100
            } else {
                bt[i].setBounds(25 + (i - 3) * 150, 300, 100, 100);
            }
//사이즈_수량 넣는 순서..

            icon[i] = new ImageIcon("images/image"+i + ".png"); //이미지 클릭할때 도리어 회색...비활성화된것처럼 보임
            bt[i].setIcon(icon[i]);   //맨 먼저 이미지 안클릭하고...수량 정해지면 확인되게...
 
            // 숫자 txt 버튼
            suja[i] = new TextField("0");  //0일경우 확인 안눌러져야.....어떻게?
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
 
            // "-" 버튼
            minus[i] = new Button("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setEnabled(false);
 
            // "+" 버튼
            plus[i] = new Button("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setEnabled(false);
 
            // 가격
            l[i] = new Label(price[i] + "원"); //텍스트 "원" 안나와
            l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
            //l[i].setSize(35, 35);
 
            // 확인 버튼
            ok[i] = new JButton("확인");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);
 
            pNorth.add(bt[i]);
            pNorth.add(suja[i]);
            pNorth.add(minus[i]);
            pNorth.add(plus[i]);
            pNorth.add(l[i]);
            pNorth.add(ok[i]);
        }
 
        // 중앙

        
        TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY); //스크롤바 딱히 안써 ..최대 6개 쌓이고..쌓어 봤자 수량으로 쌓이니까
        //ta.setBounds(600,200,50,50);위치 지정이 왜 안되지?
        ta.setText("   상품명        단가        수량        합계\n\n");
        ta.setBackground(Color.white);
        ta.setEditable(false);
        ta.setFont(font1);
 
        // 남쪽
        Panel pSouth = new Panel();
       // pSouth.setBounds(0,10,200,10);
 
        
//      Button bt1 = new Button("선택취소");////글씨 안나옴,,부분취소하려면 해당 메뉴에 대한 각각 삭제버튼 있어야
        Button bt1 = new Button("전체취소"); //초기화
        Button bt2 = new Button("합계");
        Button bt3 = new Button("결제");
        
       // pSouth.setSize(70, 2000); 사이즈 조정 안되지?
//        pSouth.add(bt1);
        pSouth.add(bt1);
//        pSouth.add(bt2);
        pSouth.add(bt3);
        
        // 주문버튼
//        bt1.addActionListener(new ActionListener() {
// 
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
//                for (int i = 0; i < menu.length; i++) {
//                    bt[i].setEnabled(true);
//                    minus[i].setEnabled(false);
//                    plus[i].setEnabled(false);
//                    suja[i].setText("0");
//                    ta.setText("   상품명        단가        수량        합계\n\n");
// 
//                }
//            }
//        });
 
        // 초기화 버튼
        bt1.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   상품명        단가        수량        합계\n\n");
 
                }
            }
        });
 
        //bt2 합계 버튼
        //담길때마다 합계금액 보여지게 추가
        
        
        //bt3 결제버튼
        //결제버튼 누르면 주방으로 주문된 메뉴 정보 보내주고
        //초기화 
        
//        bt3.addActionListener(new ActionListener() {
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
// 
 
        // 컴포넌트
        frame.add(pNorth, BorderLayout.NORTH);
        frame.add(ta, BorderLayout.CENTER);
        frame.add(pSouth, BorderLayout.SOUTH);
        frame.setVisible(true);
 
        // 이벤트단
        for (int i = 0; i < menu.length; i++) {
            int j = i;
 
            // 햄버그 버튼 이벤트
            bt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    bt[j].setEnabled(false);
                    ok[j].setEnabled(true);
 
                    count = 0;
                }
            });
 
            // "-" 버튼 이벤트
            minus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 0) {
                        count = count - 1;
                        suja[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });
            
            // "+" 버튼 이벤트
            plus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
            
            //확인 버튼 이벤트
            ok[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    show = bt[j].getActionCommand();
                    ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                            + "원" + "\n");
                    ok[j].setEnabled(false);
                }
            });
 
        }
 
        // 끄기
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
  



	// 메인
    public static void main(String[] args) {
        new Possystem();
    }
 
}
 