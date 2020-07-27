import java.util.Scanner;

public boolean class brcCounter() {

    public static void main (String[] Args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ener bracket sequence to read - ");
        StringBuilder imputData = new StringBuilder(sc.nextLine());

        if (imputData.length() % 2 ==0) {  // simple  data lenght odd test.
            int i = 0;                       //setting init value
            int rd_br = 0;                  // for rounded brackets
            int sq_br = 0;                  // for squared brackets
            int fig_br = 0;                 // for figured brackets
            char last_br_type; //for keeping last oppened bracket type
            int last_ch_index = 0;          // to keep last oppened bracket index.

            loop:
            while (imputData.length() > 0) {   //if lenght is even we have to run analyser.
                switch (imputData.charAt(i)) {
                    case '(':
                        rd_br += 1;
                        last_br_type = ')';
                        last_ch_index = i;
                        i++;
                        break;

                    case '[':
                        sq_br += 1;
                        last_br_type = ']';
                        last_ch_index = i;
                        i++;
                        break;

                    case '{':
                        fig_br += 1;
                        last_br_type = '}';
                        last_ch_index = i;
                        i++;
                        break;

                    case ']':                   //trying to find a couple closely spaced brackets
                        sq_br -= 1;
                        if (sq_br < 0) {           //test if there more closed bracket than oppened
                            System.out.println("false. Check square brackets");
                            break loop;
                        }
                        if (imputData.charAt(i) == last_br_type) {        //removing couple of bracket
                            imputData.deleteCharAt(i).deleteCharAt(last_ch_index);
                            i--;
                            break;
                        } else {
                            System.out.println("false. Check square brackets"); // if
                            break loop;
                        }
                    case ')':                   //trying to find a couple closely spaced brackets
                        rd_br -= 1;
                        if (rd_br < 0) {           //test if there more closed bracket than oppened
                            System.out.println("false. Check rounded brackets");
                            break loop;
                        }
                        if (imputData.charAt(i) == last_br_type) {        //removing couple of bracket
                            imputData.deleteCharAt(i).deleteCharAt(last_ch_index);
                            i--;
                            break;
                        }
                        else {
                            System.out.println("false. Check rounded brackets"); // if
                            break loop;
                        }
                    case '}':                   //trying to find a couple closely spaced brackets
                        fig_br -= 1;
                        if (fig_br < 0) {           //test if there more closed bracket than oppened
                            System.out.println("false. Check figure brackets");
                            break loop;
                        }
                        if (imputData.charAt(i) == last_br_type) {        //removing couple of bracket
                            imputData.deleteCharAt(i).deleteCharAt(last_ch_index);
                            i--;
                            break;
                        }
                        else {
                            System.out.println("false. Check figure brackets"); // if
                            break loop;
                        }
                    default:
                        i++;
                        break;
                }

            }
        }
            else   {                             //if lenght is odd we can exit programm and return false
            return false;
            }
        return false;
    }

    }

