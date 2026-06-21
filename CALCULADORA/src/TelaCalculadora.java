import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;


public class TelaCalculadora extends JFrame{
    private double numero1,numero2,resultado ;
    private String operation;
    JPanel painel;
    JTextField visor;
    JButton num0;
    JButton num1;
    JButton num2;
    JButton num3;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton btnIgual;
    JButton btnMenos;
    JButton btnMais;
    JButton btnDiv;
    JButton btnMult;
    JButton btnC;
    public TelaCalculadora(){
        setTitle("CALCULADORA_GUI");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        visor = new JTextField();
        add(visor,BorderLayout.NORTH);
        painel = new JPanel();
        painel.setLayout(new GridLayout(4,4,5,5));
        add(painel,BorderLayout.CENTER);
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");

        btnMais = new JButton("+");
        btnMenos = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        btnIgual = new JButton("=");
        btnC = new JButton("C");

        painel.add(num0);
        painel.add(num1);
        painel.add(num2);
        painel.add(num3);
        painel.add(num4);
        painel.add(num5);
        painel.add(num6);
        painel.add(num7);
        painel.add(num8);
        painel.add(num9);
        painel.add(btnDiv);
        painel.add(btnMult);
        painel.add(btnMais);
        painel.add(btnMenos);
        painel.add(btnC);
        painel.add(btnIgual);

        num0.addActionListener(e -> {
            visor.setText(visor.getText() + "0");
        });
        num1.addActionListener(e -> {
                visor.setText(visor.getText() + "1");
        });
        num2.addActionListener(e -> {
            visor.setText(visor.getText() + "2");
        });
        num3.addActionListener(e -> {
            visor.setText(visor.getText() + "3");
        });
        num4.addActionListener(e -> {
            visor.setText(visor.getText() + "4");
        });
        num5.addActionListener(e -> {
            visor.setText(visor.getText() + "5");
        });
        num6.addActionListener(e -> {
            visor.setText(visor.getText() + "6");
        });
        num7.addActionListener(e -> {
            visor.setText(visor.getText() + "7");
        });
        num8.addActionListener(e -> {
            visor.setText(visor.getText() + "8");
        });num9.addActionListener(e -> {
            visor.setText(visor.getText() + "9");
        });btnC.addActionListener(e -> {
            numero1=0;
            numero2 = 0;
            operation = "";
            visor.setText("");
        });
        btnDiv.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operation = "/";
            visor.setText("");
        });
        btnIgual.addActionListener(e -> {
            numero2 = Double.parseDouble(visor.getText());
            if (operation.equals("x")) {
                    resultado = Calculadora.multiplicacao(numero1,numero2);
                    visor.setText(String.valueOf(resultado));
            } else if (operation.equals("+")){
                resultado = Calculadora.soma(numero1,numero2);
                visor.setText(String.valueOf(resultado));
            } else if (operation.equals("-")){
                resultado = Calculadora.subtracao(numero1,numero2);
                visor.setText(String.valueOf(resultado));

            }else if (operation.equals("/")) {
                resultado = Calculadora.divisao(numero1,numero2);
                visor.setText(String.valueOf(resultado));
            }
        });
        btnMais.addActionListener(e -> {
            if (visor.getText().equals(""))  JOptionPane.showMessageDialog(this, "Digite um número primeiro!");
            else {
                numero1 = Double.parseDouble(visor.getText());
                operation = "+";
                visor.setText("");
            }
        });
        btnMenos.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operation = "-";
            visor.setText("");
        });
        btnMult.addActionListener(e -> {

            numero1 = Double.parseDouble(visor.getText());
            operation = "x";
            visor.setText("");
        });


        setVisible(true);
    }

        public static void main(String[] args) {
            new TelaCalculadora();
        }
    }

