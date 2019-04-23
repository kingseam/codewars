package codiliity;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public int solution(int[] A, int[] B, int M, int X, int Y) {
		// write your code in Java SE 8
		int maxFloor = M;
		int maxPeople = X;
		int maxWeight = Y;
		if (A.length != B.length) {
			return 0;
		}
		int size = A.length;
		Queue<People> peopleQueue = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			// maxFloor over continue;
			if (maxFloor < B[i]) {
				continue;
			}
			peopleQueue.add(new People(A[i], B[i]));
		}

		return move(peopleQueue, maxPeople, maxWeight);
	}

	public int move(Queue<People> peopleQueue, int maxPeople, int maxWeight) {
		Queue<People> elevatorQueue = new LinkedList<>();
		int currentPeople = 0;
		int currentWeight = 0;
		int currentFloor = 1;
		int count = 0;
		boolean move = false;

		while (!peopleQueue.isEmpty()) {
			People people = peopleQueue.peek();
			if (currentPeople + 1 <= maxPeople && currentWeight + people.getWeight() <= maxWeight) {
				move = false;
				currentPeople++;
				currentWeight = currentWeight + people.getWeight();
				elevatorQueue.add(peopleQueue.poll());
			}else{
				move = true;
			}

			if(peopleQueue.isEmpty()) move = true;

			if(move) {
				while(!elevatorQueue.isEmpty()) {
					People elevatorPeople = elevatorQueue.poll();
					if (currentFloor != elevatorPeople.getFloor()) {
						count++;
						currentFloor = elevatorPeople.getFloor();
					}
				}

				if (elevatorQueue.isEmpty()) {
					currentFloor = 1;
					currentPeople = 0;
					currentWeight = 0;
					count++;
				}
			}

		}
		return count;
	}

	static public void main(String... args) {
		Solution sl = new Solution();
		System.out.println(sl.solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 200));
	}

}

class People {

	int weight;
	int floor;

	public People(int weight, int floor) {
		this.weight = weight;
		this.floor = floor;
	}

	public int getWeight() {
		return weight;
	}

	public int getFloor() {
		return floor;
	}
}