package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible folding behavior of a {@link Flap} widget.
 * @version 1.0
 */
public class FlapFoldPolicy extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwFlapFoldPolicy";
    
    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    public static final FlapFoldPolicy NEVER = new FlapFoldPolicy(0);
    
    /**
     * Keep the flap always folded.
     */
    public static final FlapFoldPolicy ALWAYS = new FlapFoldPolicy(1);
    
    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    public static final FlapFoldPolicy AUTO = new FlapFoldPolicy(2);
    
    public FlapFoldPolicy(int value) {
        super(value);
    }
}
