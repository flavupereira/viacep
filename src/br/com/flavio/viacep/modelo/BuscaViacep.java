package br.com.flavio.viacep.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class BuscaViacep {


        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite o Cep  ser consultado :");
        HttpResponse<String> response = null;

        var buscep = leitura.nextLine();

         URI endereco = URI.create("https://viacep.com.br/ws/"+buscep+"/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {

             response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e){
              throw new RuntimeException("Não foi possivel obter endereço com esse cep");
        }

        String json = response.body();
       // System.out.println(json);

        Gson gson =  new GsonBuilder()
                .setPrettyPrinting()
                .create();



        Enderecoviacep enderecojson =  gson.fromJson(json, Enderecoviacep.class);

        Endereco meuEndereco = new Endereco(enderecojson);

        System.out.println(meuEndereco);




    }
}
