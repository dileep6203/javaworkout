package sapmlework;

public class QueueApp {
	private int qcapacity;
	int qArr[];
	int head=0;
	int tail=-1;
	int qCurrentSize=0;
	
	public QueueApp(int qSize){
		this.qcapacity=qSize;
		qArr=new int[this.qcapacity];
	}
	/*--this method adds element at the end of the queue.--------*/
	public void push(int element){
		if (isQFull()){
			System.out.println("Overflow ! Unable to add element: "+element);
		}else {
			tail++;
			if (tail == qcapacity-1){
				tail=0;
			}
			qArr[tail]=element;
			qCurrentSize++;
			System.out.println("Element " + element+ " is moved to Queue !");
			
		}
	}
	/*-- method for  removing element at the top of the queue.--------*/
	public void pop() {
		if (isQEmpty()){
			System.out.println("Underflow ! Unable to remove element from Queue");
		} else {
			head++;
			if (head == qcapacity-1){
				System.out.println("Element is popped out :" +qArr[head-1]);
				head=0;
			}else {
				System.out.println("Element is popped out :" +qArr[head-1]);
			}
			qCurrentSize--;
		}
	}
	/*------- method for checking whether the queue is full or not --------*/
	public boolean isQFull(){
		boolean status=false;
		if (qCurrentSize==qcapacity){
			status=true;
		}
		return status;
	}
	/*------- method for checking whether the queue is empty or not --------*/
	public boolean isQEmpty(){
		boolean status=false;
		if (qCurrentSize==0){
			status=true;
		}
		return status;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueApp qapp=new QueueApp(3);
		qapp.push(10);
		qapp.pop();
		qapp.push(1);
		qapp.push(2);
		qapp.push(3);
		qapp.push(4);
		qapp.push(5);
		qapp.pop();
		
	}

}
