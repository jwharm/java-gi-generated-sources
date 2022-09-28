package org.gtk.glib;

public class AsciiType extends io.github.jwharm.javagi.Bitfield {

    public static final AsciiType ALNUM = new AsciiType(1);
    
    public static final AsciiType ALPHA = new AsciiType(2);
    
    public static final AsciiType CNTRL = new AsciiType(4);
    
    public static final AsciiType DIGIT = new AsciiType(8);
    
    public static final AsciiType GRAPH = new AsciiType(16);
    
    public static final AsciiType LOWER = new AsciiType(32);
    
    public static final AsciiType PRINT = new AsciiType(64);
    
    public static final AsciiType PUNCT = new AsciiType(128);
    
    public static final AsciiType SPACE = new AsciiType(256);
    
    public static final AsciiType UPPER = new AsciiType(512);
    
    public static final AsciiType XDIGIT = new AsciiType(1024);
    
    public AsciiType(int value) {
        super(value);
    }
    
}
