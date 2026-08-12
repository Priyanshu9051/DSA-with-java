class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
                String dna=s.substring(i,i+10);
            if(set1.contains(dna)){
                set2.add(dna);

            }
            
                set1.add(dna);
            

        }
        
        return new ArrayList<String>(set2);


        
    }
}