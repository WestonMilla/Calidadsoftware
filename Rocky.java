package rocky;
import java.util.Scanner;

import static rocky.Rocky.Round;
import static rocky.Rocky.Rounds;
public class Rocky {
Scanner scan = new Scanner(System.in); 

String Rocky_Balboa;
String Apolo_Creed;
String Ivan_Drago;
String Mister_T;
static String Personaje;
static String Oponente;
static int Contadorper;
static int Round;
static int Total;
static String Listo;


 
 static void Intro() {   
 System.out.println("Bienvenido al nuevo casino especializado en Box!!");
 System.out.println("");
 System.out.println("Este programa se basa en en la pelicula Rocky 3");
 System.out.println("");
}
  
static void Personaje(){
 
 int luchador;
    
 System.out.println("Escribe el número del personaje que quieras escoger ");
 System.out.println("1.Rocky Balboa   2.Apolo Creed    3.Ivan Drago    4.Mister-T");
 Scanner scan = new Scanner(System.in); 
 luchador = scan.nextInt();
  
  switch (luchador){
    case 1:System.out.println("Rocky Balboa usa un calzón con la bandera de Estados Unidos");
             System.out.println("Rocky Balboa ha ganado 8-10 peleas");
             System.out.println("Ha ganado 3 veces po K.O.");
             Personaje="Rocky Balboa";
             break;
    
    case 2:System.out.println("Apolo Creed usa un calzón Rojo con rayas Azules");
             System.out.println("Apolo Creed  ha ganado 6-10 peleas");
             System.out.println("Ha ganado 1 veces po K.O.");
             Personaje="Apolo Creed";
             break;
    
    case 3:System.out.println("Ivan Drago usa un calzón con la bandera Rusa");
             System.out.println("Ivan Drago ha ganado 9-10 peleas");
             System.out.println("Ha ganado 5 veces po K.O.");
             Personaje="Ivan Drago";
             break;
  
    case 4:System.out.println("Mister-T usa un calzón Negro");
             System.out.println("Mister-T ha ganado 4-10 peleas");
             System.out.println("Ha ganado 0 veces po K.O.");
             Personaje="Mister-T";
             break;
        
    default : System.out.println("Número de luchador invalido");
    break;     
  }   
} 
   
 static void Arbitro(){
 
 int arbitro;
    
 System.out.println("Escribe el número del Arbitro que quieres seleccionar para tu pelea ");
 System.out.println("1.Victor Avedaño   2.Joe Cortez    3.Manu Maritxalar");
 Scanner scan = new Scanner(System.in); 
 arbitro = scan.nextInt();
  
  switch (arbitro){
    case 1:System.out.println("Victor Aveñadoes es un árbitro Argentino");
             System.out.println("Ha sido árbitro de 413 peleas");
             
             break;
    
    case 2:System.out.println("Joe Cortez es un árbitro EstadoUnidense ");
             System.out.println("Ha sido árbitro de 324 peleas");
            
             break;
    
    case 3:System.out.println("Manu Maritxalar es un árbitro Español");
             System.out.println("Ha sido árbitro de 186 peleas");
             
             break;
      
    default : System.out.println("Número de árbitro invalido");
    break;     
  }   
} 
    
 static void Oponente(){
 
 int oponente;
    
 System.out.println("Escribe el número del oponente contra el que quieras ir ");
 System.out.println("1.Rocky Balboa   2.Apolo Creed    3.Ivan Drago    4.Mister-T");
 Scanner scan = new Scanner(System.in); 
 oponente = scan.nextInt();
  
  switch (oponente){
    case 1:System.out.println("Haz escogido a Rocky Balboa como contrincante");
    Oponente="Rocky Balboa";
          break;
    
    case 2:System.out.println("Haz escogido a Apolo Creed como contrincante ");
    Oponente="Apolo Creed";
           break;
    
    case 3:System.out.println(" Haz escogido a Ivan Drago como contrincante");
    Oponente="Ivan Drago";
           break;
  
    case 4:System.out.println("Haz escogido a Mister-T como contrincante ");
    Oponente="Mister-T";
           break;
        
    default : System.out.println("Número de luchador invalido");
    break;     
  }   
} 
  
 static void Rounds() {
     
     while (Round<9) {
     Contadorper=0;
     
     System.out.println("#### ROUND " + Round + "  ######");
     System.out.println("");
     System.out.println("!! FIGHT ¡¡");
     System.out.println("");
     System.out.println("HAZ RECIBIDO UN GANCHO AL HIGADO DE  " + Oponente);
     System.out.println("");
     System.out.println("");
 System.out.println("Escribe el número del golpe que quieras realizar a " + Oponente);
 System.out.println("1.Gancho al Higado   2.Jab a lam cara    3.OperCut a la mandibula");
 Scanner scan = new Scanner(System.in); 
 int golpe1;
 golpe1 = scan.nextInt();
  
  switch (golpe1){
    case 1:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN GANCHO AL HIGADO DE " + Personaje);
     Contadorper=Contadorper+10;
         break;
    
    case 2:System.out.println("");
        System.out.println( Oponente +" HA RECIBIDO UN JAB EN LA CARA DE  " + Personaje);
    Contadorper=Contadorper+20;
           break;
    
    case 3:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN UPERCUT EN LA MANDIBULA DE  " + Personaje);
     Contadorper=Contadorper+15;
           break;
    
    default : System.out.println("¡HAZ FALLADO EL GOLPE!");
    break;     
  }  
  System.out.println("");
  System.out.println("HAZ RECIBIDO UN JAB A LA CARA DE  " + Oponente); 
  System.out.println("");
 System.out.println("Escribe el número del golpe que quieras realizar a " + Oponente);
 System.out.println("1.Gancho al Higado   2.Jab a lam cara    3.OperCut a la mandibula");
 int golpe2;
 golpe2 = scan.nextInt();
  
  switch (golpe2){
    case 1:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN GANCHO AL HIGADO DE  " + Personaje);
     Contadorper=Contadorper+10;
         break;
    
    case 2:System.out.println("");
        System.out.println( Oponente +" HA RECIBIDO UN JAB A LA CARA DE  " + Personaje);
    Contadorper=Contadorper+20;
           break;
    
    case 3:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN UPERCUT EN LA MANDIBULA DE " + Personaje);
     Contadorper=Contadorper+15;
           break;
    
    default :System.out.println(""); 
        System.out.println("¡HAZ FALLADO EL GOLPE!");
    break;     
  }  
 
  System.out.println("");
  System.out.println("HAZ RECIBIDO OTRO GANCHO AL HIGADO DE  " + Oponente); 
  System.out.println("");
 System.out.println("Escribe el número del golpe que quieras realizar a " + Oponente);
 System.out.println("1.Gancho al Higado   2.Jab a lam cara    3.OperCut a la mandibula");
 int golpe3;
 golpe3 = scan.nextInt();
  
  switch (golpe3){
    case 1:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN GANCHO AL HIGADO DE  " + Personaje);
     Contadorper=Contadorper+10;
         break;
    
    case 2:System.out.println("");
        System.out.println( Oponente +" HA RECIBIDO UN JAB A LA CARA DE  " + Personaje);
    Contadorper=Contadorper+20;
           break;
    
    case 3:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN UPERCUT EN LA MANDIBULA DE " + Personaje);
     Contadorper=Contadorper+15;
           break;
    
    default :System.out.println(""); 
        System.out.println("¡HAZ FALLADO EL GOLPE!");
    break;     
  }   
  
   System.out.println("");
  System.out.println("HAZ RECIBIDO OTRO GANCHO AL HIGADO DE  " + Oponente); 
  System.out.println("");
 System.out.println("Escribe el número del golpe que quieras realizar a " + Oponente);
 System.out.println("1.Gancho al Higado   2.Jab a lam cara    3.OperCut a la mandibula");
 int golpe4;
 golpe4 = scan.nextInt();
  
  switch (golpe4){
    case 1:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN GANCHO AL HIGADO DE  " + Personaje);
     Contadorper=Contadorper+10;
         break;
    
    case 2:System.out.println("");
        System.out.println( Oponente +" HA RECIBIDO UN JAB A LA CARA DE  " + Personaje);
    Contadorper=Contadorper+20;
           break;
    
    case 3:System.out.println("");
        System.out.println(Oponente +" HA RECIBIDO UN UPERCUT EN LA MANDIBULA DE " + Personaje);
     Contadorper=Contadorper+15;
           break;
    
    default :System.out.println(""); 
        System.out.println("¡HAZ FALLADO EL GOLPE!");
    break;     
  }      
     
    if (Contadorper>55){ 
   System.out.println("");
   System.out.println( "####### HAZ GANADO EL ROUND  " + Round + "  #######");
   Total=Total+1;  }
  
   else {
  System.out.println(" HAZ PERDIDO EL ROUND   " + Round );
           }
           
  System.out.println("");
  System.out.println("###### LISTO PARA EL SIGUIENTE ROUND  #####");
  System.out.println("");
  
  Listo = scan.nextLine();
  Round=Round+1;
  
 }
 }
 
public static void main(String[] args) {
       
Intro();
Personaje();

 System.out.println("");
 System.out.println("¿Quieres cambiar de personaje?");
 String preg; 
  Scanner scan = new Scanner(System.in); 
  preg = scan.nextLine();
 
  if ("si".equals(preg)){
   Personaje();   
  }

System.out.println("");  
Arbitro();

System.out.println("");
System.out.println("Hora de escoger a tu oponente!!");
Oponente();
  
System.out.println("");
System.out.println("");
System.out.println("¡¡La pelea comienza!!");
 
Total=0;
Round=1;

Rounds();

if (Total>4) {
System.out.println("###############################################");
System.out.println("#######  HAZ GANADO CONTRA "+ Oponente +"#######");    
System.out.println("###############################################");
} 
else {
System.out.println("###############################################");
System.out.println("#######  HAZ PERDIDO CONTRA "+ Oponente +"#######");    
System.out.println("###############################################"); 
}    
    
    
    
    
    }
    
}
