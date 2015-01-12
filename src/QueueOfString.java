
public class QueueOfString {

	
	public void String enqueue (String string){
		StringNode nextNode=new StringNode(string);
		
		if (head==null&& tail==null){
			head=nextNode;
			tail=nextNode;
			
		}else{
			tail.setNext(nextNode);
			tail=nextNode;
		}
		
	}
	
	public String dequeue(){
		if (head==null){
			return null;
		}
		String result=head.getValue();
		head=head.getNext();
		
	}
	
	private static class StringNode{
		String value;
		String next;
		
		public StringNode (String value){
			this.value=value;
		}
	public String getValue (){
		return value;
	}	
	
	public StringNode getNext(){
		return next;
	}
		
	}
}
