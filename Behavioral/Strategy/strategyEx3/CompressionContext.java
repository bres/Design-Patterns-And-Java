package designPatterns.Behavioral.Strategy.strategyEx3;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
    private CompressionStrategy strategy;

    //client will set what CompressionStrategy to use by calling this method
    public void setCompressionStrategy (CompressionStrategy startegy) {
        this.strategy = strategy;
    }

    public void createArchive (ArrayList<File> files, String compressedArchiveFileName ) {
        strategy.compressFiles(files,compressedArchiveFileName);
    }
}
