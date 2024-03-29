package laplanh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javazoom.jl.player.Player;

import static laplanh.FrameScreen.column;
import static laplanh.FrameScreen.row;
import static laplanh.FrameScreen.arr;
import static laplanh.FrameScreen.hoicham;

public class GameScreen extends JPanel implements ActionListener, Runnable {

    public static int countY = 0;
    public static int countX = 0;
    public static int count3 = 0;
    public static int countEnd = 0;
    public static int x = 0;
    public static int x1, x2, y1, y2;
    public static int i1, j1, i2, j2;
    public static boolean result1;
    JButton button;
    JButton[][] jButton = new JButton[row][column];
    JLabel jLable, jLableEnd;
    Thread thread;

    public GameScreen() {
//        create02();
        createButton();
        createLable();

    }

    public void createButton() {
        for (int i = 0; i < row; i++) {
            x = i + countY;
            for (int j = 0; j < column; j++) {
                setLayout(null);
                //new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\hoicham.jpg")
                jButton[i][j] = new JButton();
                add(jButton[i][j]);
                jButton[i][j].setIcon(hoicham);
                jButton[i][j].setBackground(Color(51, 51, 51));
                jButton[i][j].setBounds(j + countX + 377, x + 150, 110, 110);
                jButton[i][j].setFont(new Font("Arial", Font.BOLD, 24));
                jButton[i][j].setActionCommand(Integer.toString(i) + "" + Integer.toString(j));
                jButton[i][j].addActionListener(this);
                countX += 112;
            }
            countY += 112;
            countX = 0;
        }
    }

    public void createLable() {
        jLable = new JLabel("Game A");
        jLableEnd = new JLabel("Victory");
        add(jLable);
        jLable.setBounds(468, 15, 300, 100);
        jLable.setFont(new Font("Arial", Font.BOLD, 70));
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((Integer.toString(i) + "" + Integer.toString(j)).equals(ae.getActionCommand())) {
                    jButton[i][j].setIcon(arr[i][j]);
                    jButton[i][j].setEnabled(false);

                    count3++;
                    if (count3 == 1) {
                        i1 = i;
                        j1 = j;
                    }
                    if (count3 == 2) {
                        i2 = i;
                        j2 = j;
                        result1 = check(arr[i1][j1], arr[i2][j2]);
                        thread = new Thread(this);
                        thread.start();
                    }
                    if (count3 == 3) {
                        result1 = check(arr[i1][j1], arr[i2][j2]);

                        if (result1 == false) {
//                            jButton[i1][j1].setEnabled(true);
//                            jButton[i2][j2].setEnabled(true);

                            jButton[i1][j1].setIcon(hoicham);
                            jButton[i2][j2].setIcon(hoicham);
                        } else {
//                            jButton[i1][j1].setEnabled(false);
//                            jButton[i2][j2].setEnabled(false);
                              jButton[i1][j1].setSize(0, 0);
                              jButton[i2][j2].setSize(0, 0);
                            countEnd++;
                            if (countEnd == 7) {
                                add(jLableEnd);
                                jLableEnd.setBounds(468, 620, 300, 100);
                                jLableEnd.setFont(new Font("Arial", Font.BOLD, 70));
                            }
                        }
                        i1 = i;
                        j1 = j;
                        count3 = 1;
                    }
                }
            }
        }
    }

    static boolean check(Icon a, Icon b) {
        boolean result;
        if (a == b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    private Color Color(int a1, int a2, int a3) {
        Color a = new Color(a1, a2, a3);
        return a;
    }

    @Override
    public void run() {
        if (result1 == false) {
            FileInputStream fis2;
            try {
                fis2 = new FileInputStream(
                        "C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\sounds\\wrog.mp3");
                Player wrong = new Player(fis2);
                wrong.play();
            } catch (Exception ex) {

            }
        } else if ( result1 == true) {
            FileInputStream fis3;
            try {
                fis3 = new FileInputStream(
                        "C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\sounds\\right.mp3");
                Player right = new Player(fis3);
                right.play();
            } catch (Exception ex) {

            }
        }else if ( countEnd == 7){
               FileInputStream fis3;
            try {
                fis3 = new FileInputStream(
                        "C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\sounds\\endBG.mp3");
                Player endBG = new Player(fis3);
                endBG.play();
                
            } catch (Exception ex) {

            }
        }

    }
}
