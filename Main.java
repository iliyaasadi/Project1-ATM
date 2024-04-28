import javax.swing.* ;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.* ;

//در این برنامه ی ATM  تلاش شده شبیه سازی خوبی نسبت به ATM انجام شود
//موارد تایید درستی یا نادرستی رمز و تعیین موجودی و تغییر موجودی بعد از برداشت و کارت به کارت در این برنامه در نظر گرفته نشده است


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ATM" );
        Dimension size = new Dimension(1000, 1000);
        frame.setSize(size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        // frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        frame.setVisible(true);

        JPanel panel1 = new JPanel() ;
        // panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.cyan);
        panel1.setBounds(frame.getBounds()) ;
        panel1.setLayout(null);

        JButton button1 = new JButton(  "فارسی" ) ;
        button1.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
        button1.setBounds( 800, 300 , 200 , 100);

        JLabel welcoming = new JLabel( "زبان خود را انتخاب کنید"   ) ;
        welcoming.setBounds(550 , 250 , 200 , 200);
        welcoming.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 18));


        JButton button2 = new JButton("English") ;
        button2.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
        button2.setBounds(0 , 300 , 200 , 90);

        JLabel welcoming2 = new JLabel("Choose Language") ;
        welcoming2.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
        welcoming2.setBounds(250 , 250 , 200 , 200);

        panel1.add(button1) ;
        panel1.add(button2) ;
        panel1.add(welcoming) ;
        panel1.add(welcoming2) ;
        frame.add(panel1) ;

        JPanel secondPanel = new JPanel() ;
        secondPanel.setLayout(null);
        secondPanel.setBackground(Color.cyan);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPanel.setBounds(panel1.getBounds());
                frame.add(secondPanel) ;
                frame.remove(panel1);

                JLabel password = new JLabel("رمز خود را وارد کنید ")  ;
                password.setBounds(400 , 200 , 200 , 200);
                password.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));

                JPasswordField passwordField = new JPasswordField()  ;
                passwordField.setBounds(380 , 400 , 200 , 50);
                passwordField.setPreferredSize(new Dimension(20 , 10));


                JButton back1 = new JButton("بازگشت" ) ;
                back1.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                back1.setBounds(500 , 600 , 500 , 100);

                //در صورتی که کمه ی بازکشت زده شود :
                back1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        panel1.setBounds(secondPanel.getBounds());
                        frame.remove(secondPanel);
                        frame.add(panel1);
                        secondPanel.removeAll();
                        frame.revalidate();
                        frame.repaint();

                    }
                });

                //با فرض درست بودن رمز اگر دکمه ی ثبت زده شود :
                JButton continueButton=  new JButton("ثبت" );
                continueButton.setBounds(0 , 600 , 500 , 100);
                continueButton.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));


                JPanel mainPage = new JPanel() ;
                mainPage.setLayout(null);
                mainPage.setBackground(Color.cyan);

                continueButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        mainPage.setBounds(secondPanel.getBounds());
                        frame.remove(secondPanel);
                        frame.add(mainPage) ;
                        frame.revalidate();
                        frame.repaint();

                        JButton changePass = new JButton("تغییر رمز" );
                        changePass.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                        changePass.setBounds(800 , 300 , 200 , 60);

                        JButton moojodi = new JButton("اعلام موجودی") ;
                        moojodi.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                        moojodi.setBounds(800 , 400 , 200 , 60);

                        JButton getcash = new JButton("برداشت وجه") ;
                        getcash.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                        getcash.setBounds(0 , 300 , 200 , 60);

                        JButton transfer = new JButton("کارت به کارت ") ;
                        transfer.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                        transfer.setBounds(0 , 400 , 200 , 60);

                        JLabel chooseProcess = new JLabel("عملیات مورد نظر خود را انتخاب کنید") ;
                        chooseProcess.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 18));
                        chooseProcess.setBounds(350 , 230 , 300 , 300);

                        JButton backLastPage = new JButton("بازگشت") ;
                        backLastPage.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                        backLastPage.setBounds(500 , 600 , 500 , 100);

                        JButton cancel1 = new JButton("لغو") ;
                        cancel1.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                        cancel1.setBounds(0 , 600 , 500 , 100);

                        mainPage.add(changePass) ;
                        mainPage.add(moojodi) ;
                        long money = 558_760_000 ;
                        mainPage.add(getcash) ;
                        mainPage.add(transfer) ;
                        mainPage.add(backLastPage) ;
                        mainPage.add(cancel1) ;
                        mainPage.add(chooseProcess) ;
                        frame.add(mainPage) ;

                        //برای تمام دکمه های تعریف شده باید actionListener تعریف شود
                        //دکمه ی بازگشت به صفحه ی قبل و دکمه ی لغو به صفحه ی اول ( انتخاب زبان ) برمیگردد
                        //دقت شود که تمام اندازه های قید شده در بالا برای لیبل ها و دکمه ها با خطا و آزمایش به دست آمده و همان بار اول به دست نیامده

                        backLastPage.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                secondPanel.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(secondPanel) ;
                                mainPage.removeAll();
                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        cancel1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                panel1.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(panel1);
                                mainPage.removeAll();
                                secondPanel.removeAll(); //برای اینکه اطلاعات صفحه ی وسط مجددا نشان داده نشود
                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        //یک پنل سوم برای اینکه اگر هرکدام از 4 تا عملیات انتخاب شود
                        JPanel thirdPanel = new JPanel() ;
                        thirdPanel.setLayout(null);
                        thirdPanel.setBackground(Color.cyan);

                        //بررسی تغییر رمز
                        changePass.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                thirdPanel.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(thirdPanel) ;
                                frame.revalidate();
                                frame.repaint();

                                JLabel newPassword = new JLabel("رمز جدید را وارد کنید") ;
                                newPassword.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 20));
                                newPassword.setBounds(430 , 100 , 200 , 100);

                                JPasswordField getNewPass = new JPasswordField() ;
                                getNewPass.setBounds(410 , 200 , 200 , 50);
                                getNewPass.setPreferredSize(new Dimension(20 , 10));

                                JLabel checkNewPass = new JLabel("تکرار رمز جدید") ;
                                checkNewPass.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 20));
                                checkNewPass.setBounds(450 , 300 , 200 , 100 );

                                JPasswordField getAgainNew = new JPasswordField() ;
                                getAgainNew.setBounds(410 , 400 , 200 ,50 );
                                getcash.setPreferredSize(new Dimension(20 , 10));

                                JButton confirmChangePass = new JButton("تایید") ;
                                confirmChangePass.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                confirmChangePass.setBounds(334 , 550 , 334 , 150);

                                JButton backLastPage2 = new JButton("بازگشت") ;
                                backLastPage2.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 35));
                                backLastPage2.setBounds(668 , 550 , 332 , 150);

                                JButton cancel2 = new JButton("لغو") ;
                                cancel2.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 35));
                                cancel2.setBounds(0 , 550 , 334 , 150);


                                thirdPanel.add(newPassword) ;
                                thirdPanel.add(getNewPass) ;
                                thirdPanel.add(checkNewPass) ;
                                thirdPanel.add(getAgainNew) ;
                                thirdPanel.add(confirmChangePass) ;
                                thirdPanel.add(backLastPage2) ;
                                thirdPanel.add(cancel2) ;
                                frame.add(thirdPanel) ;

                                backLastPage2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        mainPage.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(mainPage) ;
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                cancel2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        panel1.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(panel1) ;
                                        secondPanel.removeAll();
                                        mainPage.removeAll();
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                // پنل صفحه ی نهایی که نشانه ی انجام موفقیت آمیز عملیات انتخاب شده است
                                JPanel successfulPanel = new JPanel() ;
                                successfulPanel.setLayout(null);
                                successfulPanel.setBackground(Color.cyan);

                                confirmChangePass.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        //ابتدا حالتی را بررسی میکنیم که رمز وارد شده در دو باکس یکسان نباشد

                                        char[] x = getNewPass.getPassword() ;
                                        char[] y = getAgainNew.getPassword() ;

                                        if(x.length != y.length){

                                            JPanel errorPanel = new JPanel() ;
                                            errorPanel.setLayout(null);
                                            errorPanel.setBackground(Color.cyan);
                                            errorPanel.setBounds(thirdPanel.getBounds());
                                            frame.remove(thirdPanel);
                                            frame.add(errorPanel);
                                            frame.revalidate();
                                            frame.repaint();


                                            JLabel error = new JLabel("رمز جدید را به درستی وارد کنید");
                                            error.setForeground(Color.red);
                                            error.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
                                            error.setBounds(200, 470, 200, 100);
                                            errorPanel.add(error);

                                            JButton backAgain = new JButton("بازگشت" );
                                            backAgain.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 35));
                                            backAgain.setBounds(0 , 550 , 1000 , 200);
                                            errorPanel.add(backAgain) ;

                                            backAgain.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    thirdPanel.setBounds(errorPanel.getBounds());
                                                    frame.remove(errorPanel);
                                                    frame.add(thirdPanel) ;
                                                    errorPanel.removeAll();
                                                    frame.revalidate();
                                                    frame.repaint();
                                                }
                                            });
                                        }
                                        int flag = 0 ;
                                        for(int i = 0 ; i<x.length ; ++i) {
                                            if (x[i] != y[i]) {
                                                flag =  1 ;

                                                JPanel errorPanel = new JPanel() ;
                                                errorPanel.setLayout(null);
                                                errorPanel.setBackground(Color.cyan);
                                                errorPanel.setBounds(thirdPanel.getBounds());
                                                frame.remove(thirdPanel);
                                                frame.add(errorPanel);
                                                frame.revalidate();
                                                frame.repaint();

                                                JLabel error = new JLabel("رمز جدید را به درستی وارد کنید!");
                                                error.setForeground(Color.red);
                                                error.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 25));
                                                error.setBounds(350, 270, 300, 150);
                                                errorPanel.add(error);

                                                JButton backAgain = new JButton("بازگشت" );
                                                backAgain.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 35));
                                                backAgain.setBounds(0 , 550 , 1000 , 200);
                                                errorPanel.add(backAgain) ;

                                                backAgain.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        thirdPanel.setBounds(errorPanel.getBounds());
                                                        frame.remove(errorPanel);
                                                        frame.add(thirdPanel) ;
                                                        errorPanel.removeAll();
                                                        frame.revalidate();
                                                        frame.repaint();
                                                    }
                                                });
                                            }
                                        }
                                        //اگر رمز در هردو باکس یکسان بود
                                        if(flag==0){

                                            successfulPanel.setBounds(thirdPanel.getBounds());
                                            frame.remove(thirdPanel);
                                            frame.add(successfulPanel) ;
                                            frame.revalidate();
                                            frame.repaint();

                                            JLabel successfulMessage = new JLabel("عملیات با موفقیت انجام شد!") ;
                                            successfulMessage.setForeground(Color.green);
                                            successfulMessage.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
                                            successfulMessage.setBounds(400 , 200 , 350 , 200);
                                            successfulPanel.add(successfulMessage) ;

                                            JButton getCard = new JButton("دریافت کارت") ;
                                            getCard.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                            getCard.setBounds(500 , 400 , 500 , 300);
                                            successfulPanel.add(getCard) ;

                                            JButton anotherProcess = new JButton("اگر قصد انجام عملیات دیگری را دارید کلیک کنید") ;
                                            anotherProcess.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
                                            anotherProcess.setBounds(0 , 400 , 500 , 300);
                                            successfulPanel.add(anotherProcess) ;

                                            getCard.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    panel1.setBounds(successfulPanel.getBounds());
                                                    frame.remove(successfulPanel);
                                                    frame.add(panel1) ;
                                                    successfulPanel.removeAll();
                                                    secondPanel.removeAll();
                                                    thirdPanel.removeAll();
                                                    mainPage.removeAll();
                                                    frame.revalidate();
                                                    frame.repaint();

                                                }
                                            });

                                            anotherProcess.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    mainPage.setBounds(successfulPanel.getBounds());
                                                    frame.remove(successfulPanel);
                                                    frame.add(mainPage) ;
                                                    thirdPanel.removeAll();
                                                    successfulPanel.removeAll();
                                                    frame.revalidate();
                                                    frame.repaint();
                                                }
                                            });
                                        }
                                    }
                                });
                                //تمام حالات مربوط به عملیات تغییر رمز را بررسی شد
                            }
                        });
                        //بررسی اعلام موجودی
                        moojodi.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                thirdPanel.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(thirdPanel);
                                frame.revalidate();
                                frame.repaint();

                                JLabel yourInventory = new JLabel("موجودی حساب شما:") ;
                                yourInventory.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                                yourInventory.setBounds(600 , 200 , 200 , 100);
                                thirdPanel.add(yourInventory) ;

                                String s = String.valueOf(money) ; //تبدیل عدد فرضی داده شده توسط خودم به عنوان موجودی اولیه به رشته
                                JLabel moneyExist = new JLabel(s) ;
                                moneyExist.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                                moneyExist.setBounds(  400, 200 , 200  ,100);
                                thirdPanel.add(moneyExist) ;


                                JLabel currency = new JLabel("ریال") ;
                                currency.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
                                currency.setBounds(300 , 200  , 200 , 100);
                                thirdPanel.add(currency) ;

                                JButton backMain = new JButton("بازگشت") ;
                                backMain.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                backMain.setBounds(500 , 500 , 500 , 200);
                                thirdPanel.add(backMain) ;

                                JButton cancel3 = new JButton("لغو") ;
                                cancel3.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                cancel3.setBounds(0 , 500 , 500 , 200);
                                thirdPanel.add(cancel3);

                                backMain.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        mainPage.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel) ;
                                        frame.add(mainPage) ;
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                cancel3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        panel1.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(panel1) ;
                                        secondPanel.removeAll();
                                        mainPage.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });
                                //تمام حالات مربوط به موجودی بررسی شد
                            }
                        });

                        //بررسی برداشت وجه
                        getcash.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                thirdPanel.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(thirdPanel) ;
                                frame.revalidate();
                                frame.repaint();

                                JLabel amount = new JLabel("مقدار برداشت را وارد کنید") ;
                                amount.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                                amount.setBounds(380 , 200 , 250 , 100);
                                thirdPanel.add(amount) ;

                                JTextField getAmount = new JTextField() ;
                                getAmount.setBounds(390 , 350 , 200 , 50);
                                getAmount.setPreferredSize(new Dimension(20 , 10)) ;
                                thirdPanel.add(getAmount) ;

                                JButton confirmgetMoney = new JButton("تایید") ;
                                confirmgetMoney.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                confirmgetMoney.setBounds(334 , 550 , 334 , 150);
                                thirdPanel.add(confirmgetMoney) ;

                                JButton backLastPage3 = new JButton("بازگشت") ;
                                backLastPage3.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 35));
                                backLastPage3.setBounds(668 , 550 , 332 , 150);
                                thirdPanel.add(backLastPage3) ;

                                JButton cancel4 = new JButton("لغو") ;
                                cancel4.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 35));
                                cancel4.setBounds(0 , 550 , 334 , 150);
                                thirdPanel.add(cancel4) ;

                                //پنلی برای زمانی که عملیات موفقیت آمیز بود
                                JPanel successfulPanel = new JPanel() ;
                                successfulPanel.setLayout(null);
                                successfulPanel.setBackground(Color.cyan);

                                confirmgetMoney.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        successfulPanel.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(successfulPanel) ;
                                        frame.revalidate();
                                        frame.repaint();

                                        JLabel successfulMessage = new JLabel("عملیات با موفقیت انجام شد!") ;
                                        successfulMessage.setForeground(Color.green);
                                        successfulMessage.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
                                        successfulMessage.setBounds(400 , 200 , 350 , 200);
                                        successfulPanel.add(successfulMessage) ;

                                        JButton getCard = new JButton("دریافت کارت") ;
                                        getCard.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                        getCard.setBounds(500 , 400 , 500 , 300);
                                        successfulPanel.add(getCard) ;

                                        JButton anotherProcess = new JButton("اگر قصد انجام عملیات دیگری را دارید کلیک کنید") ;
                                        anotherProcess.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
                                        anotherProcess.setBounds(0 , 400 , 500 , 300);
                                        successfulPanel.add(anotherProcess) ;

                                        getCard.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                panel1.setBounds(successfulPanel.getBounds());
                                                frame.remove(successfulPanel);
                                                frame.add(panel1) ;
                                                successfulPanel.removeAll();
                                                secondPanel.removeAll();
                                                thirdPanel.removeAll();
                                                mainPage.removeAll();
                                                frame.revalidate();
                                                frame.repaint();

                                            }
                                        });

                                        anotherProcess.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                mainPage.setBounds(successfulPanel.getBounds());
                                                frame.remove(successfulPanel);
                                                frame.add(mainPage) ;
                                                thirdPanel.removeAll();
                                                successfulPanel.removeAll();
                                                frame.revalidate();
                                                frame.repaint();
                                            }
                                        });


                                    }
                                });

                                backLastPage3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        mainPage.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(mainPage) ;
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                cancel4.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        panel1.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(panel1) ;
                                        secondPanel.removeAll();
                                        mainPage.removeAll();
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });
                                //تمام حالات برداشت بررسی شد
                            }
                        });

                        //بررسی کارت به کارت
                        transfer.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                thirdPanel.setBounds(mainPage.getBounds());
                                frame.remove(mainPage);
                                frame.add(thirdPanel) ;
                                frame.revalidate();
                                frame.repaint();

                                JLabel moneyForTransfer = new JLabel("مبلغ مورد نظر را وارد کنید") ;
                                moneyForTransfer.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 18));
                                moneyForTransfer.setBounds(420 , 100 , 200 , 100);
                                thirdPanel.add(moneyForTransfer) ;

                                JTextField amountOfTransfer = new JTextField() ;
                                amountOfTransfer.setBounds(415 , 200 , 200 , 50);
                                amountOfTransfer.setPreferredSize(new Dimension(new Dimension(20 , 10)));
                                thirdPanel.add(amountOfTransfer) ;

                                JLabel aimCard = new JLabel("شماره کارت مقصد را وارد کنید") ;
                                aimCard.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 20));
                                aimCard.setBounds(400 , 250 , 300 ,100);
                                thirdPanel.add(aimCard) ;

                                JTextField cardNumber = new JTextField() ;
                                cardNumber.setBounds(415 , 350 , 200 , 50);
                                cardNumber.setPreferredSize(new Dimension(20 , 10));
                                thirdPanel.add(cardNumber) ;


                                JButton continue2 = new JButton("ثبت")  ;
                                continue2.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                continue2.setBounds(332 , 500 , 336 , 200);
                                thirdPanel.add(continue2) ;

                                JButton backLastPage4 = new JButton("بازگشت") ;
                                backLastPage4.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                backLastPage4.setBounds(668 , 500 , 332 , 200);
                                thirdPanel.add(backLastPage4) ;

                                JButton cancel5 = new JButton("لغو") ;
                                cancel5.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 35));
                                cancel5.setBounds(0 , 500 , 332 , 200);
                                thirdPanel.add(cancel5) ;



                                //پنلی برای زمانی که عملیات موفقیت آمیز بود
                                JPanel successfulPanel = new JPanel() ;
                                successfulPanel.setLayout(null);
                                successfulPanel.setBackground(Color.cyan);



                                continue2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        successfulPanel.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(successfulPanel);
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();

                                        JLabel successText = new JLabel("عملیات با موفقیت انجام شد");
                                        successText.setForeground(Color.green);
                                        successText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
                                        successText.setBounds(400, 200, 350, 200);
                                        successfulPanel.add(successText);

                                        JButton getCard = new JButton("دریافت کارت");
                                        getCard.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
                                        getCard.setBounds(500, 400, 500, 300);
                                        successfulPanel.add(getCard);

                                        JButton anotherProcess = new JButton("اگر قصد انجام عملیات دیگری را دارید کلیک کنید");
                                        anotherProcess.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
                                        anotherProcess.setBounds(0, 400, 500, 300);
                                        successfulPanel.add(anotherProcess);

                                        getCard.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                panel1.setBounds(successfulPanel.getBounds());
                                                frame.remove(successfulPanel);
                                                frame.add(panel1);
                                                secondPanel.removeAll();
                                                mainPage.removeAll();
                                                successfulPanel.removeAll();
                                                frame.revalidate();
                                                frame.repaint();
                                            }
                                        });

                                        anotherProcess.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                mainPage.setBounds(successfulPanel.getBounds());
                                                frame.remove(successfulPanel);
                                                frame.add(mainPage);
                                                successfulPanel.removeAll();
                                                frame.revalidate();
                                                frame.repaint();
                                            }
                                        });
                                    }
                                });

                                backLastPage4.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        mainPage.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(mainPage);
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                cancel5.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        panel1.setBounds(thirdPanel.getBounds());
                                        frame.remove(thirdPanel);
                                        frame.add(panel1) ;
                                        secondPanel.removeAll();
                                        mainPage.removeAll();
                                        thirdPanel.removeAll();
                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });
                                //تمام حالات کارت به کارت بررسی شد
                            }
                        });

                    }
                });


                secondPanel.add(password) ;
                secondPanel.add(passwordField) ;
                secondPanel.add(back1) ;
                secondPanel.add(continueButton) ;
                frame.add(secondPanel) ;

                frame.revalidate();
                frame.repaint();
            }
        });
        frame.setVisible(true);
    }
}
