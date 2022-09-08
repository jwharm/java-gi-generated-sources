package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkIMContextSimple` is an input method supporting table-based input methods.
 * 
 * ## Compose sequences
 * 
 * `GtkIMContextSimple` reads compose sequences from the first of the
 * following files that is found: ~/.config/gtk-4.0/Compose, ~/.XCompose,
 * /usr/share/X11/locale/$locale/Compose (for locales that have a nontrivial
 * Compose file). The syntax of these files is described in the Compose(5)
 * manual page.
 * 
 * If none of these files is found, `GtkIMContextSimple` uses a built-in table
 * of compose sequences that is derived from the X11 Compose files.
 * 
 * Note that compose sequences typically start with the Compose_key, which is
 * often not available as a dedicated key on keyboards. Keyboard layouts may
 * map this keysym to other keys, such as the right Control key.
 * 
 * ## Unicode characters
 * 
 * `GtkIMContextSimple` also supports numeric entry of Unicode characters
 * by typing <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>u</kbd>, followed by a
 * hexadecimal Unicode codepoint.
 * 
 * For example,
 * 
 *     Ctrl-Shift-u 1 2 3 Enter
 * 
 * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 * 
 * ## Dead keys
 * 
 * `GtkIMContextSimple` supports dead keys. For example, typing
 * 
 *     dead_acute a
 * 
 *  yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 *  depends on the keyboard layout including dead keys.
 */
public class IMContextSimple extends IMContext {

    public IMContextSimple(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IMContextSimple */
    public static IMContextSimple castFrom(org.gtk.gobject.Object gobject) {
        return new IMContextSimple(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkIMContextSimple`.
     */
    public IMContextSimple() {
        super(References.get(gtk_h.gtk_im_context_simple_new(), true));
    }
    
    /**
     * Adds an additional table from the X11 compose file.
     */
    public void addComposeFile(java.lang.String composeFile) {
        gtk_h.gtk_im_context_simple_add_compose_file(handle(), Interop.allocateNativeString(composeFile).handle());
    }
    
}
