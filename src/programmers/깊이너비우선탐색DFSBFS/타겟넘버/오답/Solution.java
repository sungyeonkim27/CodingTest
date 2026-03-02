package programmers.깊이너비우선탐색DFSBFS.타겟넘버.오답;

public class Solution {
    public static void main(String[] args) {
        Solution tNum = new Solution();
        int[] numbers = {4, 1, 2, 1};
        int target = 2;
        System.out.println(tNum.solution(numbers, target));
    }

    public class TrieNode {
        TrieNode[] children = new TrieNode[2];
        int sum = 0;
    }

    public int solution(int[] numbers, int target) {
        int result = 0;
        TrieNode root = new TrieNode();
        int index = 0;
        insert(numbers, root, index);
        search(target, root, result);
        return result;
    }

    public void insert(int[] numbers, TrieNode current, int index) {
        for (int i = index; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = 0; j < 2; j++) {
                if (current.children[j] == null) {
                    current.children[j] = new TrieNode();
                }

                if (j == 0) {
                    current.children[j].sum = current.sum + number;
                    current = current.children[j]; // j=0일 때 current를 변경하면, j=1일 때는 원래 노드가 아닌 자식 노드를 참조하게 된다.
                    if (index >= numbers.length) {
                        continue;
                    }
                    insert(numbers, current, ++index);
                    /*
                    외부 for문(i)과 재귀 호출이 중복되어 있다.
                    insert(numbers, current, ++index)를 호출하면서 index를 변경하는데, 이것이 외부 for문과 충돌한다.
                    결과적으로 배열 범위를 벗어나거나 의도하지 않은 동작을 한다.
                     */
                } else {
                    current.children[j].sum = current.sum - number;
                    current = current.children[j];
                    if (index >= numbers.length) {
                        continue;
                    }
                    insert(numbers, current, ++index);
                }

            }

        }
    }

    public int search(int target, TrieNode root, int count) {
        TrieNode current = root;
        for (int i = 0; i < 2; i++) {
            if (current.children[i] == null) {
                continue;
            }

            if (current.children[i].sum == target) {
                count++;
                current = current.children[i];
            }
        }
        return count;
    }



}

/*
[4, 1, 2, 1]	4	2

  + 4 + 1 + 2 + 1
              - 1
          - 2 + 1
              - 1
      - 1 + 2 + 1
              - 1
          - 2 + 1
              - 1
  - 4 + 1 + 2 + 1
              - 1
          - 2 + 1
              - 1
      - 1 + 2 + 1
              - 1
          - 2 + 1
              - 1

 */

/*
1. 노드가 가지는 데이터
2. 자식 노드의 개수
3. 기저조건 설정
4. 재귀 함수 호출 시점
5. 반환값 설정

1. 트라이보다도 DFS로 풀어야함
2. 트라이는 잘 안쓰는 알고리즘
3. 문자열에 자주쓰는게 트라이


dfs
1. 재귀
2. 스택
3. (옵셔널): 방문 기록 관리

- 재귀를 위해 매개변수를 분리
- 어레이, 타겟넘버, 현재 깊이, 어레이의 깊이
- 기저조건 설정(배열 인덱스 초과시 반환)
- 보통 주어진 배열을 노드마다 들고 다닌다.
- 계산 로직 -> 한 depth에서 더하는 것을 다음 depth에 넘김


BFS
1. 재귀
2. 큐
3. (옵셔널): 방문 기록 관리

트라이는 데이터 형식
dfs는 알고리즘

게임 맵 최단거리
-

백준 미로 탐색 풀어보기

 */