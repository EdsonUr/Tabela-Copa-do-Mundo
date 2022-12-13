import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Frame extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTextArea text1a;
    private JTextArea text2a;
    private JTextArea text3a;
    private JTextArea text5a;
    private JTextArea text7a;
    private JTextArea text9a;
    private JTextArea text11a;
    private JTextArea text12a;
    private JTextArea text10a;
    private JTextArea text8a;
    private JTextArea text6a;
    private JTextArea text4a;
    private JPanel mainPanel;
    private JButton btnA;
    private JLabel firstA;
    private JLabel segundoA;
    private JLabel terceiroA;
    private JPanel qua;
    private JLabel quartoA;
    private JLabel pts1a;
    private JLabel pts2a;
    private JLabel pts3a;
    private JLabel pts4a;
    private JLabel sg1a;
    private JLabel sg2a;
    private JLabel sg3a;
    private JLabel sg4a;
    private JLabel qtg1a;
    private JLabel qtdg2a;
    private JLabel qtdg3a;
    private JLabel qtdg4a;
    private JList list1;
    private JList list2;
    private JList list3;
    private JList list4;
    private JList list5;
    private JList list6;
    private JLabel ft1a;
    private JButton btnB;
    private JTextArea text1b;
    private JTextArea text2b;
    private JTextArea text3b;
    private JTextArea text4b;
    private JTextArea text5b;
    private JTextArea text6b;
    private JTextArea text7b;
    private JTextArea text8b;
    private JTextArea text9b;
    private JTextArea text10b;
    private JTextArea text11b;
    private JTextArea text12b;
    private JLabel firstB;
    private JLabel segundoB;
    private JLabel terceiroB;
    private JLabel quartoB;
    private JLabel pts1b;
    private JLabel pts2b;
    private JLabel pts3b;
    private JLabel pts4b;
    private JLabel sg1b;
    private JLabel sg2b;
    private JLabel sg3b;
    private JLabel sg4b;
    private JLabel qtdg1b;
    private JLabel qtdg2b;
    private JLabel qtdg3b;
    private JLabel qtdg4b;
    private JLabel a1;
    private JLabel b2;
    private JLabel a2;
    private JLabel b1;
    private JTextArea text1c;
    private JTextArea text2c;
    private JTextArea text3c;
    private JTextArea text4c;
    private JTextArea text5c;
    private JTextArea text6c;
    private JTextArea text7c;
    private JTextArea text8c;
    private JTextArea text9c;
    private JTextArea text10c;
    private JTextArea text11c;
    private JTextArea text12c;
    private JLabel firstC;
    private JLabel segundoC;
    private JLabel terceiroC;
    private JLabel quartoC;
    private JLabel pts1c;
    private JLabel pts2c;
    private JLabel pts3c;
    private JLabel pts4c;
    private JLabel sg1c;
    private JLabel sg2c;
    private JLabel sg3c;
    private JLabel sg4c;
    private JLabel qtdg1c;
    private JLabel qtdg2c;
    private JLabel qtdg3c;
    private JLabel qtdg4c;
    private JLabel c1;
    private JLabel c2;
    private JButton btnC;
    private JTextArea text1d;
    private JTextArea text2d;
    private JTextArea text3d;
    private JTextArea text4d;
    private JTextArea text5d;
    private JTextArea text6d;
    private JTextArea text7d;
    private JTextArea text8d;
    private JTextArea text9d;
    private JTextArea text10d;
    private JTextArea text11d;
    private JTextArea text12d;
    private JLabel firstD;
    private JLabel segundoD;
    private JLabel terceiroD;
    private JLabel quartoD;
    private JLabel pts1d;
    private JLabel pts2d;
    private JLabel pts3d;
    private JLabel pts4d;
    private JLabel sg1d;
    private JLabel sg2d;
    private JLabel sg3d;
    private JLabel sg4d;
    private JLabel qtdg1d;
    private JLabel qtdg2d;
    private JLabel qtdg3d;
    private JLabel qtdg4d;
    private JLabel d2;
    private JLabel d1;
    private JButton btnD;
    private JTextArea text1e;
    private JTextArea text2e;
    private JTextArea text3e;
    private JTextArea text4e;
    private JTextArea text5e;
    private JTextArea text6e;
    private JTextArea text7e;
    private JTextArea text8e;
    private JTextArea text9e;
    private JTextArea text10e;
    private JTextArea text11e;
    private JTextArea text12e;
    private JLabel firstE;
    private JLabel segundoE;
    private JLabel terceiroE;
    private JLabel quartoE;
    private JLabel pts1e;
    private JLabel pts2e;
    private JLabel pts3e;
    private JLabel pts4e;
    private JLabel sg1e;
    private JLabel sg2e;
    private JLabel sg3e;
    private JLabel sg4e;
    private JLabel qtdg1e;
    private JLabel qtdg2e;
    private JLabel qtdg3e;
    private JLabel qtdg4e;
    private JTextArea text1f;
    private JTextArea text2f;
    private JTextArea text3f;
    private JTextArea text4f;
    private JTextArea text5f;
    private JTextArea text6f;
    private JTextArea text7f;
    private JTextArea text8f;
    private JTextArea text9f;
    private JTextArea text10f;
    private JTextArea text11f;
    private JTextArea text12f;
    private JLabel firstF;
    private JLabel segundoF;
    private JLabel terceiroF;
    private JLabel quartoF;
    private JLabel pts1f;
    private JLabel pts2f;
    private JLabel pts3f;
    private JLabel pts4f;
    private JLabel sg1f;
    private JLabel sg2f;
    private JLabel sg3f;
    private JLabel sg4f;
    private JLabel qtdg1f;
    private JLabel qtdg2f;
    private JLabel qtdg3f;
    private JLabel qtdg4f;
    private JButton btnE;
    private JButton btnF;
    private JLabel e1;
    private JLabel e2;
    private JLabel f2;
    private JLabel f1;
    private JTextArea text1g;
    private JTextArea text2g;
    private JTextArea text3g;
    private JTextArea text4g;
    private JTextArea text5g;
    private JTextArea text6g;
    private JTextArea text7g;
    private JTextArea text8g;
    private JTextArea text9g;
    private JTextArea text10g;
    private JTextArea text11g;
    private JTextArea text12g;
    private JLabel firstG;
    private JLabel segundoG;
    private JLabel terceiroG;
    private JLabel quartoG;
    private JLabel pts1g;
    private JLabel pts2g;
    private JLabel pts3g;
    private JLabel pts4g;
    private JLabel sg1g;
    private JLabel sg2g;
    private JLabel sg3g;
    private JLabel sg4g;
    private JLabel qtdg1g;
    private JLabel qtdg2g;
    private JLabel qtdg3g;
    private JLabel qtdg4g;
    private JLabel g1;
    private JLabel g2;
    private JTextArea text1h;
    private JTextArea text2h;
    private JTextArea text3h;
    private JTextArea text4h;
    private JTextArea text5h;
    private JTextArea text6h;
    private JTextArea text7h;
    private JTextArea text8h;
    private JTextArea text9h;
    private JTextArea text10h;
    private JTextArea text11h;
    private JTextArea text12h;
    private JLabel firstH;
    private JLabel segundoH;
    private JLabel terceiroH;
    private JLabel quartoH;
    private JLabel pts1h;
    private JLabel pts2h;
    private JLabel pts3h;
    private JLabel pts4h;
    private JLabel sg1h;
    private JLabel sg2h;
    private JLabel sg3h;
    private JLabel sg4h;
    private JLabel qtdg1h;
    private JLabel qtdg2h;
    private JLabel qtdg3h;
    private JLabel qtdg4h;
    private JLabel h1;
    private JLabel h2;
    private JButton btnG;
    private JButton btnH;
    private JTextArea oit1g;
    private JTextArea oit2g;
    private JTextArea oit3g;
    private JTextArea oit4g;
    private JTextArea oit5g;
    private JTextArea oit6g;
    private JTextArea oit7g;
    private JTextArea oit8g;
    private JTextArea oit9g;
    private JTextArea oit10g;
    private JTextArea oit11g;
    private JTextArea oit12g;
    private JTextArea oit13g;
    private JTextArea oit14g;
    private JTextArea oit15g;
    private JTextArea oit16g;
    private JButton oitavasBtn;
    private JButton quartasBtn;
    private JButton SemisBtn;
    private JButton finalBtn;
    private JTextArea po1;
    private JTextArea po2;
    private JTextArea po3;
    private JTextArea po4;
    private JTextArea po5;
    private JTextArea po6;
    private JTextArea po7;
    private JTextArea po8;
    private JTextArea po9;
    private JTextArea po10;
    private JTextArea po11;
    private JTextArea po12;
    private JTextArea po13;
    private JTextArea po14;
    private JTextArea po15;
    private JTextArea po16;
    private JLabel qua1;
    private JLabel qua2;
    private JLabel qua3;
    private JLabel qua4;
    private JLabel qua5;
    private JLabel qua6;
    private JLabel qua7;
    private JLabel qua8;
    private JTextArea q1;
    private JTextArea q2;
    private JTextArea q3;
    private JTextArea q4;
    private JTextArea q5;
    private JTextArea q6;
    private JTextArea q7;
    private JTextArea q8;
    private JTextArea qp1;
    private JTextArea qp2;
    private JTextArea qp3;
    private JTextArea qp4;
    private JTextArea qp5;
    private JTextArea qp6;
    private JTextArea qp7;
    private JTextArea qp8;
    private JLabel semi1;
    private JLabel semi2;
    private JLabel semi3;
    private JLabel semi4;
    private JTextArea s1;
    private JTextArea s2;
    private JTextArea s3;
    private JTextArea s4;
    private JTextArea sg1;
    private JTextArea sg2;
    private JTextArea sg3;
    private JTextArea sg4;
    private JLabel finalista1;
    private JLabel finalista2;
    private JLabel terceiro1;
    private JLabel terceiro2;
    private JLabel primeiroLugar;
    private JLabel segundoLugar;
    private JLabel terceiroLugar;
    private JTextArea f1g;
    private JTextArea f1p;
    private JTextArea f2g;
    private JTextArea f2p;
    private JTextArea t1g;
    private JTextArea t1p;
    private JTextArea t2g;
    private JTextArea t2p;

    public Frame(){
        LogicaCompartilhada l = new LogicaCompartilhada();
        ArrayList<String> arquivos = new ArrayList<>();

        Grupo a = new Grupo("A");
        Selecao catar = new Selecao("Catar");
        Selecao senegal = new Selecao("Senegal");
        Selecao holanda = new Selecao("Holanda");
        Selecao equador = new Selecao("Equador");
        a.setSelecoes(catar);
        a.setSelecoes(senegal);
        a.setSelecoes(holanda);
        a.setSelecoes(equador);

        Grupo b = new Grupo("B");
        Selecao inglaterra = new Selecao("Inglaterra");
        Selecao ira = new Selecao("Irã");
        Selecao gales = new Selecao("País de Gales");
        Selecao usa = new Selecao("Estados Unidos");
        b.setSelecoes(inglaterra);
        b.setSelecoes(ira);
        b.setSelecoes(gales);
        b.setSelecoes(usa);

        Grupo c = new Grupo("C");
        Selecao argentina = new Selecao("Argentina");
        Selecao arabia = new Selecao("Arábia Saudita");
        Selecao mexico = new Selecao("México");
        Selecao polonia = new Selecao("Polônia");
        c.setSelecoes(argentina);
        c.setSelecoes(arabia);
        c.setSelecoes(mexico);
        c.setSelecoes(polonia);

        Grupo d = new Grupo("D");
        Selecao dinamarca = new Selecao("Dinamarca");
        Selecao tunisia = new Selecao("Tunísia");
        Selecao franca = new Selecao("França");
        Selecao australia = new Selecao("Austrália");
        d.setSelecoes(dinamarca);
        d.setSelecoes(tunisia);
        d.setSelecoes(franca);
        d.setSelecoes(australia);

        Grupo E = new Grupo("E");
        Selecao alemanha = new Selecao("Alemanha");
        Selecao japao = new Selecao("Japão");
        Selecao espanha = new Selecao("Espanha");
        Selecao costarica = new Selecao("Costa Rica");
        E.setSelecoes(alemanha);
        E.setSelecoes(japao);
        E.setSelecoes(espanha);
        E.setSelecoes(costarica);

        Grupo f = new Grupo("F");
        Selecao marrocos = new Selecao("Marrocos");
        Selecao croacia = new Selecao("Croácia");
        Selecao belgica = new Selecao("Bélgica");
        Selecao canada = new Selecao("Canadá");
        f.setSelecoes(marrocos);
        f.setSelecoes(croacia);
        f.setSelecoes(belgica);
        f.setSelecoes(canada);

        Grupo g = new Grupo("G");
        Selecao suica = new Selecao("Suiça");
        Selecao camaroes = new Selecao("Camarões");
        Selecao brasil = new Selecao("Brasil");
        Selecao servia = new Selecao("Sérvia");
        g.setSelecoes(suica);
        g.setSelecoes(camaroes);
        g.setSelecoes(brasil);
        g.setSelecoes(servia);

        Grupo h = new Grupo("H");
        Selecao uruguai = new Selecao("Uruguai");
        Selecao coreia = new Selecao("Coreia do Sul");
        Selecao portugal = new Selecao("Portugal");
        Selecao gana = new Selecao("Gana");
        h.setSelecoes(uruguai);
        h.setSelecoes(coreia);
        h.setSelecoes(portugal);
        h.setSelecoes(gana);

        Selecao generica  = new Selecao("Generica");
        Partidas generica2 = new Partidas(generica,generica,0,0);
        Eliminatorias eliminatorias = new Eliminatorias(generica,generica2);

        setContentPane(mainPanel);
        setTitle("Bracket Simulator");
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        l.verificaArquivoGrupos("A.txt",new JTextArea[]{text1a,text2a,text3a,text4a,text5a,text6a,text7a,text8a,text9a,text10a,text11a,text12a}, new JLabel[]{firstA,segundoA,terceiroA,quartoA,pts1a,pts2a,pts3a,pts4a,sg1a,sg2a,sg3a,sg4a,qtg1a,qtdg2a,qtdg3a,qtdg4a,a1,a2},a,eliminatorias);
        l.verificaArquivoGrupos("B.txt",new JTextArea[]{text1b,text2b,text3b,text4b,text5b,text6b,text7b,text8b,text9b,text10b,text11b,text12b}, new JLabel[]{firstB,segundoB,terceiroB,quartoB,pts1b,pts2b,pts3b,pts4b,sg1b,sg2b,sg3b,sg4b,qtdg1b,qtdg2b,qtdg3b,qtdg4b,b1,b2},b,eliminatorias);
        l.verificaArquivoGrupos("C.txt",new JTextArea[]{text1c,text2c,text3c,text4c,text5c,text6c,text7c,text8c,text9c,text10c,text11c,text12c}, new JLabel[]{firstC,segundoC,terceiroC,quartoC,pts1c,pts2c,pts3c,pts4c,sg1c,sg2c,sg3c,sg4c,qtdg1c,qtdg2c,qtdg3c,qtdg4c,c1,c2},c,eliminatorias);
        l.verificaArquivoGrupos("D.txt",new JTextArea[]{text1d,text2d,text3d,text4d,text5d,text6d,text7d,text8d,text9d,text10d,text11d,text12d}, new JLabel[]{firstD,segundoD,terceiroD,quartoD,pts1d,pts2d,pts3d,pts4d,sg1d,sg2d,sg3d,sg4d,qtdg1d,qtdg2d,qtdg3d,qtdg4d,d1,d2},d,eliminatorias);
        l.verificaArquivoGrupos("E.txt",new JTextArea[]{text1e,text2e,text3e,text4e,text5e,text6e,text7e,text8e,text9e,text10e,text11e,text12e}, new JLabel[]{firstE,segundoE,terceiroE,quartoE,pts1e,pts2e,pts3e,pts4e,sg1e,sg2e,sg3e,sg4e,qtdg1e,qtdg2e,qtdg3e,qtdg4e,e1,e2},E,eliminatorias);
        l.verificaArquivoGrupos("F.txt",new JTextArea[]{text1f,text2f,text3f,text4f,text5f,text6f,text7f,text8f,text9f,text10f,text11f,text12f}, new JLabel[]{firstF,segundoF,terceiroF,quartoF,pts1f,pts2f,pts3f,pts4f,sg1f,sg2f,sg3f,sg4f,qtdg1f,qtdg2f,qtdg3f,qtdg4f,f1,f2},f,eliminatorias);
        l.verificaArquivoGrupos("G.txt",new JTextArea[]{text1g,text2g,text3g,text4g,text5g,text6g,text7g,text8g,text9g,text10g,text11g,text12g}, new JLabel[]{firstG,segundoG,terceiroG,quartoG,pts1g,pts2g,pts3g,pts4g,sg1g,sg2g,sg3g,sg4g,qtdg1g,qtdg2g,qtdg3g,qtdg4g,g1,g2},g,eliminatorias);
        l.verificaArquivoGrupos("H.txt",new JTextArea[]{text1h,text2h,text3h,text4h,text5h,text6h,text7h,text8h,text9h,text10h,text11h,text12h}, new JLabel[]{firstH,segundoH,terceiroH,quartoH,pts1h,pts2h,pts3h,pts4h,sg1h,sg2h,sg3h,sg4h,qtdg1h,qtdg2h,qtdg3h,qtdg4h,h1,h2},h,eliminatorias);
        try {
            String info = Arquivo.ReadLista("listaArquivos.txt");
            String[] infoBox = info.split(";");
            for(int i =0; i< infoBox.length;i++){
                if(Files.exists(Path.of(infoBox[i]))){
                    arquivos.add(infoBox[i]);
                }
            }
            if(arquivos.size()!=8){
                Files.deleteIfExists(Path.of("Oitavas.txt"));
                Files.deleteIfExists(Path.of("Quartas.txt"));
                Files.deleteIfExists(Path.of("Semis.txt"));
                Files.deleteIfExists(Path.of("Finais.txt"));
            }else if(!Files.exists(Path.of("Oitavas.txt"))){
                Files.deleteIfExists(Path.of("Quartas.txt"));
                Files.deleteIfExists(Path.of("Semis.txt"));
                Files.deleteIfExists(Path.of("Finais.txt"));
            }else if(!Files.exists(Path.of("Quartas.txt"))){
                Files.deleteIfExists(Path.of("Semis.txt"));
                Files.deleteIfExists(Path.of("Finais.txt"));
            }else if(!Files.exists(Path.of("Semis.txt"))){
                Files.deleteIfExists(Path.of("Finais.txt"));
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        l.verificaArquivoFinais("Oitavas.txt",40, new JTextArea[]{oit1g, po1, oit2g, po2, oit3g, po3, oit4g, po4, oit5g, po5, oit6g, po6, oit7g, po7, oit8g, po8, oit9g, po9, oit10g, po10, oit11g, po11, oit12g, po12, oit13g, po13, oit14g, po14, oit15g, po15, oit16g, po16}, new JLabel[]{qua1, qua2, qua3, qua4, qua5, qua6, qua7, qua8},eliminatorias);
        l.verificaArquivoFinais("Quartas.txt",20, new JTextArea[]{q1, qp1, q2, qp2, q3, qp3, q4, qp4, q5, qp5, q6, qp6, q7, qp7, q8, qp8}, new JLabel[]{semi1, semi2, semi3, semi4},eliminatorias);
        l.verificaArquivoFinais("Semis.txt",12, new JTextArea[]{s1, sg1, s2, sg2, s3, sg3, s4, sg4}, new JLabel[]{finalista1, finalista2, terceiro1, terceiro2},eliminatorias);
        l.verificaArquivoFinais("Finais.txt",11, new JTextArea[]{f1g, f1p, f2g, f2p, t1g, t1p, t2g, t2p}, new JLabel[]{primeiroLugar, segundoLugar, terceiroLugar},eliminatorias);

        btnA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstA,segundoA,terceiroA,quartoA,pts1a,pts2a,pts3a,pts4a,sg1a,sg2a,sg3a,sg4a,qtg1a,qtdg2a,qtdg3a,qtdg4a,a1,a2};
                JTextArea[] textAreas = {text1a,text2a,text3a,text4a,text5a,text6a,text7a,text8a,text9a,text10a,text11a,text12a};
                l.logicaGrupos(catar,senegal,holanda,equador,textAreas,labels,a,eliminatorias,0,9,arquivos);
            }
        });
        btnB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstB,segundoB,terceiroB,quartoB,pts1b,pts2b,pts3b,pts4b,sg1b,sg2b,sg3b,sg4b,qtdg1b,qtdg2b,qtdg3b,qtdg4b,b1,b2};
                JTextArea[] textAreas = {text1b,text2b,text3b,text4b,text5b,text6b,text7b,text8b,text9b,text10b,text11b,text12b};
                l.logicaGrupos(inglaterra,ira,gales,usa,textAreas,labels,b,eliminatorias,8,1,arquivos);
            }
        });

        btnC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstC,segundoC,terceiroC,quartoC,pts1c,pts2c,pts3c,pts4c,sg1c,sg2c,sg3c,sg4c,qtdg1c,qtdg2c,qtdg3c,qtdg4c,c1,c2};
                JTextArea[] textAreas = {text1c,text2c,text3c,text4c,text5c,text6c,text7c,text8c,text9c,text10c,text11c,text12c};
                l.logicaGrupos(argentina,arabia,mexico,polonia,textAreas,labels,c,eliminatorias,2,11,arquivos);
            }
        });
        btnD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstD,segundoD,terceiroD,quartoD,pts1d,pts2d,pts3d,pts4d,sg1d,sg2d,sg3d,sg4d,qtdg1d,qtdg2d,qtdg3d,qtdg4d,d1,d2};
                JTextArea[] textAreas = {text1d,text2d,text3d,text4d,text5d,text6d,text7d,text8d,text9d,text10d,text11d,text12d};
                l.logicaGrupos(dinamarca,tunisia,franca,australia,textAreas,labels,d,eliminatorias,10,3,arquivos);
            }
        });
        btnE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstE,segundoE,terceiroE,quartoE,pts1e,pts2e,pts3e,pts4e,sg1e,sg2e,sg3e,sg4e,qtdg1e,qtdg2e,qtdg3e,qtdg4e,e1,e2};
                JTextArea[] textAreas = {text1e,text2e,text3e,text4e,text5e,text6e,text7e,text8e,text9e,text10e,text11e,text12e};
                l.logicaGrupos(alemanha,japao,espanha,costarica,textAreas,labels,E,eliminatorias,4,13,arquivos);
            }
        });
        btnF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstF,segundoF,terceiroF,quartoF,pts1f,pts2f,pts3f,pts4f,sg1f,sg2f,sg3f,sg4f,qtdg1f,qtdg2f,qtdg3f,qtdg4f,f1,f2};
                JTextArea[] textAreas = {text1f,text2f,text3f,text4f,text5f,text6f,text7f,text8f,text9f,text10f,text11f,text12f};
                l.logicaGrupos(marrocos,croacia,belgica,canada,textAreas,labels,f,eliminatorias,12,5,arquivos);
            }
        });
        btnG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstG,segundoG,terceiroG,quartoG,pts1g,pts2g,pts3g,pts4g,sg1g,sg2g,sg3g,sg4g,qtdg1g,qtdg2g,qtdg3g,qtdg4g,g1,g2};
                JTextArea[] textAreas = {text1g,text2g,text3g,text4g,text5g,text6g,text7g,text8g,text9g,text10g,text11g,text12g};
                l.logicaGrupos(suica,camaroes,brasil,servia,textAreas,labels,g,eliminatorias,6,15,arquivos);
            }
        });
        btnH.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JLabel[] labels = {firstH,segundoH,terceiroH,quartoH,pts1h,pts2h,pts3h,pts4h,sg1h,sg2h,sg3h,sg4h,qtdg1h,qtdg2h,qtdg3h,qtdg4h,h1,h2};
                JTextArea[] textAreas = {text1h,text2h,text3h,text4h,text5h,text6h,text7h,text8h,text9h,text10h,text11h,text12h};
                l.logicaGrupos(uruguai,coreia,portugal,gana,textAreas,labels,h,eliminatorias,14,7,arquivos);
            }
        });
        oitavasBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int controle = 0;
                try {
                    super.mouseClicked(e);
                    if(arquivos.size() != 8){
                        controle = 1;
                        throw new Exception();
                    }
                    JTextArea[] textAreas = {oit1g, po1, oit2g, po2, oit3g, po3, oit4g, po4, oit5g, po5, oit6g, po6, oit7g, po7, oit8g, po8, oit9g, po9, oit10g, po10, oit11g, po11, oit12g, po12, oit13g, po13, oit14g, po14, oit15g, po15, oit16g, po16};
                    for(JTextArea textArea: textAreas){
                        if(Integer.parseInt(textArea.getText())<0){
                            throw new Exception();
                        }
                    }
                    Partidas poit1 = new Partidas(eliminatorias.getOitavas().get(0),eliminatorias.getOitavas().get(1),Integer.parseInt(oit1g.getText()),Integer.parseInt(po1.getText()),Integer.parseInt(oit2g.getText()),Integer.parseInt(po2.getText()));
                    Partidas poit2 = new Partidas(eliminatorias.getOitavas().get(2),eliminatorias.getOitavas().get(3),Integer.parseInt(oit3g.getText()),Integer.parseInt(po3.getText()),Integer.parseInt(oit4g.getText()),Integer.parseInt(po4.getText()));
                    Partidas poit3 = new Partidas(eliminatorias.getOitavas().get(4),eliminatorias.getOitavas().get(5),Integer.parseInt(oit5g.getText()),Integer.parseInt(po5.getText()),Integer.parseInt(oit6g.getText()),Integer.parseInt(po6.getText()));
                    Partidas poit4 = new Partidas(eliminatorias.getOitavas().get(6),eliminatorias.getOitavas().get(7),Integer.parseInt(oit7g.getText()),Integer.parseInt(po7.getText()),Integer.parseInt(oit8g.getText()),Integer.parseInt(po8.getText()));
                    Partidas poit5 = new Partidas(eliminatorias.getOitavas().get(8),eliminatorias.getOitavas().get(9),Integer.parseInt(oit9g.getText()),Integer.parseInt(po9.getText()),Integer.parseInt(oit10g.getText()),Integer.parseInt(po10.getText()));
                    Partidas poit6 = new Partidas(eliminatorias.getOitavas().get(10),eliminatorias.getOitavas().get(11),Integer.parseInt(oit11g.getText()),Integer.parseInt(po11.getText()),Integer.parseInt(oit12g.getText()),Integer.parseInt(po12.getText()));
                    Partidas poit7 = new Partidas(eliminatorias.getOitavas().get(12),eliminatorias.getOitavas().get(13),Integer.parseInt(oit13g.getText()),Integer.parseInt(po13.getText()),Integer.parseInt(oit14g.getText()),Integer.parseInt(po14.getText()));
                    Partidas poit8 = new Partidas(eliminatorias.getOitavas().get(14),eliminatorias.getOitavas().get(15),Integer.parseInt(oit15g.getText()),Integer.parseInt(po15.getText()),Integer.parseInt(oit16g.getText()),Integer.parseInt(po16.getText()));
                    Partidas[] oitavas = {poit1,poit2,poit3,poit4,poit5,poit6,poit7,poit8};
                    eliminatorias.setPartidas(oitavas);
                    eliminatorias.checaOitavas();
                    if(eliminatorias.getControla() == 2){
                        throw new Exception();
                    }
                    eliminatorias.getQuartas().get(6);
                    JLabel[] quartas = {qua1,qua2,qua3,qua4,qua5,qua6,qua7,qua8};
                    String StringArq = "";
                    for(int j = 0; j <oitavas.length; j++){
                        StringArq += oitavas[j].getGols1()+";"+oitavas[j].getPenalti1()+";"+oitavas[j].getGols2()+";"+oitavas[j].getPenalti2()+";"+"\n";
                    }
                    for(int i = 0; i < eliminatorias.getQuartas().size(); i++){
                        quartas[i].setText(eliminatorias.getQuartas().get(i).getNome());
                        if(i != eliminatorias.getQuartas().size()-1){
                            StringArq += eliminatorias.getQuartas().get(i).getNome()+";";
                        }else{
                            StringArq += eliminatorias.getQuartas().get(i).getNome();
                        }
                    }
                    l.escreveEliminatorias(StringArq, "Oitavas.txt");
                }catch (Exception ex){
                    if(controle != 1){
                        JOptionPane.showMessageDialog(null,"1-Todos os placares da fase devem estar preenchidos com números inteiros positivos\n2-Certifique-se que a lógica PLACAR-PENALTIS está correta","Bracket Simulator", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Todas as fases de grupos devem estar preenchidas!","Bracket Simulator",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        quartasBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int controla = 0;
                try {
                    super.mouseClicked(e);
                    if(arquivos.size() == 8 && Files.exists(Path.of("Oitavas.txt"))){
                        String texto = "";
                        JTextArea[] textAreas = {q1, qp1, q2, qp2, q3, qp3, q4, qp4, q5, qp5, q6, qp6, q7, qp7, q8, qp8};
                        for(JTextArea textArea: textAreas){
                            if(Integer.parseInt(textArea.getText())<0){
                                throw new Exception();
                            }
                        }
                        Partidas pq1 = new Partidas(eliminatorias.getQuartas().get(0),eliminatorias.getQuartas().get(1),Integer.parseInt(q1.getText()),Integer.parseInt(qp1.getText()),Integer.parseInt(q2.getText()),Integer.parseInt(qp2.getText()));
                        Partidas pq2 = new Partidas(eliminatorias.getQuartas().get(2),eliminatorias.getQuartas().get(3),Integer.parseInt(q3.getText()),Integer.parseInt(qp3.getText()),Integer.parseInt(q4.getText()),Integer.parseInt(qp4.getText()));
                        Partidas pq3 = new Partidas(eliminatorias.getQuartas().get(4),eliminatorias.getQuartas().get(5),Integer.parseInt(q5.getText()),Integer.parseInt(qp5.getText()),Integer.parseInt(q6.getText()),Integer.parseInt(qp6.getText()));
                        Partidas pq4 = new Partidas(eliminatorias.getQuartas().get(6),eliminatorias.getQuartas().get(7),Integer.parseInt(q7.getText()),Integer.parseInt(qp7.getText()),Integer.parseInt(q8.getText()),Integer.parseInt(qp8.getText()));
                        Partidas[] quartas = {pq1,pq2,pq3,pq4};
                        for(int j = 0; j< quartas.length;j++){
                            texto += quartas[j].getGols1()+";"+quartas[j].getPenalti1()+";"+quartas[j].getGols2()+";"+quartas[j].getPenalti2()+";"+"\n";
                        }
                        eliminatorias.setPartidasQuartas(quartas);
                        eliminatorias.checaQuartas();
                        if(eliminatorias.getControla() == 2){
                            throw new Exception();
                        }
                        JLabel[] labels = {semi1, semi2,semi3,semi4};
                        for(int i = 0; i < eliminatorias.getSemi().size(); i++){
                            labels[i].setText(eliminatorias.getSemi().get(i).getNome());
                            if(i != eliminatorias.getSemi().size()-1){
                                texto += eliminatorias.getSemi().get(i).getNome()+";";
                            }else{
                                texto += eliminatorias.getSemi().get(i).getNome();
                            }
                        }
                        l.escreveEliminatorias(texto,"Quartas.txt");
                    }else{
                        controla = 1;
                        throw new Exception();
                    }
                }catch (Exception ex){
                    if(controla != 1){
                        JOptionPane.showMessageDialog(null,"1-Todos os placares da fase devem estar preenchidos com números inteiros positivos\n2-Certifique-se que a lógica PLACAR-PENALTIS está correta","Bracket Simulator", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Fases de grupo e Oitavas devem estar preenchidas!","Bracket Simulator",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        SemisBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int controla = 0;
                try {
                    super.mouseClicked(e);
                    if(arquivos.size() == 8 && Files.exists(Path.of("Oitavas.txt")) && Files.exists(Path.of("Quartas.txt"))){
                        String texto = "";
                        JTextArea[] textAreas = {s1, sg1, s2, sg2, s3, sg3, s4, sg4};
                        for(JTextArea textArea: textAreas){
                            if(Integer.parseInt(textArea.getText())<0){
                                throw new Exception();
                            }
                        }
                        Partidas ps1 = new Partidas(eliminatorias.getSemi().get(0),eliminatorias.getSemi().get(1),Integer.parseInt(s1.getText()),Integer.parseInt(sg1.getText()),Integer.parseInt(s2.getText()),Integer.parseInt(sg2.getText()));
                        Partidas ps2 = new Partidas(eliminatorias.getSemi().get(2),eliminatorias.getSemi().get(3),Integer.parseInt(s3.getText()),Integer.parseInt(sg3.getText()),Integer.parseInt(s4.getText()),Integer.parseInt(sg4.getText()));
                        eliminatorias.setPartidasSemi(ps1,0);
                        eliminatorias.setPartidasSemi(ps2,1);
                        eliminatorias.checaSemis();
                        if(eliminatorias.getControla() == 2){
                            throw new Exception();
                        }
                        texto += ps1.getGols1()+";"+ps1.getPenalti1()+";"+ps1.getGols2()+";"+ps1.getPenalti2()+";"+"\n"+ps2.getGols1()+";"+ps2.getPenalti1()+";"+ps2.getGols2()+";"+ps2.getPenalti2()+";"+"\n";
                        JLabel[] labels = {finalista1, finalista2,terceiro1,terceiro2};
                        for(int i = 0; i < eliminatorias.getFinalistas().size();i++){
                            labels[i].setText(eliminatorias.getFinalistas().get(i).getNome());
                            texto += eliminatorias.getFinalistas().get(i).getNome()+";";
                        }
                        for(int i = 0; i < eliminatorias.getDisputaTerceiro().size();i++){
                            labels[i+2].setText(eliminatorias.getDisputaTerceiro().get(i).getNome());
                            if(i != eliminatorias.getDisputaTerceiro().size()-1){
                                texto += eliminatorias.getDisputaTerceiro().get(i).getNome()+";";
                            }else{
                                texto += eliminatorias.getDisputaTerceiro().get(i).getNome();
                            }
                        }
                        l.escreveEliminatorias(texto,"Semis.txt");
                    }else{
                        controla = 1;
                        throw new Exception();
                    }
                }catch (Exception ex){
                    if(controla != 1){
                        JOptionPane.showMessageDialog(null,"1-Todos os placares da fase devem estar preenchidos com números inteiros positivos\n2-Certifique-se que a lógica PLACAR-PENALTIS está correta","Bracket Simulator", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Fases de grupos, Oitavas e Quartas devem estar preenchidas!","Bracket Simulator",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        finalBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int controla = 0;
                try {
                    super.mouseClicked(e);
                    if(arquivos.size() == 8 && Files.exists(Path.of("Oitavas.txt")) && Files.exists(Path.of("Quartas.txt")) && Files.exists(Path.of("Semis.txt"))){
                        String texto = "";
                        JTextArea[] textAreas = {f1g, f1p, f2g, f2p, t1g, t1p, t2g, t2p};
                        for(JTextArea textArea: textAreas){
                            if(Integer.parseInt(textArea.getText())<0){
                                throw new Exception();
                            }
                        }
                        Partidas pf1 = new Partidas(eliminatorias.getFinalistas().get(0),eliminatorias.getFinalistas().get(1),Integer.parseInt(f1g.getText()),Integer.parseInt(f1p.getText()),Integer.parseInt(f2g.getText()),Integer.parseInt(f2p.getText()));
                        Partidas pf2 = new Partidas(eliminatorias.getDisputaTerceiro().get(0),eliminatorias.getDisputaTerceiro().get(1),Integer.parseInt(t1g.getText()),Integer.parseInt(t1p.getText()),Integer.parseInt(t2g.getText()),Integer.parseInt(t2p.getText()));
                        eliminatorias.setPartidasSemi(pf1,0);
                        eliminatorias.setPartidasSemi(pf2,1);
                        eliminatorias.checaFinais();
                        if(eliminatorias.getControla() == 2){
                            throw new Exception();
                        }
                        texto += pf1.getGols1()+";"+pf1.getPenalti1()+";"+pf1.getGols2()+";"+pf1.getPenalti2()+";"+"\n"+pf2.getGols1()+";"+pf2.getPenalti1()+";"+pf2.getGols2()+";"+pf2.getPenalti2()+";"+"\n";
                        JLabel[] labels = {primeiroLugar,segundoLugar,terceiroLugar};
                        for(int i = 0; i < labels.length;i++){
                            labels[i].setText(eliminatorias.getGanhadores().get(i).getNome());
                            if(i != labels.length-1){
                                texto += eliminatorias.getGanhadores().get(i).getNome()+";";
                            }else{
                                texto += eliminatorias.getGanhadores().get(i).getNome();
                            }
                        }
                        l.escreveEliminatorias(texto,"Finais.txt");
                    }else{
                        controla = 1;
                        throw new Exception();
                    }
                }catch (Exception ex){
                    if(controla != 1){
                        JOptionPane.showMessageDialog(null,"1-Todos os placares da fase devem estar preenchidos com números inteiros positivos\n2-Certifique-se que a lógica PLACAR-PENALTIS está correta","Bracket Simulator", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Fases de grupo, Oitavas, Quartas e Semis devem estar preenchidas!","Bracket Simulator",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }) ;
    }
}