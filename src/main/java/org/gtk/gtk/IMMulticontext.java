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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.IMContext.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code object}
     * @return The value of the field {@code object}
     */
    public org.gtk.gtk.IMContext object$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object"));
        return new org.gtk.gtk.IMContext(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a IMMulticontext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IMMulticontext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IMMulticontext if its GType is a (or inherits from) "GtkIMMulticontext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IMMulticontext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkIMMulticontext", a ClassCastException will be thrown.
     */
    public static IMMulticontext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), IMMulticontext.getType())) {
            return new IMMulticontext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkIMMulticontext");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the id of the currently active delegate of the {@code context}.
     * @return the id of the currently active delegate
     */
    public @NotNull java.lang.String getContextId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_im_multicontext_get_context_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        try {
            DowncallHandles.gtk_im_multicontext_set_context_id.invokeExact(
                    handle(),
                    (Addressable) (contextId == null ? MemoryAddress.NULL : Interop.allocateNativeString(contextId)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_im_multicontext_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.IMContext.Build {
        
         /**
         * A {@link IMMulticontext.Build} object constructs a {@link IMMulticontext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link IMMulticontext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IMMulticontext} using {@link IMMulticontext#castFrom}.
         * @return A new instance of {@code IMMulticontext} with the properties 
         *         that were set in the Build object.
         */
        public IMMulticontext construct() {
            return IMMulticontext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    IMMulticontext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
