package zadatak_4;

public class Main {

    public static void main(String[] args) {
        // create open source project
        OpenSourceProject project1 = new OpenSourceProject();
        // create and add programmer to the project
        Programmer programmer1 = new Programmer("Programer 1");
        Programmer programmer2 = new Programmer("Programer 2");

        project1.addObserver(programmer1);
        project1.addObserver(programmer2);

        //create and add changes to the project
        String changeDescription = "Added new functionalitzt";
        String dateTime = "2023-09-05 14:30";
        String codeChange = "public void newFeature() { /* Implementation */ }";
        Programmer contributor = programmer1;

        project1.makeCodeChange(changeDescription, dateTime, codeChange, contributor);

        //remove programmer from the project
        project1.removeObserver(programmer1);

        // promjena u projektu programera2

        project1.makeCodeChange("Bug fix", "2023-09-05 15:15", "bugFix()", programmer2);

    }


}
