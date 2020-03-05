/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopilha;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author aluno
 */
public class ExemploPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<Integer>();
        
        int auxiliar;
        pilha.push(44);
        pilha.push(33);
        pilha.push(22);
        pilha.push(11);
        
//        System.out.println(pilha);
//        int topo = pilha.pop(); //11
//        System.out.println(pilha);
//        int seg = pilha.pop(); //22
//        System.out.println(pilha);
//        int ter = pilha.pop(); //33
//        pilha.push(99);
//        System.out.println(pilha);
//        pilha.push(ter);
//        pilha.push(seg);
//        pilha.push(topo);
//        System.out.println(pilha);
        
//        while(pilha.search(1)!= 99){
//            System.out.println(pilha);
//            auxiliar = pilha.pop();
//        }
//       
//        pilha.pop();
//        pilha.pop();
//        pilha.push(101);
//        pilha.push(seg);
//        pilha.push(topo);
//        System.out.println(pilha);
        
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for(int i = 0;i<pilha.size();i++){
            System.out.println(pilha);
            aux.add(pilha.pop());
            System.out.println(aux);
        }
        
        pilha.push(9);
        System.out.println(pilha);
        
        for(int i = (aux.size() - 1); i>=0 ;i--){
            System.out.println(pilha);
            pilha.push(aux.get(i));
            System.out.println(aux.get(i));
        }
        System.out.println(pilha);
    }
    
}
