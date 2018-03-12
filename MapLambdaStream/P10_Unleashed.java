import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10_Unleashed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pat = Pattern.compile("^(?<singer>[a-zA-Z][a-zA-Z ]+)\\s@(?<venue>[a-zA-Z][a-zA-Z ]+)\\s(?<ticketPrice>\\d+)\\s(?<ticketCount>\\d+)$");
        Map<String,Map<String,Long>> datas = new LinkedHashMap<>();

        String line = "";

        while (!"END".equalsIgnoreCase(line = reader.readLine())) {

            Matcher matcher = pat.matcher(line);

            if (matcher.find()) {
                String vanue = matcher.group("venue");
                String singer = matcher.group("singer");
                Long ticketPrice = Long.parseLong(matcher.group("ticketPrice"));
                Long ticketCount = Long.parseLong(matcher.group("ticketCount"));


                // Short version  datas.putIfAbsent(vanue,new HashMap<>()); It will put the key only if it`s not exist
                if (!datas.containsKey(vanue)) {
                    datas.put(vanue, new LinkedHashMap<>());
                }

                // datas.get(vanue).putIfAbsent(singer,0L);
                if (!datas.get(vanue).containsKey(singer)) {
                    datas.get(vanue).put(singer, 0L);
                }

                Long sum = datas.get(vanue).get(singer) + ticketCount * ticketPrice;

                datas.get(vanue).put(singer,sum);
            }
        }

       datas.forEach((key, value) -> {
           System.out.println(key);
           value.entrySet()
                   .stream()
                   .sorted((s1,s2) -> Long.compare(s2.getValue(),s1.getValue()))
                   .forEach(ordered -> {
                       System.out.printf("#  %s -> %d%n",ordered.getKey(),ordered.getValue());
                   });

       });
    }
}
