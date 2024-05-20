import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;

public class FormPendaftaran extends JFrame {
    private JTextField txtNama, txtNomorPendaftaran, txtNomorTelepon, txtEmail;
    private JFormattedTextField txtTanggalLahir;
    private JTextArea txtAlamat;
    private JButton btnSubmit;

    public FormPendaftaran() {
        setTitle("Form Pendaftaran Mahasiswa Baru");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        JLabel lblTanggalJam = new JLabel("Tanggal & Jam:");
        JLabel lblTanggalJamValue = new JLabel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        lblTanggalJamValue.setText(sdf.format(new Date()));

        JLabel lblNama = new JLabel("Nama Lengkap:");
        txtNama = new JTextField();
        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir (dd/mm/yyyy):");
        try {
            MaskFormatter formatter = new MaskFormatter("##/##/####");
            txtTanggalLahir = new JFormattedTextField(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel lblNomorPendaftaran = new JLabel("Nomor Pendaftaran:");
        txtNomorPendaftaran = new JTextField();
        JLabel lblNomorTelepon = new JLabel("No. Telepon:");
        txtNomorTelepon = new JTextField();
        JLabel lblAlamat = new JLabel("Alamat:");
        txtAlamat = new JTextArea();
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();

        panel.add(lblTanggalJam);
        panel.add(lblTanggalJamValue);
        panel.add(lblNama);
        panel.add(txtNama);
        panel.add(lblTanggalLahir);
        panel.add(txtTanggalLahir);
        panel.add(lblNomorPendaftaran);
        panel.add(txtNomorPendaftaran);
        panel.add(lblNomorTelepon);
        panel.add(txtNomorTelepon);
        panel.add(lblAlamat);
        panel.add(new JScrollPane(txtAlamat));
        panel.add(lblEmail);
        panel.add(txtEmail);

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNama.getText().isEmpty() || txtTanggalLahir.getText().isEmpty()
                        || txtNomorPendaftaran.getText().isEmpty() ||
                        txtNomorTelepon.getText().isEmpty() || txtAlamat.getText().isEmpty()
                        || txtEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus terisi!", "Peringatan",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    int choice = JOptionPane.showConfirmDialog(null,
                            "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi",
                            JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        tampilkanData();
                    }
                }
            }
        });
        panel.add(btnSubmit);

        add(panel);
        setVisible(true);
    }

    private void tampilkanData() {
        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));

        JLabel lblTanggalJam = new JLabel(
                "Tanggal & Jam: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        JLabel lblNama = new JLabel("Nama Lengkap: " + txtNama.getText());
        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir: " + txtTanggalLahir.getText());
        JLabel lblNomorPendaftaran = new JLabel("Nomor Pendaftaran: " + txtNomorPendaftaran.getText());
        JLabel lblNomorTelepon = new JLabel("No. Telepon: " + txtNomorTelepon.getText());
        JLabel lblAlamat = new JLabel("Alamat: " + txtAlamat.getText());
        JLabel lblEmail = new JLabel("Email: " + txtEmail.getText());

        panel.add(lblTanggalJam);
        panel.add(lblNama);
        panel.add(lblTanggalLahir);
        panel.add(lblNomorPendaftaran);
        panel.add(lblNomorTelepon);
        panel.add(lblAlamat);
        panel.add(lblEmail);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormPendaftaran();
            }
        });
    }
}
