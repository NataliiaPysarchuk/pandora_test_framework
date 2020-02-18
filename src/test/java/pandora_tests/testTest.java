package pandora_tests;

import com.google.common.collect.ImmutableMap;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testTest {

    public List<String> collectionNames = new ArrayList<>();

    public String returnSomeName() {
        collectionNames.add("Nat");
        collectionNames.add("Kostia");
        collectionNames.add("Vika");
        collectionNames.add("Petro");

        Arrays.asList("Nat", "Kostia", "Vika");

//        for (int i = 0; i <= collectionNames.size(); i++){
//
//        }

//        for (String poly : collectionNames){
//           if (poly.equalsIgnoreCase("Dima")){
//               return poly;
//           }
//        }

        return collectionNames
                .stream()
                .filter(f -> f.equalsIgnoreCase("Dima"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Ti chto tvarish !!"));

        //throw new IllegalStateException("Ti chto tvarish !!");
    }

    @Test
    public void testTestL() {
        System.out.println(returnSomeName());
    }


    public Map<String, String> mapColl = new HashMap<>();


    public String method() {
        mapColl.put("Kostia", "Ukr");
        mapColl.put("Nat", "rus");
        mapColl.put("Vika", "rus");
        mapColl.put("Petro", "Ukr");

        ImmutableMap.of("Kostia", "Ukr", "Nat", "rus");

        Map<String, String> result = new TreeMap<>();

        for (Map.Entry<String, String> entry : mapColl.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("rus")) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        throw new IllegalStateException("Ti chto tvarish !!");

//        return mapColl
//        .entrySet()
//                .stream()
//                .filter(f -> f.getValue().equals("Ukr"))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.joining());
    }


    Map<String, String> rusColl = new HashMap<>();

    public Map<String, String> methodRus() {

        rusColl.put("Kostia", "Ukr");
        rusColl.put("Nat", "rus");
        rusColl.put("Vika", "rus");
        rusColl.put("Petro", "Ukr");

        Map<String, String> collect = rusColl.entrySet().stream()
                .filter(x -> x.getValue().equals("rus"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        return collect;
    }


    @Test
    public void testTestLT() {
        methodRus()
                .forEach((k, v) -> System.out.println(k));
    }
}


