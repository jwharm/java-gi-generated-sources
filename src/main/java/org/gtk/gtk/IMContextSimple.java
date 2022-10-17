package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIMContextSimple} is an input method supporting table-based input methods.
 * 
 * <h2>Compose sequences</h2>
 * {@code GtkIMContextSimple} reads compose sequences from the first of the
 * following files that is found: ~/.config/gtk-4.0/Compose, ~/.XCompose,
 * /usr/share/X11/locale/$locale/Compose (for locales that have a nontrivial
 * Compose file). The syntax of these files is described in the Compose(5)
 * manual page.
 * <p>
 * If none of these files is found, {@code GtkIMContextSimple} uses a built-in table
 * of compose sequences that is derived from the X11 Compose files.
 * <p>
 * Note that compose sequences typically start with the Compose_key, which is
 * often not available as a dedicated key on keyboards. Keyboard layouts may
 * map this keysym to other keys, such as the right Control key.
 * 
 * <h2>Unicode characters</h2>
 * {@code GtkIMContextSimple} also supports numeric entry of Unicode characters
 * by typing &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;u&lt;/kbd&gt;, followed by a
 * hexadecimal Unicode codepoint.
 * <p>
 * For example,
 * <p>
 *     Ctrl-Shift-u 1 2 3 Enter
 * <p>
 * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 * 
 * <h2>Dead keys</h2>
 * {@code GtkIMContextSimple} supports dead keys. For example, typing
 * <p>
 *     dead_acute a
 * <p>
 *  yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 *  depends on the keyboard layout including dead keys.
 */
public class IMContextSimple extends IMContext {

    public IMContextSimple(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IMContextSimple */
    public static IMContextSimple castFrom(org.gtk.gobject.Object gobject) {
        return new IMContextSimple(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_im_context_simple_new = Interop.downcallHandle(
        "gtk_im_context_simple_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_im_context_simple_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkIMContextSimple}.
     */
    public IMContextSimple() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_im_context_simple_add_compose_file = Interop.downcallHandle(
        "gtk_im_context_simple_add_compose_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an additional table from the X11 compose file.
     */
    public @NotNull void addComposeFile(@NotNull java.lang.String composeFile) {
        try {
            gtk_im_context_simple_add_compose_file.invokeExact(handle(), Interop.allocateNativeString(composeFile));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
