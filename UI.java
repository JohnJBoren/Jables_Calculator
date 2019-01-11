import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class UI implements ActionListener {
    private final JFrame frame;
    private final JPanel panel;
    private final JTextArea text;
    private final JButton but[], butAdd, butMinus, butMultiply, butDivide, butEqual, butCancel, butSquareRoot,
            butSquare, butOneDevidedBy, butCos, butSin, butTan, butxpowerofy, butlog, butrate;
    private final Calculator calc;

    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

    public UI() {
        frame = new JFrame("Calculator - John J Boren");
        frame.setForeground(Color.BLACK);

        panel = new JPanel(new GridLayout(5, 5));

        text = new JTextArea(2, 25);
        text.setFont(text.getFont().deriveFont(96f));
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        text.setLineWrap(true);
        Color black = new Color(72, 201, 176); // black
        Color textInput = new Color(255, 195, 0);
        Color white = new Color(218, 247, 166);
        Color otherColor = new Color(245, 127, 23);
        Color operatorColor = new Color(255, 82, 82);

        text.setBackground(textInput);
        text.setForeground(white);

        but = new JButton[10];

        but[1] = new JButton(String.valueOf(1));
        but[1].setBackground(black);
        but[1].setForeground(white);
        but[1].setFont(text.getFont().deriveFont(36f));

        but[2] = new JButton(String.valueOf(2));
        but[2].setBackground(black);
        but[2].setForeground(white);
        but[2].setFont(text.getFont().deriveFont(36f));

        but[3] = new JButton(String.valueOf(3));
        but[3].setBackground(black);
        but[3].setForeground(white);
        but[3].setFont(text.getFont().deriveFont(36f));

        butSquare = new JButton("x*x");
        butSquare.setBackground(otherColor);
        butSquare.setForeground(white);
        butSquare.setFont(text.getFont().deriveFont(36f));

        butAdd = new JButton("+");
        butAdd.setBackground(operatorColor);
        butAdd.setForeground(white);
        butAdd.setFont(text.getFont().deriveFont(36f));

        but[4] = new JButton(String.valueOf(4));
        but[4].setBackground(black);
        but[4].setForeground(white);
        but[4].setFont(text.getFont().deriveFont(36f));

        but[5] = new JButton(String.valueOf(5));
        but[5].setBackground(black);
        but[5].setForeground(white);
        but[5].setFont(text.getFont().deriveFont(36f));

        but[6] = new JButton(String.valueOf(6));
        but[6].setBackground(black);
        but[6].setForeground(white);
        but[6].setFont(text.getFont().deriveFont(36f));

        butSquareRoot = new JButton("sqrt");
        butSquareRoot.setBackground(otherColor);
        butSquareRoot.setForeground(white);
        butSquareRoot.setFont(text.getFont().deriveFont(36f));

        butMinus = new JButton("-");
        butMinus.setBackground(operatorColor);
        butMinus.setForeground(white);
        butMinus.setFont(text.getFont().deriveFont(36f));

        but[7] = new JButton(String.valueOf(7));
        but[7].setBackground(black);
        but[7].setForeground(white);
        but[7].setFont(text.getFont().deriveFont(36f));

        but[8] = new JButton(String.valueOf(8));
        but[8].setBackground(black);
        but[8].setForeground(white);
        but[8].setFont(text.getFont().deriveFont(36f));

        but[9] = new JButton(String.valueOf(9));
        but[9].setBackground(black);
        but[9].setForeground(white);
        but[9].setFont(text.getFont().deriveFont(36f));

        butOneDevidedBy = new JButton("1/x");
        butOneDevidedBy.setBackground(otherColor);
        butOneDevidedBy.setForeground(white);
        butOneDevidedBy.setFont(text.getFont().deriveFont(36f));

        butMultiply = new JButton("*");
        butMultiply.setBackground(operatorColor);
        butMultiply.setForeground(white);
        butMultiply.setFont(text.getFont().deriveFont(36f));

        butxpowerofy = new JButton("x^y");
        butxpowerofy.setBackground(otherColor);
        butxpowerofy.setForeground(white);
        butxpowerofy.setFont(text.getFont().deriveFont(36f));

        but[0] = new JButton(String.valueOf(0));
        but[0].setBackground(black);
        but[0].setForeground(white);
        but[0].setFont(text.getFont().deriveFont(36f));

        butrate = new JButton("x%");
        butrate.setBackground(otherColor);
        butrate.setForeground(white);
        butrate.setFont(text.getFont().deriveFont(36f));

        butlog = new JButton("log10(x)");
        butlog.setBackground(otherColor);
        butlog.setForeground(white);
        butlog.setFont(text.getFont().deriveFont(36f));

        butDivide = new JButton("/");
        butDivide.setBackground(operatorColor);
        butDivide.setForeground(white);
        butDivide.setFont(text.getFont().deriveFont(36f));

        butCos = new JButton("Cos");
        butCos.setBackground(otherColor);
        butCos.setForeground(white);
        butCos.setFont(text.getFont().deriveFont(36f));

        butSin = new JButton("Sin");
        butSin.setBackground(otherColor);
        butSin.setForeground(white);
        butSin.setFont(text.getFont().deriveFont(36f));

        butTan = new JButton("Tan");
        butTan.setBackground(otherColor);
        butTan.setForeground(white);
        butTan.setFont(text.getFont().deriveFont(36f));

        butCancel = new JButton("C");
        butCancel.setBackground(otherColor);
        butCancel.setForeground(white);
        butCancel.setFont(text.getFont().deriveFont(36f));

        butEqual = new JButton("=");
        butEqual.setBackground(operatorColor);
        butEqual.setForeground(white);
        butEqual.setFont(text.getFont().deriveFont(36f));

        calc = new Calculator();
    }

    public void init() {
        frame.setVisible(true);
        frame.setSize(850, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));
        frame.add(text);
        frame.add(panel);

        panel.add(but[1]);
        panel.add(but[2]);
        panel.add(but[3]);
        panel.add(butSquare);
        panel.add(butAdd);
        panel.add(but[4]);
        panel.add(but[5]);
        panel.add(but[6]);
        panel.add(butSquareRoot);
        panel.add(butMinus);
        panel.add(but[7]);
        panel.add(but[8]);
        panel.add(but[9]);
        panel.add(butOneDevidedBy);
        panel.add(butMultiply);
        panel.add(butxpowerofy);
        panel.add(but[0]);
        panel.add(butrate);
        panel.add(butlog);
        panel.add(butDivide);
        panel.add(butCos);
        panel.add(butSin);
        panel.add(butTan);
        panel.add(butCancel);
        panel.add(butEqual);

        for (int i = 1; i < 10; i++) {
            but[i].addActionListener(this);
        }

        but[0].addActionListener(this);
        butAdd.addActionListener(this);
        butMinus.addActionListener(this);
        butMultiply.addActionListener(this);
        butDivide.addActionListener(this);
        butSquare.addActionListener(this);
        butSquareRoot.addActionListener(this);
        butOneDevidedBy.addActionListener(this);
        butCos.addActionListener(this);
        butSin.addActionListener(this);
        butTan.addActionListener(this);
        butxpowerofy.addActionListener(this);
        butlog.addActionListener(this);
        butrate.addActionListener(this);

        butEqual.addActionListener(this);
        butCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == but[i]) {
                text.replaceSelection(buttonValue[i]);
                return;
            }
        }

        if (source == butAdd) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.add, reader()));
        }

        if (source == butMinus) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.minus, reader()));
        }

        if (source == butMultiply) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.multiply, reader()));
        }

        if (source == butDivide) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.divide, reader()));
        }
        if (source == butxpowerofy) {
            writer(calc.calculateBi(Calculator.BiOperatorModes.xpowerofy, reader()));
        }

        if (source == butSquare) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.square, reader()));
        }

        if (source == butSquareRoot) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.squareRoot, reader()));
        }

        if (source == butOneDevidedBy) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, reader()));
        }

        if (source == butCos) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.cos, reader()));
        }

        if (source == butSin) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.sin, reader()));
        }

        if (source == butTan) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.tan, reader()));
        }
        if (source == butlog) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.log, reader()));
        }
        if (source == butrate) {
            writer(calc.calculateMono(Calculator.MonoOperatorModes.rate, reader()));
        }

        if (source == butEqual) {
            writer(calc.calculateEqual(reader()));
        }

        if (source == butCancel) {
            writer(calc.reset());
        }

        text.selectAll();
    }

    public Double reader() {
        Double num;
        String str;
        str = text.getText();
        num = Double.valueOf(str);

        return num;
    }

    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            text.setText("");
        } else {
            text.setText(Double.toString(num));
        }
    }
}