class Solution {
   int top=-1;	
	int max=10000;
	char ch[] = new char[max];
	
	boolean isEmpty()
	{
			// System.out.println(max);
			return (top<0);
	}
	
	
	public void push(char a)
	{
		if(top<=max-1)
		{
			ch[++top]=a;
			// System.out.println(ch[top]);
		}
	}
	public char pop()
	{
		
		if(top>=0)
		{
			int x = ch[top];
			// System.out.println(ch[top]);
			top--;
		}
		return ' ';
	}
	public char peek()
	{
		return ch[top];
	}
	public void show()
	{
		int i;
		for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
	public boolean isValid1(String s)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.length()==0 || s.length()%2!=0)
			{
				return false;
			}else{
				if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				{
					push(s.charAt(i) );
				}
				else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')
				{
					if(top==-1)
					{
						return false;
					}
					else
					{
					if(s.charAt(i) == '}' )
					{
						
						if(peek()== '{')
						pop();
						else
							break;
						
					}
					if(s.charAt(i) == ')' )
					{
						if(peek()== '(')
						pop();
						else
							break;
						
					}
					if(s.charAt(i) == ']' )
					{
						
						if(peek()== '[')
						pop();
						else
							break;
						
					}
					}
					
				}
			}
			
		}
		if(isEmpty())
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
    public boolean isValid(String s) {
        
		
	return isValid1(s);
		
}
}
