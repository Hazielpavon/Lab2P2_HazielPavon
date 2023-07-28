package lab2p2_hazielpavon;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_HazielPavon {

    static ArrayList<Object> Chefsarray = new ArrayList();
    static ArrayList<Object> meseroarray = new ArrayList();
    static ArrayList<Object> bartenderarray = new ArrayList();
    static ArrayList<Object> mesasarray = new ArrayList();

    static int contadorM = 0;
    static int contadorM2 = 0;
    static int contadorb = 0;
    static int contadorp = 0;
    static int total = 0;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Iniciar sesion como gerente");
            System.out.println("2. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Ingrese su usuario");

                    String usuario;

                    usuario = leer.next();

                    System.out.println("Ingrese su contrasena");

                    String contra;
                    contra = leer.next();

                    if (usuario.equals("gerente") && contra.equals("g3r$nt0")) {
                        boolean seguir2 = true;
                        while (seguir2) {

                            System.out.println("1. Chefs");
                            System.out.println("2. Meseros");
                            System.out.println("3. Bartenders");
                            System.out.println("4. Mesas");
                            System.out.println("5. salir");
                            int op2 = leer.nextInt();

                            switch (op2) {

                                case 1:

                                    boolean seguir3 = true;
                                    while (seguir3) {
                                        System.out.println("1. Ingresar un chef");
                                        System.out.println("2. Modificar un chef");
                                        System.out.println("3. Eliminar un chef");
                                        System.out.println("4. Listar chefs");
                                        System.out.println("5. Salir");

                                        int opchef = leer.nextInt();

                                        switch (opchef) {
                                            case 1:
                                                if (contadorM < 15) {
                                                    String turno2 = "";

                                                    System.out.println("Ingrese el nombre del chef");
                                                    String nombre = leer.next();

                                                    System.out.println("Ingrese la edad del chef");
                                                    int edad = leer.nextInt();

                                                    System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                    int turno1 = leer.nextInt();

                                                    System.out.println("Ingrese la cantidad de estrellas michelín");
                                                    int estrellas = leer.nextInt();

                                                    System.out.println("Ingrese el sueldo");
                                                    int sueldo = leer.nextInt();

                                                    if (turno1 == 1 && contadorM > 7) {
                                                        turno2 = "Vespertino";
                                                    } else if (turno1 == 2 && contadorM > 7) {
                                                        turno2 = "Matutino";
                                                    } else if (turno1 == 1 || turno1 == 2) {
                                                        turno2 = turno1 == 1 ? "Vespertino" : "Matutino";
                                                    } else {
                                                        System.out.println("Ingrese un horario correcto");
                                                        break;
                                                    }

                                                    Chefs t = new Chefs(nombre, edad, turno2, estrellas, sueldo);
                                                    Chefsarray.add(t);

                                                    contadorM++;
                                                } else {
                                                    System.out.println("Ya ingresó el límite de chefs");
                                                }
                                                break;

                                            case 2:
                                                if (contadorM != 0) {
                                                    for (int i = 0; i < Chefsarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + Chefsarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del chef que quiere modificar");
                                                    int mod = leer.nextInt() - 1;

                                                    if (mod >= 0 && mod < Chefsarray.size()) {
                                                        Chefs Chefsarraymod = (Chefs) Chefsarray.get(mod);

                                                        System.out.println("Ingrese el nombre del chef");
                                                        String nombre2 = leer.next();
                                                        Chefsarraymod.setNombre(nombre2);

                                                        System.out.println("Ingrese la edad del chef");
                                                        int edad2 = leer.nextInt();
                                                        Chefsarraymod.setEdad(edad2);

                                                        System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                        int turno5 = leer.nextInt();
                                                        String turno3 = "";

                                                        if (turno5 == 1 && contadorM > 7) {
                                                            turno3 = "Vespertino";
                                                        } else if (turno5 == 2 && contadorM > 7) {
                                                            turno3 = "Matutino";
                                                        } else if (turno5 == 1 || turno5 == 2) {
                                                            turno3 = turno5 == 1 ? "Vespertino" : "Matutino";
                                                        } else {
                                                            System.out.println("Ingrese un horario correcto");
                                                            break;
                                                        }
                                                        Chefsarraymod.setTurno(turno3);

                                                        System.out.println("Ingrese la cantidad de estrellas michelín");
                                                        int estrellas2 = leer.nextInt();
                                                        Chefsarraymod.setEstrellas(estrellas2);

                                                        System.out.println("Ingrese el sueldo");
                                                        int sueldo2 = leer.nextInt();
                                                        Chefsarraymod.setSueldo(sueldo2);

                                                        System.out.println("Chef modificado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un chef primero");
                                                }
                                                break;

                                            case 3:
                                                if (contadorM != 0) {
                                                    for (int i = 0; i < Chefsarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + Chefsarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del chef que quiere eliminar");
                                                    int delete = leer.nextInt() - 1;

                                                    if (delete >= 0 && delete < Chefsarray.size()) {
                                                        Chefsarray.remove(delete);
                                                        contadorM--;
                                                        System.out.println("Chef eliminado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un chef primero");
                                                }
                                                break;

                                            case 4:
                                                if (contadorM != 0) {
                                                    for (int i = 0; i < Chefsarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + Chefsarray.get(i));
                                                    }
                                                } else {
                                                    System.out.println("No hay chefs registrados");
                                                }
                                                break;

                                            case 5:
                                                seguir3 = false;
                                                System.out.println("Saliendo del programa...");
                                                break;

                                            default:
                                                System.out.println("Ingrese una opción válida.");
                                                break;
                                        }
                                    }

                                case 2:
                                    boolean seguir4 = true;
                                    while (seguir4) {

                                        System.out.println("1. Ingresar un Mesero");
                                        System.out.println("2. Modificar un Mesero");
                                        System.out.println("3. Eliminar Mesero");
                                        System.out.println("4. Listar Meseros");
                                        System.out.println("5. Salir");
                                        int opMesero = leer.nextInt();
                                        switch (opMesero) {
                                            case 1:
                                                if (contadorM2 < 8) {
                                                    String turno2 = "";

                                                    System.out.println("Ingrese el nombre del mesero");
                                                    String nombre = leer.next();

                                                    System.out.println("Ingrese la edad del mesero");
                                                    int edad = leer.nextInt();

                                                    System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                    int turno1 = leer.nextInt();

                                                    System.out.println("Ingrese la propina");
                                                    int propina = leer.nextInt();

                                                    System.out.println("Ingrese el sueldo");
                                                    int sueldo = leer.nextInt();

                                                    if (turno1 == 1 && contadorM2 > 3) {
                                                        turno2 = "Vespertino";
                                                    } else if (turno1 == 2 && contadorM2 > 3) {
                                                        turno2 = "Matutino";
                                                    } else if (turno1 == 1 || turno1 == 2) {
                                                        turno2 = turno1 == 1 ? "Vespertino" : "Matutino";
                                                    } else {
                                                        System.out.println("Ingrese un horario correcto");
                                                        break;
                                                    }

                                                    Meseros M = new Meseros(nombre, edad, turno2, propina, sueldo);
                                                    meseroarray.add(M);

                                                    contadorM2++;
                                                } else {
                                                    System.out.println("Solo pueden ser 8 meseros");
                                                }
                                                break;

                                            case 2:
                                                if (contadorM2 != 0) {
                                                    for (int i = 0; i < meseroarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + meseroarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del mesero que quiere modificar");
                                                    int mod = leer.nextInt() - 1;

                                                    if (mod >= 0 && mod < meseroarray.size()) {
                                                        Meseros Meseromod = (Meseros) meseroarray.get(mod);

                                                        System.out.println("Ingrese el nombre del mesero");
                                                        String nombre2 = leer.next();
                                                        Meseromod.setNombre(nombre2);

                                                        System.out.println("Ingrese la edad del mesero");
                                                        int edad2 = leer.nextInt();
                                                        Meseromod.setEdad(edad2);

                                                        System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                        int turno5 = leer.nextInt();
                                                        String turno3 = "";

                                                        if (turno5 == 1 && contadorM2 > 3) {
                                                            turno3 = "Vespertino";
                                                        } else if (turno5 == 2 && contadorM2 > 3) {
                                                            turno3 = "Matutino";
                                                        } else if (turno5 == 1 || turno5 == 2) {
                                                            turno3 = turno5 == 1 ? "Vespertino" : "Matutino";
                                                        } else {
                                                            System.out.println("Ingrese un horario correcto");
                                                            break;
                                                        }
                                                        Meseromod.setTurno(turno3);

                                                        System.out.println("Ingrese la propina");
                                                        int propina2 = leer.nextInt();
                                                        Meseromod.setPropina(propina2);

                                                        System.out.println("Ingrese el sueldo");
                                                        int sueldo2 = leer.nextInt();
                                                        Meseromod.setSueldo(sueldo2);

                                                        System.out.println("Mesero modificado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un mesero primero");
                                                }
                                                break;

                                            case 3:
                                                if (contadorM2 != 0) {
                                                    for (int i = 0; i < meseroarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + meseroarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del mesero que quiere eliminar");
                                                    int delete = leer.nextInt() - 1;

                                                    if (delete >= 0 && delete < meseroarray.size()) {
                                                        meseroarray.remove(delete);
                                                        contadorM2--;
                                                        System.out.println("Mesero eliminado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un mesero primero");
                                                }
                                                break;

                                            case 4:
                                                if (contadorM2 != 0) {
                                                    for (int i = 0; i < meseroarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + meseroarray.get(i));
                                                    }
                                                } else {
                                                    System.out.println("No hay meseros registrados");
                                                }
                                                break;

                                            case 5:
                                                seguir4 = false;
                                                System.out.println("Saliendo del programa...");
                                                break;

                                            default:
                                                System.out.println("Ingrese una opción válida.");
                                                break;
                                        }
                                    }

                                    boolean seguir5 = true;
                                    while (seguir5) {
                                        System.out.println("1. Ingresar un Bartender");
                                        System.out.println("2. Modificar un Bartender");
                                        System.out.println("3. Eliminar Bartender");
                                        System.out.println("4. Listar Bartenders");
                                        System.out.println("5. Salir");
                                        int opBartender = leer.nextInt();
                                        switch (opBartender) {
                                            case 1:
                                                if (contadorb < 4) {
                                                    String turno2 = "";

                                                    System.out.println("Ingrese el nombre del Bartender");
                                                    String nombre = leer.next();

                                                    System.out.println("Ingrese la edad del Bartender");
                                                    int edad = leer.nextInt();

                                                    System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                    int turno1 = leer.nextInt();

                                                    System.out.println("Ingrese la cantidad de licores");
                                                    int licores = leer.nextInt();

                                                    System.out.println("Ingrese el sueldo");
                                                    int sueldo = leer.nextInt();

                                                    if (turno1 == 1 && contadorb > 1) {
                                                        turno2 = "Vespertino";
                                                    } else if (turno1 == 2 && contadorb > 1) {
                                                        turno2 = "Matutino";
                                                    } else if (turno1 == 1 || turno1 == 2) {
                                                        turno2 = turno1 == 1 ? "Vespertino" : "Matutino";
                                                    } else {
                                                        System.out.println("Ingrese un horario correcto");
                                                        break;
                                                    }

                                                    Bartenders B = new Bartenders(nombre, edad, turno2, licores, sueldo);
                                                    bartenderarray.add(B);

                                                    contadorb++;
                                                } else {
                                                    System.out.println("Solo pueden ser 4 bartenders");
                                                }
                                                break;

                                            case 2:
                                                if (contadorb != 0) {
                                                    for (int i = 0; i < bartenderarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + bartenderarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del Bartender que quiere modificar");
                                                    int mod = leer.nextInt() - 1;

                                                    if (mod >= 0 && mod < bartenderarray.size()) {
                                                        Bartenders Bartendermod = (Bartenders) bartenderarray.get(mod);

                                                        System.out.println("Ingrese el nombre del Bartender");
                                                        String nombre2 = leer.next();
                                                        Bartendermod.setNombre(nombre2);

                                                        System.out.println("Ingrese la edad del Bartender");
                                                        int edad2 = leer.nextInt();
                                                        Bartendermod.setEdad(edad2);

                                                        System.out.println("Ingrese el turno: 1 para vespertino, 2 para matutino");
                                                        int turno5 = leer.nextInt();
                                                        String turno3 = "";

                                                        if (turno5 == 1 && contadorb > 1) {
                                                            turno3 = "Vespertino";
                                                        } else if (turno5 == 2 && contadorb > 1) {
                                                            turno3 = "Matutino";
                                                        } else if (turno5 == 1 || turno5 == 2) {
                                                            turno3 = turno5 == 1 ? "Vespertino" : "Matutino";
                                                        } else {
                                                            System.out.println("Ingrese un horario correcto");
                                                            break;
                                                        }
                                                        Bartendermod.setTurno(turno3);

                                                        System.out.println("Ingrese la cantidad de licores");
                                                        int licores2 = leer.nextInt();
                                                        Bartendermod.setLicores(licores2);

                                                        System.out.println("Ingrese el sueldo");
                                                        int sueldo2 = leer.nextInt();
                                                        Bartendermod.setSueldo(sueldo2);

                                                        System.out.println("Bartender modificado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un numero valido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un Bartender primero");
                                                }
                                                break;

                                            case 3:
                                                if (contadorb != 0) {
                                                    for (int i = 0; i < bartenderarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + bartenderarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número del Bartender que quiere eliminar");
                                                    int delete = leer.nextInt() - 1;

                                                    if (delete >= 0 && delete < bartenderarray.size()) {
                                                        bartenderarray.remove(delete);
                                                        contadorb--;
                                                        System.out.println("Bartender eliminado correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar un Bartender primero");
                                                }
                                                break;

                                            case 4:
                                                if (contadorb != 0) {
                                                    for (int i = 0; i < bartenderarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + bartenderarray.get(i));
                                                    }
                                                } else {
                                                    System.out.println("No hay bartenders registrados");
                                                }
                                                break;

                                            case 5:
                                                seguir5 = false;
                                                System.out.println("Saliendo del programa...");
                                                break;

                                            default:
                                                System.out.println("Ingrese una opcion valida");
                                                break;
                                        }
                                    }

                                    break;

                                case 4:
                                    boolean seguir6 = true;
                                    while (seguir6) {
                                        System.out.println("1. Ingresar una mesa");
                                        System.out.println("2. Modificar una mesa");
                                        System.out.println("3. Eliminar una mesa");
                                        System.out.println("4. Listar las mesas");
                                        System.out.println("5. Precio total");
                                        System.out.println("6. salir");
                                        int opmesa = leer.nextInt();
                                        switch (opmesa) {
                                            case 1:
                                                if (contadorp < 11) {
                                                    System.out.println("Ingrese la cantidad de platos en la mesa");
                                                    int platos = leer.nextInt();

                                                    System.out.println("Ingrese la cantidad de utensilios");
                                                    int utensilios = leer.nextInt();

                                                    System.out.println("Ingrese el total a pagar de la mesa");
                                                    int precio = leer.nextInt();

                                                    total += precio;

                                                    Mesas x = new Mesas(platos, utensilios, precio, total);
                                                    mesasarray.add(x);

                                                    contadorp++;
                                                } else {
                                                    System.out.println("Solo puede agregar 10 mesas");
                                                }
                                                break;

                                            case 2:
                                                if (contadorp != 0) {
                                                    for (int i = 0; i < mesasarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + mesasarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número de la mesa que quiere modificar");
                                                    int mod = leer.nextInt() - 1;

                                                    if (mod >= 0 && mod < mesasarray.size()) {
                                                        Mesas Mesasmod = (Mesas) mesasarray.get(mod);

                                                        System.out.println("Ingrese la cantidad de platos en la mesa");
                                                        int platos2 = leer.nextInt();
                                                        Mesasmod.setPlatos(platos2);

                                                        System.out.println("Ingrese la cantidad de utensilios");
                                                        int utensilios2 = leer.nextInt();
                                                        Mesasmod.setUtencilios(utensilios2);

                                                        System.out.println("Ingrese el total a pagar de la mesa");
                                                        int precio2 = leer.nextInt();
                                                        Mesasmod.setPrecio(precio2);

                                                        total += precio2;
                                                        Mesasmod.setTotal2(total);

                                                        System.out.println("Mesa modificada correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que ingresar una mesa primero");
                                                }
                                                break;

                                            case 3:
                                                if (contadorp != 0) {
                                                    for (int i = 0; i < mesasarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + mesasarray.get(i));
                                                    }

                                                    System.out.println("Ingrese el número de la mesa que quiere eliminar");
                                                    int delete = leer.nextInt() - 1;

                                                    if (delete >= 0 && delete < mesasarray.size()) {
                                                        mesasarray.remove(delete);
                                                        contadorp--;
                                                        System.out.println("Mesa eliminada correctamente.");
                                                    } else {
                                                        System.out.println("Ingrese un número válido.");
                                                    }
                                                } else {
                                                    System.out.println("Tiene que agregar una mesa primero");
                                                }
                                                break;

                                            case 4:
                                                if (contadorp != 0) {
                                                    for (int i = 0; i < mesasarray.size(); i++) {
                                                        System.out.println((i + 1) + ". " + mesasarray.get(i));
                                                    }
                                                } else {
                                                    System.out.println("No hay mesas registradas");
                                                }
                                                break;

                                            case 5:
                                                System.out.println("El precio total de las mesas es: " + total);
                                                break;

                                            case 6:
                                                seguir6 = false;
                                                System.out.println("Saliendo del programa...");

                                            default:
                                                System.out.println("Ingrese una opcion valida");
                                                break;
                                        }
                                    }
                            }
                        }
                    } else {
                        System.out.println("Ingrese bien la contrasena o el usuario");
                    }
                    break;

                case 2:
                    seguir = false;
                    System.out.println("Saliendo del programa totalmente");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
