
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class FigurC_mitSchleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,350); // Festlegen der Fenstergröße
    }      

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
    }
    
    public void zeichneBildC(){
        ellipse(100,100,100,100);
        rect(100,200,100,100);
        rect(50,150,100,100);
        triangle(100,250,50,350,150,350);
        rect(300,50,100,100);
        ellipse(350,100,70,70);
        ellipse(350,100,50,50);
        ellipse(350,100,30,30);
        ellipse(350,250,120,120);
        rect(310,210,76,76);
        rect(325,225,50,50);
        rect(340,240,20,20);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
