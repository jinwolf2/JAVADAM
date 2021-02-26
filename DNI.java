import java.util.Scanner;

public class DNI{
    public final int DNIMX=99999999;
    public final int DNIMIN =0;
    public char letras[]= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public static void main(String[] args){
        DNI programa = new DNI();
        programa.inicio();
    }
    public void inicio() {
       
        int res = numeroDNI();
        int dnin=comprobar(res);
        char dnil=calcularLetra();

        if(dnil!=letras[dnin]){
            System.out.println("La letra que se esperaba es: "+letras[dnin]);
        }else{
            System.out.println("El numero de DNI "+res+" contiene la letra: "+letras[dnin]);
            System.out.println("la letra de DNI es correcta: "+letras[dnin]);
        }
    }

    public int numeroDNI(){
        Scanner entrada = new Scanner(System.in);
        int dni =0;

        boolean ok= false;
        while(!ok){
            System.out.print("Introduzca el numero: ");
            ok=entrada.hasNextInt();
            if(ok){
                dni = entrada.nextInt();
                if(dni<=0){
                    System.out.println("Los numeros negativos no son validos");
                }
            }else{
                System.out.println("Caracter no valido");
                entrada.next();
            }
        }
        entrada.nextLine();
        return dni;        
    }

    public int comprobar(int dni){
        int dnin=0;
        if((dni<DNIMIN)||(dni>DNIMX)){
            System.out.println("El Numero no es Correcto: "+dni);
            int ret=numeroDNI();
        }else{
            dnin=dni%23;
        }
        return dnin;
    }

    public char calcularLetra(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la letra:");
        char dnil= entrada.next().toUpperCase().charAt(0);
        
        return dnil;
    }
}
