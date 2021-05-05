package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 크롤링해서저장프로그램 {
	private static JTextField t1;
//내용을 추출하고 싶지만 a태그로 연결되어있음 => Jsoup의 attr메서드를 사용하여 구성요소를 추출!!
	public static void main(String[] args) { //예외처리를 한 번에 해서 FileWriter할 때 다시 할 필요 없음
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(60, 179, 113));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("네이버 뉴스 속보 크롤링");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 27));
		lblNewLabel.setBounds(91, 10, 310, 47);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("저장 제목");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_1.setBounds(83, 173, 123, 56);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		t1.setBounds(230, 173, 185, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel naver = new JLabel("");
		ImageIcon icon = new ImageIcon("naver.PNG");//이미지 넣기 위해 객체 생성 ~> 생성자 중 이미지 이름을 통해찾기
		naver.setIcon(icon);//실행
		naver.setBounds(127, 54, 239, 116);
		f.getContentPane().add(naver);
		
		JButton b1 = new JButton("종합");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=001"); 
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b1.setBackground(new Color(152, 251, 152));
		b1.setBounds(41, 249, 87, 78);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("정치");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=100"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b2.setBackground(new Color(152, 251, 152));
		b2.setBounds(153, 249, 87, 78);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("경제");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=101"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b3.setBackground(new Color(152, 251, 152));
		b3.setBounds(263, 249, 87, 78);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("사회");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=102"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b4.setBackground(new Color(152, 251, 152));
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b4.setBounds(369, 249, 87, 78);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("생활/문화");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=103"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b5.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b5.setBackground(new Color(152, 251, 152));
		b5.setBounds(41, 349, 154, 78);
		f.getContentPane().add(b5);
		
		JButton b6 = new JButton("세계");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=104"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b6.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b6.setBackground(new Color(152, 251, 152));
		b6.setBounds(217, 349, 87, 78);
		f.getContentPane().add(b6);
		
		JButton b7 = new JButton("IT/과학");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ttitle = t1.getText();
					Connection con = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LSD&mid=sec&sid1=105"); //
					Document doc = con.get();
					
					Elements title = doc.select("dl dt a");
					
					FileWriter file = new FileWriter(ttitle+".txt"); //저장을 위한 객체 생성
					
					//for문을 통해 추출에 필요한 html 소스중 필요 요소 사이즈 만큼 반복
					for (int i = 0; i < title.size(); i++) {
					String title1 = title.get(i).text(); // title1에 크롤링한 요소 넣기
					System.out.println(title1); //확인
					file.write(i +":" + title1 + "\n"); //저장파일에 작성하기
					}
					JOptionPane.showMessageDialog(f, "크롤링을 수행하였습니다.");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b7.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b7.setBackground(new Color(152, 251, 152));
		b7.setBounds(316, 349, 140, 78);
		f.getContentPane().add(b7);
		
		f.setVisible(true);
		
	}
}
