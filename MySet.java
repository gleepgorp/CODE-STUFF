public class MySet implements Set
{
   int [] items;
   int count;
  
  public MySet(int size)
  {
      items = new int[size];
  }
  
  public MySet()
  {
      this(10);
  }
  
  public boolean isEmpty()
  {
      return count == 0;
  }
  
  public boolean isFull()
  {
      return count == items.length;
  }
  
  public void add(int item)
  {
      if(!isFull())
         items[count++] = item;
  }

//UNION////////////////////////////
  public Set union(Set set)
  {
      MySet union = new MySet();
      MySet argSet = (MySet)set;
   
      for(int i = 0; i < count; i++)
      union.add(items[i]);
      
         for(int i = 0; i < argSet.count; i++)
            if(!union.isFound(argSet.items[i]))
            union.add(argSet.items[i]);
            return union;
  }
  
//INTERSECTION//////////////////////
   public Set intersection(Set set)
   {
      MySet intersection = new MySet();
      MySet argSet = (MySet)set;
      
      for (int i = 0; i < count; i++) 
      {
          if (argSet.isFound(items[i]) == argSet.isFound(items[i])) 
          {
              intersection.add(items[i]);
          }
          else
          {
               intersection.add(items[i]);    
          }
      }
      return intersection;  
   }
   
//DIFFERENCE A-B//////////////////////
   public Set differenceA(Set set) 
   {
	    MySet differenceA = new MySet();
	    MySet argSet = (MySet) set;

	    for (int i = 0; i < count; i++) 
	    {
	        if (!argSet.isFound(items[i])) 
	        {
	            differenceA.add(items[i]);
	        }
	    }
	    return differenceA;
	}
  
 //DIFFERENCE B-A//////////////////////
   public Set differenceB(Set set) 
   {
	   MySet differenceB = new MySet();
	   MySet argSet = (MySet) set;

	    for (int i = 0; i < argSet.count; i++) 
	    {
	        if (!isFound(argSet.items[i])) 
	        {
	            differenceB.add(argSet.items[i]);
	        }
	    }
	    return differenceB;
	}
   
 //SUBSET//////////////////////////////
   public boolean isSubset(Set set) 
   {
	   MySet argSet = (MySet) set;
	   for (int i = 0; i < count; i++) 
	   {
	      if (!argSet.isFound(items[i])) 
	      {
	         return false;
	      }
	   }
	   return true;
	}
     
 //CARDINALITY/////////////////////////
   public int cardinality()
   {
	   return count;
   }
  
  //public Set intersection(Set set){ return null;}
  //public Set difference(Set set){return null;}
  //public boolean isSubset(Set set){return false;}
  //public int cardinality(){return 0;}
  
  public String toString()
  {
      StringBuffer sb = new StringBuffer();
      sb.append("{ ");
         for(int i = 0; i < count; i++)
         sb.append(items[i] + " ");
         sb.append("}");
         return sb.toString();
  }
  
  public boolean isFound(int item)
  {
      boolean flag = false;
      
      for(int i = 0; i < count; i++)
         if(items[i] == item)
         {
            flag = true;
            break;
         }
         
         return flag;
  }
  
  public boolean equals(Object obj)
  {
      boolean flag = false;
      if(obj instanceof Set)
      {
         MySet set = (MySet)obj;
         for(int i = 0; i < count; i++)
         
         if(!set.isFound(items[i]))
         {
            flag = false;
            break;
         }
      }
      
      return flag;
  }
  
  public static void main(String [] args)
  {
      MySet setA = new MySet();
      MySet setB = new MySet();
      setA.add(6);
      setA.add(1);
      setA.add(3);
      setA.add(5);
      setA.add(5);
   
      setB.add(1);
      setB.add(5);
      setB.add(2);
      
      System.out.println("set A contains: " + setA);
      System.out.println("set B contains: " + setB +"\n");
      System.out.println("set A union set B: " + setA.union(setB));
      System.out.println("set A intersection set B: " + setA.intersection(setB));
      System.out.println("set A - B: " + setA.differenceA(setB)+ " | set B - A: " +setA.differenceB(setB));
      System.out.println("set B subset of set A?: " + setA.isSubset(setB));
      System.out.println("set A cardinality: "+"["+setA.cardinality()+"]"+ " | set B cardinality: "+"["+setB.cardinality()+"]");
  }
}