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
  insertAtBack(data){
        // Create a new node with the given value 
        // inserts it at the back of the list
        // HINT: How to find the last node of a Singly Linked List?    
  }

  removeHead(){
        // Remove the head (HINT: What will be the new head?)
  }

  // ------------W1D4------------
    contains(data){
      

    }

    removeBack(){
    }

   
    average(){

    }

    containsRecursive(data, curr=this.head){      

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



