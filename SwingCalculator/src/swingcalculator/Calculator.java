/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcalculator;

/**
 *
 * @author tharun
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        button1 = new javax.swing.JButton();
        buttonSubtract = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        labelResult = new javax.swing.JLabel();
        buttonEqual = new javax.swing.JButton();
        buttonMultiply = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button1.setText("1");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        buttonSubtract.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        buttonSubtract.setText("-");
        buttonSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubtractMouseClicked(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        buttonAdd.setText("+");
        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddMouseClicked(evt);
            }
        });
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button2.setText("2");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button5.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button5.setText("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        button8.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button8.setText("8");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
        });

        button3.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button3.setText("3");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        button7.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button7.setText("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });

        button4.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button4.setText("4");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        button0.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button0.setText("0");
        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button0MouseClicked(evt);
            }
        });
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button9.setText("9");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button9MouseClicked(evt);
            }
        });

        button6.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        button6.setText("6");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
        });

        labelResult.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N

        buttonEqual.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        buttonEqual.setText("=");
        buttonEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEqualMouseClicked(evt);
            }
        });

        buttonMultiply.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        buttonMultiply.setText("*");
        buttonMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMultiplyMouseClicked(evt);
            }
        });

        buttonDivide.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        buttonDivide.setText("/");
        buttonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDivideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button2)
                            .addComponent(button8)
                            .addComponent(button5))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button0, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDivide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelResult)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(buttonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSubtract)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(button9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7)
                            .addComponent(button6)
                            .addComponent(button8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0)
                            .addComponent(button1)
                            .addComponent(button2))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button0ActionPerformed

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "2";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "3";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "4";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "5";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "6";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button6MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "7";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button7MouseClicked

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "8";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button8MouseClicked

    private void button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "9";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button9MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "1";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button1MouseClicked

    private void button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MouseClicked
        // TODO add your handling code here:
        String newvalue = labelResult.getText() + "0";
        labelResult.setText(newvalue);
    }//GEN-LAST:event_button0MouseClicked

    private void buttonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddMouseClicked
        // TODO add your handling code here:
        operator = "+";
        num1 = Integer.parseInt(labelResult.getText());
        labelResult.setText("");
    }//GEN-LAST:event_buttonAddMouseClicked

    private void buttonEqualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEqualMouseClicked
        // TODO add your handling code here:
        num2 = Integer.parseInt(labelResult.getText());
        
        if(operator == "+")
        {
            int result = num1 + num2;
            String str = Integer.toString(result);
            labelResult.setText(str);
        }
        else if(operator == "-")
        {
            int result = num1 - num2;
            String str = Integer.toString(result);
            labelResult.setText(str);
        }
        else if(operator == "*")
        {
            int result = num1 * num2;
            String str = Integer.toString(result);
            labelResult.setText(str);
        } 
        else if(operator == "/")
        {
            int result = num1 / num2;
            String str = Integer.toString(result);
            labelResult.setText(str);
        }
    }//GEN-LAST:event_buttonEqualMouseClicked

    private void buttonSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSubtractMouseClicked
        // TODO add your handling code here:
        operator = "-";
        num1 = Integer.parseInt(labelResult.getText());
        labelResult.setText("");
    }//GEN-LAST:event_buttonSubtractMouseClicked

    private void buttonMultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMultiplyMouseClicked
        // TODO add your handling code here:
        operator = "*";
        num1 = Integer.parseInt(labelResult.getText());
        labelResult.setText("");
        
    }//GEN-LAST:event_buttonMultiplyMouseClicked

    private void buttonDivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDivideMouseClicked
        // TODO add your handling code here:
        operator = "/";
        num1 = Integer.parseInt(labelResult.getText());
        labelResult.setText("");
        
    }//GEN-LAST:event_buttonDivideMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    
    int num1;
    int num2;
    String operator;
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonMultiply;
    private javax.swing.JButton buttonSubtract;
    private javax.swing.JLabel labelResult;
    // End of variables declaration//GEN-END:variables
}
