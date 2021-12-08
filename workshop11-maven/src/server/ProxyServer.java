package server;

import domain.Query;
import domain.QueryFactory;

import java.util.Scanner;

public class ProxyServer {
    public void startServer(){
        try (Scanner scanner = new Scanner(System.in)){//Dans les paraenthese on peut mettre un objet qui autoClosable
            //while(true){
                //Créer un nouvel objet Query
                System.out.println("Veuillez entrer l'url du site ou je dois faire une requête web.");
                QueryFactory query = new QueryFactory();
                new QueryHandler(query.getQuery()).start(); // Je lance le Thread
            //}
        }
    }
}
