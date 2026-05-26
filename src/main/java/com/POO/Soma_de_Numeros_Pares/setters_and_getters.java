package com.POO.Soma_de_Numeros_Pares;

public class setters_and_getters {
    
    protected int limiteInferior;
    protected int limiteSuperior;

    // Construtor padrão
    public setters_and_getters() {
        this.limiteInferior = 1;
        this.limiteSuperior = 100;
    }

    // Construtor com parâmetros
    public setters_and_getters(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    // ==================== GETTERS E SETTERS ====================
    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
}