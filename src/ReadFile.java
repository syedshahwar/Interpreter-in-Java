import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    
    private String path;
    
    
    public ReadFile(String f_path)
    {
        path = f_path;
    }
    
    // read data from file
    public String[] OpenFile() throws IOException
    {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        int noOfLines = readLines();		//total no. of lines in file
        
        String[] fileData = new String[noOfLines];		// store data from file
       
        int i;
        
        // store the data line by line from file
        for (i=0; i < noOfLines; i++) 
        {
            fileData[i] = textReader .readLine();
        }
        
        textReader.close( );
        return fileData;  
    }
    
    // calculate total number of lines
    int readLines() throws IOException
    {
        
        FileReader fr = new FileReader(path);
        BufferedReader bf = new BufferedReader(fr);
        
        int noOfLines=0;
        String line;
        
        //read to the end of file
        while((line = bf.readLine())!=null)
        {
            noOfLines++;
        }
        
        bf.close();
        
        return noOfLines;
    }

}

