package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoRenderPart} defines different items to render for such
 * purposes as setting colors.
 * @version 1.8
 */
public enum RenderPart implements io.github.jwharm.javagi.Enumeration {
    /**
     * the text itself
     */
    FOREGROUND(0),
    /**
     * the area behind the text
     */
    BACKGROUND(1),
    /**
     * underlines
     */
    UNDERLINE(2),
    /**
     * strikethrough lines
     */
    STRIKETHROUGH(3),
    /**
     * overlines
     */
    OVERLINE(4);
    
    private static final java.lang.String C_TYPE_NAME = "PangoRenderPart";
    
    private final int value;
    RenderPart(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RenderPart of(int value) {
        return switch (value) {
            case 0 -> FOREGROUND;
            case 1 -> BACKGROUND;
            case 2 -> UNDERLINE;
            case 3 -> STRIKETHROUGH;
            case 4 -> OVERLINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
