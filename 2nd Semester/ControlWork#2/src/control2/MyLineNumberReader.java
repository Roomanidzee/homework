package control2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Андрей Романов <steampart@gmail.com>
 */
public class MyLineNumberReader extends BufferedReader{
    
    private int line;
    
    private boolean markedLine;
    private boolean lastLine;
    private int markedNumber;
    
    private final char CONSTANT = '\n';
    
    
    public MyLineNumberReader(Reader in){
        
        super(in);
        
    }
    
    public MyLineNumberReader(Reader in, int sz){
        
        super(in, sz);
        
    }
    
    public void setLineNumber(int lineNumber){
        
        if(lineNumber < 0){
            
            throw new IllegalArgumentException("Wrong input");
            
        }
        
        this.line = lineNumber;
        
    }
    
    public int getLineNumber(){
        
        return line;
        
    }
    
    @Override
    public void mark(int readLimit)throws IOException{
        
        if(readLimit < 0){
            
            throw new IllegalArgumentException("Wrong input");
            
        }
        
        super.mark(readLimit);
        
        this.markedNumber = this.line;
        this.markedLine = this.lastLine;
        
    }
    
    @Override
    public int read() throws IOException{
        
        int ch = super.read();
        
        if(ch == this.CONSTANT && this.lastLine){
            
            ch = super.read();
            
        }
        
        this.lastLine = false;
        
        switch(ch){
            
            case '\r':
                
                ch = '\n';
                this.lastLine = true;
                break;
                
            case '\n':
                
                this.line++;
            
        }
        
        return ch;
        
    }
    
    @Override
    public String readLine() throws IOException{
        
        if(this.lastLine){
            
            this.lastLine = false;
            
        }
        
        String result = super.readLine();
        
        if(result != null){
            
            this.line++;
            
        }
        
        return result;
        
    }
    
    @Override
    public void reset() throws IOException{
        
        super.reset();
        
        this.line = this.markedNumber;
        this.lastLine = this.markedLine;
        
    }
    
    @Override
    public long skip(long n) throws IOException{
        
        if(n < 0){
            
            throw new IllegalArgumentException("Wrong input");
            
        }
        
        for(int i = 0; i < n; i++){
            
            if(read() == i){
                
                return i;
                
            }
            
        }
        
        return n;
        
    }
}
