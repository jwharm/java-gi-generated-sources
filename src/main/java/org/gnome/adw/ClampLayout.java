package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A layout manager constraining its children to a given size.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-wide.png" alt="clamp-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-narrow.png" alt="clamp-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwClampLayout} constraints the size of the widgets it contains to a given
 * maximum size. It will constrain the width if it is horizontal, or the height
 * if it is vertical. The expansion of the children from their minimum to their
 * maximum size is eased out for a smooth transition.
 * <p>
 * If a child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 * <p>
 * Each child will get the style  classes .large when it reached its maximum
 * size, .small when it's allocated the full size, .medium in-between, or none
 * if it hasn't been allocated yet.
 * @version 1.0
 */
public class ClampLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwClampLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ClampLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ClampLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ClampLayout if its GType is a (or inherits from) "AdwClampLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ClampLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwClampLayout", a ClassCastException will be thrown.
     */
    public static ClampLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ClampLayout.getType())) {
            return new ClampLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwClampLayout");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_clamp_layout_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwClampLayout}.
     */
    public ClampLayout() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the maximum size allocated to the children.
     * @return the maximum size to allocate to the children
     */
    public int getMaximumSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_clamp_layout_get_maximum_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size above which the children are clamped.
     * @return the size above which the children are clamped
     */
    public int getTighteningThreshold() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_clamp_layout_get_tightening_threshold.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the maximum size allocated to the children.
     * <p>
     * It is the width if the layout is horizontal, or the height if it is vertical.
     * @param maximumSize the maximum size
     */
    public void setMaximumSize(int maximumSize) {
        try {
            DowncallHandles.adw_clamp_layout_set_maximum_size.invokeExact(
                    handle(),
                    maximumSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size above which the children are clamped.
     * <p>
     * Starting from this size, the layout will tighten its grip on the children,
     * slowly allocating less and less of the available size up to the maximum
     * allocated size. Below that threshold and below the maximum size, the children
     * will be allocated all the available size.
     * <p>
     * If the threshold is greater than the maximum size to allocate to the
     * children, they will be allocated the whole size up to the maximum. If the
     * threshold is lower than the minimum size to allocate to the children, that
     * size will be used as the tightening threshold.
     * <p>
     * Effectively, tightening the grip on a child before it reaches its maximum
     * size makes transitions to and from the maximum size smoother when resizing.
     * @param tighteningThreshold the tightening threshold
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        try {
            DowncallHandles.adw_clamp_layout_set_tightening_threshold.invokeExact(
                    handle(),
                    tighteningThreshold);
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
            RESULT = (long) DowncallHandles.adw_clamp_layout_get_type.invokeExact();
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
         * A {@link ClampLayout.Build} object constructs a {@link ClampLayout} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ClampLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ClampLayout} using {@link ClampLayout#castFrom}.
         * @return A new instance of {@code ClampLayout} with the properties 
         *         that were set in the Build object.
         */
        public ClampLayout construct() {
            return ClampLayout.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ClampLayout.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The maximum size to allocate to the children.
         * <p>
         * It is the width if the layout is horizontal, or the height if it is
         * vertical.
         * @param maximumSize The value for the {@code maximum-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaximumSize(int maximumSize) {
            names.add("maximum-size");
            values.add(org.gtk.gobject.Value.create(maximumSize));
            return this;
        }
        
        /**
         * The size above which the children are clamped.
         * <p>
         * Starting from this size, the layout will tighten its grip on the children,
         * slowly allocating less and less of the available size up to the maximum
         * allocated size. Below that threshold and below the maximum size, the
         * children will be allocated all the available size.
         * <p>
         * If the threshold is greater than the maximum size to allocate to the
         * children, they will be allocated the whole size up to the maximum. If the
         * threshold is lower than the minimum size to allocate to the children, that
         * size will be used as the tightening threshold.
         * <p>
         * Effectively, tightening the grip on a child before it reaches its maximum
         * size makes transitions to and from the maximum size smoother when resizing.
         * @param tighteningThreshold The value for the {@code tightening-threshold} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTighteningThreshold(int tighteningThreshold) {
            names.add("tightening-threshold");
            values.add(org.gtk.gobject.Value.create(tighteningThreshold));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_clamp_layout_new = Interop.downcallHandle(
            "adw_clamp_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_layout_get_maximum_size = Interop.downcallHandle(
            "adw_clamp_layout_get_maximum_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_layout_get_tightening_threshold = Interop.downcallHandle(
            "adw_clamp_layout_get_tightening_threshold",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_clamp_layout_set_maximum_size = Interop.downcallHandle(
            "adw_clamp_layout_set_maximum_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_clamp_layout_set_tightening_threshold = Interop.downcallHandle(
            "adw_clamp_layout_set_tightening_threshold",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_clamp_layout_get_type = Interop.downcallHandle(
            "adw_clamp_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
