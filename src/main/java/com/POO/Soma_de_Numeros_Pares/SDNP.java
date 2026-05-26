package com.POO.Soma_de_Numeros_Pares;

public class SDNP extends setters_and_getters {

    public SDNP() {
        super();
    }

    public SDNP(int limiteInferior, int limiteSuperior) {
        super(limiteInferior, limiteSuperior);
    }

    public long calcularSoma() {
        int primeiroPar = (getLimiteInferior() % 2 == 0) ? getLimiteInferior() : getLimiteInferior() + 1;
        int ultimoPar = (getLimiteSuperior() % 2 == 0) ? getLimiteSuperior() : getLimiteSuperior() - 1;

        if (primeiroPar > ultimoPar) {
            return 0;
        }

        int quantidade = ((ultimoPar - primeiroPar) / 2) + 1;
        return (long) quantidade * (primeiroPar + ultimoPar) / 2;
    }
}