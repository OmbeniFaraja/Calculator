package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Calculator extends JFrame {
    private double num1=0,num2=0,result=0;
    private char operator;

    public Calculator() {

        ImageIcon icon = new ImageIcon(".//res//calcIcon.png");

        JPanel panelScreen = new JPanel(new GridLayout(1, 1));
        JPanel buttons = new JPanel(new GridLayout(9, 5, 10, 10));

        JFrame frame = new JFrame("CALCULATOR");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextArea screen = new JTextArea();
        screen.setEditable(false);
        panelScreen.add(screen);

        frame.getContentPane().add(screen, BorderLayout.NORTH);
        frame.getContentPane().add(buttons, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setResizable(false);


        Font font = new Font("ink Free", Font.BOLD, 37);
        screen.setFont(font);
/*        screen.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);*/


        //IAN KIREMA
        JButton exppowx = new JButton("eˣ");
        exppowx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == exppowx) {
                        screen.setText(String.valueOf(Math.pow(Math.E, num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input power first");
                }
            }
        });
        buttons.add(exppowx);

        JButton abs = new JButton("Abs");
        abs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == abs) {
                        screen.setText(String.valueOf(Math.abs(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(abs);

        JButton cosh = new JButton("cosh");
        cosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == cosh) {
                        screen.setText(String.valueOf(Math.cosh(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(cosh);

        JButton sinh = new JButton("sinh");
        sinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == sinh) {
                        screen.setText(String.valueOf(Math.sinh(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(sinh);

        JButton tanh = new JButton("tanh");
        tanh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == tanh) {
                        screen.setText(String.valueOf(Math.tanh(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(tanh);

        JButton logarithm = new JButton("log");
        logarithm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == logarithm) {
                        screen.setText(String.valueOf(Math.log10(num1)));
                        if (num1 <= 0) {
                            screen.setText("Math Error");
                        }
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(logarithm);

        JButton naturalLog = new JButton("ln");
        naturalLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == naturalLog) {
                        screen.setText(String.valueOf(Math.log(num1)));
                        if (num1 <= 0) {
                            screen.setText("Math Error");
                        }

                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(naturalLog);

        JButton cosInverse = new JButton("acos");
        cosInverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cosInverse) {
                    try {
                        num1 = Double.parseDouble(screen.getText());
                        screen.setText(String.valueOf(Math.acos(num1)));
                    } catch (Exception exc) {
                        screen.setText("Input a value first");
                    }
                }
            }
        });
        buttons.add(cosInverse);

        JButton sineInverse = new JButton("asin");
        sineInverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(Math.asin(num1)));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(sineInverse);

        JButton tanInverse = new JButton("atan");
        tanInverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(Math.atan(num1)));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(tanInverse);

        JButton factorial = new JButton("x!");
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == factorial) {
                        int i, fact = 1;
                        for (i = 1; i <= num1; i++) {
                            fact = fact * i;
                        }
                        screen.setText(String.valueOf(fact));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(factorial);

        JButton baseLog = new JButton("logxY");
        baseLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == baseLog) {
                        operator = 'L';
                        screen.setText("");
                    }
                } catch (Exception exc) {
                    screen.setText("Input base value");
                }
            }
        });
        buttons.add(baseLog);

        JButton cosine = new JButton("cos");
        cosine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(Math.cos(num1)));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(cosine);

        JButton sine = new JButton("sin");
        sine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(Math.sin(num1)));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(sine);


        JButton tangent = new JButton("tan");
        tangent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(Math.tan(num1)));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(tangent);

        JButton square = new JButton("x^2");
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == square) {
                        screen.setText(String.valueOf(Math.pow(num1, 2)));
                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(square);

        JButton cube = new JButton("x^3");
        cube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == cube) {
                        screen.setText(String.valueOf(Math.pow(num1, 3)));
                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(cube);

        JButton squareRoot = new JButton("√");
        squareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == squareRoot) {
                        num1 = Double.parseDouble(screen.getText());
                        screen.setText(String.valueOf(Math.sqrt(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(squareRoot);

        JButton threeRoot = new JButton("3√x");
        threeRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == threeRoot) {
                        screen.setText(String.valueOf(Math.cbrt(num1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(threeRoot);

        JButton nroot = new JButton("n√x");
        nroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == nroot) {
                        operator = 'v';
                        screen.setText("");
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(nroot);

        JButton inverse = new JButton("x^-1");
        inverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == inverse) {
                        screen.setText(String.valueOf(Math.pow(num1, -1)));
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(inverse);

        JButton xpowy = new JButton("x^y");
        xpowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == xpowy) {
                        operator = 'p';
                        screen.setText("");
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(xpowy);

        JButton delete = new JButton("DEL");
        delete.setFocusable(false);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == delete) {
                    String number = screen.getText();
                    screen.setText("");
                    for (int i = 0; i < number.length() - 1; i++) {
                        screen.setText(screen.getText() + number.charAt(i));
                    }
                }
            }
        });
        buttons.add(delete);

        JButton clear = new JButton("AC");
        clear.setFocusable(false);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == clear) {
                    screen.setText("");
                }
            }
        });
        buttons.add(clear);

        JButton addition = new JButton("+");
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == addition) {
                        operator = '+';
                        screen.setText("");

                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(addition);

        JButton eular = new JButton("e");
        eular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(num1 * Math.E));
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(eular);

        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == seven) {
                    screen.setText(screen.getText().concat("7"));

                }
            }
        });
        buttons.add(seven);

        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == eight) {
                    screen.setText(screen.getText().concat("8"));

                }
            }
        });
        buttons.add(eight);

        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == nine) {
                    screen.setText(screen.getText().concat("9"));

                }
            }
        });
        buttons.add(nine);

        JButton subtraction = new JButton("-");
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == subtraction) {
                        operator = '-';
                        screen.setText("");

                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(subtraction);

        JButton pi = new JButton("π");
        pi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == pi) {
                    try {
                        num1 = Double.parseDouble(screen.getText());
                        screen.setText(String.valueOf(num1 * Math.PI));
                    } catch (Exception exc) {
                        screen.setText("Input a value first");
                    }
                }
            }
        });
        buttons.add(pi);

        JButton four = new JButton("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == four) {
                    screen.setText(screen.getText().concat("4"));

                }
            }
        });
        buttons.add(four);

        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == five) {
                    screen.setText(screen.getText().concat("5"));

                }
            }
        });
        buttons.add(five);

        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == six) {
                    screen.setText(screen.getText().concat("6"));

                }
            }
        });
        buttons.add(six);

        JButton multiplication = new JButton("*");
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == multiplication) {
                        operator = 'x';
                        screen.setText("");

                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(multiplication);

        JButton modulo = new JButton("%");
        modulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == modulo) {
                        operator = '%';
                        screen.setText("");
                    }
                } catch (Exception exc) {
                    screen.setText("Input a value first");
                }
            }
        });
        buttons.add(modulo);

        JButton one = new JButton("1");
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == one) {
                    screen.setText(screen.getText().concat("1"));

                }
            }
        });
        buttons.add(one);

        JButton two = new JButton("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == two) {
                    screen.setText(screen.getText().concat("2"));

                }
            }
        });
        buttons.add(two);

        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == three) {
                    screen.setText(screen.getText().concat("3"));

                }
            }
        });
        buttons.add(three);

        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(screen.getText());
                    if (e.getSource() == divide) {
                        operator = '/';
                        screen.setText("");

                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(divide);

        JButton negButton = new JButton("(-)");
        negButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == negButton) {
                    try {
                        double temp = Double.parseDouble(screen.getText());
                        temp *= -1;
                        screen.setText(String.valueOf(temp));
                    } catch (Exception exc) {
                        screen.setText("Input a value first");
                    }
                }
            }
        });
        buttons.add(negButton);

        JButton radTodeg = new JButton("DEG");
        radTodeg.setFocusable(false);
        radTodeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==radTodeg){
                    try{num1 = Double.parseDouble(screen.getText());
                    screen.setText(String.valueOf(num1*180/Math.PI));}catch (Exception exc){screen.setText("Input a value in Rad");};

                }
            }
        });
        buttons.add(radTodeg);

        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == zero) {
                    screen.setText(screen.getText().concat("0"));

                }
            }
        });
        buttons.add(zero);

        JButton dot = new JButton(".");
        dot.setFocusable(false);
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == dot) {
                    screen.setText(screen.getText().concat("."));

                }
            }
        });
        buttons.add(dot);

        JButton equal = new JButton("=");
        equal.setLayout(null);
        equal.setFocusable(false);
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == equal) {
                        num2 = Double.parseDouble(screen.getText());
                        switch (operator) {
                            case '+':
                                result = num1 + num2;
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case '-':
                                result = num1 - num2;
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case '/':
                                if(num2!=0){
                                result = num1 / num2;
                                screen.setText(String.valueOf(result));
                                num1 = result;}
                                else
                                    screen.setText("Math Error");
                                break;
                            case 'x':
                                result = num1 * num2;
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case 'v':
                                result = Math.pow(num2, 1 / num1);
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case 'p':
                                result = Math.pow(num1, num2);
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case '%':
                                result = num1 % num2;
                                screen.setText(String.valueOf(result));
                                num1 = result;
                                break;
                            case 'L':
                                if(num1>=0 && num2 >=0 ){
                                result = Math.log(num2) / Math.log(num1);
                                screen.setText(String.valueOf(result));
                                num1 = result;}
                                else
                                    screen.setText("Math Error");
                                break;
                        }
                    }
                } catch (Exception exc) {
                    screen.setText("");
                }
            }
        });
        buttons.add(equal);

        screen.setBackground(Color.GRAY);
        buttons.setBackground(Color.black);
        delete.setBackground(Color.magenta);
        equal.setBackground(Color.magenta);
        dot.setBackground(Color.yellow);
        radTodeg.setBackground(Color.yellow);
        clear.setBackground(Color.magenta);



        JButton numArray[] ={zero, one, two, three, four, five, six, seven, eight, nine};
        for(int i=0; i<numArray.length;i++){
            numArray[i].setFocusable(false);
            numArray[i].setBackground(Color.white);
        }

        JButton operationsArray[]={addition, subtraction, divide, multiplication};
        for(int i=0; i<operationsArray.length;i++){
            operationsArray[i].setBackground(Color.yellow);
            operationsArray[i].setFocusable(false);
        }

        JButton constantsArray[]={eular,pi,modulo,negButton};
        for(int i=0; i<constantsArray.length;i++){
            constantsArray[i].setBackground(Color.cyan);
            constantsArray[i].setFocusable(false);
        }

        JButton functionsArray[]={exppowx,cosh,sinh,abs,factorial,tanh,logarithm,baseLog,naturalLog,cosInverse,sineInverse,tanInverse,cosine,sine,tangent,inverse,square,cube,squareRoot,threeRoot,nroot,xpowy};
        for(int i=0;i< functionsArray.length;i++){
            functionsArray[i].setBackground(Color.lightGray);
            functionsArray[i].setFocusable(false);
        }

        JButton fontArray[]={eular,pi,modulo,negButton,exppowx,cosh,sinh,abs,factorial,tanh,logarithm,baseLog,naturalLog,cosInverse,sineInverse,tanInverse,cosine,sine,tangent,inverse,square,cube,squareRoot,threeRoot,nroot,xpowy,addition, subtraction, divide, multiplication, equal, delete, clear };
        for (int i=0;i<fontArray.length;i++) {
        }
        frame.setVisible(true);

    }
}
