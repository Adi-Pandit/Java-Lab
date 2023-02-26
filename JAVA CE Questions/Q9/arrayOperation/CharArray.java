package arrayOperation;

public class CharArray 
{
	char CharArray[] = {'a','c','I','o','P','U','A','e','z','D'};
	
	public void Vowel()
	{
		System.out.println("\nGiven character array : ");
		for(char ch: CharArray)
		{
			System.out.print(ch+" ");
		}
		System.out.println("\n\nCharacter array after converting vowels from lowerCase to upperCase and vice versa : ");
		for(char ch: CharArray)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				if(Character.isUpperCase(ch))
				{
					ch = Character.toLowerCase(ch);
				}
				else
				{
					ch = Character.toUpperCase(ch);
				}
			}
			System.out.print(ch+" ");
		}
	}
}					
