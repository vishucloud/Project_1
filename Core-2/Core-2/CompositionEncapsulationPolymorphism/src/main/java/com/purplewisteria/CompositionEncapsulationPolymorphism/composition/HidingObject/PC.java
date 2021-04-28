package com.purplewisteria.CompositionEncapsulationPolymorphism.composition.HidingObject;

public class PC {
	
	// Composition is modeling parts...of the grater whole
	// Here Composition is modeling parts..of the PC
	// Here Case, monitor, Motherboard are components of PC.. not actually the whole PC
	// PC class comprises three other classes & it's going to have three objects...
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

   
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
      
    // Hiding the Objects... 'Case' & 'Monitor'
    // Don't allow the calling program to access those objects directly.
    
    public final void powerUp() {
    	
        this.theCase.pressPowerButton();
        drawLogo();
    }
    
    // Creating an object within object...

    private final void drawLogo() {
        // Fancy graphics
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }

    
    
}
