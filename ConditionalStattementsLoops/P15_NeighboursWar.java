import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15_NeighboursWar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peshosDamage = Integer.parseInt(reader.readLine());
        int goshosDamage = Integer.parseInt(reader.readLine());

        int peshosHealth = 100;
        int goshosHealth = 100;
        int attackCounter = 0;

        boolean isAnyoneAlive = true;
        String attackName = "";
        String attacker = "";
        String attacked = "";
        int attackedHealth = 0;


        while (isAnyoneAlive) {
            attackCounter++;
            if (attackCounter % 2 != 0) {
                goshosHealth -= peshosDamage;
                attackName = "Roundhouse kick";
                attacker = "Pesho";
                attacked = "Gosho";
                attackedHealth = goshosHealth;
            } else {
                peshosHealth -= goshosDamage;
                attackName = "Thunderous fist";
                attacker = "Gosho";
                attacked = "Pesho";
                attackedHealth = peshosHealth;
            }
            if (peshosHealth <= 0 || goshosHealth <= 0) {
                System.out.printf("%s won in %dth round.%n", attacker, attackCounter);
                isAnyoneAlive = false;
            } else {
                if (attackCounter % 3 == 0) {
                    goshosHealth += 10;
                    peshosHealth += 10;
                }
                System.out.printf("%s used %s and reduced %s to %d health.%n",
                        attacker, attackName, attacked, attackedHealth);
            }
        }
    }
}
