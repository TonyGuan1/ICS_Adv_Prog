package ICS_Adv_Prog_master.AdvancedProgSkills.Question_4;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author Tonyg
 */
public class Question_4 extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public Question_4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(quitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        char x;
        int l;
        try {
            FileReader reader = new FileReader("\\\\ad.ocdsb.ca\\studenthome\\3\\S199817793\\NetBeansProjects\\JavaApplication1\\src\\ICS_Adv_Prog_master\\AdvancedProgSkills\\Question_4\\fullNames.txt");//Text for Reading
            String line;
            BufferedReader br = new BufferedReader(reader);

            FileWriter writer = new FileWriter("\\\\ad.ocdsb.ca\\studenthome\\3\\S199817793\\NetBeansProjects\\JavaApplication1\\src\\ICS_Adv_Prog_master\\AdvancedProgSkills\\Question_4\\initals.txt", true);//Text for writing
            BufferedWriter bw = new BufferedWriter(writer);
            while ((line = br.readLine()) != null) {
                l = line.length();
                for (int i = 0; i < l; i++) {
                    x = line.charAt(i); //taking out one character at a time from the sentence
                    if (x == ' ') //if the character is a space, printing the next Character along with a fullstop
                    {
                        bw.write(line.toUpperCase().charAt(i + 1));
                    }
                }
            }
            System.out.println("Done");
            reader.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error\nFile Not found");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {

        // Or we could just do this: 
        // ex.printStackTrace()
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question_4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton quitButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
