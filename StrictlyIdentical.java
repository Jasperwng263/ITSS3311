import java.util.Scanner;//import the method
public class StrictlyIdentical {//naming the class
    public static boolean equals(int[] array1, int[] array2){//declare a true of false statement if array1 and array2 are identical
        for(int i = 0;i<array1.length;i++){//loop for array1 must be greater than i 
            if(array1[i]!=array2[i]){// if array1 is not equal to array2 than it is false
                return false;// if not statement ends
            }//enclose if statement is false
        }//enclose the statement with the loop
        return true;//if true then moves down 
    }//enclose the statement above if true 

    public static void main(String[] args) {//main method 
        Scanner scanner = new Scanner(System.in);//bring the scanner in
        int array1[] = new int[5];//set the data set and array1 size to 5 
        int array2[] = new int[5];// set the data set and array2 size to 5

        System.out.print("Enter 5 elements of list1: ");//prints for user to enter numbers
        for(int i = 0;i<5;i++){ //loop that shows i must be less than 5 or else exit the loop
            array1[i] = scanner.nextInt();//hold i for next entry
        }//enclose the loop for array1

        System.out.print("Enter 5 elements of list2: ");//prints for user to enter number for list 2
        for(int i = 0;i<5;i++){//loop that shows i must be less than 5 or else exit the loop
            array2[i] = scanner.nextInt();//hold i for next entry
        }//enclose the loop of array2

        if(equals(array1,array2)){//make sure both are identical
            System.out.println("Two lists are strictly identical.");//prints out the statement if identical
        }//encloses if they are identical
        else{// if not identical
            System.out.println("Two lists are not strictly identical.");//print out the statement if they are not identical
        }//enclose if they are not identical 
    }
}

	/*Enter 5 elements of list1: 1 2 3 4 5
	Enter 5 elements of list2: 1 2 3 4 5 
	Two lists are strictly identical*/
