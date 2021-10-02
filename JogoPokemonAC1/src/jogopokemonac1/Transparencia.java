/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopokemonac1;

import java.awt.Color;
import javax.swing.JFrame;

public class Transparencia {
    //para fazer a tela de loading ficar transparente
    public void aplicarTransparencia(JFrame frame){
        //tira as bordas
        frame.setUndecorated(true);
        
        //frame.setOpacity(0.5f);
        // retira as corres do backgroud
        frame.setBackground(new Color(200,0,0,0));
        
        
        
    }
}
