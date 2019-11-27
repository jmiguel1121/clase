/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angely
 */
public class Main {

    public static void main(String[] args) {
        //superMercado();
        //salario(200000, 3);
        // decuentoTienda(100000);
        //dolares(3000000, 3000);
        //superMercadoDos(1000);
        operacion(3, 9);
    }

    /**
     *
     */
    public static void superMercado() {
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        List<Producto> productos = new ArrayList();
        productos.add(new Producto("papa", 300));
        productos.add(new Producto("arroz", 500));
        productos.add(new Producto("platano", 600));
        productos.add(new Producto("carne", 100));
        productos.add(new Producto("pollo", 200));

        List<Producto> compra = new ArrayList();

        while (opcion != 3) {
            System.out.println("elija una opcion");
            System.out.println("1 =  agregar producto");
            System.out.println("2 =  total");
            System.out.println("3. salir");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("elija el prodcuto");
                    System.out.println("1 = papa");
                    System.out.println("2 = arroz");
                    System.out.println("3 = platano");
                    System.out.println("3 = carne");
                    System.out.println("3 = pollo");

                    int pro = in.nextInt();
                    compra.add(productos.get(pro - 1));
                    break;

                case 2:
                    double total = 0;
                    for (Producto pr : compra) {
                        System.out.println(pr);
                        total = total + pr.getPrecio();
                    }
                    System.out.println("sub total :" + total);
                    total = (total > 1000) ? total - (total * 10) / 100 : total - (total * 4) / 100;
                    System.out.print("descuento :");
                    System.out.println((total >= 1000) ? "10%" : "4%");
                    System.out.println("total :" + total);
                    opcion = 3;
                    break;
                default:
                    System.out.println("Opcion erronea");
            }

        }
    }

    /**
     *
     * @param base
     * @param ventas
     */
    public static void salario(int base, int ventas) {

        int valorVenta = 20000;
        int totalVentas = 0;
        for (int i = 0; i < ventas; i++) {
            totalVentas = totalVentas + valorVenta;
        }
        double salario = base + (totalVentas * 10) / 100;
        System.out.println("Base :" + base);
        System.out.println("Ventas :" + totalVentas);
        System.out.println("Comicion :" + (totalVentas * 10) / 100);
        System.out.println("Total Salario :" + salario);
    }

    /**
     *
     * @param valorCompra
     */
    public static void decuentoTienda(int valorCompra) {
        int descuento = (valorCompra * 15) / 100;
        System.out.println("Total  compra :" + valorCompra);
        System.out.println("descuento :" + descuento);
        System.out.println("total :" + (valorCompra - descuento));
    }

    /**
     *
     * @param valor
     * @param trm
     */
    public static void dolares(int valor, double trm) {
        System.out.println("Tasa de Cambio :" + trm);
        System.out.println("varol Pesos :" + valor);
        System.out.println("valor dolares :" + valor / trm);

    }

    /**
     *
     * @param total
     */
    public static void superMercadoDos(double total) {
        double descuento = (total > 1000) ? (total * 8) / 100 : 0;
        System.out.println("Total Compras :" + total);
        System.out.println("decuento :" + descuento);
        System.out.println("total a apgar :" + (total - descuento));

    }

    public static void operacion(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Multiplicacion : " + num1 * num2);
        } else if (num1 > num2) {
            System.out.println("Resta : " + num1 * num2);
        } else {
            System.out.println("Suma : " + (num1 + num2));
        }
    }
}
