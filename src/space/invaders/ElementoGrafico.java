package space.invaders;

import java.awt.*;

public class ElementoGrafico {
    private int posY, posX;
    private Image imagem;
    private int altura, largura;

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getPosY(){
        return this.posY;
    }
}