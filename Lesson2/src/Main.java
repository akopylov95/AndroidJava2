public class Main {

    public static void main(String[] args) {
        String a = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 2";

        System.out.println(loadAndCalculateMatrix(a,4));

    }

    public static int loadAndCalculateMatrix(String s, int matrixSize){ //matrixSize размерность матрицы
        String[] arr = s.split("\n");
        if(arr.length != matrixSize){
            throw new MyArraySizeException("Неверное количсетво строк");
        }

        String[][] matrix = new String[matrixSize][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = arr[i].split("\\s");
            if(matrix[i].length != matrixSize){
                throw new MyArraySizeException("Неверное количество элементов");
            }
        }

        int res = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                try{
                    res += Integer.parseInt(matrix[i][j]); //получаем на выходе Integer
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке [" + i + "][" + j + "]" + " найдено не число!");
                }
            }
        }
        return res;
    }
}
