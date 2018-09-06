package pl.javaschool.working_with_jar_resources;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Person {
    private String firstName;
    private String lastName;
}
