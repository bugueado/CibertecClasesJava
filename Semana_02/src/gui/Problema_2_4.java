package gui;

import java.awt.EventQueue;
import semana_02.Obrero;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_2_4 extends JFrame implements ActionListener {

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
                    Problema_2_4 frame = new Problema_2_4();
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
    public Problema_2_4() {
        setTitle("Problema_2_4");
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
        Obrero o = new Obrero(123, "Fernando", 30, 50.5);
        listado(o);

        o.setHorasTrabajadas(o.getHorasTrabajadas() + 8);
        o.setTarifaHora(o.getTarifaHora() - (o.getTarifaHora()*0.015));
        listado(o);
    }
    //  Métodos tipo void (con parámetros)
    void imprimir(String s) {
        txtS.append(s + "\n");
    }

    void listado(Obrero x){
        imprimir("Dirmem: " + x);
        imprimir("codigo: " + x.getCodigo());
        imprimir("nombre: " + x.getNombre());
        imprimir("horas trabajadas: " + x.getHorasTrabajadas());
        imprimir("tarifa: " + x.getTarifaHora());
        imprimir("sueldo bruto: " + x.sueldoBruto());
        imprimir("afp: " + x.afp());
        imprimir("eps: " + x.eps());
        imprimir("sueldo neto: " + x.sueldoNeto());
        imprimir("");
    }

}