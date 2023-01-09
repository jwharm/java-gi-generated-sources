package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIMMulticontext} is an input method context supporting multiple,
 * switchable input methods.
 * <p>
 * Text widgets such as {@code GtkText} or {@code GtkTextView} use a {@code GtkIMMultiContext}
 * to implement their {@code im-module} property for switching between different
 * input methods.
 */
public class IMMulticontext extends org.gtk.gtk.IMContext {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMMulticontext";
    
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
     * Create a IMMulticontext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IMMulticontext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IMMulticontext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IMMulticontext(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_im_multicontext_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIMMulticontext}.
     */
    public IMMulticontext() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Gets the id of the currently active delegate of the {@code context}.
     * @return the id of the currently active delegate
     */
    public java.lang.String getContextId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_im_multicontext_get_context_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the context id for {@code context}.
     * <p>
     * This causes the currently active delegate of {@code context} to be
     * replaced by the delegate corresponding to the new context id.
     * <p>
     * Setting this to a non-{@code null} value overrides the system-wide
     * IM module setting. See the {@code Gtk.Settings:gtk-im-module}
     * property.
     * @param contextId the id to use
     */
    public void setContextId(@Nullable java.lang.String contextId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_im_multicontext_set_context_id.invokeExact(
                        handle(),
                        (Addressable) (contextId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(contextId, SCOPE)));
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
            RESULT = (long) DowncallHandles.gtk_im_multicontext_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link IMMulticontext.Builder} object constructs a {@link IMMulticontext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IMMulticontext.Builder#build()}. 
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
         * Finish building the {@link IMMulticontext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IMMulticontext}.
         * @return A new instance of {@code IMMulticontext} with the properties 
         *         that were set in the Builder object.
         */
        public IMMulticontext build() {
            return (IMMulticontext) org.gtk.gobject.GObject.newWithProperties(
                IMMulticontext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_im_multicontext_new = Interop.downcallHandle(
                "gtk_im_multicontext_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_multicontext_get_context_id = Interop.downcallHandle(
                "gtk_im_multicontext_get_context_id",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_multicontext_set_context_id = Interop.downcallHandle(
                "gtk_im_multicontext_set_context_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_im_multicontext_get_type = Interop.downcallHandle(
                "gtk_im_multicontext_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_im_multicontext_get_type != null;
    }
}
