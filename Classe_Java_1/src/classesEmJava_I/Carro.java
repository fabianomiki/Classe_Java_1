package classesEmJava_I;

public class Carro {
    String numChassi;
    double velocidadeMaxima;
    double quilometragem;
    double potencia;
    String cor;
    int quantidadePortas;
    double velocidade;
    int marcha;
    boolean ligado;

    Carro() {}

    Carro(String numChassi, String cor) {
        this.numChassi = numChassi;
        velocidade = 0;
        velocidadeMaxima = 180;
        quilometragem = 0;
        potencia = 80;
        this.cor = cor;
        quantidadePortas = 4;
        marcha = 0;
        ligado = false;
    }

    void ligar() {
        ligado = true;
    }

    void desligar() {
        ligado = false;
    }

    void acelerar() {
        if (regraMarcha()) {
            velocidade += 5;
        }
    }

    void fear() {
        if (velocidade > 0) {
            velocidade -= 5;
        }
    }

    void girarVolante() {

    }

    void reduzirMarcha() {
        if (marcha > 0) {
            marcha--;
        }
    }

    void subirMarcha() {
        int totalMarcha = 5;
        if (marcha <= totalMarcha) {
            marcha++;
        }
    }

    boolean regraMarcha() {
        if (marcha == 1 && velocidade <= 20) {
            return true;
        } else if (marcha == 2 && velocidade < 30) {
            return true;
        } else if (marcha == 3 && velocidade < 40) {
            return true;
        } else if (marcha == 4 && velocidade < 65) {
            return true;
        } else return marcha == 5 && velocidade <= velocidadeMaxima;
    }
}

class Principal {

    public static void main(String... args) {
        Carro carroVermelho = new Carro();
        carroVermelho.cor = "vermelho";
        carroVermelho.numChassi = "12321";
        carroVermelho.quilometragem = 0;
        carroVermelho.potencia = 100;
        carroVermelho.quantidadePortas = 4;
        carroVermelho.velocidade = 40;
        carroVermelho.marcha = 3;
        carroVermelho.ligado = true;
        carroVermelho.velocidadeMaxima = 180;

        // CARRO VERMELHO
        carroVermelho.subirMarcha();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();

        carroVermelho.subirMarcha();

        System.out.println("VELOCIDADE INICIAL CARRO VERMELHO: " + carroVermelho.velocidade);

        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();
        carroVermelho.acelerar();

        System.out.println("VELOCIDADE FINAL CARRO VERMELHO: " + carroVermelho.velocidade);

        // CARRO VERMELHO
        Carro carroPreto = new Carro("123213", "preto");

        carroPreto.velocidade = 50;
        carroPreto.marcha = 4;

        System.out.println("VELOCIDADE INICIAL CARRO PRETO: " + carroPreto.velocidade);

        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();

        carroPreto.subirMarcha();

        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();
        carroPreto.acelerar();

        System.out.println("VELOCIDADE FINAL CARRO PRETO: " + carroPreto.velocidade);
    }

}