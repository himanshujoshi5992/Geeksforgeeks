import java.util.Scanner;

class List {
	int item;
	List right;
	List(int data) {
		this.item = data;
		this.right = null;
	}
}
class LengthLL {
	static List head = null;

	void createList(int num) {
		if (head == null) {
			List n1 = new List(num);
			head = n1;
		} else {
			List n = new List(num);
			n.right = head;
			head = n;
		}
	}
	public static void main(String[] args) {
		LengthLL len = new LengthLL();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int num = s.nextInt();
			len.createList(num);
		}
		List temp = head;
		int length = 0;
		for (int i = 0;temp != null;i++) {
			System.out.println(temp.item);
			temp = temp.right;
			length = i;
		}
		System.out.println("Length of list: "+(length+1));
	}
}