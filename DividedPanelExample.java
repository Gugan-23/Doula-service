package newpage1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;

class Choose extends JFrame {

    JPanel doula;
    static JPanel home,doulas,d1d,d2d,d3d,d4d,d5d,d6d,new1;
    static JPanel shoppanel,shop1,shop2,shop3,shop4,shop5;
    static JButton pro1,pro2,pro3,pro4,pro5;
    static JPanel shop,ab;
    static JPanel pp1,pp2,pp3,pp4,pp5;
    static JTextField search;
    static JButton doulabutton,sh1,sh2,sh3,sh4,sh5;
    static JButton dbutton,se,d1,d2,d3,d5,d6,b1,next,sh,d4,bb1,bb2,bb3,bb4,bb5,bb6;
    JButton userbutton;
    JButton back;
    static JLabel sh11,sh22,sh33,sh44,sh55;
    static JLabel d11d,d22d,d33d,d44d,d55d,d66d,sch1;
    static JLabel sd1,sd2,sd3,sd4,sd5;
    static JLabel d1dd,d2dd,d3dd,d4dd,d5dd,d6dd;
    static JButton aboutus,ba2,chatwithus,ba3;
    static JDatePicker datePicker,datePicker2,datePicker3,datePicker4,datePicker5,datePicker6;
    static JButton scheduleButton,scheduleButton2,scheduleButton3,scheduleButton4,scheduleButton5,scheduleButton6;
    static JButton Chat,cd1,cd2,cd3,cd4,cd5;
    
    
    Choose(JButton doulabutton, JButton userbutton) {
        this.doulabutton = doulabutton;
        this.userbutton = userbutton;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1350, 1200);
        setTitle("Healwave");
        
        shop= new JPanel(null);
        shop.setBackground(new Color(0xfffffff));
        

        ab= new JPanel(null);
        ab.setBackground(new Color(0xccfffff));

        doula = new JPanel(null);
        doula.setBackground(new Color(0xfffffff));

        home = new JPanel(null);
        home.setBackground(new Color(0xffffff));

        doulas = new JPanel(null);
        doulas.setBackground(new Color(0xffffff));

        dbutton = new JButton("Doula");
        dbutton.setFont(new Font("Arial", Font.BOLD, 18));
        dbutton.setBounds(100, 300, 250, 50);
        dbutton.setBorder(new LineBorder(Color.PINK)); 
        home.add(dbutton);
        
        new1= new JPanel(null);
        new1.setBackground(new Color(0xffffff));
        
        shoppanel=new JPanel(null);
        shoppanel.setBackground(new Color(0xffffff));
        //doula 
        //calender
        
        UtilDateModel model = new UtilDateModel();
        datePicker = new JDatePicker(model);
        
        
        scheduleButton = new JButton("Schedule");
        scheduleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        
        
        d1d = new JPanel(null);
        d1d.setBackground(new Color(0xffffff));
        
        datePicker.setBounds(700, 500, 300, 30);
        d1d.add(datePicker);
        
        scheduleButton.setBounds(1000, 500, 100, 30);
        d1d.add(scheduleButton);
        
        UtilDateModel model2 = new UtilDateModel();
        datePicker2 = new JDatePicker(model);
        
        
        scheduleButton2 = new JButton("Schedule");
        scheduleButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        
        d2d= new JPanel(null);
        d2d.setBackground(new Color(0xffffff));
        
        datePicker2.setBounds(700, 500, 300, 30);
        d2d.add(datePicker2);
        
        scheduleButton2.setBounds(1000, 500, 100, 30);
        d2d.add(scheduleButton2);
        
        UtilDateModel mode3 = new UtilDateModel();
        datePicker3 = new JDatePicker(mode3);
        
        
        scheduleButton3 = new JButton("Schedule");
        scheduleButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        d3d= new JPanel(null);
        d3d.setBackground(new Color(0xffffff));
        
        datePicker3.setBounds(700, 500, 300, 30);
        d3d.add(datePicker3);
        
        scheduleButton3.setBounds(1000, 500, 100, 30);
        d3d.add(scheduleButton3);
        
         UtilDateModel mode4 = new UtilDateModel();
        datePicker4 = new JDatePicker(mode3);
        
        
        scheduleButton4 = new JButton("Schedule");
        scheduleButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        d4d =new JPanel(null);
        d4d.setBackground(new Color(0xffffff));
        
        datePicker4.setBounds(700, 500, 300, 30);
        d4d.add(datePicker4);
        
        scheduleButton4.setBounds(1000, 500, 100, 30);
        d4d.add(scheduleButton4);
        
        UtilDateModel mode5 = new UtilDateModel();
        datePicker5 = new JDatePicker(mode5);
        
        
        scheduleButton5 = new JButton("Schedule");
        scheduleButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        d5d= new JPanel(null);
        d5d.setBackground(new Color(0xffffff));
        datePicker5.setBounds(700, 500, 300, 30);
        d5d.add(datePicker5);
        
        scheduleButton5.setBounds(1000, 500, 100, 30);
        d5d.add(scheduleButton5);
      
        UtilDateModel mode6 = new UtilDateModel();
        datePicker6 = new JDatePicker(mode6);
        
        
        scheduleButton6 = new JButton("Schedule");
        scheduleButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        });
        d6d= new JPanel(null);
        d6d.setBackground(new Color(0xffffff));
        datePicker6.setBounds(700, 500, 300, 30);
        d6d.add(datePicker6);
        
        scheduleButton6.setBounds(1000, 500, 100, 30);
        d6d.add(scheduleButton6);
      
        
        shop1= new JPanel(null);
        shop1.setBackground(new Color(0xffffff));
        
        shop2= new JPanel(null);
        shop2.setBackground(new Color(0xffffff));
        
        shop3= new JPanel(null);
        shop3.setBackground(new Color(0xffffff));
        
        shop4= new JPanel(null);
        shop4.setBackground(new Color(0xffffff));
        
        shop5=new JPanel(null);
        shop5.setBackground(new Color(0xffffff));
        
        //calender
        
        
        back = new JButton("Back");
        back.setBackground(Color.PINK);
        back.setBounds(690, 300, 250, 50);
        back.setBorder(new LineBorder(Color.PINK)); 
        home.add(back);
        
        
        
        
        doulabutton.setFont(new Font("Arial", Font.BOLD, 18));
        userbutton.setFont(new Font("Arial", Font.BOLD, 18));

        doulabutton.setBackground(Color.PINK);
        doulabutton.setBounds(400, 300, 250, 50);
        doula.add(doulabutton);

        userbutton.setBackground(Color.PINK);
        userbutton.setBounds(690, 300, 250, 50);
        doula.add(userbutton);
        
        // labels
        //shop products
        pp1=new JPanel(null);
        pp1.setBackground(new Color(0xffffff));
        
        pp2=new JPanel(null);
        pp2.setBackground(new Color(0xffffff));
        
        pp3=new JPanel(null);
        pp3.setBackground(new Color(0xffffff));
        
        pp4=new JPanel(null);
        pp4.setBackground(new Color(0xffffff));
        
        pp5=new JPanel(null);
        pp5.setBackground(new Color(0xffffff));
        
        //chat with doula
        
        cd1 = new JButton("Chat with me");
        cd1.setFont(new Font("Arial", Font.BOLD, 18));
        cd1.setBounds(500, 550, 250, 50);
        cd1.setBorder(new LineBorder(Color.PINK)); 
        d1d.add(cd1);
        
        
        cd2 = new JButton("Chat with me");
        cd2.setFont(new Font("Arial", Font.BOLD, 18));
        cd2.setBounds(500, 550, 250, 50);
        cd2.setBorder(new LineBorder(Color.PINK)); 
        d2d.add(cd2);
        
        
        cd3 = new JButton("Chat with me");
        cd3.setFont(new Font("Arial", Font.BOLD, 18));
        cd3.setBounds(500, 550, 250, 50);
        cd3.setBorder(new LineBorder(Color.PINK)); 
        d3d.add(cd3);
        
        cd4 = new JButton("Chat with me");
        cd4.setFont(new Font("Arial", Font.BOLD, 18));
        cd4.setBounds(500, 550, 250, 50);
        cd4.setBorder(new LineBorder(Color.PINK)); 
        d4d.add(cd4);
        
        cd5 = new JButton("Chat with me");
        cd5.setFont(new Font("Arial", Font.BOLD, 18));
        cd5.setBounds(500, 550, 250, 50);
        cd5.setBorder(new LineBorder(Color.PINK)); 
        d5d.add(cd5);
        
        //doula details
        
       
        
        //doula details
        
       
        //back buttons
        
        bb1=new JButton("Back");
        bb1.setFont(new Font("Arial", Font.BOLD, 30));
        bb1.setBounds(500, 500, 150, 50);
        d1d.add(bb1);
        
        bb2=new JButton("Back");
        bb2.setFont(new Font("Arial", Font.BOLD, 30));
        bb2.setBounds(500, 500, 150, 50);
        d2d.add(bb2);
        
        bb3=new JButton("Back");
        bb3.setFont(new Font("Arial", Font.BOLD, 30));
        bb3.setBounds(500, 500, 150, 50);
        d3d.add(bb3);
        
        bb4=new JButton("Back");
        bb4.setFont(new Font("Arial", Font.BOLD, 30));
        bb4.setBounds(500, 500, 150, 50);
        d4d.add(bb4);
        
        bb5=new JButton("Back");
        bb5.setFont(new Font("Arial", Font.BOLD, 30));
        bb5.setBounds(500, 500, 150, 50);
        d5d.add(bb5);
        
        bb6=new JButton("Back");
        bb6.setFont(new Font("Arial", Font.BOLD, 30));
        bb6.setBounds(500, 500, 150, 50);
        d6d.add(bb6);
        
        //back buttons
        
        //schedule
        
        
        //product
        
        /*sh11 =new JLabel("<html>Manju<p>The best doula in our</p> <p>website and she has many good reviews</p></html>");
        sh11.setFont(new Font("Arial", Font.BOLD, 30));
        sh11.setBounds(550, 100, 900, 150);
        s.add(sh11);
        */
        
        search = new JTextField(30);
        search.setBounds(350, 30, 500, 30);
        doulas.add(search);
        
        se = new JButton("search");
        se.setBackground(Color.RED);
        se.setBounds(850, 30, 200, 30);
        se.setBorder(new LineBorder(Color.RED)); 
        doulas.add(se);
        
        b1 = new JButton("Back");
        b1.setBackground(Color.PINK);
        b1.setBounds(700, 650, 250, 50);
        b1.setBorder(new LineBorder(Color.PINK)); 
        doulas.add(b1);
        
        next= new JButton(" Next ");
        next.setBackground(Color.PINK);
        next.setBounds(500, 650, 150, 50);
        next.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(next);
        
        d1 = new JButton("<html>Radhika<br>The best doula in our website and she has many good reviews</html>");
        d1.setBackground(new Color(0xfffffff));
        d1.setBounds(400, 150, 900, 70);
        d1.setBorder(new LineBorder(new Color(0xffffff))); 
        d1.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(d1);
        
        d2 = new JButton("<html>Radha mani<br>The best doula in our website and she has many good reviews</html>");
        d2.setBackground(new Color(0xfffffff));
        d2.setBounds(400, 250, 900, 70);
        d2.setBorder(new LineBorder(new Color(0xffffff))); 
        d2.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(d2);
        
        d3 = new JButton("<html>savithri<br>The best doula in our website and she has many good reviews</html>");
        d3.setBackground(new Color(0xfffffff));
        d3.setBounds(400, 350, 900, 70);
        d3.setBorder(new LineBorder(new Color(0xffffff))); 
        d3.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(d3);
        
        d4 = new JButton("<html>Aruna<br>The best doula in our website and she has many good reviews</html>");
        d4.setBackground(new Color(0xfffffff));
        d4.setBounds(400, 450, 900, 70);
        d4.setBorder(new LineBorder(new Color(0xffffff))); 
        d4.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(d4);
        
        d5 = new JButton("<html>Manju<br>The best doula in our website and she has many good reviews</html>");
        d5.setBackground(new Color(0xfffffff));
        d5.setBounds(400, 550, 900, 70);
        d5.setBorder(new LineBorder(new Color(0xffffff))); 
        d5.setFont(new Font("Arial", Font.BOLD, 18));
        doulas.add(d5);
        
        d6 = new JButton("<html>Kanamal<br>The best doula in our website and she has many good reviews</html>");
        d6.setBackground(new Color(0xfffffff));
        d6.setBounds(400, 100, 900, 70);
        d6.setBorder(new LineBorder(new Color(0xffffff))); 
        d6.setFont(new Font("Arial", Font.BOLD, 18));
        new1.add(d6);
        
        //doula end 
        
        //chat with us
        Chat= new JButton(" Chat with Doctor ");
        Chat.setBounds(100, 500, 250, 50); 
        Chat.setFont(new Font("Arial", Font.BOLD, 18));
        home.add(Chat);
        
        //about us
        
        
        aboutus =new JButton("About us");
        aboutus.setBounds(100, 400, 250, 50);
        aboutus.setFont(new Font("Arial", Font.BOLD, 18));
        home.add(aboutus);
        
        ba2=new JButton("Back");
        ba2.setBounds(600, 600, 250, 50);
        ba2.setFont(new Font("Arial", Font.BOLD, 18));
        ab.add(ba2);
        
        //shop now
        
        sh= new JButton("shop now");
        sh.setBounds(100, 200, 250, 50);
        sh.setBorder(new LineBorder(Color.WHITE));
        sh.setFont(new Font("Arial", Font.BOLD, 18));
        home.add(sh);
        
        ba3= new JButton("Back");
        ba3.setBounds(100, 600, 250, 50);
        ba3.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(ba3);
        
         //product details
        sd1=new JLabel("<html>Jhonsan's baby<p>The best baby product in the world</p></html>");
        sd1.setFont(new Font("Arial", Font.BOLD, 18));
        sd1.setBounds(550, 100, 700, 300);
        pp1.add(sd1);
        
        sd2=new JLabel("<html>Feeding bottel<p>The best Feeding bottel in the app</p></html>");
        sd2.setFont(new Font("Arial", Font.BOLD, 18));
        sd2.setBounds(550, 100, 700, 300);
        pp2.add(sd2);
        
        sd3=new JLabel("<html>Dress<p>The best dress in the app</p></html>");
        sd3.setFont(new Font("Arial", Font.BOLD, 18));
        sd3.setBounds(550, 100, 700, 300);
        pp3.add(sd3);
        
        sd4=new JLabel("<html>Baby products<p>The best dress in the app</p></html>");
        sd4.setFont(new Font("Arial", Font.BOLD, 18));
        sd4.setBounds(550, 100, 700, 300);
        pp4.add(sd4);
        
        sd5=new JLabel("<html>Food<p>The best Food in the app</p></html>");
        sd5.setFont(new Font("Arial", Font.BOLD, 18));
        sd5.setBounds(500, 100, 700, 300);
        pp5.add(sd5);
        
       
        
        
        
        
        sh1= new JButton("<html>Jhonsan's baby<br>The best baby product in the world</html>");
        sh1.setBounds(500, 200, 500, 50);
        sh1.setBackground(new Color(0xfffffff));
        sh1.setBorder(new LineBorder(Color.WHITE));
        sh1.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(sh1);
        
        sh2= new JButton("<html>Feeding bottel <br>The best Feeding bottel in the app</html>");
        sh2.setBounds(500, 300, 500, 50);
        sh2.setBackground(new Color(0xfffffff));
        sh2.setBorder(new LineBorder(Color.WHITE));
        sh2.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(sh2);
        
        sh3= new JButton("<html>Dress <br>The best dress  in the app</html>");
        sh3.setBounds(480, 400, 500, 50);
        sh3.setBackground(new Color(0xfffffff));
        sh3.setBorder(new LineBorder(Color.WHITE));
        sh3.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(sh3);
        
        sh4= new JButton("<html> baby product's <br> The best dress  in the app </html> ");
        sh4.setBounds(480, 500, 500, 50);
        sh4.setBackground(new Color(0xfffffff));
        sh4.setBorder(new LineBorder(Color.WHITE));
        sh4.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(sh4);
        
        sh5= new JButton("<html>Food<br>The best Food in the app</html>");
        sh5.setBounds(480, 600, 500, 50);
        sh5.setBackground(new Color(0xfffffff));
        sh5.setBorder(new LineBorder(Color.WHITE));
        sh5.setFont(new Font("Arial", Font.BOLD, 18));
        shop.add(sh5);
        
        //product
        pro1= new JButton("<html>Jhonsan's baby<br>The best Diapper in the app</html>");
        pro1.setBounds(550, 100, 700, 300);
        pro1.setBackground(new Color(0xfffffff));
        pro1.setBorder(new LineBorder(Color.WHITE));
        pro1.setFont(new Font("Arial", Font.BOLD, 18));
        shop1.add(pro1);
        
        pro2= new JButton("<html>Feeding bottel <br>The best Food in the app</html>");
        pro2.setBounds(550, 100, 700, 300);
        pro2.setBackground(new Color(0xfffffff));
        pro2.setBorder(new LineBorder(Color.WHITE));
        pro2.setFont(new Font("Arial", Font.BOLD, 18));
        shop2.add(pro2);
        
        pro3= new JButton("<html>Dress<br>The best Food in the app</html>");
        pro3.setBounds(550, 100, 700, 300);
        pro3.setBackground(new Color(0xfffffff));
        pro3.setBorder(new LineBorder(Color.WHITE));
        pro3.setFont(new Font("Arial", Font.BOLD, 18));
        shop3.add(pro3);
        
         pro4= new JButton("<html>baby product's<br>The best Food in the app</html>");
        pro4.setBounds(550, 100, 700, 300);
        pro4.setBackground(new Color(0xfffffff));
        pro4.setBorder(new LineBorder(Color.WHITE));
        pro4.setFont(new Font("Arial", Font.BOLD, 18));
        shop4.add(pro4);
        
        pro5= new JButton("<html>Food<br>The best Food in the app</html>");
        pro5.setBounds(550, 100, 700, 300);
        pro5.setBackground(new Color(0xfffffff));
        pro5.setBorder(new LineBorder(Color.WHITE));
        pro5.setFont(new Font("Arial", Font.BOLD, 18));
        shop5.add(pro5);
        
        // shop buttons
        
        add(doula);
        setVisible(true);
        //shop pro
         pro1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    shop1.setVisible(false);
                    setTitle(" Pamper's  ");
                    add(pp1, BorderLayout.CENTER);
                    pp1.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
         pro2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    shop2.setVisible(false);
                    setTitle(" food");
                    add(pp2, BorderLayout.CENTER);
                    pp2.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
         pro3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    shop3.setVisible(false);
                    setTitle(" Pamper's  ");
                    add(pp3, BorderLayout.CENTER);
                    pp3.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
         pro4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    shop4.setVisible(false);
                    setTitle(" Pamper's  ");
                    add(pp4, BorderLayout.CENTER);
                    pp4.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
         
         pro5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    shop5.setVisible(false);
                    setTitle(" Pamper's  ");
                    add(pp5, BorderLayout.CENTER);
                    pp5.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
         
         //product 
        bb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d1d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        bb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d2d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        /*Chat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            new Google();
            }
        });*/

        bb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d3d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        bb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d2d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        bb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d3d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        bb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                   
                    d3d.setVisible(false);
                    setTitle(" Shop radhika ");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });

        bb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    d4d.setVisible(false);
                    setTitle("Shop now");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
            }
        });
        bb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    d5d.setVisible(false);
                    setTitle("Shop now");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
            }
        });
        bb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    d6d.setVisible(false);
                    setTitle("Shop now");
                    add(new1, BorderLayout.CENTER);
                    new1.setVisible(true);
                    revalidate();
                    repaint();
            }
        });
        sh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    home.setVisible(false);
                    setTitle("Shop now");
                    add(shop, BorderLayout.CENTER);
                    shop.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    doulas.setVisible(false);
                    setTitle("Doula");
                    add(home, BorderLayout.CENTER);
                    home.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        ba3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    shop.setVisible(false);
                    setTitle("Doula");
                    add(home, BorderLayout.CENTER);
                    home.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        
        aboutus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    home.setVisible(false);
                    setTitle("Aboutus");
                    add(ab, BorderLayout.CENTER);
                    ab.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        dbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                    home.setVisible(false);
                    setTitle("Doula Page2");
                    add(doulas, BorderLayout.CENTER);
                    doulas.setVisible(true);
                    revalidate();
                    repaint();
                
            }
        });
        d1.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            doulas.setVisible(false);
                    setTitle("Choose");
                    add(d1d, BorderLayout.CENTER);
                    d1d.setVisible(true);
                    revalidate();
                    repaint();
        
            
        }});
        d2.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == d2) {
            doulas.setVisible(false);
            setTitle("Choose");
            add(d2d, BorderLayout.CENTER);
            d2d.setVisible(true);
            revalidate();
            repaint();
        }
            
        }});
        //pro
        sh1.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            shop.setVisible(false);
            setTitle("Choose");
            add(shop1, BorderLayout.CENTER);
            shop1.setVisible(true);
            revalidate();
            repaint();
        }});
        
         sh2.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            shop.setVisible(false);
            setTitle("Choose");
            add(shop2, BorderLayout.CENTER);
            shop2.setVisible(true);
            revalidate();
            repaint();
        }});
         sh3.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            shop.setVisible(false);
            setTitle("Choose");
            add(shop3, BorderLayout.CENTER);
            shop3.setVisible(true);
            revalidate();
            repaint();
        }});
         
         sh4.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            shop.setVisible(false);
            setTitle("Choose");
            add(shop4, BorderLayout.CENTER);
            shop4.setVisible(true);
            revalidate();
            repaint();
        }});
         sh5.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            shop.setVisible(false);
            setTitle("Choose");
            add(shop5, BorderLayout.CENTER);
            shop5.setVisible(true);
            revalidate();
            repaint();
        }});
        //product
        ba2.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
            ab.setVisible(false);
            setTitle("Choose");
            add(home, BorderLayout.CENTER);
            home.setVisible(true);
            revalidate();
            repaint();
        }});
                
        d3.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
            doulas.setVisible(false);
            setTitle("Choose");
            add(d3d, BorderLayout.CENTER);
            d3d.setVisible(true);
            revalidate();
            repaint();
        
        }});
        
        d4.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
                    doulas.setVisible(false);
                    setTitle("Choose");
                    add(d4d, BorderLayout.CENTER);
                    d4d.setVisible(true);
                    revalidate();
                    repaint();
        
       }});
        
        d5.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
                    doulas.setVisible(false);
                    setTitle("Choose");
                    add(d5d, BorderLayout.CENTER);
                    d5d.setVisible(true);
                    revalidate();
                    repaint();
        
            
        }});
        
        next.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
        
        
                     doulas.setVisible(false);
                    setTitle("Page2");
                    add(new1, BorderLayout.CENTER);
                    new1.setVisible(true);
                    revalidate();
                    repaint();
        
            
        }});
        
        d6.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e) {
        
            new1.setVisible(false);
                    setTitle("Page2");
                    add(d6d, BorderLayout.CENTER);
                    d6d.setVisible(true);
                    revalidate();
                    repaint();
       
        }});
        doulabutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == doulabutton) {
                    doula.setVisible(false);
                    setTitle("Choose");
                    add(home, BorderLayout.CENTER);
                    home.setVisible(true);
                    revalidate();
                    repaint();
                }
            }
        });
        userbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == userbutton) {
                    doula.setVisible(false);
                    setTitle("Choose");
                    add(home, BorderLayout.CENTER);
                    home.setVisible(true);
                    revalidate();
                    repaint();
                }
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == back) {
                    home.setVisible(false);
                    setTitle("Healwave");
                    add(doula, BorderLayout.CENTER);
                    doula.setVisible(true);
                    revalidate();
                    repaint();
                }
            }
        });
        
         /*se.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == se) {
                    String query = search.getText().toLowerCase();
                     hideAllButtons();
                    if (query.equals("radhika")) {
                        updateButtonOrder(d1);
                    } else if (query.equals("radha mani")) {
                        updateButtonOrder(d2);
                    } else if (query.equals("savithri")) {
                        updateButtonOrder(d3);
                    } 
                    else if (query.equals("kanamal")) {
                        updateButtonOrder(d6);
                    } 
                }
            }
        });
    }**/
          
    }
    
    void showCalendar() {
        JOptionPane.showMessageDialog(this, "Scheduled for: " + datePicker.getModel().getValue());
    }

   
    void drawLine(Graphics g) {
        // Draw a line from (50, 50) to (350, 350)
        g.drawLine(50, 50, 350, 50);
    
                            
    }
}

                
public class DividedPanelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JButton doulabutton = new JButton("Doula");
            JButton userbutton = new JButton("User");
            new Choose(doulabutton, userbutton).setVisible(true);
        });
    }
}
