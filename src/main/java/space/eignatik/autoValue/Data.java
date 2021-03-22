package space.eignatik.autoValue;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

@AutoValue
public abstract class Data {

    abstract String name();

    abstract ImmutableList<String> synonyms();

    static Builder builder() {
        return new AutoValue_Data.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder synonyms(ImmutableList<String> synonyms);
        abstract Data build();
    }

}
