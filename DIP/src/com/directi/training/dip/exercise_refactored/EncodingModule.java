package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

// By applying the DIP, EncodingModule is now depending on abstractions ( IReader and IWriter)
public class EncodingModule
{
    public void encode(IReader reader, IWriter writer) throws IOException
    {
        String aLine = reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        writer.write(encodedLine);
    }
}

