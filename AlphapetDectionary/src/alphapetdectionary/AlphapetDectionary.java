/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphapetdectionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author A M
 */
public class AlphapetDectionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,ArrayList<String>> alphapet=new HashMap<>();
        String[] dictionary= {"apple", "ant", "arrow", "b", "banana",
            "bird", "boat", "c", "cat", "car", "cup", "d", "dog",
            "duck", "desk", "e", "elephant", "egg", "eagle", "f", "fish",
            "frog", "flag", "g", "grapes", "goat", "guitar", "h", "hat", 
            "house", "horse", "i", "ice", "island", "ink", "j", "jelly", "jump",
            "jacket", "k", "kite", "king", "kangaroo", "l", "lion", "lamp",
            "leaf", "m", "monkey", "mountain", "moon", "n", "nest", "nose", 
            "notebook", "o", "orange", "owl","a", "ocean", "p", "pear", "penguin",
            "piano", "q", "queen", "quilt", "quail", "r", "rabbit", "rainbow",
            "rock", "s", "sun", "star", "spider", "t", "tiger", "tree", "turtle",
            "u", "umbrella", "unicorn", "umpire", "v", "violin", "van", "volcano",
            "w", "whale", "window", "wolf", "x", "xylophone", "xenon", "x-ray", "y",
            "yak", "yellow", "yacht", "z", "zebra", "zero", "zipper"
        };
        
        ArrayList<String> list=new ArrayList<>();
         for(String element:dictionary){
            list.add(element);  
        }
         Collections.sort(list);
        for(int i=0; i<list.size();i+=4){
            String letter=list.get(i);
            ArrayList<String> words=new ArrayList<>();
            words.add(list.get(i+1));
            words.add(list.get(i+2));
            words.add(list.get(i+3));
            alphapet.put(letter, words);
        }
        
        for(Map.Entry<String,ArrayList<String>> entry:alphapet.entrySet()){
            String key=entry.getKey();
            ArrayList<String> value=entry.getValue();
            System.out.println(key+"      "+value);
        }
        
        String special="w";
        System.out.println(alphapet.get(special));
    }
    
}
