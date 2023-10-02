class Solution {
    public boolean areNumbersAscending(String str) {
        String num="";
        List<Integer> l1 = new ArrayList<Integer>();
        for (char c : str.toCharArray())
        {
            if (Character.isDigit(c)){
                num+=c;
                // System.out.print(num);
            }
            if(c==' ' && num!=""){
                int dig = Integer.parseInt(num);
                l1.add(dig);
                num="";
            }
        }
        if(num!=""){
                int dig = Integer.parseInt(num);
                l1.add(dig);
        }
        for (int i = 0; i < l1.size()-1; i++) {
            int first=l1.get(i);
            int sec=l1.get(i+1);
            if(first>=sec){
                return false;
            }
        }
        for(Integer x:l1)  {
            // System.out.print(x+" ");
        }
        return true;
    }
}