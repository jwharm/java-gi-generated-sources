package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAspectFrame} preserves the aspect ratio of its child.
 * <p>
 * The frame can respect the aspect ratio of the child widget,
 * or use its own aspect ratio.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAspectFrame} uses a CSS node with name {@code frame}.
 */
public class AspectFrame extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAspectFrame";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AspectFrame proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AspectFrame(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AspectFrame> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AspectFrame(input);
    
    private static MemoryAddress constructNew(float xalign, float yalign, float ratio, boolean obeyChild) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_aspect_frame_new.invokeExact(
                    xalign,
                    yalign,
                    ratio,
                    Marshal.booleanToInteger.marshal(obeyChild, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkAspectFrame}.
     * @param xalign Horizontal alignment of the child within the parent.
     *   Ranges from 0.0 (left aligned) to 1.0 (right aligned)
     * @param yalign Vertical alignment of the child within the parent.
     *   Ranges from 0.0 (top aligned) to 1.0 (bottom aligned)
     * @param ratio The desired aspect ratio.
     * @param obeyChild If {@code true}, {@code ratio} is ignored, and the aspect
     *   ratio is taken from the requistion of the child.
     */
    public AspectFrame(float xalign, float yalign, float ratio, boolean obeyChild) {
        super(constructNew(xalign, yalign, ratio, obeyChild));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of self@
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_aspect_frame_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the child's size request should override
     * the set aspect ratio of the {@code GtkAspectFrame}.
     * @return whether to obey the child's size request
     */
    public boolean getObeyChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_aspect_frame_get_obey_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the desired aspect ratio of the child.
     * @return the desired aspect ratio
     */
    public float getRatio() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_ratio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the horizontal alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     * @return the horizontal alignment
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_xalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the vertical alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     * @return the vertical alignment
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_yalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_aspect_frame_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the aspect ratio of the child's size
     * request should override the set aspect ratio of
     * the {@code GtkAspectFrame}.
     * @param obeyChild If {@code true}, {@code ratio} is ignored, and the aspect
     *    ratio is taken from the requistion of the child.
     */
    public void setObeyChild(boolean obeyChild) {
        try {
            DowncallHandles.gtk_aspect_frame_set_obey_child.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(obeyChild, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired aspect ratio of the child.
     * @param ratio aspect ratio of the child
     */
    public void setRatio(float ratio) {
        try {
            DowncallHandles.gtk_aspect_frame_set_ratio.invokeExact(
                    handle(),
                    ratio);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     * @param xalign horizontal alignment, from 0.0 (left aligned) to 1.0 (right aligned)
     */
    public void setXalign(float xalign) {
        try {
            DowncallHandles.gtk_aspect_frame_set_xalign.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     * @param yalign horizontal alignment, from 0.0 (top aligned) to 1.0 (bottom aligned)
     */
    public void setYalign(float yalign) {
        try {
            DowncallHandles.gtk_aspect_frame_set_yalign.invokeExact(
                    handle(),
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_aspect_frame_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AspectFrame.Builder} object constructs a {@link AspectFrame} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AspectFrame.Builder#build()}. 
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
         * Finish building the {@link AspectFrame} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AspectFrame}.
         * @return A new instance of {@code AspectFrame} with the properties 
         *         that were set in the Builder object.
         */
        public AspectFrame build() {
            return (AspectFrame) org.gtk.gobject.GObject.newWithProperties(
                AspectFrame.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the {@code GtkAspectFrame} should use the aspect ratio of its child.
         * @param obeyChild The value for the {@code obey-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObeyChild(boolean obeyChild) {
            names.add("obey-child");
            values.add(org.gtk.gobject.Value.create(obeyChild));
            return this;
        }
        
        /**
         * The aspect ratio to be used by the {@code GtkAspectFrame}.
         * <p>
         * This property is only used if
         * {@code Gtk.AspectFrame:obey-child} is set to {@code false}.
         * @param ratio The value for the {@code ratio} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRatio(float ratio) {
            names.add("ratio");
            values.add(org.gtk.gobject.Value.create(ratio));
            return this;
        }
        
        /**
         * The horizontal alignment of the child.
         * @param xalign The value for the {@code xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXalign(float xalign) {
            names.add("xalign");
            values.add(org.gtk.gobject.Value.create(xalign));
            return this;
        }
        
        /**
         * The vertical alignment of the child.
         * @param yalign The value for the {@code yalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYalign(float yalign) {
            names.add("yalign");
            values.add(org.gtk.gobject.Value.create(yalign));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_aspect_frame_new = Interop.downcallHandle(
                "gtk_aspect_frame_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_child = Interop.downcallHandle(
                "gtk_aspect_frame_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_obey_child = Interop.downcallHandle(
                "gtk_aspect_frame_get_obey_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_ratio = Interop.downcallHandle(
                "gtk_aspect_frame_get_ratio",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_xalign = Interop.downcallHandle(
                "gtk_aspect_frame_get_xalign",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_yalign = Interop.downcallHandle(
                "gtk_aspect_frame_get_yalign",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_set_child = Interop.downcallHandle(
                "gtk_aspect_frame_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_set_obey_child = Interop.downcallHandle(
                "gtk_aspect_frame_set_obey_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_set_ratio = Interop.downcallHandle(
                "gtk_aspect_frame_set_ratio",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_set_xalign = Interop.downcallHandle(
                "gtk_aspect_frame_set_xalign",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_set_yalign = Interop.downcallHandle(
                "gtk_aspect_frame_set_yalign",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_aspect_frame_get_type = Interop.downcallHandle(
                "gtk_aspect_frame_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_aspect_frame_get_type != null;
    }
}
