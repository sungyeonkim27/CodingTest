package leetCode.trie.Implement_Trie_Prefix_Tree;

class Trie {
    // Trie의 각 노드를 나타내는 내부 클래스
    private class TrieNode {
        TrieNode[] children;  // 자식 노드 배열 (a-z, 총 26개)
        boolean isEndOfWord;  // 이 노드에서 단어가 끝나는지 표시

        public TrieNode() {
            children = new TrieNode[26];  // 알파벳 26개
            isEndOfWord = false;
        }
    }

    private final TrieNode root;  // 트라이의 루트 노드

    // 생성자: 트라이 초기화
    public Trie() {
        root = new TrieNode();
    }

    // 단어 삽입
    public void insert(String word) {
        TrieNode current = root;

        // 단어의 각 문자를 순회
        for (char c : word.toCharArray()) {
            int index = c - 'a';  // 'a'=0, 'b'=1, ..., 'z'=25

            // 해당 경로가 없으면 새로 생성
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            // 다음 노드로 이동
            current = current.children[index];
        }

        // 마지막 문자 노드에 단어 끝 표시
        current.isEndOfWord = true;
    }

    // 단어 검색 (완전히 일치하는 단어가 있는지)
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        // 경로가 존재하고 + 단어가 끝나는 지점이어야 함
        return node != null && node.isEndOfWord;
    }

    // 접두사로 시작하는 단어가 있는지 검색
    public boolean startsWith(String prefix) {
        // 경로만 존재하면 됨 (단어 끝일 필요 없음)
        return searchPrefix(prefix) != null;
    }

    // 헬퍼 메서드: 접두사 경로를 찾아서 마지막 노드 반환
    private TrieNode searchPrefix(String prefix) {
        TrieNode current = root;

        // 접두사의 각 문자를 순회
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            // 경로가 없으면 null 반환
            if (current.children[index] == null) {
                return null;
            }

            // 다음 노드로 이동
            current = current.children[index];
        }

        // 접두사의 마지막 노드 반환
        return current;
    }
}


