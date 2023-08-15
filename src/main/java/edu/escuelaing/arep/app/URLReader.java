package edu.escuelaing.arep.app;
import java.net.*;
/**
 * Hello world!
 *
 */
public class URLReader 
{
    public static void main (String[] args){
        try{
            URL miURL = new URL("http://ldbn.escuelaing.edu.co:80/search?q=query&rlz=1C1UUXU_esCO1071CO1071&oq=query&aqs=chrome..69i57.919j0j1&sourceid=chrome&ie=UTF-8");
            System.out.println("Protocol: " + miURL.getProtocol());
            System.out.println("Authority: " + miURL.getAuthority());
            System.out.println("Host: " + miURL.getHost());
            System.out.println("Port: " + miURL.getPort());
            System.out.println("Path: " + miURL.getPath());
            System.out.println("Query: " + miURL.getQuery());
            System.out.println("File: " + miURL.getFile());
            System.out.println("Ref: " + miURL.getRef());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
