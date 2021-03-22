package space.eignatik.autoValue;

import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableList.Builder<Data> dataBuilder = ImmutableList.builder();
        dataBuilder.add(Data.builder()
                .name("Human")
                .synonyms(ImmutableList.of("Man", "Person", "People"))
                .build());
        dataBuilder.add(Data.builder()
                .name("Difficulty")
                .synonyms(ImmutableList.of("Complexity", "Intricacies", "Challenge"))
                .build());
        dataBuilder.build().forEach(el -> System.out.println(el.name() + " has " + el.synonyms().size() + " synonyms"));
    }
}
