class Main {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        int j = sb.length()-1;

        for(int i=0; i<sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            j--;
        }

        return true;

    }
}