
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLLStack {
    constructor() {
        this.top = null; 
    }
    // add to top
    push(data) {
        let newNode = new Node(data);
        if (this.top === null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    pop() {
        if (this.top === null) return null;

        var removed = this.top; 
        this.top = this.top.next; 
        removed.next = null; 
        return removed.data; 
    }

    peek() {
        return this.top? this.top.data: null;
    }

    isEmpty() {
        return this.top === null;
    }

    getLength() {
        return this.length;
    }

    printStack(){
      //print the stack using only stack operations
      // return the stack back to the original state
      let tempStack = new SLLStack();
      let temp;
      console.log("top: " + this.peek())
      while(!this.isEmpty()){
        let temp = this.pop()
        console.log(temp);
        tempStack.push(temp);
      }

      while(!tempStack.isEmpty()){
        this.push(tempStack.pop());
      }
    }
}


class SLLQueue{
	constructor(){
		this.front = null;
		this.rear = null;
	}


	isPalindrome(){
		//Determine if the queue is a palindrome (same items forward and backwords)
		// Use only stack and queue for additional storage
	}

	compareQueue(q2){
		let isEqual = true;
	    let newq1 = new SLLQueue()
	    let newq2 = new SLLQueue()
	    // q1: a,b,c,d.  q2: a,b,c 
	    while(!this.isEmpty() || !q2.isEmpty()){
	      let temp = this.dequeue();
	      let temp2 = q2.dequeue();
	      if(temp != temp2){
	        console.log("false")
	        isEqual = false;
	      }
	        newq1.enqueue(temp);
	        newq2.enqueue(temp2); 
	      }
	     // the while loop will stop when one of the q ends

	    // q1 is not empty but q2 is empty 
	    if(!this.isEmpty() && q2.isEmpty()){
	        isEqual = false;
	      }
	    if(this.isEmpty() && !q2.isEmpty()){
	        isEqual = false;
	      }

	    
	    while(!newq1.isEmpty() && !newq2.isEmpty()){
	        let temp3 = newq1.dequeue()
	        this.enqueue(temp3)
	        let temp4 = newq2.dequeue()
	        q2.enqueue(temp4)
	      }
	    if(isEqual){
	      console.log("they are equal")
	    }else{
	      console.log("they are not equal")
	    }
		// compare this queue to another given queue to see if they are equal
		// do not use any extra array or objects
		// the queue should return to the original order when order
	}



	getFront(){
		if(this.front){
			return this.front.data;
		}else{
			return null;
		}
		//return the front
	}
    enqueue(data){
        // construct a new node and add to the current queue
        var node = new Node(data);
        if (this.front == null) {
          this.front = node;
          this.rear = node;
        } else {
          this.rear.next = node;
          this.rear = node;
        }
    }

	dequeue(){
		// remove and return from the front of the queue
	    if (!this.front) {
	      return null;
	    }

	    const dequeued = this.front;
	    this.front = this.front.next;

	    if (this.front === null) {
	      this.rear = null;
	    }
	    return dequeued.data;		
	}

	isEmpty(){
	    if(this.front){
	      return false;
	    }else{
	      return true;
	    }
		// check if the queue is empty
	}

	printQueue(){
		console.log("Front: " + this.getFront());
	    let q2 = new SLLQueue();
	    while(!this.isEmpty()){
	      let temp = this.dequeue();
	      console.log(temp);
	      q2.enqueue(temp)
	    }
	    while(!q2.isEmpty()){
	      this.enqueue(q2.dequeue())
    }

		
	}

	contains(searchVal) {
	    let runner = this.front;

	    while (runner) {
	      if (runner.searchVal === searchVal) return true;
	      runner = runner.next;
	    }
	    return false;
  	}
}


var q = new SLLQueue();
q.enqueue("a");
q.enqueue("b");
q.enqueue("b");
q.enqueue("a");
//q.printQueue();



var s = new SLLStack();
s.push("a");
s.push("b");
s.push("c");
s.push("d");
s.printStack();
s.printStack();

