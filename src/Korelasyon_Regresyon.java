
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;


public class Korelasyon_Regresyon extends javax.swing.JFrame {
        ArrayList<Integer>dep_var_list=new ArrayList<Integer>();//double tipinde list olusturmak
        ArrayList<Integer>first_indep_var=new ArrayList<Integer>();
        ArrayList<Integer>second_indep_var=new ArrayList<Integer>();
        ArrayList<Integer>edu_dep_var=new ArrayList<Integer>();//double tipinde list olusturmak
        ArrayList<Integer>first_edu_indep_var=new ArrayList<Integer>();
        ArrayList<Integer>second_edu_indep_var=new ArrayList<Integer>();
        ArrayList<Integer>selectedRow=new ArrayList<Integer>();
        DefaultTableModel myTable;
        double total=0;
        Random rand=new Random();
    public Korelasyon_Regresyon() {
        initComponents();
       double min = 1;
       double max = 1000;
        
        btn_add.setBackground(Color.BLUE);
        btn_delete.setBackground(Color.red);
        for(int i=0;i<100;i++)
        {
            jTable1.setValueAt(i+1, i, 0);
            jTable1.setValueAt(rand.nextInt(100), i, 1);
            jTable1.setValueAt(rand.nextInt(100), i, 2);
            jTable1.setValueAt(rand.nextInt(100), i, 3);
        } 
        GetArrayList();
    }
   private void GetArrayList()
   {    
       dep_var_list.clear();
       edu_dep_var.clear();
       first_indep_var.clear();
       first_edu_indep_var.clear();
       second_indep_var.clear();
       second_edu_indep_var.clear();
       selectedRow.clear();
       myTable=(DefaultTableModel)jTable1.getModel();
       int rowCount=myTable.getRowCount();
    
       for(int i=0;i<rowCount;i++)
       {
           myTable.setValueAt(i+1, i,0);
       }
       int percent70=rowCount*70/100;
      
      
       for(int i=0;i<rowCount;i++)
       {
           dep_var_list.add((Integer) myTable.getValueAt(i,3));
           first_indep_var.add((Integer) myTable.getValueAt(i,1));
           second_indep_var.add((Integer) myTable.getValueAt(i,2));
       }
       
       
       
       for(int i=0;i<percent70;i++)
       {
           boolean control;
            int whichRow;
          
          do{
             whichRow=rand.nextInt(rowCount);
             control=SimilarityCheck(whichRow);
          }while(control==false);
          
           selectedRow.add(whichRow);
           edu_dep_var.add(dep_var_list.get(whichRow));
           first_edu_indep_var.add(first_indep_var.get(whichRow));
           second_edu_indep_var.add(second_indep_var.get(whichRow));
       }
       
   }
    private boolean SimilarityCheck(int number)
    {
        for(int i=0;i<selectedRow.size();i++)
        {
            if(selectedRow.get(i).equals(number))
                return false;
        }
        return true;
    }
    private double Arithmetic_Mean(ArrayList<Integer> list)
    {   int i;
        total=0;
        for( i=0;i<list.size();i++)
        {
            total+=list.get(i);
        }
       
        return total/i;
    }
    
    private double Total(ArrayList<Integer>list)
    {
        total=0;
        for(int i=0;i<list.size();i++)
        {
            total+=list.get(i);
        }
        return total;
    }
    private double SumofSquares(ArrayList<Integer>list)
    {
        total=0;
        for(int i=0;i<list.size();i++)
        {
            total+=Math.pow(list.get(i),2);
        }
        return total;
    }
    private double SumofTheProductofTwoVar(ArrayList<Integer>dep_list,ArrayList<Integer>indep_list)
    {
         total=0;
         for(int i=0;i<dep_list.size();i++)
         {
             total+=dep_list.get(i)*indep_list.get(i);
         }
         return total;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_dialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_x1 = new javax.swing.JTextField();
        txt_x2 = new javax.swing.JTextField();
        txt_y = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        delete_dialog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        txt_delete = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_kor = new javax.swing.JButton();
        btn_reg = new javax.swing.JButton();
        btn_sse = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        add_dialog.setTitle("Add Data");
        add_dialog.setBounds(new java.awt.Rectangle(200, 200, 300, 250));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("x1:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("x2:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("y:");

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_dialogLayout = new javax.swing.GroupLayout(add_dialog.getContentPane());
        add_dialog.getContentPane().setLayout(add_dialogLayout);
        add_dialogLayout.setHorizontalGroup(
            add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_dialogLayout.createSequentialGroup()
                .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_dialogLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_x1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txt_x2)
                            .addComponent(txt_y)))
                    .addGroup(add_dialogLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        add_dialogLayout.setVerticalGroup(
            add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_dialogLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(add_dialogLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_x1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_x2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_y))
                .addGap(18, 18, 18)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        delete_dialog.setTitle("Delete Data");
        delete_dialog.setBounds(new java.awt.Rectangle(200, 200, 300, 250));

        jLabel4.setText("Silmek istediginiz satiri giriniz:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_dialogLayout = new javax.swing.GroupLayout(delete_dialog.getContentPane());
        delete_dialog.getContentPane().setLayout(delete_dialogLayout);
        delete_dialogLayout.setHorizontalGroup(
            delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_dialogLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(delete_dialogLayout.createSequentialGroup()
                .addGroup(delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_dialogLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(txt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_dialogLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_dialogLayout.setVerticalGroup(
            delete_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_dialogLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Correlation_Regression");
        setBackground(new java.awt.Color(255, 204, 204));
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Row", "1.Indepen_Var", "2.Indepen_Var", "Dep_Var", "          Ý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_kor.setText("Correlation");
        btn_kor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_korActionPerformed(evt);
            }
        });

        btn_reg.setText("Regression");
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        btn_sse.setText("SSE");
        btn_sse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sseActionPerformed(evt);
            }
        });

        btn_add.setText("Add Data");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete Data");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_kor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double Correlation(ArrayList<Integer>indep_var,ArrayList<Integer>dep_var)
    {
        int size=indep_var.size();
        double a=SumofTheProductofTwoVar(dep_var, indep_var)-size*Arithmetic_Mean(dep_var)*Arithmetic_Mean(indep_var);
        //System.out.println("a:"+a);
        double b=SumofSquares(indep_var)-size*Math.pow(Arithmetic_Mean(indep_var),2);
        //System.out.println("b:"+b);

        double c=SumofSquares(dep_var)-size*Math.pow(Arithmetic_Mean(dep_var),2);
        //System.out.println("c:"+c);
        double d=Math.sqrt(b*c);
        return a/d;
    }
    private void Regression(ArrayList<Integer>indep_var,ArrayList<Integer>dep_var)
    {
        int size=indep_var.size();
        double x=size*SumofTheProductofTwoVar(dep_var, indep_var)-Total(dep_var)*Total(indep_var);
        double y=size*SumofSquares(indep_var)-Math.pow(Total(indep_var), 2);
        double b=x/y;
        //*******************
        double a=Arithmetic_Mean(dep_var)-b*Arithmetic_Mean(indep_var);
      
        jTextArea1.append("\nY="+String.format("%,.5f", a)+"+("+String.format("%,.5f",b)+")x");
        for(int i=0;i<size;i++)
        {
            double result=a+b*indep_var.get(i);
 
            myTable.setValueAt(result,selectedRow.get(i),4);
        }
    }
    private void btn_korActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_korActionPerformed
        jTextArea1.setText("r1=Cor(x1,y)="+String.format("%,.3f", Correlation(first_edu_indep_var, edu_dep_var)));
        jTextArea1.append("\nr2=Cor(x2,y)="+String.format("%,.3f", Correlation(second_edu_indep_var, edu_dep_var)));
        
    }//GEN-LAST:event_btn_korActionPerformed

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        if(Correlation(first_edu_indep_var, edu_dep_var)>Correlation(second_edu_indep_var, edu_dep_var))
        {
            Regression(first_edu_indep_var, edu_dep_var);
        }
        else
        {
            Regression(second_edu_indep_var, edu_dep_var);
        }
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_sseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sseActionPerformed
        double result=0;
        for(int i=0;i<edu_dep_var.size();i++)
        {
            result+=Math.pow(edu_dep_var.get(i)-(double)myTable.getValueAt(selectedRow.get(i),4),2);   
        }
        jTextArea1.append("\nSSE="+String.format("%,.3f",result));
    }//GEN-LAST:event_btn_sseActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        jTextArea1.setText(" ");
         for(int i=0;i<myTable.getRowCount();i++)
        {
            myTable.setValueAt(null, i,4);
        }
        add_dialog.setVisible(true);     
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        jTextArea1.setText(" ");
         for(int i=0;i<myTable.getRowCount();i++)
        {
            myTable.setValueAt(null, i,4);
        }
        delete_dialog.setVisible(true);
    }//GEN-LAST:event_btn_deleteActionPerformed
    int deleteRow;
    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
       
        Integer []data=new Integer[5];//yeni girilen degerleri alip tabloya eklemek icin tutucu dizi
        data[0]=(Integer)myTable.getRowCount()+1;
        data[1]=Integer.valueOf(txt_x1.getText());
        data[2]=Integer.valueOf(txt_x2.getText());
        data[3]=Integer.valueOf(txt_y.getText());
        data[4]=null;
    
        myTable.addRow(data);
        GetArrayList();
        add_dialog.setVisible(false);
    }//GEN-LAST:event_btn_okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deleteRow=Integer.parseInt(txt_delete.getText());
        myTable.removeRow(deleteRow);
        GetArrayList();
        delete_dialog.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Korelasyon_Regresyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Korelasyon_Regresyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog add_dialog;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_kor;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_reg;
    private javax.swing.JButton btn_sse;
    private javax.swing.JDialog delete_dialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_delete;
    private javax.swing.JTextField txt_x1;
    private javax.swing.JTextField txt_x2;
    private javax.swing.JTextField txt_y;
    // End of variables declaration//GEN-END:variables
}
