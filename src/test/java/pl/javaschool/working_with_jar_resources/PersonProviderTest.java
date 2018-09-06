package pl.javaschool.working_with_jar_resources;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonProviderTest {
    private PersonProvider personProvider;

    @BeforeEach
    void beforeEach() {
        personProvider = new PersonProvider();
    }

    @Test
    void shouldReadFromFile() {
        //given
        Person givenPerson = givenPerson();
        //when
        Person expectedPerson = personProvider.provide();
        //then
        assertThat(expectedPerson).isEqualTo(givenPerson);
    }

    private Person givenPerson() {
        return Person.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .build();
    }
}