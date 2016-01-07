import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskGUI extends javax.swing.JFrame 
{
    ArrayList list;
    ListIterator <Task> it;
    int curtask, tottask;
    Task t;
    
    public TaskGUI() 
    {
        initComponents();
        
        list = new ArrayList();
        it = list.listIterator();
        
        curtask = 0; 
        tottask = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        txtcur = new javax.swing.JTextField();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuall = new javax.swing.JCheckBoxMenuItem();
        mnuexit = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JCheckBoxMenuItem();
        mnuremove = new javax.swing.JCheckBoxMenuItem();
        mnurestore = new javax.swing.JCheckBoxMenuItem();
        mnuclear = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JCheckBoxMenuItem();
        mnuafter = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Description:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Current Task: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Tasks:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txttot, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtcur, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        btnfirst.setText("<<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">>");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        mnuall.setSelected(true);
        mnuall.setText("Show All Tasks");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu1.add(mnuall);

        mnuexit.setSelected(true);
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setSelected(true);
        mnureplace.setText("Replace This As Current Task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnuremove.setSelected(true);
        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setSelected(true);
        mnurestore.setText("Restore Current Task to Screen");
        jMenu2.add(mnurestore);

        mnuclear.setSelected(true);
        mnuclear.setText("Clear Screen");
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setSelected(true);
        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnubefore);

        mnuafter.setSelected(true);
        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnfirst)
                .addGap(39, 39, 39)
                .addComponent(btnprev)
                .addGap(43, 43, 43)
                .addComponent(btnnext)
                .addGap(39, 39, 39)
                .addComponent(btnlast)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        String nm = txtname.getText();
        String d = txtinfo.getText();
        
        t = new Task(nm, d);
        
        if(t.validate() == false)
        {
            JOptionPane.showMessageDialog(this, "ERROR - Must enter in all information");
            return;
        }
        
        if(tottask > 0) it.next();
        
        it.add(t);
        it.previous();
        
        curtask ++;
        tottask ++;
        
        txtcur.setText("" + curtask);
        txttot.setText("" + tottask);
        
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnuafterActionPerformed

    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
//        String nm = txtname.getText();
//        String d = txtinfo.getText();
//        
//        if(t.validate() == false)
//        {
//            JOptionPane.showMessageDialog(this, "ERROR - Must enter in all information");
//            return;
//        }
//        
//        it.add(t);
//        it.previous();
//        
//        if(tottask == 0) curtask = 1;
//        tottask ++;
//        
//        txtcur.setText("" + curtask);
//        txttot.setText("" + tottask);
//        
//        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnubeforeActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(curtask == tottask) return;
        
        curtask ++;
        txtcur.setText("" + curtask);
        
        it.next();
        it.next();
        
        t = it.previous();
        
        txtname.setText(t.getName());
        txtinfo.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        if(curtask == 1) return;
        
        curtask --;
        txtcur.setText("" + curtask);
        
        it.previous();

        t = it.next();
        
        it.previous();
        
        txtname.setText(t.getName());
        txtinfo.setText(t.getDescription());
        
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if(curtask == tottask) return;
        
        while(it.hasNext()) 
            it.next();
        
        t = it.previous();
        
        curtask = tottask;
        
        txtcur.setText("" + curtask);
        
        txtname.setText(t.getName());
        txtinfo.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
        if(tottask == 0) 
        {
            JOptionPane.showMessageDialog(this, "ERROR - No task to replace");
            return;
        }
        
        String nm = txtname.getText();
        String d = txtinfo.getText();
        t = new Task(nm, d);
        
        if(t.validate() == false)
        {
            JOptionPane.showMessageDialog(this, "ERROR - Must enter in all information");
            return;
        }
        
        it.next();
        it.set(t);
        it.previous();
    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        if(tottask == 0) return;
        
        it.next();
        it.remove();
        
        tottask --;
        txttot.setText("" + tottask);
        
        if(tottask == 0)
        {
            txtname.setText("");
            txtinfo.setText("");
            
            curtask = 0;
            txtcur.setText("n/a");
            
            return;
        }
        
        else if(curtask > 1)
        {
            t = it.previous();
            
            curtask --;
            txtcur.setText("" + curtask);
        }
        
        else
        {
            it.next();
            
            t = it.previous();
        }
        
        txtname.setText(t.getName());
        txtinfo.setText(t.getDescription());
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        String result = "";
        
        for(int x = 0; x < list.size(); x ++)
        {
            t = (Task)list.get(x);
            result += "TASK " + (x + 1) + ":\n" + t.toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnuallActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if(curtask == 1) return;
        
        while(it.hasPrevious()) 
            it.previous();
        
        t = it.next();
        
        curtask = 1;
        
        txtcur.setText("" + curtask);
        
        txtname.setText(t.getName());
        txtinfo.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TaskGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBoxMenuItem mnuafter;
    private javax.swing.JCheckBoxMenuItem mnuall;
    private javax.swing.JCheckBoxMenuItem mnubefore;
    private javax.swing.JCheckBoxMenuItem mnuclear;
    private javax.swing.JCheckBoxMenuItem mnuexit;
    private javax.swing.JCheckBoxMenuItem mnuremove;
    private javax.swing.JCheckBoxMenuItem mnureplace;
    private javax.swing.JCheckBoxMenuItem mnurestore;
    private javax.swing.JTextField txtcur;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
