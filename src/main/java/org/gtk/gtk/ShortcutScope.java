package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes where {@link Shortcut}s added to a
 * {@link ShortcutController} get handled.
 */
public enum ShortcutScope implements io.github.jwharm.javagi.Enumeration {
    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    LOCAL(0),
    /**
     * Shortcuts are handled by
     *   the first ancestor that is a {@code ShortcutManager}
     */
    MANAGED(1),
    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    GLOBAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutScope";
    
    private final int value;
    ShortcutScope(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ShortcutScope of(int value) {
        return switch (value) {
            case 0 -> LOCAL;
            case 1 -> MANAGED;
            case 2 -> GLOBAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
