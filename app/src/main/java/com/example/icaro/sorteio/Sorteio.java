package com.example.icaro.sorteio;

import java.util.Random;

/**
 * Created by Icaro on 01/04/2017.
 */

public class Sorteio {
    public int[] sortear(){
        int[] numeros=new int[60];
        int[] sorteados=new int[6];
        for(int i=0;i<60;i++){
            numeros[i]=i+1;
        }
        Random sorteador=new Random();
        for(int i=0;i<6;i++){
            int sorteio=sorteador.nextInt(60-i);
            sorteados[i]=numeros[sorteio];
            numeros[sorteio]=numeros[59-i];
        }
        return sorteados;
    }
}
