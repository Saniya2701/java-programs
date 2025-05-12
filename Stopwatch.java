import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame implements ActionListener {
    JLabel timeLabel;
    JButton startButton, stopButton, resetButton;
    int seconds = 0;
    boolean running = false;
    Thread thread;

    public Stopwatch() {
        timeLabel = new JLabel("Time: 0 s", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        add(timeLabel, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton && !running) {
            running = true;
            thread = new Thread(() -> {
                while (running) {
                    seconds++;
                    timeLabel.setText("Time: " + seconds + " s");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {}
                }
            });
            thread.start();
        }

        if (e.getSource() == stopButton) {
            running = false;
        }

        if (e.getSource() == resetButton) {
            running = false;
            seconds = 0;
            timeLabel.setText("Time: 0 s");
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}

