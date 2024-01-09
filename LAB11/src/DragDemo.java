import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class DragBallPanel extends JPanel {
    private int ballSize = 30;
    private int ballX = 100;
    private int ballY = 100;
    private boolean isDragging = false;
    private boolean autoMove = false;

    private Color getRandomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("(" + ballX + ", " + ballY + ")", 10, 20);

        g.setColor(getRandomColor());
        g.fillOval(ballX, ballY, ballSize, ballSize);
    }

    public DragBallPanel() {
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.getX() >= ballX && evt.getX() <= ballX + ballSize &&
                    evt.getY() >= ballY && evt.getY() <= ballY + ballSize) {
                    isDragging = true;
                }

                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
                    autoMove = !autoMove;
                    if (autoMove) {
                        autoMove();
                    }
                }

                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                    setForeground(getRandomColor());
                    repaint();
                }
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                isDragging = false;
            }
        });

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if (isDragging) {
                    ballX = evt.getX() - ballSize / 2;
                    ballY = evt.getY() - ballSize / 2;
                    repaint();
                }
            }
        });
    }

    private void autoMove() {
        new Thread(() -> {
            while (autoMove) {
                if (ballX <= 0 || ballX + ballSize >= getWidth()) {
                    ballX = Math.max(0, Math.min(ballX, getWidth() - ballSize));
                    repaint();
                }
                if (ballY <= 0 || ballY + ballSize >= getHeight()) {
                    ballY = Math.max(0, Math.min(ballY, getHeight() - ballSize));
                    repaint();
                }

                ballX += 5;
                ballY += 5;

                repaint();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

public class DragDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame();
            window.setTitle("Drag Demo");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setContentPane(new DragBallPanel());
            window.pack();
            window.setVisible(true);
        });
    }
}
