package leetcode.tree;

public class Trie {
    private class TriNode {
        private boolean isEnd;
        private TriNode[] next;

        public TriNode() {
            isEnd = false;
            next = new TriNode[26];
        }
    }

    private TriNode root;

    public Trie() {
        root = new TriNode();
    }

    public void insert(String word) {
        TriNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.next[c - 'a'] == null)
                cur.next[c - 'a'] = new TriNode();
             cur = cur.next[c - 'a'];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        TriNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.next[c - 'a'] == null)
                return false;
            else cur = cur.next[c - 'a'];
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TriNode cur = root;
        for (char c : prefix.toCharArray()) {
            if (cur.next[c - 'a'] == null)
                return false;
            else cur = cur.next[c - 'a'];
        }
        return true;
    }
}
