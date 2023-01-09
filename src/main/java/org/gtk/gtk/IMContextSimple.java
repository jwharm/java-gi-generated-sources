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
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContextSimple";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.IMContext.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a IMContextSimple proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IMContextSimple(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IMContextSimple> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IMContextSimple(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_im_context_simple_new.invokeExact();
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
        this.takeOwnership();
    }
    
    /**
     * Adds an additional table from the X11 compose file.
     * @param composeFile The path of compose file
     */
    public void addComposeFile(java.lang.String composeFile) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_im_context_simple_add_compose_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(composeFile, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_im_context_simple_add_table.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        maxSeqLen,
                        nSeqs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_im_context_simple_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link IMContextSimple.Builder} object constructs a {@link IMContextSimple} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IMContextSimple.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.IMContext.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link IMContextSimple} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IMContextSimple}.
         * @return A new instance of {@code IMContextSimple} with the properties 
         *         that were set in the Builder object.
         */
        public IMContextSimple build() {
            return (IMContextSimple) org.gtk.gobject.GObject.newWithProperties(
                IMContextSimple.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_im_context_simple_new = Interop.downcallHandle(
                "gtk_im_context_simple_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_simple_add_compose_file = Interop.downcallHandle(
                "gtk_im_context_simple_add_compose_file",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_context_simple_add_table = Interop.downcallHandle(
                "gtk_im_context_simple_add_table",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_im_context_simple_get_type = Interop.downcallHandle(
                "gtk_im_context_simple_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_im_context_simple_get_type != null;
    }
}
