package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TitlebarGesture implements io.github.jwharm.javagi.Enumeration {
    DOUBLE_CLICK(1),
    RIGHT_CLICK(2),
    MIDDLE_CLICK(3);
    
    private static final java.lang.String C_TYPE_NAME = "GdkTitlebarGesture";
    
    private final int value;
    TitlebarGesture(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TitlebarGesture of(int value) {
        return switch (value) {
            case 1 -> DOUBLE_CLICK;
            case 2 -> RIGHT_CLICK;
            case 3 -> MIDDLE_CLICK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
