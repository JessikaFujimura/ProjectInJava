package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.lindamor.com.br/";
        System.out.println("===========================");
        System.out.println("Listagem de produtos da Lojinha Lindamor");
        try {
            Document document = Jsoup.connect(url).get();
            Elements clothes = document.select(".listagem-item");
            
            for(Element cl: clothes){
                String name = cl.select(".nome-produto").text();
                String price = cl.select(".preco-venda").text();
                
                System.out.println(name + " - " + price);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
        
        
    }
}