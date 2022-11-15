public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void tampar() {
    }

    public void status() {
    }

    public void rabiscar() {

    }

    public void destampar() {
    }


    public class caneta {
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
        void status() {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Uma caneta" + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Está tampada?" + this.tampada);
        }

        /**
         * Método de rabiscar ou não rabiscar
         */

        void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO! Não posso rabiscar");
            }else{
                System.out.println("Estou Rabiscando");
            }
        }

        /**
         * Método de tampar/destampar
         */

        void tampar() {
            this.tampada = true;
        }

        void destampar() {
            this.tampada = false;
        }
    }

}