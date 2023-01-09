package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific mnemonic is pressed.
 * <p>
 * Mnemonics require a <em>mnemonic modifier</em> (typically &lt;kbd&gt;Alt&lt;/kbd&gt;) to be
 * pressed together with the mnemonic key.
 */
public class MnemonicTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMnemonicTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MnemonicTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MnemonicTrigger(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MnemonicTrigger> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MnemonicTrigger(input);
    
    private static MemoryAddress constructNew(int keyval) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mnemonic_trigger_new.invokeExact(keyval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever the key with
     * the given {@code keyval} is pressed and mnemonics have been activated.
     * <p>
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     * @param keyval The keyval to trigger for
     */
    public MnemonicTrigger(int keyval) {
        super(constructNew(keyval));
        this.takeOwnership();
    }
    
    /**
     * Gets the keyval that must be pressed to succeed triggering {@code self}.
     * @return the keyval
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_mnemonic_trigger_get_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_mnemonic_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MnemonicTrigger.Builder} object constructs a {@link MnemonicTrigger} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MnemonicTrigger.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ShortcutTrigger.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MnemonicTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MnemonicTrigger}.
         * @return A new instance of {@code MnemonicTrigger} with the properties 
         *         that were set in the Builder object.
         */
        public MnemonicTrigger build() {
            return (MnemonicTrigger) org.gtk.gobject.GObject.newWithProperties(
                MnemonicTrigger.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The key value for the trigger.
         * @param keyval The value for the {@code keyval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKeyval(int keyval) {
            names.add("keyval");
            values.add(org.gtk.gobject.Value.create(keyval));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_mnemonic_trigger_new = Interop.downcallHandle(
                "gtk_mnemonic_trigger_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_mnemonic_trigger_get_keyval = Interop.downcallHandle(
                "gtk_mnemonic_trigger_get_keyval",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_mnemonic_trigger_get_type = Interop.downcallHandle(
                "gtk_mnemonic_trigger_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_mnemonic_trigger_get_type != null;
    }
}
