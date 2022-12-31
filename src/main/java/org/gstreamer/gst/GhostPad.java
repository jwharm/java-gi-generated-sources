package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GhostPads are useful when organizing pipelines with {@link Bin} like elements.
 * The idea here is to create hierarchical element graphs. The bin element
 * contains a sub-graph. Now one would like to treat the bin-element like any
 * other {@link Element}. This is where GhostPads come into play. A GhostPad acts as
 * a proxy for another pad. Thus the bin can have sink and source ghost-pads
 * that are associated with sink and source pads of the child elements.
 * <p>
 * If the target pad is known at creation time, gst_ghost_pad_new() is the
 * function to use to get a ghost-pad. Otherwise one can use gst_ghost_pad_new_no_target()
 * to create the ghost-pad and use gst_ghost_pad_set_target() to establish the
 * association later on.
 * <p>
 * Note that GhostPads add overhead to the data processing of a pipeline.
 */
public class GhostPad extends org.gstreamer.gst.ProxyPad {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGhostPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ProxyPad.getMemoryLayout().withName("pad"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GhostPad proxy instance for the provided memory address.
     * <p>
     * Because GhostPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GhostPad(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GhostPad> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GhostPad(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name, org.gstreamer.gst.Pad target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new ghostpad with {@code target} as the target. The direction will be taken
     * from the target pad. {@code target} must be unlinked.
     * <p>
     * Will ref the target.
     * @param name the name of the new pad, or {@code null} to assign a default name
     * @param target the pad to ghost.
     */
    public GhostPad(@Nullable java.lang.String name, org.gstreamer.gst.Pad target) {
        super(constructNew(name, target), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromTemplate(@Nullable java.lang.String name, org.gstreamer.gst.Pad target, org.gstreamer.gst.PadTemplate templ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_from_template.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    target.handle(),
                    templ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new ghostpad with {@code target} as the target. The direction will be taken
     * from the target pad. The template used on the ghostpad will be {@code template}.
     * <p>
     * Will ref the target.
     * @param name the name of the new pad, or {@code null} to assign a default name.
     * @param target the pad to ghost.
     * @param templ the {@link PadTemplate} to use on the ghostpad.
     * @return a new {@link Pad}, or {@code null} in
     * case of an error.
     */
    public static GhostPad newFromTemplate(@Nullable java.lang.String name, org.gstreamer.gst.Pad target, org.gstreamer.gst.PadTemplate templ) {
        var RESULT = constructNewFromTemplate(name, target, templ);
        return (org.gstreamer.gst.GhostPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.GhostPad.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewNoTarget(@Nullable java.lang.String name, org.gstreamer.gst.PadDirection dir) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_no_target.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    dir.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new ghostpad without a target with the given direction.
     * A target can be set on the ghostpad later with the
     * gst_ghost_pad_set_target() function.
     * <p>
     * The created ghostpad will not have a padtemplate.
     * @param name the name of the new pad, or {@code null} to assign a default name.
     * @param dir the direction of the ghostpad
     * @return a new {@link Pad}, or {@code null} in
     * case of an error.
     */
    public static GhostPad newNoTarget(@Nullable java.lang.String name, org.gstreamer.gst.PadDirection dir) {
        var RESULT = constructNewNoTarget(name, dir);
        return (org.gstreamer.gst.GhostPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.GhostPad.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewNoTargetFromTemplate(@Nullable java.lang.String name, org.gstreamer.gst.PadTemplate templ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_no_target_from_template.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    templ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new ghostpad based on {@code templ}, without setting a target. The
     * direction will be taken from the {@code templ}.
     * @param name the name of the new pad, or {@code null} to assign a default name
     * @param templ the {@link PadTemplate} to create the ghostpad from.
     * @return a new {@link Pad}, or {@code null} in
     * case of an error.
     */
    public static GhostPad newNoTargetFromTemplate(@Nullable java.lang.String name, org.gstreamer.gst.PadTemplate templ) {
        var RESULT = constructNewNoTargetFromTemplate(name, templ);
        return (org.gstreamer.gst.GhostPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.GhostPad.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Finish initialization of a newly allocated ghost pad.
     * <p>
     * This function is most useful in language bindings and when subclassing
     * {@link GhostPad}; plugin and application developers normally will not call this
     * function. Call this function directly after a call to g_object_new
     * (GST_TYPE_GHOST_PAD, "direction", {@code dir}, ..., NULL).
     * @return {@code true} if the construction succeeds, {@code false} otherwise.
     * @deprecated This function is deprecated since 1.18 and does nothing
     * anymore.
     */
    @Deprecated
    public boolean construct() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_construct.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the target pad of {@code gpad}. Unref target pad after usage.
     * @return the target {@link Pad}, can be
     * {@code null} if the ghostpad has no target set. Unref target pad after
     * usage.
     */
    public @Nullable org.gstreamer.gst.Pad getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_get_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Set the new target of the ghostpad {@code gpad}. Any existing target
     * is unlinked and links to the new target are established. if {@code newtarget} is
     * {@code null} the target will be cleared.
     * @param newtarget the new pad target
     * @return {@code true} if the new target could be set. This function
     *     can return {@code false} when the internal pads could not be linked.
     */
    public boolean setTarget(@Nullable org.gstreamer.gst.Pad newtarget) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_set_target.invokeExact(
                    handle(),
                    (Addressable) (newtarget == null ? MemoryAddress.NULL : newtarget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ghost_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Invoke the default activate mode function of a ghost pad.
     * @param pad the {@link Pad} to activate or deactivate.
     * @param parent the parent of {@code pad} or {@code null}
     * @param mode the requested activation mode
     * @param active whether the pad should be active or not.
     * @return {@code true} if the operation was successful.
     */
    public static boolean activateModeDefault(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.PadMode mode, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_activate_mode_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    mode.getValue(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Invoke the default activate mode function of a proxy pad that is
     * owned by a ghost pad.
     * @param pad the {@link Pad} to activate or deactivate.
     * @param parent the parent of {@code pad} or {@code null}
     * @param mode the requested activation mode
     * @param active whether the pad should be active or not.
     * @return {@code true} if the operation was successful.
     */
    public static boolean internalActivateModeDefault(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent, org.gstreamer.gst.PadMode mode, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_internal_activate_mode_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    mode.getValue(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link GhostPad.Builder} object constructs a {@link GhostPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GhostPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.ProxyPad.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GhostPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GhostPad}.
         * @return A new instance of {@code GhostPad} with the properties 
         *         that were set in the Builder object.
         */
        public GhostPad build() {
            return (GhostPad) org.gtk.gobject.GObject.newWithProperties(
                GhostPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_ghost_pad_new = Interop.downcallHandle(
            "gst_ghost_pad_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_new_from_template = Interop.downcallHandle(
            "gst_ghost_pad_new_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_new_no_target = Interop.downcallHandle(
            "gst_ghost_pad_new_no_target",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_new_no_target_from_template = Interop.downcallHandle(
            "gst_ghost_pad_new_no_target_from_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_construct = Interop.downcallHandle(
            "gst_ghost_pad_construct",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_get_target = Interop.downcallHandle(
            "gst_ghost_pad_get_target",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_set_target = Interop.downcallHandle(
            "gst_ghost_pad_set_target",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_get_type = Interop.downcallHandle(
            "gst_ghost_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_activate_mode_default = Interop.downcallHandle(
            "gst_ghost_pad_activate_mode_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ghost_pad_internal_activate_mode_default = Interop.downcallHandle(
            "gst_ghost_pad_internal_activate_mode_default",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
