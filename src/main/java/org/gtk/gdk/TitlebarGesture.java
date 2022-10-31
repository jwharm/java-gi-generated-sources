package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TitlebarGesture extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkTitlebarGesture";
    
    public static final TitlebarGesture DOUBLE_CLICK = new TitlebarGesture(1);
    
    public static final TitlebarGesture RIGHT_CLICK = new TitlebarGesture(2);
    
    public static final TitlebarGesture MIDDLE_CLICK = new TitlebarGesture(3);
    
    public TitlebarGesture(int value) {
        super(value);
    }
}
