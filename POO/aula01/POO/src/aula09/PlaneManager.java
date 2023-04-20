package aula09;

import java.util.ArrayList;
import java.util.Scanner;
public class PlaneManager {
    private ArrayList<Plane> planelist;

    public PlaneManager(){this.planelist = new ArrayList<Plane>();}

    public void addPlane(Plane plane){
        this.planelist.add(plane);
    }

    public void removePlane(String id){
        this.planelist.remove(searchPlane(id));
    }

    public Plane searchPlane(String id){
        for (Plane p: this.planelist){
            if(p.getId() == id){
                return p;
            }else{
                return null;
            }
        }
        return null;
    }

    public ArrayList<Plane> getCommercialPlanes(){
        ArrayList<Plane> planes = new ArrayList<Plane>();
        for(Plane p : this.planelist){
            if(p instanceof CommercialPlane){
                planes.add(p);
            }
        }
        return planes;
    }

    public ArrayList<Plane> getMilitaryPlanes(){
        ArrayList<Plane> planes = new ArrayList<Plane>();
        for (Plane p : this.planelist){
            if(p instanceof MilitaryPlane){
            planes.add(p);
            }
        }
        return planes;
    }

    public void printAllPlanes(){
        for(Plane p : this.planelist){
            System.out.println(p);
        }
    }

    public Plane getFastestPlane(){
        int highestspeed = 0;
        Plane fastest = null;
        for (Plane p : this.planelist){
            if(p.getMaxspeed() > highestspeed){
                highestspeed = p.getMaxspeed();
                fastest = p;
            }
        }
        return fastest;
    }

    public static void PlaneTester(String[] args) {
        PlaneManager planes = new PlaneManager();
        boolean repetir = true;
        Scanner sc = new Scanner(System.in);

        while(repetir) {
            System.out.println("1: Add plane");
            System.out.println("2: Remove plane");
            System.out.println("3: Search Plane");
            System.out.println("4: Print all planes");
            System.out.println("5: Print all commercial planes or military planes");
            System.out.println("6: Print fastest plane");
            System.out.println("7: Quit");
            System.out.println("Choose an option");
            int op = sc.nextInt();
            switch(op){
                case(1):
                    planes.addPlane(new Plane());
                    PlaneTester(args);
                case(2):
                    System.out.println("Insert id of the plane you wish to remove");
                    String idd = sc.nextLine();
                    planes.removePlane(idd);
                    PlaneTester(args);
                 case(3):
                    System.out.println("Insert plane id");
                    String id = sc.nextLine();
                    planes.searchPlane(id);
                    PlaneTester(args);
                case(4):
                    planes.printAllPlanes();
                    PlaneTester(args);
                case(5):
                    System.out.println("Choose: " + "\n" + "1: Commercial planes" + "\n" + "2: Military planes");
                    int option = sc.nextInt();
                    if(option == 1){
                        planes.getCommercialPlanes();
                    }else{
                        planes.getMilitaryPlanes();
                    }
                    PlaneTester(args);
                case(6):
                    System.out.println(planes.getFastestPlane());
                    PlaneTester(args);
                case(7):
                    repetir = false;
            }
        }
        sc.close();
    }
}
