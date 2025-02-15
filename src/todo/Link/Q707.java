package todo.Link;

public class Q707 {
    class ListNodeLocal {
        int val;
        ListNodeLocal next;

        ListNodeLocal() {
        }

        ListNodeLocal(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {

        int size;
        ListNodeLocal head;

        public MyLinkedList() {
            size = 0;
            head = new ListNodeLocal(0);
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNodeLocal cur = head;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            ListNodeLocal newHead = new ListNodeLocal(val);
            newHead.next = head.next;
            head.next = newHead;
            size++;
        }

        public void addAtTail(int val) {
            ListNodeLocal newTail = new ListNodeLocal(val);
            ListNodeLocal cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newTail;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }
            ListNodeLocal newNode = new ListNodeLocal(val);
            ListNodeLocal cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            ListNodeLocal cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
