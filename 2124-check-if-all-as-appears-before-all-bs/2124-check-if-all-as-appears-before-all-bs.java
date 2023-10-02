class Solution {
    public boolean checkString(String s) {
        boolean afind=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(afind==true && c=='a') return false;
            if(c=='b')afind=true;
        }
        return true;
    }
}