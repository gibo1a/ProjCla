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
		            
                case 2:
                    // remover planta
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
                        
                    }
                case 5:
                    pManager.listAllPlants();
                case 6:
                    pManager.listSummarySpecies();
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    // imprimir mensagem de erro
            }

        } while (choice != 7);
    }
}
