import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import libs.java
public class Ejercicio1 {

    public static void main(String[] args) throws Exception{

        File dnaFile = new File("ej1.gb");

        LinkedHashMap<String, DNASequence> dnaSequences = GenbankReaderHelper.readGenbankDNASequence( dnaFile );
        for (DNASequence sequence : dnaSequences.values()) {
            System.out.println( sequence.getSequenceAsString() );
            try {
                FileWriter myWriter = new FileWriter("secuencia.fasta");
                myWriter.write(sequence.getSequenceAsString());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    }
}