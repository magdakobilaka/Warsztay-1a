import org.jsoup.Jsoup;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.Element;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args){
        Connection connect = (Connection) Jsoup.connect("http://wiadomosci.wp.pl/");

        try(PrintWriter wr =new PrintWriter("popular_words.txt")){
            Document dokument =connect.get();
            Elements links =dokument.select("span.title");
            for(Element elem : links){
                System.out.println(elem.text());
                StringTokenizer st =new StringTokenizer(
                  elem.text(),"");
                  while (st.hasMoreTokens()) {
                      wr.println(st.nextToken());
                  }
                }
            }catch (IOException e) {
            e.printStackTrace();
        }
    }
}


