import java.util.Scanner ;

public class Calcul{
public static void main(String[] args) {
   
int somme ;
   Scanner sc = new Scanner(System.in);
   System.out.println("Donner le premier entier : ");
   int a = sc.nextInt();
   System.out.println("Donner le deuxieme entier : ");
   int b = sc.nextInt();

somme = a+b ;
System.out.println("La somme est : "+somme);

if(a > b) {
  int fact = 1;
  for(int i=1;i<=a;i++){
     fact = fact *i;
         }
  System.out.println("le factoriel de "+a+" est "+fact);
    }
 else {
  int fact = 1;
  for(int i=1;i<=b;i++){
     fact = fact *i;
         }
  System.out.println("le factoriel de "+b+" est "+fact);
 } 

 

  } 
   }

 
  




   
   
   

