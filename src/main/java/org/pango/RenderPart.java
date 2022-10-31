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
public class RenderPart extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoRenderPart";
    
    /**
     * the text itself
     */
    public static final RenderPart FOREGROUND = new RenderPart(0);
    
    /**
     * the area behind the text
     */
    public static final RenderPart BACKGROUND = new RenderPart(1);
    
    /**
     * underlines
     */
    public static final RenderPart UNDERLINE = new RenderPart(2);
    
    /**
     * strikethrough lines
     */
    public static final RenderPart STRIKETHROUGH = new RenderPart(3);
    
    /**
     * overlines
     */
    public static final RenderPart OVERLINE = new RenderPart(4);
    
    public RenderPart(int value) {
        super(value);
    }
}
