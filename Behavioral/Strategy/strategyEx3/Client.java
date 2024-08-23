package designPatterns.Behavioral.Strategy.strategyEx3;


import java.io.File;
import java.util.ArrayList;

public class Client
{

    public static void main( String[] args )
    {

        ArrayList<File> fileList = new ArrayList<File>();
        fileList.add(new File("designPatterns/Behavioral/Strategy/strategyEx3/test1.txt"));
        fileList.add(new File("designPatterns/Behavioral/Strategy/strategyEx3/test2.txt"));

        CompressionContext ctx;

        ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ctx.createArchive(fileList,"Javafiles");

        ctx = new CompressionContext();
        ctx.setCompressionStrategy(new RarCompressionStrategy());
        ctx.createArchive(fileList,"Javafiles");

    }
}
