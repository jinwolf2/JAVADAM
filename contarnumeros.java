public class Amstrong{
    
    public static void main(String[] args) {
        Amstrong programa = new Amstrong();
        programa.inicio();
    }

    public void inicio() {
        int res=numeros();
        System.out.println(res);
    }

    //paremetros de entradas= no (se genera desde aqui)
    //parametros de salida = si int (la variable num)
    public int numeros(){
        int num=0;
        for(int i=0;i<=153;i++){
            if(amstrong(i)){ //aqui unicamente hacemos que imprimamos los numeros amstrong (unicamente si amstrong es true)
                System.out.println(i + " : es Amstrong\n");
                num++;
            }

        }
        return num;
    }
    //parametros de entrada = si (num)
    //parametros de salidaes = si (boolean) 
    public boolean amstrong(int num) {
        int numDigitos = Contador(num); //llamada a la funcion de contar numeros para saber a cuanto elevar
        int ro=0,resto=0,aux=num;
        while(aux>0){
            resto=aux%10;
            ro=ro+(int) Math.pow(resto, numDigitos); //proceso matematico donde hacemos el calculo si es narcisista
            aux=aux/10;
        }
        return ro==num; //devolvemos con un operado logico boleano (devuelve si es True o False)
    }
    
    //parametros de entrada = si int (num de numeros())
    //parameros de salida = si int (variable digito)
    public int Contador(int num) {
        int digito=0;
        while(num>0){
            digito++;
            num=num/10;
        }

        return digito;
    }

    

    
}
