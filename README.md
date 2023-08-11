# PriorityQueue

## 기본개념
- 우선 순위 큐를 구현한 클래스
- 요소들을 우선순위에 따라 저장하고 접근
- 우선순위에 따라 정렬 (선택해야함 -> 큰값, 작은값)
- heap 데이터 기반
- 우선 순위 큐의 동작 보장

## 사용법
- add(E element)
- offer(E element)
- poll() -> 가장 우선순위가 높은 요소를 제거하고 반환
- peek() -> 가장 우선순위가 높은 요소를 반환하지만 제거하지 않음

---

## 간단한 코드
```java
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueStudy {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 한가지 정확하게 알아야 될것은 PriorityQueue의 기본 디폴트 설정은
        // 다음과 같다. 가장 작은 값중에서 우선순위를 찾는다.
        // 만약에 가장 큰 값중에서 우선순위를 먼저 찾고싶다면 ?
        // 아래와 같은 생성자로 도입부를 시작하면 된다.
        // PriorityQueue <Integer> maxHeap = 
        // new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);

        System.out.println(minHeap.poll()); // 출력 1
        System.out.println(minHeap.poll()); // 출력 3

        System.out.println(minHeap.peek()); // 출력 5
    }

}


```