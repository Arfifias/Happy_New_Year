import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frameeeee extends JFrame implements ActionListener {


    public ImageIcon icon;

    public JButton show;

    public JButton hide;
    public JButton image_show;
    public JLabel label;
    public JLabel image;
    public JLabel happy;
    public JLabel best;
    public JPanel panel;

    Frameeeee(){

        icon = new ImageIcon("C:\\Users\\STAGKOSARISTEIDIS\\IdeaProjects\\Testing\\Image\\2024.png");

        happy = new JLabel("Happy New Year");
        happy.setFont(new Font("Comic Sans",Font.PLAIN,50));
        happy.setBackground(new Color(100,70,200));
        happy.setForeground(new Color(0,0,0));
        happy.setBounds(500,300,600,100);
        happy.setOpaque(true);
        happy.setVisible(false);

        best = new JLabel("And Achieve Your Targets");
        best.setFont(new Font("Comic Sans",Font.PLAIN,50));
        best.setBackground(new Color(100,70,200));
        best.setForeground(new Color(0,0,0));
        best.setBounds(500,500,600,100);
        best.setOpaque(true);
        best.setVisible(false);

        show = new JButton("Show");
        show.setFont(new Font("Comic Sans",Font.PLAIN,20));
        show.setBounds(300,800,250,100);
        show.setForeground(new Color(0,0,0));
        show.setBackground(new Color(100,70,200));
        show.setFocusable(false);
        show.addActionListener(this);

        hide = new JButton("Hide");
        hide.setBounds(700,800,250,100);
        hide.setFont(new Font("Comic Sans",Font.PLAIN,20));
        hide.setForeground(new Color(0,0,0));
        hide.setBackground(new Color(100,70,200));
        hide.setFocusable(false);
        hide.addActionListener(this);

        image_show = new JButton("Show 2024");
        image_show.setBounds(1100,800,250,100);
        image_show.setFont(new Font("Comic Sans",Font.PLAIN,20));
        image_show.setForeground(new Color(0,0,0));
        image_show.setBackground(new Color(100,70,200));
        image_show.setFocusable(false);
        image_show.addActionListener(this);

        label = new JLabel("Happy New Year");
        label.setFont(new Font("Comic Sans",Font.PLAIN,60));
        label.setForeground(new Color(0,0,0));

        image = new JLabel();
        image.setIcon(icon);
        image.setBounds(200,200,1200,500);
        image.setVisible(false);

        panel = new JPanel();
        panel.setBackground(new Color(100,70,200));
        panel.setBounds(0,0,1600,100);
        panel.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,400,1600,1000);
        this.getContentPane().setBackground(new Color(0,0,0));
        this.setLayout(null);
        this.setTitle("Happy New Year");
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.add(happy);
        this.add(best);
        this.add(show);
        this.add(hide);
        this.add(image_show);
        this.add(panel);
        this.add(image);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == show){
            happy.setVisible(true);
            best.setVisible(true);
        }else if(e.getSource() == hide){
            happy.setVisible(false);
            best.setVisible(false);
            image.setVisible(false);
        }else if (e.getSource() == image_show) {
            image.setVisible(true);
        }else {
            System.out.println("Error has occurred!!!!");
        }
    }
}
