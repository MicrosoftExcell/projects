import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class WordFrequency
{
    private String text;
    private HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    ArrayList<String> wordList = new ArrayList<String>();
    Set<String> build = new HashSet<String>();
    private String word;
    private String space;
    private int frequency;
    private int num;
    private double relative;
    private static String newStr;
    private static HashMap<String, HashMap<String, Integer>> typeFrequency = new HashMap<String, HashMap<String, Integer>>();
    private static HashMap<String, WordFrequency> typeFrequency1 = new HashMap<String, WordFrequency>();
    private static HashMap<String, Integer> temp = new HashMap<String, Integer>();
    
    public WordFrequency(String text)
    {
       this.text = text;
       word = "";
       space = " ";
       frequency = 0;
       num = 0;
       relative = 0.0;
    }
    
    public Set<String> getWords(){
        Set<String> words = new HashSet<String>();
        text = text + " ";
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)==space.charAt(0)){
                word = word.toLowerCase();
                words.add(word);
                word = "";
            }
            else{
                word = word + text.charAt(i);
            }
            if (i==text.length()-1){
                word = word.toLowerCase();
                words.add(word);
            }
        }
        System.out.println(words);
        return words;
    }
    
    public ArrayList<String> getList(){
        ArrayList<String> wordList = new ArrayList<String>();
        text = text + " ";
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)==space.charAt(0)){
                word = word.toLowerCase();
                wordList.add(word);
                word = "";
            }
            else{
                word = word + text.charAt(i);
            }
            if (i==text.length()-1){
                word = word.toLowerCase();
                wordList.add(word);
            }
        }
        System.out.println(wordList);
        return wordList;
    }
    
    public void addText(String more){
        text = text + " ";
        text = text + more;
    }
    
    public int findFrequency(String givenWord){
        wordList = getList();
        frequency = 0;
        for (String i: wordList){
            if (i.equals(givenWord)){
                frequency += 1;
            }
        }
        return frequency;
    }
    
    public double relativeFreq(String givenWord){
        frequency = findFrequency(givenWord);
        wordList = getList();
        num = 0;
        for (String i: wordList){
            if (i != ""){
                num += 1;
            }
        }
        relative = (double) frequency/ (double) num;
        return relative;
    }
    
    public static WordFrequency makeInstance(String file){
        StringBuilder contentBuilder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) 
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Exception found");
        }
        newStr =  contentBuilder.toString();
        WordFrequency wf = new WordFrequency(newStr);
        return wf;
    }
    
    public HashMap<String, Integer> overallFreq(){
        build = getWords();
        for (String i: build){
            if (i != ""){
                frequency = findFrequency(i);
                hmap.put(i,frequency);
            }
        }
        System.out.println(hmap);
        return hmap;
    }
    
    public void classifyAs(String type,String page){
        HashMap<String, Integer> hmap1 = new HashMap<String, Integer>();
        text = page;
        hmap1 = overallFreq();
        if (typeFrequency.containsKey(type) == true){
            temp = typeFrequency.get(type);
            hmap1.putAll((HashMap) temp);
            typeFrequency.remove(type);
            typeFrequency.put(type,temp);
        }
        else{
            typeFrequency.put(type,hmap1);
        }
        System.out.println(typeFrequency);
    }
}
