package Beginner.Arrays;

public class Matrisler {
    public static void main(String[] args) {
        int [][] deneme = new int[3][4];


        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        //3. satır 2. sutun
        System.out.println(uzaklik[3][2]);

        //satır boyutu
        System.out.println(uzaklik.length);
        //sütun boyutu
        System.out.println(uzaklik[0].length);

        //Matris oluşturma
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
        // Matrisi yazdırma
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geç
        }

    }
}
