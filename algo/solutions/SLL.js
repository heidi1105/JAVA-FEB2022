// class Node 
class Node{
  constructor(data){
    this.data = data;
    this.next = null;
  }  
}

// class SLL - Singly Linked List
class SLL{
  constructor(){
    this.head = null;
  }

// ------------W1D1------------
  isEmpty(){
    if(this.head === null){
      return true;
    }else {
      return false;
    }
  }
  
  insertAtFront(data){
      var tempNode = new Node(data);
      tempNode.next = this.head;
      this.head = tempNode;
  }

  // bonus
  arrToList(arr){
        // loop through the array
        for (var i=0; i<arr.length; i++) {
          // add each value in array to back of SLL
          this.insertAtBack(arr[i]);
        }
  }

// ------------W1D2------------
  insertAtBack(data){
    var newNode = new Node(data);
    if(this.head){
      var runner = this.head;
      while(runner.next){
        runner = runner.next;
      }
      runner.next = newNode;
    }else{
      this.head = newNode;
    }
  }

  removeHead(){
    if(this.head){
      this.head = this.head.next;
    }
  }

  // ------------W1D3------------
      insertAtBack(val){
        var d = new Node(val);   
        var runner = this.head;
        while (runner.next) {      
          runner = runner.next
        }
        runner.next = d;

    }

    removeHead(){
        if(this.head){
            this.head = this.head.next;
        }
    }

  // ------------W1D4------------
    contains(data){
        let runner = this.head;
        while(runner){
            if(runner.data == data){
                return true;
            }
        }
        return false;
    }

    containsRecrusive(data, curr = this.head){
        if(!curr){
            return false        
        }
        if(curr.data == data){
            return true
        }else{
            return this.containsRecrusive(data, curr.next)
        }
    }

    removeBack(){
        if(!this.head){
            return
        }
        let runner = this.head;
        if(!runner.next){
            this.head=null;
        }
        while(runner.next.next){
            runner = runner.next;
        }
        runner.next =null;
    }

     average(){
        let count = 0;
        let sum = 0;
        let runner = this.head;
        while(runner){
            sum += runner.val;
            count++;
            runner=runner.next;            
        }
        return sum/count;
        // Find the average of all the nodes inside a Singly Linked List
        // HINT: How to get an average? What information do we need to generate an average?
        // BONUS: What if one of the nodes stored String instead of int? How do you want to handle that edge case?
    }

  //given
  printList(){
    if(!this.head){
        console.log("Empty list");
        return
    }
    console.log("HEAD: " + this.head.data)
    var runner = this.head;
    while(runner){ // while(runner != null)
        console.log(runner.data);
        runner = runner.next;            
    }
  }
}



var list1 = new SLL();

var list2 = new SLL();
list2.insertAtBack(1);
list2.insertAtBack(2);
list2.insertAtBack(3);

list1.printList();
list2.printList();



