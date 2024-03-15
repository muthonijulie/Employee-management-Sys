import javax.swing.*;
import java.io.File;

public class homepg {
    private JPanel panel;
    private JLabel EMPLOYEEMANAGEMENTSYSTEMLbel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EMPLOYEE MANAGEMENT SYSTEM");

        frame.setSize(740, 395);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        try {
            File imageFile = new File("C:\\Users\\Liz\\Desktop\\present\\2nd year\\2.3\\java prac\\Employee management system\\images\\WhatsApp Image 2024-03-15 at 10.35.15_cee3146d.jpg");

            // Check if the file exists
            if (imageFile.exists()) {
                // Create an ImageIcon from the file
                ImageIcon icon = new ImageIcon(imageFile.getAbsolutePath());
                JLabel label = new JLabel(icon);
                frame.add(label);
            } else {
                System.out.println("Image file not found.");
            }
        }

            catch (Exception e) {
                e.printStackTrace();
            }

            frame.setVisible(true);
        }
    }


