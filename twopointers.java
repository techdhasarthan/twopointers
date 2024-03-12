import java.util.Arrays;

public class twopointers {

    public static void main(String[] args) {

                int arr[] = { 2, 3, 5, 8, 9, 10, 11 };

                int val = 17;

                System.out.println(Arrays.toString(isPairSum(arr, arr.length, val)));
            }



    private static int[] isPairSum(int[] A, int N, int X)
            {
                // Nested for loops for iterations
                for (int i = 0; i < N; i++) {
                    for (int j = i + 1; j < N; j++) {
                        // As equal i and j means same element
                        if (i == j)

                            // continue keyword skips the execution
                            // for following condition
                            continue;

                        // Condition check if pair exists
                        if (A[i] + A[j] == X)
                            return new int[]{A[i], A[j]};

                        // By now the array is sorted
                        if (A[i] + A[j] > X)

                            // Break keyword to hault the execution
                            break;
                    }
                }

                // No pair found with given sum.
                return new int[]{0};
            }
        }

