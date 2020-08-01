public class arrayLesson {

        public static void main(String[] args) {
            int[] field = new int[25];
            int i = 0;
            for (i = 0; i<field.length; i++) {
                if (i % 2>0) {
                    field[i] = 1;
                }
                else{
                    field[i] = i;
                }
                System.out.println("Index "+i+":"+field[i]);
            }
        }



    }
