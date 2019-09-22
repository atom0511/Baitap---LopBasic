package laplanh;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static laplanh.GameScreen.countEnd;

public class FrameScreen extends JFrame  {

    GameScreen gameScreen;
    public static final int row = 4;
    public static final int column = 4;
    public static int elements = row * column / 2 + 1;
    public static Icon[][] arr = new Icon[row][column];
    public static Icon[] arr1 = imageRandom();
    public static Icon hoicham = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\hoicham.jpg");

    public FrameScreen() {
        gameScreen = new GameScreen();
        add(gameScreen);
        creatAndShow();
        
    }

    public static Icon[] imageRandom() {
        Icon[] arrIM = new Icon[8];
        arrIM[0] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog1.jpg");
        arrIM[1] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog2.jpg");
        arrIM[2] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog3.jpg");
        arrIM[3] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog4.jpg");
        arrIM[4] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog5.jpg");
        arrIM[5] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog6.jpg");
        arrIM[6] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog7.jpg");
        arrIM[7] = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LapLanh\\image\\dog8.jpg");
        return arrIM;
    }

    static Icon[][] arrayRandom() {
        Icon[][] arrRd = new Icon[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrRd[i][j] = hoicham;
            }
        }
        Random rd = new Random();
        int num = 1;
        
        boolean flag = true;
        while(flag){
            int m = rd.nextInt(row);
            int n = rd.nextInt(column);
            if (arrRd[m][n] == hoicham) {
                arrRd[m][n] = arr1[num-1];
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
                flag = false;
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
        arr1 = imageRandom();
        Sound sound = new Sound();
       
        
    }

}
