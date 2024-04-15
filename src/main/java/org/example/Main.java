package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        FileInputStream fisier = null;
        List<String> list = new ArrayList<>();
        System.out.println("Se da o lista : ");
        try {
            fisier = new FileInputStream("text.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        Scanner scanner = new Scanner(fisier);
        while (scanner.hasNext()) {
            list.add(scanner.next());
            System.out.println(list.get(list.size() - 1));
        }
        scanner.close();
        System.out.println("Lista sortata : ");
        Collections.sort(list);
        boolean ok = false;
        for (String sc : list) {
            System.out.println(list);
            if (sc.contains(" mere ") || sc.contains(" Mere ") || sc.contains(" MERE "))
                ok = true;
        }
        if (ok) System.out.println("Fisierul contine cuvantul mere.");
        else System.out.println("Fisierul nu contine cuvantul mere.");


    }
}