package day15multidimensionalarraylists;

public class MultidimensionalArrays04 {

    public static void main(String[] args) {

        //Example:Find the maximum element in a two dimensional array
        //{{5,0},{-2,4},{65,-12,23}}

        int arr[][]={{5,0},{-2,4},{65,-12,23}};

        int max=arr[0][0];

        for (int[] w:arr){
            for (int u:w){
                if (max<u){
                    max=u;

                    System.out.println(max);
                }
            }
        }
    }
}
