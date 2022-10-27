package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIMContextSimple} is an input method supporting table-based input methods.
 * <p>
 * <strong>Compose sequences</strong><br/>
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
 * <strong>Unicode characters</strong><br/>
 * {@code GtkIMContextSimple} also supports numeric entry of Unicode characters
 * by typing &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;u&lt;/kbd&gt;, followed by a
 * hexadecimal Unicode codepoint.
 * <p>
 * For example,
 * <p>
 *     Ctrl-Shift-u 1 2 3 Enter
 * <p>
 * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 * <p>
 * <strong>Dead keys</strong><br/>
 * {@code GtkIMContextSimple} supports dead keys. For example, typing
 * <p>
 *     dead_acute a
 * <p>
 *  yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 *  depends on the keyboard layout including dead keys.
 */
public class IMContextSimple extends org.gtk.gtk.IMContext {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.IMContext.getMemoryLayout().withName("object"),
        org.gtk.gtk.IMContextSimplePrivate.getMemoryLayout().withName("priv")
    ).withName("GtkIMContextSimple");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public IMContextSimple(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IMContextSimple */
    public static IMContextSimple castFrom(org.gtk.gobject.Object gobject) {
        return new IMContextSimple(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_im_context_simple_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param composeFile The path of compose file
     */
    public void addComposeFile(@NotNull java.lang.String composeFile) {
        java.util.Objects.requireNonNull(composeFile, "Parameter 'composeFile' must not be null");
        try {
            DowncallHandles.gtk_im_context_simple_add_compose_file.invokeExact(handle(), Interop.allocateNativeString(composeFile));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds an additional table to search to the input context.
     * Each row of the table consists of {@code max_seq_len} key symbols
     * followed by two {@code guint16} interpreted as the high and low
     * words of a {@code gunicode} value. Tables are searched starting
     * from the last added.
     * <p>
     * The table must be sorted in dictionary order on the
     * numeric value of the key symbol fields. (Values beyond
     * the length of the sequence should be zero.)
     * @param data the table
     * @param maxSeqLen Maximum length of a sequence in the table
     * @param nSeqs number of sequences in the table
     * @deprecated Use gtk_im_context_simple_add_compose_file()
     */
    @Deprecated
    public void addTable(short[] data, int maxSeqLen, int nSeqs) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gtk_im_context_simple_add_table.invokeExact(handle(), Interop.allocateNativeArray(data, false), maxSeqLen, nSeqs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_im_context_simple_new = Interop.downcallHandle(
            "gtk_im_context_simple_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_im_context_simple_add_compose_file = Interop.downcallHandle(
            "gtk_im_context_simple_add_compose_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_im_context_simple_add_table = Interop.downcallHandle(
            "gtk_im_context_simple_add_table",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
}
