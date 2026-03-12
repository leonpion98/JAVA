import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab8 extends JFrame implements ActionListener {

    String graphType = "";

    // Кнопки с номерами заданий
    Button b1 = new Button("1. y = kx");
    Button b2 = new Button("2. y = 3x^2");
    Button b3 = new Button("3. y = -x^2 + x^3");
    Button b4 = new Button("4. y = x^3 + x^2 + x");
    Button b5 = new Button("5. y = x^5");
    Button b6 = new Button("6. y = sin x");
    Button b7 = new Button("7. y = cos(x-1)+x");

    lab8() {
        setTitle("Лабораторная работа 8");
        setSize(700, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Расставляем кнопки
        b1.setBounds(10, 50, 150, 30);
        b2.setBounds(10, 90, 150, 30);
        b3.setBounds(10, 130, 150, 30);
        b4.setBounds(10, 170, 150, 30);
        b5.setBounds(10, 210, 150, 30);
        b6.setBounds(10, 250, 150, 30);
        b7.setBounds(10, 290, 150, 30);

        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) graphType="1";
        if(e.getSource()==b2) graphType="2";
        if(e.getSource()==b3) graphType="3";
        if(e.getSource()==b4) graphType="4";
        if(e.getSource()==b5) graphType="5";
        if(e.getSource()==b6) graphType="6";
        if(e.getSource()==b7) graphType="7";
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        int centerX = 400; // Центр по горизонтали
        int centerY = 300; // Центр по вертикали

        // Рисуем сетку
        g.setColor(Color.LIGHT_GRAY);
        for(int i=0; i<700; i+=20) {
            g.drawLine(i, 0, i, 600);
            g.drawLine(0, i, 700, i);
        }

        // Рисуем оси X и Y
        g.setColor(Color.BLACK);
        g.drawLine(160, centerY, 700, centerY);
        g.drawLine(centerX, 0, centerX, 600);

        g.setColor(Color.BLUE); // Цвет графика

        // Отрисовка по условиям
        if(graphType.equals("1")) {
            for(double k=0.1; k<=1.0; k+=0.1) {
                for(int i=-200; i<200; i++) {
                    double x1 = i/20.0, x2 = (i+1)/20.0;
                    g.drawLine(centerX+i, centerY-(int)(k*x1*40), centerX+i+1, centerY-(int)(k*x2*40));
                }
            }
        }

        if(graphType.equals("2")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/20.0, x2 = (i+1)/20.0;
                int y1 = (int)(3*x1*x1 * 20);
                int y2 = (int)(3*x2*x2 * 20);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }

        if(graphType.equals("3")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/20.0, x2 = (i+1)/20.0;
                int y1 = (int)((-x1*x1 + x1*x1*x1) * 20);
                int y2 = (int)((-x2*x2 + x2*x2*x2) * 20);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }

        if(graphType.equals("4")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/20.0, x2 = (i+1)/20.0;
                int y1 = (int)((Math.pow(x1,3) + x1*x1 + x1) * 10);
                int y2 = (int)((Math.pow(x2,3) + x2*x2 + x2) * 10);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }

        if(graphType.equals("5")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/40.0, x2 = (i+1)/40.0;
                int y1 = (int)(Math.pow(x1,5) * 200);
                int y2 = (int)(Math.pow(x2,5) * 200);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }

        if(graphType.equals("6")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/20.0, x2 = (i+1)/20.0;
                int y1 = (int)(Math.sin(x1) * 60);
                int y2 = (int)(Math.sin(x2) * 60);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }

        if(graphType.equals("7")) {
            for(int i=-200; i<200; i++) {
                double x1 = i/20.0, x2 = (i+1)/20.0;
                int y1 = (int)((Math.cos(x1-1) + x1) * 40);
                int y2 = (int)((Math.cos(x2-1) + x2) * 40);
                g.drawLine(centerX+i, centerY-y1, centerX+i+1, centerY-y2);
            }
        }
    }

    public static void main(String[] args) {
        new lab8(); // Запуск
    }
}
