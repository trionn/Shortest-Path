

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
		Vertex vertexS = new Vertex("S");
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexT = new Vertex("T");
        

        // Gán chiêu dài cho các cạnh có sẵn 

        vertexS.addNeighbour(
                new Edge(array[0], vertexS, vertexA));//SA
        vertexS.addNeighbour(
                new Edge(array[1], vertexS, vertexB));//SB
        vertexA.addNeighbour(
                new Edge(array[2], vertexA, vertexB));//AB
        vertexA.addNeighbour(
                new Edge(array[3], vertexA, vertexC));//AC
        vertexA.addNeighbour(
                new Edge(array[4], vertexA, vertexD));//AD
        vertexB.addNeighbour(
                new Edge(array[5], vertexB, vertexD));//BD
        vertexC.addNeighbour(
                new Edge(array[6], vertexC, vertexD));//CD
        vertexC.addNeighbour(
                new Edge(array[7 ], vertexC, vertexT));//CT
        vertexD.addNeighbour(
                new Edge(array[8], vertexD, vertexT));//DT
        
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
       
        shortestPath.computeShortestPaths(vertexS); // Diem bat dau la S

       
		// Diem cuoi la T
        xuat = "Duong di ngan nhat tu S den T theo thu tu lan luot la: " + shortestPath.getShortestPathTo(vertexT);
        File file = new File("Output.txt");
          try (FileWriter fw = new FileWriter(file, true);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)) {
                pw.println(xuat);
            }
		System.out.println("Ket qua trong file Output.txt");

    }
}
