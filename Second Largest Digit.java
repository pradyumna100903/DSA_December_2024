
class Solution {
    public int secondHighest(String s) {
      HashSet<Integer> hs=new HashSet(); // HashSet Does not allow Duplicates 
      for(int i=0;i<s.length();i++){

        char ch=s.charAt(i);

        if(Character.isDigit(ch)){

            hs.add(Character.getNumericValue(ch));

        }
      }

    ArrayList<Integer> list=new ArrayList(hs);
    Collections.sort(list);
    if(list.size()<2){
        return -1; // if list contains only one element 
    }

    int res=list.get(list.size()-2);
    return res;



       
    }
}
