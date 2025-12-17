package leetCode.trie.Search_Suggestions_System;

import java.util.*;

class Solution {
    // Trie 노드 정의
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        List<String> suggestions = new ArrayList<>(); // 각 노드에 최대 3개 상품 저장
    }

    class Trie {
        TrieNode root = new TrieNode();

        // Trie에 단어 삽입
        void insert(String word) {
            // 현재 노드에 루트 할당
            TrieNode node = root;

            // 단어를 한글자식 반복할당
            for (char c : word.toCharArray()) {

                // c에 해당하는 자식이 있으면 넘어가고 없으면 새 자식을 생성
                node.children.putIfAbsent(c, new TrieNode());
                // 해당 문자의 자식 노드로 이동
                node = node.children.get(c);

                // 각 노드에 사전순으로 최대 3개까지만 저장
                if (node.suggestions.size() < 3) {
                    node.suggestions.add(word);
                }
            }
        }

        // prefix로 시작하는 추천 상품 검색
        List<String> search(String prefix) {
            TrieNode node = root;

            // prefix를 따라 내려가기
            for (char c : prefix.toCharArray()) {
                if (!node.children.containsKey(c)) {
                    return new ArrayList<>(); // prefix가 없으면 빈 리스트 반환하고 종료
                }
                // c 자식노드로 이동
                node = node.children.get(c);
            }

            return node.suggestions;
        }
    }

    // 해당 검색 내용을 트라이 구조에 저장하는 메서드
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        // 1. products를 사전순으로 정렬
        Arrays.sort(products);

        // 2. Trie 구축
        Trie trie = new Trie();
        for (String product : products) {
            trie.insert(product);
        }

        // 3. searchWord의 각 문자를 추가하며 검색
        List<List<String>> result = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();

        for (char c : searchWord.toCharArray()) {
            // prefix에 현재 문자를 추가
            prefix.append(c);
            // prefix로 검색한 결과를 결과에 추가
            result.add(trie.search(prefix.toString()));
        }

        return result;
    }
}
