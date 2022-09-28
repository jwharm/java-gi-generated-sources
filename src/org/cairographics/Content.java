package org.cairographics;

public class Content extends io.github.jwharm.javagi.Enumeration {

    public static final Content COLOR = new Content(4096);
    
    public static final Content ALPHA = new Content(8192);
    
    public static final Content COLOR_ALPHA = new Content(12288);
    
    public Content(int value) {
        super(value);
    }
    
}
