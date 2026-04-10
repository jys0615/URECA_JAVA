package ch21_swing.level2;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

/*
 * Layout : 컴포넌트 배치를 위한 디자인 가이드.
 * FlowLayout의 예.
 * FlowLayout : 흐르는대로(좌->우, 위->아래) 컴포넌트 배치.
 */
public class CalcView {

    private JFrame frm;
    private JPanel pan;
    private JTextField tf;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton btnCLs, btnEquals, btnPlus, btnMinus, btnMulti, btnDiv;
    private GridLayout grid;


    public CalcView() {
        frm = new JFrame("사칙연산기");
        pan = new JPanel();
        tf = new JTextField();
        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("1");
        btn8 = new JButton("2");
        btn9 = new JButton("3");
        btn0 = new JButton("0");
        btnCLs = new JButton("Cls"); btnEquals = new JButton("=");
        btnPlus = new JButton("+"); btnMinus = new JButton("-");
        btnMulti = new JButton("*"); btnDiv = new JButton("/");
        grid = new GridLayout(4, 4);
    }

    public void makeGui() {
        frm.setSize(500, 500);
        frm.setLayout(grid);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btnDiv);
        frm.add(btn4);
        frm.add(btn5);
        frm.add(btn6);
        frm.add(btnMulti);
        frm.add(btn7);
        frm.add(btn8);
        frm.add(btn9);
        frm.add(btnMinus);
        frm.add(btn0);
        frm.add(btnCLs);
        frm.add(btnEquals);
        frm.add(btnPlus);
        frm.setVisible(true);
    }

    public void addEvent() {
        // frm.addWindowListener(winEventProc);
    } // addEvent

    public static void main(String[] args) {
        CalcView test = new CalcView();
        test.makeGui();
        test.addEvent();
    } // main

} // class