package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFixedLayout} is a layout manager which can place child widgets
 * at fixed positions.
 * <p>
 * Most applications should never use this layout manager; fixed positioning
 * and sizing requires constant recalculations on where children need to be
 * positioned and sized. Other layout managers perform this kind of work
 * internally so that application developers don't need to do it. Specifically,
 * widgets positioned in a fixed layout manager will need to take into account:
 * <ul>
 * <li>Themes, which may change widget sizes.
 * </ul>
 * <ul>
 * <li>Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different
 *   fonts.
 * </ul>
 * <ul>
 * <li>Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 * </ul>
 * <p>
 * In addition, {@code GtkFixedLayout} does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately depending on the text direction, e.g. to put labels
 * to the right of the thing they label when using an RTL language;
 * {@code GtkFixedLayout} won't be able to do that for you.
 * <p>
 * Finally, fixed positioning makes it kind of annoying to add/remove UI
 * elements, since you have to reposition all the other  elements. This is a
 * long-term maintenance problem for your application.
 */
public class FixedLayout extends org.gtk.gtk.LayoutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFixedLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FixedLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FixedLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FixedLayout if its GType is a (or inherits from) "GtkFixedLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FixedLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFixedLayout", a ClassCastException will be thrown.
     */
    public static FixedLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FixedLayout.getType())) {
            return new FixedLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFixedLayout");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_fixed_layout_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFixedLayout}.
     */
    public FixedLayout() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_fixed_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutManager.Build {
        
         /**
         * A {@link FixedLayout.Build} object constructs a {@link FixedLayout} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FixedLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FixedLayout} using {@link FixedLayout#castFrom}.
         * @return A new instance of {@code FixedLayout} with the properties 
         *         that were set in the Build object.
         */
        public FixedLayout construct() {
            return FixedLayout.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FixedLayout.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_fixed_layout_new = Interop.downcallHandle(
            "gtk_fixed_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_fixed_layout_get_type = Interop.downcallHandle(
            "gtk_fixed_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
