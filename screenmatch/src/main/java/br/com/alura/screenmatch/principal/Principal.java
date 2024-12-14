package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    Scanner scanner = new Scanner(System.in);
    ConsumoApi consumoApi = new ConsumoApi();
    ConverteDados converteDados = new ConverteDados();
    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=80373a06";

    public void exibeMenu(){
        System.out.println("-----------------------------\n" +
                "            MENU             \n" +
                "-----------------------------\n");

        System.out.println("Digite o nome de uma serie:    ");
        var serie = scanner.next();

        System.out.println("\nInformações sobre temporadas e episodios:");
        var json = consumoApi.obterDadosApi(ENDERECO + serie.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = converteDados.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> listaTemporadas = new ArrayList<>();
        for (int i=1; i<= dadosSerie.totalTemporadas(); i++){
            json = consumoApi.obterDadosApi(ENDERECO + serie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converteDados.obterDados(json, DadosTemporada.class);
            listaTemporadas.add(dadosTemporada);
        }
        listaTemporadas.forEach(t -> t.episodio().forEach(e -> System.out.println(e.titulo())));

        List<DadosEpisodio> dadosEpisodios = listaTemporadas.stream()
                .flatMap(t -> t.episodio().stream())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 episódios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
