package designPatterns.Behavioral.Strategy.strategyEx3;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements  CompressionStrategy{
    @Override
    public void compressFiles(ArrayList<File> files, String compressedArchiveFileName) {
        System.out.println("Filew are compressed using zip approach:" +compressedArchiveFileName + ".zip is created");
    }
}
