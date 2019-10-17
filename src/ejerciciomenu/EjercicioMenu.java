package ejerciciomenu;

import javax.swing.JOptionPane;

public class EjercicioMenu {

    public static void main(String[] args) {
        int opcion = 0;
        int men =0;
        int b=0, c=0, sum, res, mul, div;
        int validar=0;
        
        do{
            try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Operaciones basicas"
                    + "\n 2. Arreglo"
                    + "\n 3. Matrices"
                    + "\n 4. Salir"));
            }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
            }

            switch(opcion){
                
                case 1:
                    do{
                        try{
                    men = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Suma"
                    + "\n 2. Resta"
                    + "\n 3. Multiplicacion"
                    + "\n 4. Division"
                    +"\n 5. volver"));
                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                    switch (men){
                        
                        case 1:
                            do{
                            try{
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                          
                            sum=b+c;
                            JOptionPane.showMessageDialog(null, "la suma es: "+sum);
                         break;
                        case 2:
                            do{
                            try{
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                            res=b-c;
                    JOptionPane.showMessageDialog(null, "La resta es: "+res);
                    break;
                    case 3:
                        do{
                            try{
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                        mul=b*c;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mul);
                    break;
                    case 4:
                        do{
                            try{
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                        div=b/c;
                    JOptionPane.showMessageDialog(null, "La division es: "+div);
                    break;
                    case 5:
                    JOptionPane.showMessageDialog(null, "volver");
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
                    }
                 }while(men!= 5);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Arreglos");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Matrices");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            }
            }while(opcion != 4);
        }
    }
    
