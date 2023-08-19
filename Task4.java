import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double amount = 0;
        System.out.print("Enter Amount: ");
        amount = scn.nextDouble();
        String haveCurrency = "PKR";
        String wantCurrency = "USD";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://currency-converter-by-api-ninjas.p.rapidapi.com/v1/convertcurrency?have="+haveCurrency+"&want="+wantCurrency+"&amount="+amount))
                .header("X-RapidAPI-Key", "4a4f6b6cc1msh4ce0cff358a18bap187a2djsn52ffbbd0c9b6")
                .header("X-RapidAPI-Host", "currency-converter-by-api-ninjas.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
