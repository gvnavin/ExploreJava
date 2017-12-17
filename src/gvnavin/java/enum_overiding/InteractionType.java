package gvnavin.java.enum_overiding;

public enum InteractionType {
    ATTEMPTED;
    
    public String id() {
        return name().toLowerCase();
    }
}
