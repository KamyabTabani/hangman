package client;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import server.Client2Server;
import server.Server2Client;

public final class HangmanUI_PPage extends javax.swing.JFrame implements ClientInterface {

    Client2Server clientinput = new Client2Server();
    Server2Client serveranswer = new Server2Client();
    Handler handler;

    public HangmanUI_PPage(String h, int p) throws UnknownHostException, IOException {
        initComponents();
        this.setTitle("Hangman");

        clientinput.setaction(-1);
        clientinput.setclientword("");
        handler = new Handler(h, p, clientinput);

        new Thread(handler).start();
        serveranswer = handler.sendclientanswer(clientinput);
        this.setEnvironment(serveranswer);
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        failattempts = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        message = new javax.swing.JTextField();
        info = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        q = new javax.swing.JButton();
        w = new javax.swing.JButton();
        e = new javax.swing.JButton();
        r = new javax.swing.JButton();
        t = new javax.swing.JButton();
        y = new javax.swing.JButton();
        u = new javax.swing.JButton();
        i = new javax.swing.JButton();
        o = new javax.swing.JButton();
        a = new javax.swing.JButton();
        s = new javax.swing.JButton();
        d = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        j = new javax.swing.JButton();
        k = new javax.swing.JButton();
        p = new javax.swing.JButton();
        l = new javax.swing.JButton();
        z = new javax.swing.JButton();
        x = new javax.swing.JButton();
        c = new javax.swing.JButton();
        v = new javax.swing.JButton();
        b = new javax.swing.JButton();
        n = new javax.swing.JButton();
        m = new javax.swing.JButton();
        newgame = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fail Attempts");

        failattempts.setEditable(false);
        failattempts.setText("10");
        failattempts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failattemptsActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Score");

        score.setEditable(false);
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(failattempts)
                    .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(failattempts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        cword.setBackground(new java.awt.Color(204, 255, 204));
        cword.setEditable(false);
        cword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cword.setAlignmentY(0.0F);
        cword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cwordActionPerformed(evt);
            }
        });

        jLabel4.setText("Guess ");

        input.setEditable(false);
        input.setText("a letter or a word");

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        message.setEditable(false);
        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setBorder(null);

        info.setEditable(false);
        info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        info.setForeground(new java.awt.Color(255, 0, 0));
        info.setBorder(null);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(send)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear)
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cword, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cword, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send)
                    .addComponent(clear))
                .addContainerGap())
        );

        q.setText("q");
        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qMouseClicked(evt);
            }
        });

        w.setText("w");
        w.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wMouseClicked(evt);
            }
        });

        e.setText("e");
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });

        r.setText("r");
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMouseClicked(evt);
            }
        });

        t.setText("t");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });

        y.setText("y");
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        u.setText("u");
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });

        i.setText("i");
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        o.setText("o");
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
        });
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        a.setText("a");
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });

        s.setText("s");
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
        });

        d.setText("d");
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        f.setText("f");
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });

        g.setText("g");
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });

        h.setText("h");
        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hMouseClicked(evt);
            }
        });

        j.setText("j");
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });

        k.setText("k");
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
        });

        p.setText("p");
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        l.setText("l");
        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lMouseClicked(evt);
            }
        });

        z.setText("z");
        z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zMouseClicked(evt);
            }
        });

        x.setText("x");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });

        c.setText("c");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });

        v.setText("v");
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vMouseClicked(evt);
            }
        });

        b.setText("b");
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        n.setText("n");
        n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nMouseClicked(evt);
            }
        });
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        m.setText("m");
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mMouseClicked(evt);
            }
        });
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(q)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(w)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(u)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(o)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(z)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(v)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        newgame.setText("New Game");
        newgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newgameMouseClicked(evt);
            }
        });

        exit.setLabel("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newgame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(newgame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void cwordActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void yActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void uActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void iActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void oActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void pActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void bActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void nActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void mActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    String str = "";
    private void qMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(q.getText());
        input.setText(str);
    }

    private void wMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(w.getText());
        input.setText(str);
    }

    private void eMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(e.getText());
        input.setText(str);
    }

    private void rMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(r.getText());
        input.setText(str);
    }

    private void tMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(t.getText());
        input.setText(str);
    }

    private void yMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(y.getText());
        input.setText(str);
    }

    private void uMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(u.getText());
        input.setText(str);
    }

    private void iMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(i.getText());
        input.setText(str);
    }

    private void oMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(o.getText());
        input.setText(str);
    }

    private void pMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(p.getText());
        input.setText(str);
    }

    private void aMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(a.getText());
        input.setText(str);
    }

    private void sMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(s.getText());
        input.setText(str);
    }

    private void dActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void dMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(d.getText());
        input.setText(str);
    }

    private void fMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(f.getText());
        input.setText(str);
    }

    private void gMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(g.getText());
        input.setText(str);
    }

    private void hMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(h.getText());
        input.setText(str);
    }

    private void jMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(j.getText());
        input.setText(str);
    }

    private void kMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(k.getText());
        input.setText(str);
    }

    private void lMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(l.getText());
        input.setText(str);
    }

    private void zMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(z.getText());
        input.setText(str);
    }

    private void xMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(x.getText());
        input.setText(str);
    }

    private void cMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(c.getText());
        input.setText(str);
    }

    private void vMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(v.getText());
        input.setText(str);
    }

    private void bMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(b.getText());
        input.setText(str);
    }

    private void nMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(n.getText());
        input.setText(str);
    }

    private void mMouseClicked(java.awt.event.MouseEvent evt) {
        str = str.concat(m.getText());
        input.setText(str);
    }

    private void failattemptsActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void newgameMouseClicked(java.awt.event.MouseEvent evt) {
        str = "";
        clientinput.setclientword(str);
        clientinput.setaction(2);
        serveranswer = handler.sendclientanswer(clientinput);
        this.setEnvironment(serveranswer);
        input.setText(str);
        send.setEnabled(true);
        clear.setEnabled(true);
    }

private void sendActionPerformed(java.awt.event.ActionEvent evt) {

    clientinput.setclientword(str);
    clientinput.setaction(1);
   
    serveranswer = handler.sendclientanswer(clientinput);
    
    if (serveranswer.getMessage().equalsIgnoreCase("You win!!!") || serveranswer.getMessage().equalsIgnoreCase("You lost!!!")) {
        send.setEnabled(false);
        clear.setEnabled(false);

    }

    this.setEnvironment(serveranswer);
    str = "";
    input.setText(str);
    clientinput.setclientword(str);
    clientinput.setaction(-1);


}

private void exitMouseClicked(java.awt.event.MouseEvent evt) {

}

private void exitActionPerformed(java.awt.event.ActionEvent evt) {
    clientinput.setaction(3);
    handler.stop();
    System.exit(0);
}

private void clearActionPerformed(java.awt.event.ActionEvent evt) {
    str = "";
    input.setText(str);
}

    public void main() throws IOException {
        this.setVisible(true);
    }
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cword;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton exit;
    private javax.swing.JButton f;
    private javax.swing.JTextField failattempts;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JTextField info;
    private javax.swing.JTextField input;
    private javax.swing.JButton j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JTextField message;
    private javax.swing.JButton n;
    private javax.swing.JButton newgame;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JTextField score;
    private javax.swing.JButton send;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;

    public JTextField getFailattempts() {
        return failattempts;
    }

    public JTextField getInfo() {
        return info;
    }

    public JTextField getMessage() {
        return message;
    }

    public JTextField getScore() {
        return score;
    }

    public JTextField getCword() {
        return cword;
    }

    public void actionPerformed(ActionEvent e) {
    }
    
    public void setEnvironment(final Server2Client serveranswer) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                cword.setText((serveranswer.getWord()).toString());
                message.setText(serveranswer.getMessage());
                failattempts.setText(String.valueOf(serveranswer.getFailAttempts()));
                info.setText(serveranswer.getInfo());
                score.setText(String.valueOf(serveranswer.getScore()) + "-" + String.valueOf(serveranswer.getGames()));

            }
        });

    }

    @Override
    public Server2Client sendclientanswer(Client2Server clientanswer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
