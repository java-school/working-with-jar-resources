package pl.javaschool.working_with_jar_resources;

public class Main {
    public static void main(String[] args) {
        PersonProvider personProvider = new PersonProvider();
        System.out.println(personProvider.provide());
    }

//    Aby uruchomic JARa wpisz w wierszu polecen:
//    java -jar '${basedir}\working-with-jar-resources\target\working-with-jar-resources-1.0-SNAPSHOT.jar'
}
