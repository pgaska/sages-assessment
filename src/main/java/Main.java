import PokemonMove.Attack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static class Example{
        public String currentType;
        public String[] enemyTypes;
    }

    private static Example parseLine(String line){
        Example example = new Example();
        String[] types = line.split(" -> ", 2);

        example.currentType = types[0];
        example.enemyTypes = types[1].split(" ");
        return example;
    }

    public static void main(String[] args){
        //parse args
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        scanner.close();

        //get results
        for (String line : lines) {
            Example example = parseLine(line);

            Attack attack = new Attack();
            attack.getDamageMultiplier(example.currentType, example.enemyTypes);
        }
    }
}
