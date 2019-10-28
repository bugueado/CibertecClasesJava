package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Virtual_2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JButton btnAdicionar;
    private JButton btnIntercambiar1;
    private JButton btnEliminar1;
    private JButton btnIntercambiar2;
    private JButton btnEliminar2;
    private JScrollPane scrollPane;
    private JTextArea txtS;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Virtual_2 frame = new Virtual_2();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Virtual_2() {
        setTitle("Actividad Virtual 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 546, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblCodigo = new JLabel("Código");
        lblCodigo.setBounds(10, 10, 46, 23);
        contentPane.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(66, 10, 86, 23);
        contentPane.add(txtCodigo);
        txtCodigo.setColumns(10);

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(this);
        btnAdicionar.setBounds(400, 40, 121, 23);
        contentPane.add(btnAdicionar);

        btnIntercambiar1 = new JButton("Intercambiar 1");
        btnIntercambiar1.addActionListener(this);
        btnIntercambiar1.setBounds(400, 70, 121, 23);
        contentPane.add(btnIntercambiar1);

        btnEliminar1 = new JButton("Eliminar 1");
        btnEliminar1.addActionListener(this);
        btnEliminar1.setBounds(400, 100, 121, 23);
        contentPane.add(btnEliminar1);

        btnIntercambiar2 = new JButton("Intercambiar 2");
        btnIntercambiar2.addActionListener(this);
        btnIntercambiar2.setBounds(400, 130, 121, 23);
        contentPane.add(btnIntercambiar2);

        btnEliminar2 = new JButton("Eliminar 2");
        btnEliminar2.addActionListener(this);
        btnEliminar2.setBounds(400, 160, 121, 23);
        contentPane.add(btnEliminar2);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 40, 380, 412);
        contentPane.add(scrollPane);

        txtS = new JTextArea();
        txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
        scrollPane.setViewportView(txtS);
    }

    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == btnEliminar2) {
            actionPerformedBtnEliminar2(arg0);
        }
        if (arg0.getSource() == btnIntercambiar2) {
            actionPerformedBtnIntercambiar2(arg0);
        }
        if (arg0.getSource() == btnEliminar1) {
            actionPerformedBtnEliminar1(arg0);
        }
        if (arg0.getSource() == btnIntercambiar1) {
            actionPerformedBtnIntercambiar1(arg0);
        }
        if (arg0.getSource() == btnAdicionar) {
            actionPerformedBtnAdicionar(arg0);
        }
        limpieza();
    }

    protected void actionPerformedBtnAdicionar(ActionEvent arg0) {

    }
    protected void actionPerformedBtnIntercambiar1(ActionEvent arg0) {

    }
    protected void actionPerformedBtnEliminar1(ActionEvent arg0) {

    }
    protected void actionPerformedBtnIntercambiar2(ActionEvent arg0) {

    }
    protected void actionPerformedBtnEliminar2(ActionEvent arg0) {

    }
    //  Métodos tipo void (sin parámetros)
    void listar() {

    }
    void limpieza() {
        txtCodigo.setText("");
        txtCodigo.requestFocus();
    }
    void imprimir() {
        imprimir("");
    }
    //  Métodos tipo void (con parámetros)
    void imprimir(String s) {
        txtS.append(s + "\n");
    }
    void mensaje(String s) {
        JOptionPane.showMessageDialog(this, s);
    }
    //  Métodos que retornan valor (sin parámetros)
    int leerCodigo()  {
        return Integer.parseInt(txtCodigo.getText().trim());
    }

}