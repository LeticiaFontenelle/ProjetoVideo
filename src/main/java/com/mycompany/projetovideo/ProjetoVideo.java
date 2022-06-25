package com.mycompany.projetovideo;
/**
 *
 * @lf
 */
public class ProjetoVideo {
     public static void main (String [] args){ 
         Video v[] = new Video [5];
         v[0] = new Video ("Aula de Economia");
         v[1] = new Video ("Aula de Álgebra Linear");
         v[2] = new Video ("Aula de Estatística");
         v[3] = new Video ("Aula de Astrofísica");
         v[4] = new Video ("Aula de Física do Meio Ambiente");
         v[5] = new Video ("Aula de Programação Lúdica");
         
         Formigaluna f[] = new Formigaluna [4];
         f[0]= new Formigaluna ("Ahava", 4, "F", "Aha"); 
         f[1]= new Formigaluna ("Aliza", 3, "F", "Ali"); 
         f[2]= new Formigaluna ("Adara", 2, "F", "Ada"); 
         f[3]= new Formigaluna ("Batel", 1, "F", "Teo"); 
         
         Visualizacao vis[] = new Visualizacao[5];
         vis[0] = new Visualizacao(f[0], v[2]); // Ahava assite Estatística
         vis[0].avaliar();
         System.out.println(vis[1].toString());
         
         vis[1] = new Visualizacao(f[0], v[1]); // Ahava assite Economia
         vis[0].avaliar(87.0f);
         System.out.println(vis[1].toString());
         
         
         
         
         
         /*
         System.out.println("VÍDEOS\n---------------------");
         System.out.println(v[0].toString());
         System.out.println(v[1].toString());
         System.out.println(v[2].toString());
         
         System.out.println("FORMIGALUNA\n---------------------");
         System.out.println(f[0].toString());
         System.out.println(f[1].toString());
         System.out.println(f[2].toString());
         System.out.println(f[3].toString()); */
         
     }  
}
