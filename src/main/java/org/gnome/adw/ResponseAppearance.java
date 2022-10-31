package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible styles of {@link MessageDialog} response buttons.
 * <p>
 * See {@code MessageDialog#setResponseAppearance}.
 * @version 1.2
 */
public class ResponseAppearance extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwResponseAppearance";
    
    /**
     * the default appearance.
     */
    public static final ResponseAppearance DEFAULT = new ResponseAppearance(0);
    
    /**
     * used to denote important responses such as the
     *     affirmative action.
     */
    public static final ResponseAppearance SUGGESTED = new ResponseAppearance(1);
    
    /**
     * used to draw attention to the potentially damaging
     *     consequences of using the response. This appearance acts as a warning to
     *     the user.
     */
    public static final ResponseAppearance DESTRUCTIVE = new ResponseAppearance(2);
    
    public ResponseAppearance(int value) {
        super(value);
    }
}
