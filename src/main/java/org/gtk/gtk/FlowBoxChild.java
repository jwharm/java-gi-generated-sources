package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFlowBoxChild} is the kind of widget that can be added to a {@code GtkFlowBox}.
 */
public class FlowBoxChild extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFlowBoxChild";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FlowBoxChild proxy instance for the provided memory address.
     * <p>
     * Because FlowBoxChild is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FlowBoxChild(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlowBoxChild> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FlowBoxChild(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_child_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFlowBoxChild}.
     * <p>
     * This should only be used as a child of a {@code GtkFlowBox}.
     */
    public FlowBoxChild() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Marks {@code child} as changed, causing any state that depends on this
     * to be updated.
     * <p>
     * This affects sorting and filtering.
     * <p>
     * Note that calls to this method must be in sync with the data
     * used for the sorting and filtering functions. For instance, if
     * the list is mirroring some external data set, and <em>two</em> children
     * changed in the external data set when you call
     * gtk_flow_box_child_changed() on the first child, the sort function
     * must only read the new data for the first of the two changed
     * children, otherwise the resorting of the children will be wrong.
     * <p>
     * This generally means that if you don’t fully control the data
     * model, you have to duplicate the data that affects the sorting
     * and filtering functions into the widgets themselves.
     * <p>
     * Another alternative is to call {@link FlowBox#invalidateSort}
     * on any model change, but that is more expensive.
     */
    public void changed() {
        try {
            DowncallHandles.gtk_flow_box_child_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flow_box_child_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current index of the {@code child} in its {@code GtkFlowBox} container.
     * @return the index of the {@code child}, or -1 if the {@code child} is not
     *   in a flow box
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_child_get_index.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the {@code child} is currently selected in its
     * {@code GtkFlowBox} container.
     * @return {@code true} if {@code child} is selected
     */
    public boolean isSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_flow_box_child_is_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_flow_box_child_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
            RESULT = (long) DowncallHandles.gtk_flow_box_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFlowBoxChild) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the user activates a child widget in a {@code GtkFlowBox}.
     * <p>
     * This can be happen either by clicking or double-clicking,
     * or via a keybinding.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>,
     * but it can be used by applications for their own purposes.
     * <p>
     * The default bindings are &lt;kbd&gt;Space&lt;/kbd&gt; and &lt;kbd&gt;Enter&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FlowBoxChild.Activate> onActivate(FlowBoxChild.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FlowBoxChild.Builder} object constructs a {@link FlowBoxChild} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FlowBoxChild.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FlowBoxChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FlowBoxChild}.
         * @return A new instance of {@code FlowBoxChild} with the properties 
         *         that were set in the Builder object.
         */
        public FlowBoxChild build() {
            return (FlowBoxChild) org.gtk.gobject.GObject.newWithProperties(
                FlowBoxChild.getType(),
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
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_flow_box_child_new = Interop.downcallHandle(
            "gtk_flow_box_child_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_changed = Interop.downcallHandle(
            "gtk_flow_box_child_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_get_child = Interop.downcallHandle(
            "gtk_flow_box_child_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_get_index = Interop.downcallHandle(
            "gtk_flow_box_child_get_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_is_selected = Interop.downcallHandle(
            "gtk_flow_box_child_is_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_set_child = Interop.downcallHandle(
            "gtk_flow_box_child_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_flow_box_child_get_type = Interop.downcallHandle(
            "gtk_flow_box_child_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
