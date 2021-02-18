import java.util.Scanner;

public class contarnumeros {
    public static void main(String[] args){
        contarnumeros programa = new contarnumeros();
        programa.inicio();
    }

    public void inicio() {
        int res=entradaNum();
        int cont=contador(res);
        boolean amn= numArmstrong(res);
        System.out.println("el numero tiene: "+cont+" digitos");
        System.out.println(res+" ¿es un numero ARMSTRONG? "+amn);
    }
    //entrada de valores: no ya que todo se genera adentro
    //salida : si = INT
    public int entradaNum(){
        Scanner entrada = new Scanner(System.in);
        int num=0;
        boolean ok = false;
        while(!ok){
            System.out.print("Introduzca el numero: ");
            ok=entrada.hasNextInt();
            if(ok){
                num = entrada.nextInt();
                if(num<=0){
                    System.out.println("Los numeros negativos no son validos");
                }
            }else{
                System.out.println("Caracter no valido");
                entrada.next();
            }
        }
        entrada.nextLine();
        return num; 

        //En este metodo nosotros hacemos una comprobacion del dato que va ser un numero entero que no sea negativo
    }
    //entrada = si un int que viene del metodo entradaNum()
    //salidas de un boolean (es una funcion heredada )
    public boolean numArmstrong(int num) { //valor que necesita ser heredado
       int numero=num; 
       int digitos =0;
       while(numero>0) {
            int aux=numero%10;
            numero=numero/10;
            digitos =digitos+(int)Math.pow(aux,3); //empleo del metodo matematico de Numero Narcisista con el metodo matematico 
            //lo hice en un bucle similar al metodo de contador, pero con la diferencia de que para el proceso de elevar los numeros que entren donde en digitos se vuelven a sumar los numeros elavados a la potencia exponente
        }
        return digitos==num; //operadores logicos que quiere decir que si los dos valores son iguales seran true de no cumplirce sera false
        
    }

    //entrada = si un int que viene del metodo entradaNum()
    //salidas de un INT (es una funcion heredada )
    public int contador(int num){
        int contador=0;
        while(num>0){
            num=num/10;
            contador++;
        }
        return contador;

        //En este metodo yo hice un contador de las cifras que tiene este numero 
    }
}
