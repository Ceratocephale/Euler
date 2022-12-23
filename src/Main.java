public class Main {
    public static void main(String[] args) {
        int[] hash = new int[]{1,2,3,4,1,2,3,5,10};
        for(int i: hash){
            System.out.println(hash.hashCode());
        }
    }
}
