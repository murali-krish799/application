package com.krishsolutions.equals;

/**we  are going to demonstrate of equals method of every class in java
 * 
 */
public class EqualsDemo extends Object{
	
	public static void main(String[] args) {
		
		//i am storing here scp of heap in runtime data area in jdk
		String name1="linaga babu";//74277480
		String name2="linaga babu";//74277480
		
		//== means looking always hashcode comparison
		System.out.println(name1==name2);
		
		
		//this
		System.out.println(name1.hashCode()+": "+name2.hashCode());
		
		System.out.println(name1.equals(name2));
		
		System.out.println("********");
		///new different--babu
		String word= new String("babu");//1223
		
		//new different---babu
		String word2= new String("babu");
		//different hashCodes
		System.out.println(word.hashCode()+" "+word2.hashCode());
		
		System.out.println(word==word2);//false
		
		
		
		System.out.println(" ****** ");
		
		
LingaBabuDemo lingaBabuDemo1= new LingaBabuDemo();
		
		lingaBabuDemo1.setName("babu");//112
LingaBabuDemo lingaBabuDemo2= new LingaBabuDemo();
		
		lingaBabuDemo2.setName("babu");//112
		
		System.out.println(lingaBabuDemo1.hashCode()+" "+lingaBabuDemo2.hashCode());
	//equals method looking data only
		//== mrthods looking hashCode memory address
		
	System.out.println(lingaBabuDemo1.equals(lingaBabuDemo2));
	
	
//	if(lingaBabuDemo1 instanceof LingaBabuDemo) {
//		if(LingaBabuDemo.class.isInstance(lingaBabuDemo2));
//	}
//	}
	
	}	

}