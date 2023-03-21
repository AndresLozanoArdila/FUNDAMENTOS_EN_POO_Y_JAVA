import java.util.Random;

public class reto4 {

        
        public static void main(String[] args) {
            int[][] sudoku = generateSudoku();
            printSudoku(sudoku);
        }
        
        public static int[][] generateSudoku() {
            int[][] sudoku = new int[3][3];
            Random rand = new Random();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sudoku[i][j] = rand.nextInt(9) + 1;
                }
            }
            return sudoku;
        }
        
        public static void printSudoku(int[][] sudoku) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(sudoku[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }