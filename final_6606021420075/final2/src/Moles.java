import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Moles extends JFrame implements MouseListener, ActionListener{
    private JLabel xLabel, yLabel ,idLabel, debugLabel;
    private JTextField xField, yField, idField, debugField;
    private JButton randButton, startButton, stopButton;
    private JLabel hoLabel[] = new JLabel[16];
    private Timer time;

    private int hole_id;
    private int score;
    private int moles[] = new int[3];;

    public Moles(){
        super("GUI");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        xLabel = new JLabel("X = ");
        c.add(xLabel);
        xField = new JTextField(4);
        xField.setEditable(false);
        c.add(xField);
        yLabel = new JLabel("Y = ");
        c.add(yLabel);
        yField = new JTextField(4);
        yField.setEditable(false);
        c.add(yField);
        idLabel = new JLabel("ID ");
        c.add(idLabel);
        idField = new JTextField(2);
        idField.setEditable(false);
        c.add(idField);
        randButton = new JButton("Random");
        c.add(randButton);
        startButton = new JButton("Start");
        c.add(startButton);
        stopButton = new JButton("Stop");
        c.add(stopButton);
        
        for(int loop = 15;hole_id <= loop;hole_id++){
            hoLabel[hole_id] = new JLabel(hole_id+"",SwingConstants.CENTER);
            hoLabel[hole_id].setPreferredSize(new Dimension(100, 100));
            hoLabel[hole_id].setOpaque(true);
            hoLabel[hole_id].setBackground(Color.RED);
            c.add(hoLabel[hole_id]);
        }
        
        debugLabel = new JLabel("Debug information");
        c.add(debugLabel);
        debugField = new JTextField(20);
        debugField.setEditable(false);
        c.add(debugField);
        
    }

    public void paint(Graphics g){
        super.paint(g);
    }

    public void Moles_move(){

    }

    public void Moles_clear(){

    }

    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == randButton){
            Moles_move();
        }
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Moles moles = new Moles();
        moles.setSize(480, 550);
        moles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        moles.setVisible(true);

    }

    
}