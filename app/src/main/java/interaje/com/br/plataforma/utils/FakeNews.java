package interaje.com.br.plataforma.utils;

import java.util.ArrayList;
import java.util.List;

import interaje.com.br.plataforma.models.News;

/**
 * Created by rayquaza on 12/07/16.
 */
public class FakeNews {

    private static List<News> fakeList = new ArrayList<>();

    public static List<News> getFakeList() {
        News news = new News();
        news.setAuthor("Felipe Radical");
        news.setCourse("Programador Mobile - Android");
        news.setId(1L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Nossa Primeira notícia");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Elias Capixaba");
        news.setCourse("Programador Web - Ruby on Rails");
        news.setId(2L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Iniciando com Ruby");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Elias Bemhumorado");
        news.setCourse("Programador Web - Ruby on Rails");
        news.setId(3L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Introdução ao Rails");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Pablo HeadShot");
        news.setCourse("Programador Html");
        news.setId(4L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Primeira aula");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Danilo GenteBoa");
        news.setCourse("Programação pra jogos com Unity3D");
        news.setId(5L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Criando o ambiente de trabalho");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Décio DesignMaster");
        news.setCourse("Design para Jogos Digitais");
        news.setId(6L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Photoshop ou Sketch?");
        fakeList.add(news);

        news = new News();
        news.setAuthor("Nelson");
        news.setCourse("Ta testando a parede");
        news.setId(7L);
        news.setMessage(getDefaultMessage());
        news.setTitle("Teste");
        fakeList.add(news);

        return fakeList;
    }

    private static String getDefaultMessage() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim " +
                "id est laborum.";
    }
}
