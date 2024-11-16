import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

class Fdemo extends Frame implements  ActionListener{

    Button[] b = new Button[9];
    Button b1;
    int k=0, x=8, y=28;
    int a =0;
    int z=0, z1=0, z2=0, z3=0, z4=0, z5=0, z6=0, z7=0, z8=0;
    int l =70;
    Fdemo() {

        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                b[k] = new Button();
                b[k].setSize(100,100);
                b[k].setLocation(x,y);
                b[k].setFont(new Font("", Font.BOLD, 40));

                add(b[k]);
                b[k].addActionListener(this);
                b[k].setBackground(new Color(255,141,28));
                k++;
                x=x+100;
            }

            x=8;
            y=y+100;
        }
        b1 = new Button("New Game");
        b1.setSize(150,40);
        b1.setLocation(500,300);
        b1.setFont(new Font("", Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            for(int i=0; i<=8; i++){
                   b[i].setLabel("");
            }
            z=0; z1=0; z2=0; z3=0; z4=0; z5=0; z6=0; z7=0; z8=0;
        }

        if(e.getSource() == b[0] && z==0){
            if(a%2 ==0){
                b[0].setLabel("O");
            }else{
                b[0].setLabel("X");
            }
            z++;
            a++;
        }

        if(e.getSource() == b[1] && z1==0){
            if(a%2 ==0){
                b[1].setLabel("O");
            }else{
                b[1].setLabel("X");
            }
            z1++;
            a++;
        }

        if(e.getSource() == b[2] && z2==0){
            if(a%2 ==0){
                b[2].setLabel("O");
            }else{
                b[2].setLabel("X");
            }
            z2++;
            a++;
        }

        if(e.getSource() == b[3] && z3==0){
            if(a%2 ==0){
                b[3].setLabel("O");
            }else{
                b[3].setLabel("X");
            }
            z3++;
            a++;
        }

        if(e.getSource() == b[4] && z4==0){
            if(a%2 ==0){
                b[4].setLabel("O");
            }else{
                b[4].setLabel("X");
            }
            z4++;
            a++;
        }

        if(e.getSource() == b[5] && z5==0){
            if(a%2 ==0){
                b[5].setLabel("O");
            }else{
                b[5].setLabel("X");
            }
            z5++;
            a++;
        }

        if(e.getSource() == b[6] && z6==0){
            if(a%2 ==0){
                b[6].setLabel("O");
            }else{
                b[6].setLabel("X");
            }
            z6++;
            a++;
        }

        if(e.getSource() == b[7] && z7==0){
            if(a%2 ==0){
                b[7].setLabel("O");
            }else{
                b[7].setLabel("X");
            }
            z7++;
            a++;
        }

        if(e.getSource() == b[8] && z8==0){
            if(a%2 ==0){
                b[8].setLabel("O");
            }else{
                b[8].setLabel("X");
            }
            z8++;
            a++;
        }

        Font f = new Font("", Font.BOLD, 20);
        if(Objects.equals(b[0].getLabel(), b[1].getLabel()) && Objects.equals(b[0].getLabel(), b[2].getLabel())){
            if(Objects.equals(b[0].getLabel(), "O")){
                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,1);
                p1.setFont(f);
                l += 50;
            }
            if(Objects.equals(b[0].getLabel(), "X")){
                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,1);
                p1.setFont(f);
                l += 50;
            }
        }
        else if(Objects.equals(b[3].getLabel(), b[4].getLabel()) && Objects.equals(b[4].getLabel(), b[5].getLabel())){

            if(Objects.equals(b[3].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[3].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[6].getLabel(), b[7].getLabel()) && Objects.equals(b[6].getLabel(), b[8].getLabel())){

            if(Objects.equals(b[6].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[6].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[0].getLabel(), b[3].getLabel()) && Objects.equals(b[0].getLabel(), b[6].getLabel())){

            if(Objects.equals(b[0].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[0].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[1].getLabel(), b[4].getLabel()) && Objects.equals(b[1].getLabel(), b[7].getLabel())){

            if(Objects.equals(b[1].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[1].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[2].getLabel(), b[5].getLabel()) && Objects.equals(b[5].getLabel(), b[8].getLabel())){

            if(Objects.equals(b[2].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[2].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[0].getLabel(), b[4].getLabel()) && Objects.equals(b[0].getLabel(), b[8].getLabel())){

            if(Objects.equals(b[0].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[0].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
        else if(Objects.equals(b[2].getLabel(), b[4].getLabel()) && Objects.equals(b[2].getLabel(), b[6].getLabel())){

            if(Objects.equals(b[2].getLabel(), "O")){

                Label p1 = new Label("Player 1 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }

            if(Objects.equals(b[2].getLabel(), "X")){

                Label p1 = new Label("Player 2 wins");
                p1.setSize(150,50);
                p1.setLocation(320,l);
                p1.setFont(f);
                add(p1);
                l+=50;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Fdemo f = new Fdemo();
    }
}