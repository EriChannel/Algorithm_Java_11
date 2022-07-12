public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        Node n4 = null;
        print(n4);

        print(n1);

        print(n2);

        Node n0 = addToHead(0, n1);
        print(n0);

        n1 = addToHead(9, n1);
        print(n1);

        n0 = addToTail(4, n0);
        print(n0);

        n0 = addToIndex(5, n0, 3);
        print(n0);

        n0 = removeAtHead(n0);
        print(n0);
    }

    public static void print(Node headNode){
        if(headNode == null){
            System.out.println("LinkedList rỗng");
        }else {
            Node temp = headNode;
            while (temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else
                    System.out.println();
            }
        }
    }

    public static Node addToHead(int value, Node headNode){
        //Tạo node mới
        Node newNode = new Node(value);
//        if(headNode == null){
//            return newNode;
//        }else {
//            newNode.next = headNode;
//        }
        if (headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(int value, Node headNode){
        Node newNode = new Node(value);
        if(headNode == null){
            return newNode;
        }else {
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(int value, Node headNode, int index){
        if(index == 0){ //Thêm vào đầu danh sách
            return addToHead(value, headNode);
        }else {
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode.next != null){
                count++;
                if (count == index){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }
}