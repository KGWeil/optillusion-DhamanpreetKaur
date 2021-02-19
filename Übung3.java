
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Übung3.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Übung3 extends PApplet
{   
    int s=25;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,600);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        // zeichneQuadrat(0,0,0,true,false);
        alleQuadrate();

    }
    /**
     * Zeichnet ein Quadrat der optischen Illusion
     * @param    x    x-Koordinate
     * @param    y    y-Koordinate
     * @param    farbe    Füllfarbe des Quadrats
     * @param    links     Falls links true ist: Kreise links; falls links false ist: Kreise rechts
     */
    public void zeichneQuadrat(int x, int y, int farbe, boolean links,boolean innen){
        fill(farbe);
        rect(x,y,s,s);
        if (innen){

        }else{

            if (farbe==0){ 
                fill(255);
                rect(x+s/14,y+s/14,s/4,s/4);
                rect(x+s-s/4,y+s-s/4,s/4,s/4);

            }else{
                fill(0);
                rect(x+s/14,y+s/14,s/4,s/4);
                rect(x+s-s/4,y+s-s/4,s/4,s/4);
            }
        }
        
        
    }
    

    public void alleQuadrate(){
        int aktuellefarbe=0;
        boolean aktuelleseite=true;
        boolean innen=false;
        for(int k=0;k<24;k++){
            for(int i=0;i<24;i++){
                if(i<6||i>17||k<6||k>17){innen = false;}else{innen = true;}

                zeichneQuadrat(i*s,k*s,aktuellefarbe,aktuelleseite,innen);

                if (aktuellefarbe==0){
                    aktuellefarbe=255;
                }else{
                    aktuellefarbe=0;

                }
                
                
            }
            
            
            if (aktuellefarbe==0){
                aktuellefarbe=255;
            }else{
                aktuellefarbe=0;
            }
            if (aktuelleseite==true){
                aktuelleseite=false;
            }else{
                aktuelleseite=true;
            }
        }
       
        for(int k=7; k<17 ; k++){
            for(int i=7;i<17;i++){
                if(i<7||i>16||k<7||k>16){innen = true;} else {innen = false;}
                zeichneQuadrat(i*s,k*s,aktuellefarbe,aktuelleseite,innen);
                if (aktuellefarbe==0){
                aktuellefarbe=255;
            }else{
                aktuellefarbe=0;
            }
            if (aktuelleseite==true){
                aktuelleseite=false;
            }else{
                aktuelleseite=true;
            }
        
            }
            if (aktuellefarbe==255){
                aktuellefarbe=0;
            }else{
                aktuellefarbe=255;
            }
            if (aktuelleseite==false){
                aktuelleseite=true;
            }else{
                aktuelleseite=false;
            }
        }
    }

    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Übung3.class.getName() });
    }
}

