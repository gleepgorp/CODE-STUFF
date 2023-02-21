
public interface Set
{
   public Set union(Set set);
   public Set intersection(Set set);
   public Set differenceA(Set set);
   public Set differenceB(Set set);
   public boolean isSubset(Set set);
   public int cardinality();
}