package bakjun_estsoft.burgerSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int[] burgerPrice = new int[3];
        int[] drinkPrice = new int[2];

        for (int i = 0; i < 3; i++) {
            burgerPrice[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            drinkPrice[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(min(burgerPrice) + min(drinkPrice) - 50);
    }

    public static int min(int[] price) {
        int min = price[0];
        for (int i = 0; i < price.length; i++) {
            if (min > price[i]) {
                min = price[i];
            }
        }
        return min;
    }


}
