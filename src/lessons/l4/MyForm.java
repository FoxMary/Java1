package lessons.l4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
    private JTextArea jta;       //многострочное текстовое поле

    public MyForm() {
        setTitle("My Test Form");       //название окна
        setBounds(1000, 200, 400, 400);     //размер окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        //приложение закрывается с закрытием окна
        setLayout(new BorderLayout());      // расположение по краям или в центре
        jta = new JTextArea(100, 10);
        JScrollPane jsp = new JScrollPane(jta);        //пролистываемая панель
        add(jsp, BorderLayout.CENTER);      //панель добавляется в окно
        JPanel bottomPanel = new JPanel(new GridLayout(1, 4));      //создание панели с кнопками
        for (int i = 0; i < 4; i++) {
            JButton jb = new JButton("#" + (i + 1));        //создание кнопок
            bottomPanel.add(jb);        //добавление каждой кнопки на панель
            jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jta.append("A\n");
                }
            });
        }
        add(bottomPanel, BorderLayout.SOUTH);       //добавление панели кнопок в окно
        JButton upperButton = new JButton("Clear");
        add(upperButton, BorderLayout.NORTH);
        upperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextArea();
            }
        });



        setVisible(true);       //окно становится видимым
    }

    public void clearTextArea() {
        jta.setText(" ");
    }
}
