package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSeparator} is a horizontal or vertical separator widget.
 * <p>
 * <img src="./doc-files/separators.png" alt="An example GtkSeparator">
 * <p>
 * A {@code GtkSeparator} can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkSeparator} has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkSeparator} uses the {@link AccessibleRole#SEPARATOR} role.
 */
public class Separator extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSeparator";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Separator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Separator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Separator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Separator(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_separator_new.invokeExact(orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSeparator} with the given orientation.
     * @param orientation the separator’s orientation.
     */
    public Separator(org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_separator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Separator.Builder} object constructs a {@link Separator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Separator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Separator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Separator}.
         * @return A new instance of {@code Separator} with the properties 
         *         that were set in the Builder object.
         */
        public Separator build() {
            return (Separator) org.gtk.gobject.GObject.newWithProperties(
                Separator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_separator_new = Interop.downcallHandle(
                "gtk_separator_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_separator_get_type = Interop.downcallHandle(
                "gtk_separator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_separator_get_type != null;
    }
}
