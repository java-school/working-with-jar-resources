package pl.javaschool.working_with_jar_resources;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConfigurationTest {
    private Configuration configuration;

    @BeforeEach
    void beforeEach() {
        configuration = Configuration.getInstance();
    }

    @Test
    void shouldReadFileName() {
        //given
        String givenFileName = "person.txt";
        //when
        String expectedFileName = configuration.getProperty("resources.filename");
        //then
        assertThat(expectedFileName).isEqualTo(givenFileName);
    }
}