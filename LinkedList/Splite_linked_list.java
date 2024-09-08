/*Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
 Output: [[1,2,3,4],[5,6,7],[8,9,10]]
 here splite the list in k size but all extra rimender are store in first

 here (list size / k) = 10 / 3 = 3 (means 3 array are splite [[],[],[]])
 * exta is (list size % k) 10 % 3 = 1 menas 1 extra element set in 1 array
 */
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Splite_linked_list {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        int k = 0;

        spliteList(head, k);
    }

    public static ListNode[] spliteList(ListNode head, int k) {
        //find the size of list;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }


        ListNode[] res = new ListNode[k];
        temp = head; //set temp as head of list
        int avg = size / k ;  //find avg
        int extra = size % k; ///find extra

        for(int i=0; i<k; i++){
            if(temp==null) break;
            ListNode currHead = temp;
            ListNode prev = null;
            int leng = 0;
            while (temp != null && leng < avg) {  //compare all are length are less to avg
                prev = temp;
                temp = temp.next;
                leng++;
            }
            if(extra > 0){ //if any extra reminder try to set in left side array
                prev = temp;
                temp = temp.next;
                extra--;
            }
            prev.next = null;
            res[i] = head;
        }

        return res;
    }
}
