public class ArrayLesson2 {


    public static void main(String[] args) {
        int inputNum = 3;
        int [] beforeField = {2, 3, 2, 1, 3, 5, 7, 8, 7, 8, 2, 6, 3};
        int removeInputnumSize = 0;

        for (int i=0;i<beforeField.length;i++) { //определим количество элементов не равных inputNumg
            if (beforeField[i] != inputNum) {
                removeInputnumSize++;
            }
        }
        System.out.println(removeInputnumSize+ " Размер массива");
        int j=0; //будет хранить индекс числа, не равного imputNum

        int [] removeInputNum = new int[removeInputnumSize];


        for (int i=0;i < beforeField.length;i++) {

            if (beforeField[i] !=inputNum) {
               removeInputNum[j] = beforeField[i];
               System.out.println(removeInputNum[j]);
               j++;

            }

        }

        }
    }
