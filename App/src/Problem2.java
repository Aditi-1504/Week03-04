import java.util.*;

class Client {
    String name;
    int riskScore;
    double balance;

    public Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }
}

public class Problem2 {

    public static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (arr[j].riskScore < key.riskScore ||
                            (arr[j].riskScore == key.riskScore &&
                                    arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void print(Client[] arr) {
        for (Client c : arr) {
            System.out.println(c.name + " " + c.riskScore);
        }
    }

    public static void top10(Client[] arr) {
        for (int i = 0; i < Math.min(10, arr.length); i++) {
            System.out.println(arr[i].name + " " + arr[i].riskScore);
        }
    }

    public static void main(String[] args) {

        Client[] clients = {
                new Client("C", 80, 1000),
                new Client("A", 20, 2000),
                new Client("B", 50, 1500)
        };

        bubbleSort(clients);
        print(clients);

        insertionSort(clients);
        print(clients);

        top10(clients);
    }
}