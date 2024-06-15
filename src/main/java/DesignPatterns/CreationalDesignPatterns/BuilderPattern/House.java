package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

// Product
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    // Setters
    public void setFoundation(String foundation) { this.foundation = foundation; }
    public void setStructure(String structure) { this.structure = structure; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setInterior(String interior) { this.interior = interior; }

    @Override
    public String toString() {
        return "House [Foundation=" + foundation + ", Structure=" + structure + 
               ", Roof=" + roof + ", Interior=" + interior + "]";
    }
}

