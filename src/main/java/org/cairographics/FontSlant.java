package org.cairographics;

public class FontSlant extends io.github.jwharm.javagi.Enumeration {

    public static final FontSlant NORMAL = new FontSlant(0);
    
    public static final FontSlant ITALIC = new FontSlant(1);
    
    public static final FontSlant OBLIQUE = new FontSlant(2);
    
    public FontSlant(int value) {
        super(value);
    }
    
}
