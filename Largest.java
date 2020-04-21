public class Largest {
    public Largest() {}
    public int largest(int[] list){
        int index;
        int max =list[0];
        for (index = 0; index < list.length; index++){
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }
}