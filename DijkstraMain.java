

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Unugirl
 */
public class DijkstraMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] array = new int[9];
        String xuat = null;
        int i = 0;
            
        Scanner sc = new Scanner(new File("Input.txt"));
        String chuthich = sc.nextLine();

        // Tạo các node
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");

        // Gán chiêu dài cho các cạnh có sẵn 

        vertexA.addNeighbour(
                new Edge(array[0], vertexA, vertexC));//AC
        vertexA.addNeighbour(
                new Edge(array[1], vertexA, vertexB));//AB
        vertexC.addNeighbour(
                new Edge(array[2], vertexC, vertexB));//CB
        vertexB.addNeighbour(
                new Edge(array[3], vertexB, vertexE));//BE
        vertexC.addNeighbour(
                new Edge(array[4], vertexC, vertexE));//CE
        vertexB.addNeighbour(
                new Edge(array[5], vertexB, vertexD));//BD
        vertexD.addNeighbour(
                new Edge(array[6], vertexD, vertexE));//DE
        vertexD.addNeighbour(
                new Edge(array[7 ], vertexD, vertexF));//DF
        vertexE.addNeighbour(
                new Edge(array[8], vertexE, vertexF));//EF
        
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();

        Scanner input = new Scanner(System.in);

        System.out.print(
                "Nhap dinh bat dau(Hoa): ");
        String dinhbatdau = input.nextLine();

        System.out.print(
                "Nhap dinh ket thuc(Hoa): ");
        String dinhketthuc = input.nextLine();
        // nếu nhập đỉnh nào thì đỉnh đó là điểm bắt đầu

        if (dinhbatdau.equals("A")) {
            shortestPath.computeShortestPaths(vertexA);
        }

        if (dinhbatdau.equals("B")) {
            shortestPath.computeShortestPaths(vertexB);
        }

        if (dinhbatdau.equals("C")) {
            shortestPath.computeShortestPaths(vertexC);
        }

        if (dinhbatdau.equals("D")) {
            shortestPath.computeShortestPaths(vertexD);
        }

        if (dinhbatdau.equals("E")) {
            shortestPath.computeShortestPaths(vertexE);
        }

        if (dinhbatdau.equals("F")) {
            shortestPath.computeShortestPaths(vertexF);
        }

        //nhập đỉnh đích

        if (dinhketthuc.equals("A")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den A la: " + vertexA.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den A theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexA);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        if (dinhketthuc.equals("B")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den B la: " + vertexB.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den B theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexB);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        if (dinhketthuc.equals("C")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den C la: " + vertexC.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den C theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexC);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        if (dinhketthuc.equals("D")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den D la: " + vertexD.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den D theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexD);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        if (dinhketthuc.equals("E")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den E la: " + vertexE.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den E theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexE);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        if (dinhketthuc.equals("F")) {

            xuat = "Khoang cach ngan nhat tu " + dinhbatdau + " den F la: " + vertexF.getDistance()
                    + ". Duong di ngan nhat tu " + dinhbatdau + " den F theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexF);
            File file = new File("Output.txt");
            try (FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bf = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
        }

        // Code nguồn tham khảo tại https://java2blog.com/dijkstra-java/;
    }
}
