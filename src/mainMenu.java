/**
 *
 * @author Alan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        proyecto[]  codigos;
        int tam=0;
        System.out.print("Cual es el tamaño de la cartera de clientes: ");
        tam=sc.nextInt();
        codigos = new proyecto[tam];
        for(int i=0; i<codigos.length; i++){
            codigos[i] = new proyecto();
        }

        int opc=10;
        while(opc!=0){
            System.out.println("Tamano de la cartera: " + tam + ".");
            System.out.println("-----------------MENU CLIENTES----------------");
            System.out.println("1) Agregar cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Buscar cliente");
            System.out.println("0) Cerrar sistema");
            System.out.print("Elige una opción: ");
            opc= sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("----------AGREGAR CLIENTE'S--------------");
                        for (int i = 0; i < codigos.length; i++) {
                            System.out.println("Cliente No." + (i+1));
                            System.out.print("Codigo del cliente: ");
                            codigos[i].setCodigoCliente(sc.nextInt());
                            System.out.print("Ingresa el nombre: ");
                            codigos[i].setNombre(bf.readLine());
                            System.out.print("Ingrese el apellido paterno: ");
                            codigos[i].setApellidoPaterno(bf.readLine());
                            System.out.print("Ingrese el apellido materno: ");
                            codigos[i].setApellidoMaterno(bf.readLine());
                            System.out.print("Ingrese el telefono: ");
                            codigos[i].setTelefono(bf.readLine());
                            System.out.print("Ingrese la dirección: ");
                            codigos[i].setDireccion(bf.readLine());
                            System.out.print("Ingrese la edad: ");
                            codigos[i].setEdad(sc.nextInt());
                            System.out.println("------------------------------------------");
                        }
                    break;
                case 2:
                    System.out.println("--------------------MOSTRAR CLIENTE'S------------------------");
                    for(int i=0; i< codigos.length; i++){
                        System.out.println("Cliente No." + (i+1));
                        System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                        System.out.println("Nombre: " + codigos[i].getNombre());
                        System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                        System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                        System.out.println("Telefono: " + codigos[i].getTelefono());
                        System.out.println("Dirección: " + codigos[i].getDireccion());
                        System.out.println("Edad: " + codigos[i].getEdad());
                        System.out.println("------------------------------------------------------------");
                    }
                    break;
                case 3:
                    int opc2 = 10;
                    while(opc2!=0) {
                        System.out.println("--------------------------------------------");
                        System.out.println("1) Buscar por codigo");
                        System.out.println("2) Buscar por nombre");
                        System.out.println("0) Regresar al menu anterior");
                        System.out.print("Elige una opción: ");
                        opc2= sc.nextInt();
                        System.out.println("----------------------------------------------");
                        switch (opc2){
                            case 1:
                                System.out.print("Ingresa el codigo del cliente: ");
                                int codig = sc.nextInt();
                                for(int i=0; i< codigos.length; i++){
                                    if(codig == codigos[i].getCodigoCliente()){
                                        System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                                        System.out.println("Nombre: " + codigos[i].getNombre());
                                        System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                                        System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                                        System.out.println("Telefono: " + codigos[i].getTelefono());
                                        System.out.println("Dirección: " + codigos[i].getDireccion());
                                        System.out.println("Edad: " + codigos[i].getEdad());
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Ingresa el nombre el cliente: ");
                                String name = bf.readLine();
                                for(int i=0; i< codigos.length; i++){
                                    if(name.equals(codigos[i].getNombre())){
                                        System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                                        System.out.println("Nombre: " + codigos[i].getNombre());
                                        System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                                        System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                                        System.out.println("Telefono: " + codigos[i].getTelefono());
                                        System.out.println("Dirección: " + codigos[i].getDireccion());
                                        System.out.println("Edad: " + codigos[i].getEdad());
                                    }
                                }
                                break;
                            case 3:

                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sistema cerrado");
                    break;
            }
        }
    }
}
