package laplanh;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameScreen extends JFrame {

    GameScreen gameScreen;
    public static final int row = 4;
    public static final int column = 4;
    public static int elements = row * column / 2 + 1;
    public static Icon[][] arr = new Icon[row][column];
    public static Icon[] arr1 = new Icon[column / 2];
    public static Icon hoicham = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\hoicham.jpg");

    public FrameScreen() {
        gameScreen = new GameScreen();
        add(gameScreen);
        creatAndShow();

    }

    public void imageRandom() {
        arr1[0] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[1] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[2] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[3] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[4] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[5] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[6] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
        arr1[7] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\image\\dog1.jpg");
    }

    static Icon[][] arrayRandom() {
        Icon[][] arrRd = new Icon[row][column];
        Random rd = new Random();
        int num = 1;
        for (int i = 0; i < 8; i++) {
            int m = rd.nextInt(row);
            int n = rd.nextInt(column);
            if (arrRd[m][n] == hoicham) {
                arrRd[m][n] = arr1[i];
                num++;
                if (num == elements) {
                    num = 1;
                }
            }

            int count = 0;
            for (int x = 0; x < row; x++) {
                for (int y = 0; y < column; y++) {
                    if (arrRd[x][y] == hoicham) {
                        count++;
                    }
                }
            }

            if (count == 0) {
                break;
            }
        }

        return arrRd;
    }

    public void creatAndShow() {
        setTitle("Atom");
        setSize(1200, 800);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameScreen();
        arr = arrayRandom();
    }

}
