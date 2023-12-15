package 스택.큐.프린터;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	class Document {
		int prior;
		int locate;

		public Document(int p, int l) {
			this.prior = p;
			this.locate = l;
		}
	}

	public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Document> queue = new LinkedList<Document>();

		int index = 0;

		for (int i : priorities) {
			queue.add(new Document(i, index++));
		}

		Document d;
		while (queue.size() > 1) {
			d = queue.peek();
			for (int i = 0; i < queue.size(); i++) {
				if (d.prior < queue.peek().prior) {
					queue.add(queue.poll());
					break;
				}

				if (i == queue.size() - 1) {
					if (d.locate == location)
						return answer;
					queue.remove();
					answer++;
				}
			}
		}

		return answer;
	}
}