package hashtable;

import java.util.ArrayList;
import java.util.List;

public class hashTable {
    public static void main(String[] args) {
        Solution A = new Solution();
        System.out.println(A.generate(5));

    }

    class Emp {
        public int id;
        public String name;
        public Emp next;

        public Emp(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
    }

    class EmpLinkedList {
        private Emp head;

        public  void add(Emp emp) {
            if (head == null) {
                head = emp;
                return;
            }
            Emp curEmp=head;
            while(true){
                if (curEmp.next==null){
                    break;
                }
                curEmp=curEmp.next;
            }
            curEmp.next=emp;
        }

        public void list(int no) {
            if (head == null) {
                System.out.println("第" + (no + 1) + "链表的信息为空");
                return;
            }
            System.out.print("第"+(no+1)+"链表信息为");
            Emp curEmp=head;
            while (true) {
                System.out.printf("=>id=%d name=%s\t", curEmp.id, curEmp.name);
                if (curEmp.next == null) {
                    break;
                }
                curEmp = curEmp.next;
            }
            System.out.println();
        }

        public Emp findEmpByld(int id) {
            if (head == null) {
                System.out.println("链表为空");
            }
            Emp curEmp = head;
            while (true) {
                if (curEmp.id == id) {
                    break;
                }
                if (curEmp.next == null) {
                    curEmp = null;
                    break;
                }
                curEmp = curEmp.next;
            }
            return curEmp;
        }
    }

    class HashTab {
        private EmpLinkedList[] empLinkedListArray;
        private int size;

        public HashTab(int size) {
            this.size = size;
            empLinkedListArray = new EmpLinkedList[size];
            for (int i = 0; i < size; i++) {
                empLinkedListArray[i] = new EmpLinkedList();

            }
        }

        public void add(Emp emp) {
            int empLinkedLishNO = hashFun(emp.id);
            empLinkedListArray[empLinkedLishNO].add(emp);
        }

        public int hashFun(int id) {
            return id % size;
        }

        public void list() {
            for (int i = 0; i < size; i++) {
                empLinkedListArray[i].list(i);
            }
        }

        public void findEmpById(int id) {
            int empLinkedListNO = hashFun(id);
            Emp emp = empLinkedListArray[empLinkedListNO].findEmpByld(id);
            if (emp != null) {
                System.out.printf("在第%d条链表中找到 雇员id=%d\n", (empLinkedListNO + 1), id);

            } else {
                System.out.println("没有此人");
            }
        }
    }

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                    }
                }
                ret.add(row);
            }
            return ret;
        }
    }

}
