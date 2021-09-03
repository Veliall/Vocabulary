package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        printVocab(getVocabulary("Якорь Якорь Якорь Азбука Букварь" +
                " Слово Едрени-фени Велик Группа Дверь Зверь Труп"));

    }

    //    Отличительные черты функционального стиля - ну стримы уже сами по себе на это указывают
//    плюс "чистота" методов, детерминированость и отсутствие сайд-эффектов
    public static List<String> getVocabulary(String string) {
        return Arrays.stream(string.split(" "))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printVocab(List<String> vocab) {
        vocab.forEach(System.out::println);
    }
}
