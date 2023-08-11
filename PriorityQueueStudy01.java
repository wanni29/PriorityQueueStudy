import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueStudy01 {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 한가지 정확하게 알아야 될것은 PriorityQueue의 기본 디폴트 설정은
        // 다음과 같다. 가장 작은 값중에서 우선순위를 찾는다.
        // 만약에 가장 큰 값중에서 우선순위를 먼저 찾고싶다면 ?
        // 아래와 같은 생성자로 도입부를 시작하면 된다.
        // PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);

        System.out.println(minHeap.poll()); // 출력 1
        System.out.println(minHeap.poll()); // 출력 3

        System.out.println(minHeap.peek()); // 출력 5
    }

}
