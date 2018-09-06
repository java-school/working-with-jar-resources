package pl.javaschool.working_with_jar_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PersonProvider {
    private String fileName = Configuration.getInstance().getProperty("resources.filename");

    public Person provide() {
        InputStream inputStream = PersonProvider.class.getResourceAsStream("/resources/txt/" + fileName);

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
        ) {
            return Person.builder()
                    .firstName(bufferedReader.readLine())
                    .lastName(bufferedReader.readLine())
                    .build();
        } catch (IOException e) {
            System.out.println(String.format("[ERROR] File %s not found!", fileName));
        }
        return Person.builder().build();
    }
}
