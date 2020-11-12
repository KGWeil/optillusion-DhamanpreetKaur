
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 350); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        // ***** hier kommen deine Anweisungen hin ************
        ellipse(100,100,100,100);
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
        // ***** Ende der eigenen Anweisungen **********
        
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        
        // ***** Ende der eigenen Anweisungen **********  
        
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
        // zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
