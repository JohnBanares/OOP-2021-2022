package ie.tudublin;

import processing.core.PApplet;

public class arrays extends PApplet {
    float[] rainfall = { 45, 37, 55, 27, 38, 58, 79, 48, 104, 31, 100, 58};

    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    //array creation
    float[] a1 = new float[100];
    float[] a2;

    int min = 0;
    int max=0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
    {
        //array iteration
        for(int i = 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }
        
        //another way of iteration through arrays
        //rainfall element is copied into r 
        for(float r:rainfall)
        {
            println(r);
        }

        int j = 0;
        for(float r:rainfall)
        {
            println(r + "\t" + months[j]);
            j++;
        }

        //backwards interation
        for(int i = rainfall.length -1; i >= 0; i--)
        {
            println(rainfall[i] + "\t" + months[i]);   
        }

        //finding the month with the least amount of rainfall
        for(int k = 0 ; k < rainfall.length; k++)
        {
           if(rainfall[k] < rainfall[min])
           {
               min = k;
           }
           else if(rainfall[k] > rainfall[max])
           {
               max = k;
           }
        }
       println("min rainfall is " + rainfall[min] + months[min]);
       println("mx rainfall is " + rainfall[max] + months[max]);
	}

	
	public void draw()
	{	
		
	}
}
