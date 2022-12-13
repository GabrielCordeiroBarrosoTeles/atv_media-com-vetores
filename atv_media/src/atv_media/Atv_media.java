package atv_media;

import javax.swing.JOptionPane;

public class Atv_media {
    public static void main(String[] args) {
        int qtd= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos"));
        float n1[] = new float [qtd] ;
        float n2[] = new float [qtd] ;
        float media[] = new float[qtd] ;  
        for(int i=0;i<qtd;i++){
       n1[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1"));
       n2[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2"));
       media[i] =(n1[i]+n2[i])/2;
        }
        for(int i=0;i<qtd;i++){  
            if(media[i] >= 6){
           JOptionPane.showMessageDialog(null,"Sua media é: "+media[i]);
            }else {
            JOptionPane.showMessageDialog(null,"Sua media é: "+media[i]);
            }                 
        }       
    }  
}
