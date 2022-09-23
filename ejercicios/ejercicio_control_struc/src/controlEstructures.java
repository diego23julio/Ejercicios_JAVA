public class controlEstructures {

    public void determinarIf (int numeroIf){
        if(numeroIf > 0){
            System.out.println(numeroIf +" es positivo");
        }
        else if (numeroIf == 0) {
            System.out.println(numeroIf +" es igual a 0");
        }
        else{
            System.out.println(numeroIf + "Es negativo");
        }
    }
    public void determinarWhile (int numeroWhile){
        if(numeroWhile < 3) {
            while (numeroWhile < 3) {
                numeroWhile = numeroWhile + 1;
                System.out.println(numeroWhile);
            }
        }
        else{
            System.out.println("El numero es igual o superior a 3");
        }
    }

    public void determinarDoWhile(int numeroWhile) {
        int cont = 0;
        if (numeroWhile < 3) {
            do {
                numeroWhile = numeroWhile + 1;
                System.out.println(numeroWhile);
                cont = cont + 1;
            } while (cont < 1);
        }
        else{
            System.out.println("El numero es igual o superior a 3");
        }
    }
    public void determinarFor(){
        for(int numeroFor=0; numeroFor <= 3; numeroFor = numeroFor+1) {
            System.out.println(numeroFor);
        }
    }
    public void determinarSwitch(int estacion){
        switch (estacion){
            case 1:
                System.out.println("Verano");
                break;
            case 2:
                System.out.println("Primavera");
                break;
            case 3:
                System.out.println("Otoño");
                break;
            case 4:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Estacion incorrecta");
                break;
        }
    }

}
