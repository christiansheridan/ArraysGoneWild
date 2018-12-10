import java.util.*;

public class Arraz implements Iterator {


    public int sumValuesOfArray(Integer[] array){
        int sum = 0;
        for(int i: array){
            sum+= i;
        }
        return sum;
    }

    public double sumDoublesOfArray(double[] array){
        double sum = 0;
        for(double d: array){
            sum+=d;
        }
        return sum;
    }

    public Integer averageOfArray(Integer[] array1) {
        return sumValuesOfArray(array1)/array1.length;
    }

    public Double doubleAverageOfArray(double[] array3) {
        return sumDoublesOfArray(array3)/array3.length;
    }


    public boolean containsValue(Integer[] array1, Integer i) {
        for(Integer in: array1){
            if(in == i){
                return true;
            }
        }
        return false;
    }


    public Integer[] reverseArray(Integer[] array1) {
        Integer[] arr = new Integer[array1.length];
        for(int i = 0; i<array1.length; i++){
            arr[i] = array1[array1.length-i-1];
        }
        return arr;
    }

    public OddEven getOddEvensOfArray(Integer[] array1) {
        OddEven oddEven = new OddEven();
        for(Integer i: array1){
            if(i%2==0){
                oddEven.evens++;
            }
            else oddEven.odds++;
        }
        return oddEven;
    }

    public int findIndexOf(Integer[] array1, int i) {
        for(int j =0; j<array1.length; j++){
            if (array1[j] == i){
                return j;
            }
        } return -1;
    }

    public Integer[] copyArrayByIterator(Integer[] array1) {
        Integer[] copyArray = new Integer[array1.length];
        Iterator<Integer>iterator = Arrays.asList(array1).iterator();
        int c = 0;
        while(iterator.hasNext()){
            copyArray[c] = iterator.next();
            c++;
        }
        return copyArray;
    }

    public Integer[] copyArrayByLoop(Integer[] array1) {
        Integer[] array = new Integer[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        return array;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }


    public Integer[] removeElementFromArray(Integer[] array1, int i) {
        int c = 0;
        int count = numberOfOccurrences(array1, i);
        Integer[]array = new Integer[array1.length-count];
        for(int j = 0; j<array1.length; j++){
            if(array1[j] == i){
                c++;
            }
            else array[j-c] = array1[j];
        }
        return array;
    }

    public int numberOfOccurrences(Integer[] array1, int i) {
        int count = 0;
        for(Integer in: array1){
            if(in == i){count++;}
        }
        return count;
    }


    public Integer[] insertIntoArrayAt(Integer[] array1, int value, int index) {
        Integer[]array = new Integer[array1.length+1];
        for(int i = 0; i<array.length; i++){
            if(i<index){
                array[i] = array1[i];
            }
            else if(i==index){
                array[i] = value;
            }
            else array[i] = array1[i-1];
        }
        return array;
    }


    public MaxMin findMaxMinOfArray(Integer[] array1) {
        Arrays.sort(array1);
        MaxMin maxMin = new MaxMin();
        maxMin.setMin(array1[0]);
        maxMin.setMax(array1[array1.length-1]);
        return maxMin;
    }


    public double find2ndLargestFromArray(double[] array3) {
        Arrays.sort(array3);
        for(int i = array3.length -1; i>0; i--){
            if (array3[i] != array3[i-1]){
                return array3[i-1];
            }
        }
        return 0;
    }


    public ArrayList<Integer> makeMeAnArrayList(Integer[] array1) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(array1.length);
        arrayList.addAll(Arrays.asList(array1));
        return arrayList;
    }


    public boolean check2ArraysForEquals(Integer[] array1, Integer[] array11) {
        return Arrays.equals(array1, array11);
    }


    public int averageOfArrayWithoutMaxMin(Integer[] array1) {
        int max = findMaxMinOfArray(array1).getMax();
        int min = findMaxMinOfArray(array1).getMin();
        Integer[]arr1 = removeElementFromArray(array1, max);
        Integer[]arr2=removeElementFromArray(arr1, min);
        return averageOfArray(arr2);
    }

    public boolean contains65and77(Integer[] array6577) {
        return containsValue(array6577, 65) && containsValue(array6577, 77);
    }

    public boolean theTotalOfTensIs30(Integer[] array10) {
        if(containsValue(array10, 10) && numberOfOccurrences(array10, 10) == 3){
            return true;
        } return false;
    }

    public Integer[] smallestAndSecondSmallest(Integer[] array1) {
        Integer[] arr = new Integer[2];
        Arrays.sort(array1);
        arr[0] = array1[0];
        for(int i = 0; i<array1.length; i++){
            if (array1[i] != array1[i+1]){
                arr[1] = array1[i+1];
                break;
            }
        }
        return arr;
    }

    public Integer[] makeMeACopyPlease(Integer[] array1) {
        Integer[]arr = new Integer[array1.length];
        for(int i = 0; i<array1.length; i++){
            arr[i] = array1[array1.length-1-i];
        }
        return arr;
    }


    public Integer[] removeLastItemAndCopy(Integer[] array1) {
        Integer in = array1[array1.length-1];
        Integer[] arr = removeElementFromArray(array1, in);
        return copyArrayByIterator(arr);
    }

    public Integer[] removeFirstItemAndCopy(Integer[] array1) {
        Integer in = array1[0];
        Integer[] arr = removeElementFromArray(array1, in);
        return copyArrayByIterator(arr);
    }

    public Integer[] insertAtStartAndCopy(Integer[] array2, int i) {
        Integer[] arr = insertIntoArrayAt(array2, i, 0);
        return copyArrayByIterator(arr);
    }

    public Integer[] sortArrayIntoEvensThenOdds(Integer[] array1) {
        OddEven oddEven = getOddEvensOfArray(array1);
        ArrayList<Integer> evens = new ArrayList<Integer>(oddEven.getEvens());
        ArrayList<Integer> odds = new ArrayList<Integer>(oddEven.getOdds());
        for(Integer i: array1){
            if(i%2==0){
                evens.add(i);
            } else odds.add(i);
        }
        ArrayList<Integer>evensAndOdds = new ArrayList<Integer>(array1.length);
        evensAndOdds.addAll(evens);
        evensAndOdds.addAll(odds);
        Integer[] evenOdds = new Integer[array1.length];
        evenOdds = evensAndOdds.toArray(evenOdds);
        return evenOdds;
    }
}
