package com.tf.entidades.geometria;
public class Area {

private Ponto pSupEsq, pInfDir;

public Area(Ponto pSupEsq, Ponto pInfDir) {

if ((pSupEsq.getX() >= pInfDir.getX()) || (pSupEsq.getY() <= pInfDir.getY())) {

    throw new IllegalArgumentException("O retangulo deve ser definido pela diagonal principal");

} else {

this.pSupEsq = pSupEsq;

this.pInfDir = pInfDir;

}

}

public Ponto getPSupEsq() {

return pSupEsq;

}

public Ponto getPInfDir() {

return pInfDir;

}

public SituacaoReta classifica(Reta reta) {
// TO DO: implementar Cohen e Shuterland
    SituacaoReta resposta;
    double p1x = reta.getP1().getX();
    double p1y = reta.getP1().getY();
    double p2x  = reta.getP2().getX();
    double p2y  = reta.getP2().getY();

    double qx = 0d;
    double qy = 0d;

    boolean vertical = p1x == p2x;

    double slope = vertical 
            ? 0d
            : (p2y-p1y)/(p2x-p1x);

    int c1 = regionCode(p1x, p1y);
    int c2 = regionCode(p2x, p2y);


    return resposta;

}

@Override

public String toString() {

return "Area [pInfDir=" + pInfDir + ", pSupEsq=" + pSupEsq + "]"; } }