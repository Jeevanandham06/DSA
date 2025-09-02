class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>res=new ArrayList<>();//new list within list res 
         for(int i =0;i<numRows;i++){ //Outer Loop;
         List<Integer>curr=new ArrayList<>();//curr list 
         List<Integer>prev=null;// make the prev row null if there is no row 
         if(i>0){
             prev=res.get(i-1);// if prev has element get that element
         }
         for(int j=0;j<=i;j++){//inner loop
            if(j==0||j==i){//if the index is equal to 0 and i 
                curr.add(1);// make them 1 
            }else{
                int val=prev.get(j-1)+prev.get(j);// to find the value  j-1 , and j and move
                curr.add(val); // add the element in curr row
            }

         }
           res.add(curr);// add all the element in result

         }
         return res;// retrun the result 
    }
}