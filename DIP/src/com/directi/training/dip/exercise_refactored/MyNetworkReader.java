package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//By applying the DIP, MyNetworkReader is now depending on abstractions ( IReader)
public class MyNetworkReader implements IReader
{
    private String _protocol;
    private String _host;
    private String _file;

    public MyNetworkReader(String protocol, String host, String file)
    {
        _protocol = protocol;
        _host = host;
        _file = file;
    }

    
    public String read() throws IOException
    {
        URL url = new URL(_protocol, _host, _file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString.append((char) c);
            c = reader.read();
        }
        return inputString.toString();
    }
}
