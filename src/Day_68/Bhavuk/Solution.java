package Day_68.Bhavuk;


class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> set = new HashSet<>();
        for(String s : dict){
            set.add(s);
        }
        StringBuilder ans = new StringBuilder();
        sentence += " ";
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch==' '){
                ans.append(temp.toString()).append(" ");
                temp.setLength(0);

            }else{
                temp.append(ch);
                if(set.contains(temp.toString())){
                    ans.append(temp.toString()).append(" ");
                    temp.setLength(0);
                    while(i<sentence.length() && sentence.charAt(i) != ' '){
                        i++;
                    }
                }
            }
        }
        ans.setLength(ans.length()-1);
        return ans.toString();


    }
}
