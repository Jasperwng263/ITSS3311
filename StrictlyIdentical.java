import java.util.Scanner;
public class StrictlyIdentical {
    public static boolean equals(int[] array1, int[] array2){
        for(int i = 0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array1[] = new int[5];//set the data set and array1 size to 5 
        int array2[] = new int[5];// set the data set and array2 size to 5

        System.out.print("Enter 5 elements of list1: ");//prints for user to enter numbers
        for(int i = 0;i<5;i++){ //loop that shows i must be less than 5 or else exit the loop
            array1[i] = scanner.nextInt();//hold i for next entry
        }

        System.out.print("Enter 5 elements of list2: ");//prints for user to enter number for list 2
        for(int i = 0;i<5;i++){//loop that shows i must be less than 5 or else exit the loop
            array2[i] = scanner.nextInt();//hold i for next entry
        }

        if(equals(array1,array2)){//make sure both are identical
            System.out.println("Two lists are strictly identical.");//prints out the statement if identical
        }//encloses if they are identical
        else{// if not identical
            System.out.println("Two lists are not strictly identical.");//print out the statement if they are not identical
        }//enclose if they are not identical 
    }
}
