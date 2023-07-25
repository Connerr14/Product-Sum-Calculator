/*
Created by Conner Recoskie
Sunday Feb 26, 2023
This program takes a number from the user, calculates and returns the sum of 1 
to the #, and the factorial of the # inputted. If a negative number or data type
is entered, the program will output an error message letting the user know. 
*/
public class FrmSumProduct extends javax.swing.JFrame {
    
    public FrmSumProduct() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInstructions3 = new javax.swing.JLabel();
        txtPositiveNumber = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        lblSum = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();
        lblNumberOutput = new javax.swing.JLabel();
        lblSumOutput = new javax.swing.JLabel();
        lblProductOutput = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblOddNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblTitle.setText("Sum and Product");

        lblInstructions3.setText("Please enter a positve number:");

        lblNumber.setText("Number:");

        lblSum.setText("Sum:");

        lblProduct.setText("Product:");

        lblInstructions1.setText("Enter a number to get the sum of 1 to the #");

        lblInstructions2.setText("entered, and the factorial of the # entered.");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblOddNumber.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumber)
                                    .addComponent(lblSum)
                                    .addComponent(lblProduct))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSumOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNumberOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProductOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOddNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInstructions3)
                                .addGap(12, 12, 12)
                                .addComponent(txtPositiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalculate)
                            .addComponent(lblInstructions1)
                            .addComponent(lblInstructions2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions3)
                    .addComponent(txtPositiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumberOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSumOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblOddNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(lblProductOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed

        // Initialize variables to hold the input number, sum of the numbers, and product of the numbers
        int positiveNumber = 0;
        int sum = 0;
        long product = 1;
        
        // Declaring a boolean variable that will be used in error checking
        boolean errorCheck = false;
        
        // Attempt to parse the input from a text field as an integer
        try
        {
            positiveNumber = Integer.parseInt(txtPositiveNumber.getText());
            errorCheck = true;
        }
        // Catch the exception if input cannot be parsed as an integer
        catch (NumberFormatException e)
        {
            // Display an error message in a label
            lblOddNumber.setText("Invalid Input detected!");
        }
        
        if (errorCheck)
        {
            // If input is positive
            if (positiveNumber > 0)
            {
                // Display the input number on it's respective label on the GUI
                lblNumberOutput.setText(String.valueOf(positiveNumber));

                // Calculate the sum and product using a loop
                for (int i = 1; i <= positiveNumber; i++)
                {
                    sum += i;
                    product *= i;
                }

                // Display the sum and product in their respective labels
                lblSumOutput.setText(String.valueOf(sum));
                lblProductOutput.setText(String.valueOf(product));
                lblOddNumber.setText(" ");
            }
            // If input is not positive
            else
            {
                // Display an error message to a label on the GUI
                lblOddNumber.setText("Please input a positive number");

                // Display "N/A" in the number, sum, and product labels
                lblNumberOutput.setText("N/A");
                lblSumOutput.setText("N/A");
                lblProductOutput.setText("N/A");
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

   
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
            java.util.logging.Logger.getLogger(FrmSumProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSumProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSumProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSumProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSumProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblInstructions3;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblNumberOutput;
    private javax.swing.JLabel lblOddNumber;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProductOutput;
    private javax.swing.JLabel lblSum;
    private javax.swing.JLabel lblSumOutput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtPositiveNumber;
    // End of variables declaration//GEN-END:variables
}
