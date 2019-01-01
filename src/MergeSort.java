public class MergeSort {

    public int[] mergeSort(int[] arr){
        if(arr.length == 1)
            return arr;

        int[] arrOne, arrTwo;
        arrOne = new int[arr.length / 2];
        arrTwo = new int[arr.length - arrOne.length];

        for(int i = 0; i < arr.length / 2; i++){
            arrOne[i] = arr[i];
        }

        for(int i = 0, i2 = arr.length / 2; i2 < arr.length; i++, i2++){
            arrTwo[i] = arr[i2];
        }

        arrOne = mergeSort(arrOne);
        arrTwo = mergeSort(arrTwo);

        return merge(arrOne, arrTwo);
    }

    private int[] merge(int[] arrA, int[] arrB) {
        int[] arrC = new int[arrA.length + arrB.length];

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        // Comparing the arrays
        while(indexA < arrA.length && indexB < arrB.length){
            if(arrA[indexA] > arrB[indexB]){
                arrC[indexC] = arrB[indexB];
                indexB++;
            } else {
                arrC[indexC] = arrA[indexA];
                indexA++;
            }
            indexC++;
        }

        // When one of the arrays are empty

        while(indexA < arrA.length){
            arrC[indexC] = arrA[indexA];
            indexA++;
            indexC++;
        }

        while(indexB < arrB.length){
            arrC[indexC] = arrB[indexB];
            indexB++;
            indexC++;
        }

        return arrC;
    }
}
