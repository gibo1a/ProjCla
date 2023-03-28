import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkManager pManager = new ParkManager("Serralves");

        int choice = 0;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add plant");
            System.out.println("2. Remove plant");
            System.out.println("3. Search for species");
            System.out.println("4. Sponsor a plant");
            System.out.println("5. View all plants");
            System.out.println("6. Summary of species");
            System.out.println("7. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Introduza a especie da planta");
                    String especies = scanner.nextLine();
                    System.out.println("Introduza o numero identificador da planta");
                    int ids = scanner.nextInt();
                    System.out.println("Introduz a altura da planta");
                    double altura = scanner.nextDouble();
                    System.out.println("Introduza a idade da planta");
                    int idade = scanner.nextInt();
                    pManager.addPlant(new Plant(especies, ids, altura, idade));
                case 2:
                    System.out.println("Introduza a planta o id da planta a ser removida");
                    int idd = scanner.nextInt();
                    pManager.removePlant(pManager.getPlantbyID(idd));
                case 3:
                    System.out.println("Introduza a especie da planta");
                    String especie = scanner.nextLine();
                    pManager.searchForSpecies(especie);
                case 4:
                    System.out.println("Introduza o id da planta");
                    int id = scanner.nextInt();
                    if(pManager.sponsorPlant(id)){
                        System.out.println("Introduza o nome do patrocinador");
                        String sponsor = scanner.nextLine();
                        pManager.getPlantbyID(id).setSponsor(sponsor);
                    }
                case 5:
                    pManager.listAllPlants();
                case 6:
                    pManager.listSummarySpecies();
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Erro introduziu um número inválido");
            }

        } while (choice != 7);
        scanner.close();
    }
}
