package edu.group4;

import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.imageio.metadata.*;

public class Metadata
{
    public static void main(String[] args)
    {
        Metadata metadata = new Metadata();
        int length = args.length;
        for(int index=0; index<args.length; index++)
        {

        }
    }
    private void readAndDisplayMetadata(String fileName)
    {
        try
        {
            File file = new File( fileName );
            ImageInputStream iis = ImageIO.createImageInputStream(file);
            Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);

            if (readers.hasNext())
            {
                // pick the first available ImageReader
                ImageReader reader = readers.next();

                // attach source to the reader
                reader.setInput(iis, true);

                // read metadata of first image
                IIOMetadata metadata = reader.getImageMetadata(0);

                String[] names = metadata.getMetadataFormatNames();

            }

        }
        catch (Exeption exeption)
        {
            exeption.printSackTrace();
        }



    }
}
