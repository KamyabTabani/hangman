package server;
import java.io.*;
import java.util.Random;

public class Textfile {
   
    public int countlines(String filename) throws IOException {
        LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = reader.readLine()) != null) {}
        cnt = reader.getLineNumber(); 
        reader.close();
        return cnt;
    }
    
    public String chooseword(String file,int count){
        String chosen = new String();
        
	Random randomGenerator = new Random();
        
	int randomWord = randomGenerator.nextInt(count);
        try {
        BufferedReader in = new BufferedReader(new FileReader(file));
        int cnt=0;
        
        while((cnt<randomWord) && (chosen = in.readLine()) != null ){
            cnt ++;
        }
        
        in.close();
        } catch (IOException e) {
        }
        return chosen;
    }
    
     public String dashme(String word){
        
	char positions[] = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                positions[i] = '-';
            }
            String dashes = new String(positions);
        return dashes;
    }
     
}
