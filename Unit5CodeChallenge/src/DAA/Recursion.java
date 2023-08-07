package DAA;

// TimeComplexity : O(n) and SpaceComplexity : O(n)
public class Recursion {

    private static int findItem(String[] items, String targetItem){
        return recursive(items,targetItem,0);
    }

    private static int recursive(String[] items, String targetItem, int index){
        if(index >= items.length){
            return -1;
        }
        else if(items[index] == targetItem){
            return index;
        }
        return recursive(items, targetItem,index+1);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Index of the item : " +findItem(new String[]{"hey","there","you"},"hey")); // valid
        System.out.println("Index of the item : " +findItem(new String[]{"hey","there","you"},"the")); // invalid
        System.out.println("Index of the item : " +findItem(new String[]{"hey","good","morning"},"morning"));
    }
}
