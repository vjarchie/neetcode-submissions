class Solution {
    public boolean isAnagram(String s, String t) {
        if((s == null && t!= null)||(s != null && t== null)){
            return false;
        }
        Map<Character,Integer> charMap = new HashMap<>();
        for(Character c: s.toCharArray()){
            if(charMap.putIfAbsent(c,1) != null){
                charMap.put(c,charMap.get(c)+1);
            }
        }
        for(Character c: t.toCharArray()){
            if(!charMap.containsKey(c)){
                return false;
            }
            charMap.put(c,charMap.get(c)-1);
            if(charMap.get(c)==0){
                charMap.remove(c);
            }
        }

        return charMap.size() == 0;

        



    }
}
