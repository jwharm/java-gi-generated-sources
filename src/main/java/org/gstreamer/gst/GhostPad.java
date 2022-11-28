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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ProxyPad.getMemoryLayout().withName("pad"),
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
     * Create a GhostPad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GhostPad(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GhostPad if its GType is a (or inherits from) "GstGhostPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GhostPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGhostPad", a ClassCastException will be thrown.
     */
    public static GhostPad castFrom(org.gtk.gobject.Object gobject) {
            return new GhostPad(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.Pad target) {
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
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
    public GhostPad(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.Pad target) {
        super(constructNew(name, target), Ownership.NONE);
    }
    
    private static Addressable constructNewFromTemplate(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.Pad target, @NotNull org.gstreamer.gst.PadTemplate templ) {
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(templ, "Parameter 'templ' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_from_template.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
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
    public static GhostPad newFromTemplate(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.Pad target, @NotNull org.gstreamer.gst.PadTemplate templ) {
        return new GhostPad(constructNewFromTemplate(name, target, templ), Ownership.NONE);
    }
    
    private static Addressable constructNewNoTarget(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.PadDirection dir) {
        java.util.Objects.requireNonNull(dir, "Parameter 'dir' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_no_target.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
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
    public static GhostPad newNoTarget(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.PadDirection dir) {
        return new GhostPad(constructNewNoTarget(name, dir), Ownership.NONE);
    }
    
    private static Addressable constructNewNoTargetFromTemplate(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.PadTemplate templ) {
        java.util.Objects.requireNonNull(templ, "Parameter 'templ' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ghost_pad_new_no_target_from_template.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
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
    public static GhostPad newNoTargetFromTemplate(@Nullable java.lang.String name, @NotNull org.gstreamer.gst.PadTemplate templ) {
        return new GhostPad(constructNewNoTargetFromTemplate(name, templ), Ownership.NONE);
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
        return RESULT != 0;
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
        return new org.gstreamer.gst.Pad(RESULT, Ownership.FULL);
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static boolean activateModeDefault(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.PadMode mode, boolean active) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_activate_mode_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    mode.getValue(),
                    active ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public static boolean internalActivateModeDefault(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.PadMode mode, boolean active) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ghost_pad_internal_activate_mode_default.invokeExact(
                    pad.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    mode.getValue(),
                    active ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.ProxyPad.Build {
        
         /**
         * A {@link GhostPad.Build} object constructs a {@link GhostPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GhostPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GhostPad} using {@link GhostPad#castFrom}.
         * @return A new instance of {@code GhostPad} with the properties 
         *         that were set in the Build object.
         */
        public GhostPad construct() {
            return GhostPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GhostPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
