package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different methods to handle text in {@link Inscription} when it doesn't
 * fit the available space.
 * @version 4.8
 */
public class InscriptionOverflow extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkInscriptionOverflow";
    
    /**
     * Clip the remaining text
     */
    public static final InscriptionOverflow CLIP = new InscriptionOverflow(0);
    
    /**
     * Omit characters at the start of the text
     */
    public static final InscriptionOverflow ELLIPSIZE_START = new InscriptionOverflow(1);
    
    /**
     * Omit characters at the middle of the text
     */
    public static final InscriptionOverflow ELLIPSIZE_MIDDLE = new InscriptionOverflow(2);
    
    /**
     * Omit characters at the end of the text
     */
    public static final InscriptionOverflow ELLIPSIZE_END = new InscriptionOverflow(3);
    
    public InscriptionOverflow(int value) {
        super(value);
    }
}
