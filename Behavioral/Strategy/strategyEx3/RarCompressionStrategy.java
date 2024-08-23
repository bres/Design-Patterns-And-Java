package designPatterns.Behavioral.Strategy.strategyEx3;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements  CompressionStrategy {
    @Override
    public void compressFiles(ArrayList<File> files, String compressedArchiveFileName) {
        System.out.println("files are compressed using Rar approach:" + compressedArchiveFileName + ".rar file is created");
    }
}

