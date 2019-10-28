package gui;

import java.awt.EventQueue;
import semana_02.Video;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_2_1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JButton btnProcesar;
    private JScrollPane scrollPane;
    private JTextArea txtS;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Propuesto_2_1 frame = new Propuesto_2_1();
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
    public Propuesto_2_1() {
        setTitle("Propuesto_2_1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnProcesar = new JButton("Procesar");
        btnProcesar.addActionListener(this);
        btnProcesar.setBounds(173, 11, 89, 23);
        contentPane.add(btnProcesar);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 48, 414, 403);
        contentPane.add(scrollPane);

        txtS = new JTextArea();
        txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
        scrollPane.setViewportView(txtS);
    }
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == btnProcesar) {
            actionPerformedBtnProcesar(arg0);
        }
    }
    protected void actionPerformedBtnProcesar(ActionEvent arg0) {
        Video v = new Video(123, "Los Vengadores", 1500.00, 3.44);
        listado(v);

        v.setPrecioSoles(v.getPrecioSoles() + 5.50);
        listado(v);
    }
    //  Métodos tipo void (con parámetros)
    void imprimir(String s) {
        txtS.append(s + "\n");
    }

    void listado(Video x){
        imprimir("Dirmem: " + x);
        imprimir("codigo: " + x.getCodigo());
        imprimir("nombre: " + x.getNombreVideo());
        imprimir("precio en soles: " + x.getPrecioSoles());
        imprimir("tipo de cambio: " + x.getTipoCambio());
        imprimir("precio en dolares: " + x.precioDolares());
        imprimir("");
    }

}