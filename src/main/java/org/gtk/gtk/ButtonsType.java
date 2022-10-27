package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prebuilt sets of buttons for {@code GtkDialog}.
 * <p>
 * If none of these choices are appropriate, simply use
 * {@link ButtonsType#NONE} and call {@link Dialog#addButtons}.
 * <p>
 * &gt; Please note that {@link ButtonsType#OK}, {@link ButtonsType#YES_NO}
 * &gt; and {@link ButtonsType#OK_CANCEL} are discouraged by the
 * &gt; <a href="http://library.gnome.org/devel/hig-book/stable/">GNOME Human Interface Guidelines</a>.
 */
public class ButtonsType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * no buttons at all
     */
    public static final ButtonsType NONE = new ButtonsType(0);
    
    /**
     * an OK button
     */
    public static final ButtonsType OK = new ButtonsType(1);
    
    /**
     * a Close button
     */
    public static final ButtonsType CLOSE = new ButtonsType(2);
    
    /**
     * a Cancel button
     */
    public static final ButtonsType CANCEL = new ButtonsType(3);
    
    /**
     * Yes and No buttons
     */
    public static final ButtonsType YES_NO = new ButtonsType(4);
    
    /**
     * OK and Cancel buttons
     */
    public static final ButtonsType OK_CANCEL = new ButtonsType(5);
    
    public ButtonsType(int value) {
        super(value);
    }
}
