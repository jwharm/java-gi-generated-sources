package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkIMContextSimple} is an input method supporting table-based input methods.
 * <p>
 * <h2>Compose sequences</h2>
 * <p>
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
 * <p>
 * <h2>Unicode characters</h2>
 * <p>
 * {@code GtkIMContextSimple} also supports numeric entry of Unicode characters
 * by typing &lt;kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>u</kbd&gt;, followed by a
 * hexadecimal Unicode codepoint.
 * <p>
 * For example,
 * <p>
 *     Ctrl-Shift-u 1 2 3 Enter
 * <p>
 * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 * <p>
 * <h2>Dead keys</h2>
 * <p>
 * {@code GtkIMContextSimple} supports dead keys. For example, typing
 * <p>
 *     dead_acute a
 * <p>
 *  yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 *  depends on the keyboard layout including dead keys.
 */
public class IMContextSimple extends IMContext {

    public IMContextSimple(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IMContextSimple */
    public static IMContextSimple castFrom(org.gtk.gobject.Object gobject) {
        return new IMContextSimple(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_im_context_simple_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIMContextSimple}.
     */
    public IMContextSimple() {
        super(constructNew());
    }
    
    /**
     * Adds an additional table from the X11 compose file.
     */
    public void addComposeFile(java.lang.String composeFile) {
        gtk_h.gtk_im_context_simple_add_compose_file(handle(), Interop.allocateNativeString(composeFile).handle());
    }
    
}
