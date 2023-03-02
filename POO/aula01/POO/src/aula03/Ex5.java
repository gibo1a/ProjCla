package aula03;
import java.util.Scanner;
import java.lang.String;

public class Ex5 {
    public static void meses(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma data (mês/ano)! ");
        String data = sc.nextLine();
        String[] dataseparada = data.split("/");
        String mes = dataseparada[0];
        int dias = 0;
        int i = 2;
        int month = Integer.parseInt(mes);
        while(mes.length() > 2 || mes.length() == 0){
            System.out.println("Introduza uma data (mês/ano)! ");
            data = sc.nextLine();
            dataseparada = data.split("/");
            mes = dataseparada[0];
            month = Integer.parseInt(mes);
        }
        String ano = dataseparada[1];
        int year = Integer.parseInt(ano);
        while (ano.length() > 4){
            System.out.println("Introduza uma data (mês/ano)! ");
            data = sc.nextLine();
            dataseparada = data.split("/");
            ano = dataseparada[1];
            year = Integer.parseInt(ano);
        }
        System.out.println("Introduza o do dia da semana em que começa o mês (1(Seg)-7(Dom))!");
        int diaSemana = sc.nextInt();
        while(diaSemana < 1 || diaSemana > 7){
            System.out.println("Introduza o do dia da semana em que começa o mês (1(Seg)-7(Dom))!");
            diaSemana = sc.nextInt();
        }
        switch(month){
            case(1):
                System.out.print(String.format("%10s","Jannuary"));
                System.out.println(String.format("%5d",year));
            case(3):
                System.out.print(String.format("%10s","March"));
                System.out.println(String.format("%5d",year));
            case(5):
                System.out.print(String.format("%10s","May"));
                System.out.println(String.format("%5d",year));
            case(7):
                System.out.print(String.format("%10s","July"));
                System.out.println(String.format("%5d",year));
            case(8):
                System.out.print(String.format("%10s","August"));
                System.out.println(String.format("%5d",year));
            case(10):
                System.out.print(String.format("%10s","October"));
                System.out.println(String.format("%5d",year));
            case(12):
                System.out.print(String.format("%10s","December"));
                System.out.println(String.format("%5d",year));
                dias = 31;
                break;
            case(4):
                System.out.print(String.format("%10s","April"));
                System.out.println(String.format("%5d",year));
            case(6):
                System.out.print(String.format("%10s","June"));
                System.out.println(String.format("%5d",year));
            case(9):
                System.out.print(String.format("%10s","September"));
                System.out.println(String.format("%5d",year));
            case(11):
                System.out.print(String.format("%10s","November"));
                System.out.println(String.format("%5d",year));
                dias = 30;
                break;
        }
        if(month == 2){
            System.out.print(String.format("%10s","February"));
            System.out.println(String.format("%5d",year));
            if(year%400 == 0){
                dias = 29;
            }else{
                dias = 28;
            }

        }
        System.out.print("Su");
        System.out.print(String.format("%3s","Mo"));
        System.out.print(String.format("%3s","Tu"));
        System.out.print(String.format("%3s","We"));
        System.out.print(String.format("%3s","Th"));
        System.out.print(String.format("%3s","Fr"));
        System.out.println(String.format("%3s","Sa"));
        switch(diaSemana){ 
            case(1):
                System.out.print(String.format("%4d",1));
                while(i <= dias){
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.println(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(i);
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }

                }
                break;
            case(2):
                System.out.print(String.format("%7d",1));
                while(i <= dias){
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.println(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(i);
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                }
                break;
            case(3):
                System.out.print(String.format("%10d",1));
                while(i <= dias){
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.println(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(i);
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
                    System.out.print(String.format("%3d",i));
                    i++;
                    if(i == dias + 1){
                        break;
                    }
            }
            break;
        case(4):
            System.out.print(String.format("%10d",1));
            while(i <= dias){
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.println(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(i);
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
            }
            break;
        case(5):
            System.out.print(String.format("%16d",1));
            while(i <= dias){
                System.out.println(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(i);
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
            }
            break;
        case(6):
            System.out.println(String.format("%19d",1));
            while(i <= dias){
                System.out.print(i);
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.println(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }

            }
            break;
        case(7):
            System.out.print(1);
            while(i <=dias){
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.println(String.format("%3d",i));
                i++;
                if(i == dias + 1){
                    break;
                }
                System.out.print(i);
                i++;
                if(i == dias + 1){
                    break;
                }
            }
            break;


        
}
    sc.close();
    
}
}
