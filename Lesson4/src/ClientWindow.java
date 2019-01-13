import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientWindow extends JFrame {

    private JTextArea jta;
    private JTextField jtf;

    public ClientWindow(){
        setTitle("Client");
        setBounds(700,300,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        jta = new JTextArea();
        jta.setEditable(false);
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp,BorderLayout.CENTER);

        JPanel bottom = new JPanel(new BorderLayout());
        jtf = new JTextField();
        JButton jSendMsg = new JButton("Send");
        bottom.add(jtf, BorderLayout.CENTER);
        bottom.add(jSendMsg, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);

        jSendMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });
        jtf.grabFocus();

        setVisible(true);
    }

    public void sendMsg(){
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}
