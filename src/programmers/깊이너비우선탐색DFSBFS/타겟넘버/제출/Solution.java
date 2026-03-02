package programmers.깊이너비우선탐색DFSBFS.타겟넘버.제출;

//1. 노드가 가지는 데이터
//2. 자식 노드의 개수
//3. 기저조건 설정
//4. 재귀 함수 호출 시점
//5. 반환값 설정

public class Solution {
    public static void main(String[] args) {
        Solution tNum = new Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(tNum.solution(numbers, target));
    }

    public class TrieNode {
        TrieNode[] children = new TrieNode[2];
        int sum = 0;
    }

    public int solution(int[] numbers, int target) {
        int result = 0;
        TrieNode root = new TrieNode();
        root.sum = 0;
        insert(numbers, root, 0);
        result = search(target, root, result);
        return result;
    }

    private void insert(int[] numbers, TrieNode current, int index) {
        if (index >= numbers.length) {
            return;
        }
        int number = numbers[index];

        // + 연산의 경우
        current.children[0] = new TrieNode();
        current.children[0].sum = current.sum + number;
        insert(numbers, current.children[0], index + 1);
        // current.children[0]로 인자를 넣으면 메서드 밖에서 노드를 이동하지 않기 때문에 자식 노드 참조 문제가 없다.

        // - 연산의 경우
        current.children[1] = new TrieNode();
        current.children[1].sum = current.sum - number;
        insert(numbers, current.children[1], index + 1);
    }


    private int search( int target, TrieNode node, int count) {

        if (node == null) {
            return count;
        }

        if (node.children[0] == null && node.children[1] == null) {
            if (node.sum == target) {
                return ++count;
            }
            return count;
        }


        count = search(target, node.children[0], count);
        count = search(target, node.children[1], count);

        return count;
    }


}
