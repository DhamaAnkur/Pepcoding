
//Leetcode FizzBuzz
//Link of Question( https://leetcode.com/problems/fizz-buzz/description/ )

class Main {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
             if(i%3==0 && i%5==0){
                al.add("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0){
                al.add("Fizz");
            }
            else if(i%5==0 && i%3!=0){
                al.add("Buzz");
            }
            else{
                al.add(i+"");
            }

        }

     return al;
    }
}