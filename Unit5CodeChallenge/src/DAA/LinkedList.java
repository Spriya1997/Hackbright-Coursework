package DAA;

public class LinkedList {
    
    static Node head1, head2;

    public static class Node{
        Node next;
        int val;

        public Node(int data){
            val = data;
            next = null;
        }
    }

    private static Node addTwoNumbers(Node n1, Node n2){
        Node temp = new Node(0);
        Node current = temp;
        int carry = 0;

        while(n1 != null || n2 != null || carry != 0){
            int sum = 0;
            if(n1 != null){
                sum = n1.val;
                n1 = n1.next;
            }
            if(n2 != null){
                sum += n2.val;
                n2 = n2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum %= 10;

            Node newNode = new Node(sum);
            current.next = newNode;
            current = current.next;
        }
        return temp.next;
 }
 
    private static void displayResults(Node node){
        while(node!=null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.next = new Node(2);
		n1.next.next = new Node(3);

        Node n2 = new Node(4);
		n2.next = new Node(5);
		n2.next.next = new Node(6);

        Node result = addTwoNumbers(n1,n2);
        System.out.println("Sum of two numbers in reverse format : ");
        displayResults(result); // output : 579
    }
}