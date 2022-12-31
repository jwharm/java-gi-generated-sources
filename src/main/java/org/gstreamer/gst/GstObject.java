package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GstObject} provides a root for the object hierarchy tree filed in by the
 * GStreamer library.  It is currently a thin wrapper on top of
 * {@link org.gtk.gobject.InitiallyUnowned}. It is an abstract class that is not very usable on its own.
 * <p>
 * {@link GstObject} gives us basic refcounting, parenting functionality and locking.
 * Most of the functions are just extended for special GStreamer needs and can be
 * found under the same name in the base class of {@link GstObject} which is {@link org.gtk.gobject.GObject}
 * (e.g. g_object_ref() becomes gst_object_ref()).
 * <p>
 * Since {@link GstObject} derives from {@link org.gtk.gobject.InitiallyUnowned}, it also inherits the
 * floating reference. Be aware that functions such as gst_bin_add() and
 * gst_element_add_pad() take ownership of the floating reference.
 * <p>
 * In contrast to {@link org.gtk.gobject.GObject} instances, {@link GstObject} adds a name property. The functions
 * gst_object_set_name() and gst_object_get_name() are used to set/get the name
 * of the object.
 * <p>
 * <strong>controlled properties</strong><br/>
 * Controlled properties offers a lightweight way to adjust gobject properties
 * over stream-time. It works by using time-stamped value pairs that are queued
 * for element-properties. At run-time the elements continuously pull value
 * changes for the current stream-time.
 * <p>
 * What needs to be changed in a {@link Element}?
 * Very little - it is just two steps to make a plugin controllable!
 * <p>
 *   * mark gobject-properties paramspecs that make sense to be controlled,
 *     by GST_PARAM_CONTROLLABLE.
 * <p>
 *   * when processing data (get, chain, loop function) at the beginning call
 *     gst_object_sync_values(element,timestamp).
 *     This will make the controller update all GObject properties that are
 *     under its control with the current values based on the timestamp.
 * <p>
 * What needs to be done in applications? Again it's not a lot to change.
 * <p>
 *   * create a {@link ControlSource}.
 *     csource = gst_interpolation_control_source_new ();
 *     g_object_set (csource, "mode", GST_INTERPOLATION_MODE_LINEAR, NULL);
 * <p>
 *   * Attach the {@link ControlSource} on the controller to a property.
 *     gst_object_add_control_binding (object, gst_direct_control_binding_new (object, "prop1", csource));
 * <p>
 *   * Set the control values
 *     gst_timed_value_control_source_set ((GstTimedValueControlSource *)csource,0 * GST_SECOND, value1);
 *     gst_timed_value_control_source_set ((GstTimedValueControlSource *)csource,1 * GST_SECOND, value2);
 * <p>
 *   * start your pipeline
 */
public class GstObject extends org.gtk.gobject.InitiallyUnowned {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstObject";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnowned.getMemoryLayout().withName("object"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("parent"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("control_bindings"),
            Interop.valueLayout.C_LONG.withName("control_rate"),
            Interop.valueLayout.C_LONG.withName("last_sync"),
            Interop.valueLayout.ADDRESS.withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GstObject proxy instance for the provided memory address.
     * <p>
     * Because GstObject is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GstObject(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GstObject> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GstObject(input, ownership);
    
    /**
     * Attach the {@link ControlBinding} to the object. If there already was a
     * {@link ControlBinding} for this property it will be replaced.
     * <p>
     * The object's reference count will be incremented, and any floating
     * reference will be removed (see gst_object_ref_sink())
     * @param binding the {@link ControlBinding} that should be used
     * @return {@code false} if the given {@code binding} has not been setup for this object or
     * has been setup for a non suitable property, {@code true} otherwise.
     */
    public boolean addControlBinding(org.gstreamer.gst.ControlBinding binding) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_add_control_binding.invokeExact(
                    handle(),
                    binding.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A default error function that uses g_printerr() to display the error message
     * and the optional debug string..
     * <p>
     * The default handler will simply print the error string using g_print.
     * @param error the GError.
     * @param debug an additional debug information string, or {@code null}
     */
    public void defaultError(org.gtk.glib.Error error, @Nullable java.lang.String debug) {
        try {
            DowncallHandles.gst_object_default_error.invokeExact(
                    handle(),
                    error.handle(),
                    (Addressable) (debug == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(debug, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the corresponding {@link ControlBinding} for the property. This should be
     * unreferenced again after use.
     * @param propertyName name of the property
     * @return the {@link ControlBinding} for
     * {@code property_name} or {@code null} if the property is not controlled.
     */
    public @Nullable org.gstreamer.gst.ControlBinding getControlBinding(java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_get_control_binding.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.ControlBinding) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.ControlBinding.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Obtain the control-rate for this {@code object}. Audio processing {@link Element}
     * objects will use this rate to sub-divide their processing loop and call
     * gst_object_sync_values() in between. The length of the processing segment
     * should be up to {@code control}-rate nanoseconds.
     * <p>
     * If the {@code object} is not under property control, this will return
     * {@code GST_CLOCK_TIME_NONE}. This allows the element to avoid the sub-dividing.
     * <p>
     * The control-rate is not expected to change if the element is in
     * {@link State#PAUSED} or {@link State#PLAYING}.
     * @return the control rate in nanoseconds
     */
    public org.gstreamer.gst.ClockTime getControlRate() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_object_get_control_rate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets a number of {@code GValues} for the given controlled property starting at the
     * requested time. The array {@code values} need to hold enough space for {@code n_values} of
     * {@link org.gtk.gobject.Value}.
     * <p>
     * This function is useful if one wants to e.g. draw a graph of the control
     * curve or apply a control curve sample by sample.
     * @param propertyName the name of the property to get
     * @param timestamp the time that should be processed
     * @param interval the time spacing between subsequent values
     * @param nValues the number of values
     * @param values array to put control-values in
     * @return {@code true} if the given array could be filled, {@code false} otherwise
     */
    public boolean getGValueArray(java.lang.String propertyName, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, org.gtk.gobject.Value[] values) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_get_g_value_array.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    timestamp.getValue().longValue(),
                    interval.getValue().longValue(),
                    nValues,
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns a copy of the name of {@code object}.
     * Caller should g_free() the return value after usage.
     * For a nameless object, this returns {@code null}, which you can safely g_free()
     * as well.
     * <p>
     * Free-function: g_free
     * @return the name of {@code object}. g_free()
     * after usage.
     * <p>
     * MT safe. This function grabs and releases {@code object}'s LOCK.
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the parent of {@code object}. This function increases the refcount
     * of the parent object so you should gst_object_unref() it after usage.
     * @return parent of {@code object}, this can be
     *   {@code null} if {@code object} has no parent. unref after usage.
     * <p>
     * MT safe. Grabs and releases {@code object}'s LOCK.
     */
    public @Nullable org.gstreamer.gst.GstObject getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.GstObject.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Generates a string describing the path of {@code object} in
     * the object hierarchy. Only useful (or used) for debugging.
     * <p>
     * Free-function: g_free
     * @return a string describing the path of {@code object}. You must
     *          g_free() the string after usage.
     * <p>
     * MT safe. Grabs and releases the {@link GstObject}'s LOCK for all objects
     *          in the hierarchy.
     */
    public java.lang.String getPathString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_get_path_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the value for the given controlled property at the requested time.
     * @param propertyName the name of the property to get
     * @param timestamp the time the control-change should be read from
     * @return the GValue of the property at the given time,
     * or {@code null} if the property isn't controlled.
     */
    public @Nullable org.gtk.gobject.Value getValue(java.lang.String propertyName, org.gstreamer.gst.ClockTime timestamp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_get_value.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a number of values for the given controlled property starting at the
     * requested time. The array {@code values} need to hold enough space for {@code n_values} of
     * the same type as the objects property's type.
     * <p>
     * This function is useful if one wants to e.g. draw a graph of the control
     * curve or apply a control curve sample by sample.
     * <p>
     * The values are unboxed and ready to be used. The similar function
     * gst_object_get_g_value_array() returns the array as {@code GValues} and is
     * better suites for bindings.
     * @param propertyName the name of the property to get
     * @param timestamp the time that should be processed
     * @param interval the time spacing between subsequent values
     * @param nValues the number of values
     * @param values array to put control-values in
     * @return {@code true} if the given array could be filled, {@code false} otherwise
     */
    public boolean getValueArray(java.lang.String propertyName, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, @Nullable java.lang.foreign.MemoryAddress values) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_get_value_array.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    timestamp.getValue().longValue(),
                    interval.getValue().longValue(),
                    nValues,
                    (Addressable) (values == null ? MemoryAddress.NULL : (Addressable) values));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if the {@code object} has active controlled properties.
     * @return {@code true} if the object has active controlled properties
     */
    public boolean hasActiveControlBindings() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_has_active_control_bindings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code object} has an ancestor {@code ancestor} somewhere up in
     * the hierarchy. One can e.g. check if a {@link Element} is inside a {@link Pipeline}.
     * @param ancestor a {@link GstObject} to check as ancestor
     * @return {@code true} if {@code ancestor} is an ancestor of {@code object}.
     * @deprecated Use gst_object_has_as_ancestor() instead.
     * <p>
     * MT safe. Grabs and releases {@code object}'s locks.
     */
    @Deprecated
    public boolean hasAncestor(org.gstreamer.gst.GstObject ancestor) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_has_ancestor.invokeExact(
                    handle(),
                    ancestor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code object} has an ancestor {@code ancestor} somewhere up in
     * the hierarchy. One can e.g. check if a {@link Element} is inside a {@link Pipeline}.
     * @param ancestor a {@link GstObject} to check as ancestor
     * @return {@code true} if {@code ancestor} is an ancestor of {@code object}.
     * <p>
     * MT safe. Grabs and releases {@code object}'s locks.
     */
    public boolean hasAsAncestor(org.gstreamer.gst.GstObject ancestor) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_has_as_ancestor.invokeExact(
                    handle(),
                    ancestor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code parent} is the parent of {@code object}.
     * E.g. a {@link Element} can check if it owns a given {@link Pad}.
     * @param parent a {@link GstObject} to check as parent
     * @return {@code false} if either {@code object} or {@code parent} is {@code null}. {@code true} if {@code parent} is
     *          the parent of {@code object}. Otherwise {@code false}.
     * <p>
     * MT safe. Grabs and releases {@code object}'s locks.
     */
    public boolean hasAsParent(org.gstreamer.gst.GstObject parent) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_has_as_parent.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Increments the reference count on {@code object}. This function
     * does not take the lock on {@code object} because it relies on
     * atomic refcounting.
     * <p>
     * This object returns the input parameter to ease writing
     * constructs like :
     *  result = gst_object_ref (object-&gt;parent);
     * @return A pointer to {@code object}
     */
    public org.gstreamer.gst.GstObject ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.GstObject.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes the corresponding {@link ControlBinding}. If it was the
     * last ref of the binding, it will be disposed.
     * @param binding the binding
     * @return {@code true} if the binding could be removed.
     */
    public boolean removeControlBinding(org.gstreamer.gst.ControlBinding binding) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_remove_control_binding.invokeExact(
                    handle(),
                    binding.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function is used to disable the control bindings on a property for
     * some time, i.e. gst_object_sync_values() will do nothing for the
     * property.
     * @param propertyName property to disable
     * @param disabled boolean that specifies whether to disable the controller
     * or not.
     */
    public void setControlBindingDisabled(java.lang.String propertyName, boolean disabled) {
        try {
            DowncallHandles.gst_object_set_control_binding_disabled.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    Marshal.booleanToInteger.marshal(disabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is used to disable all controlled properties of the {@code object} for
     * some time, i.e. gst_object_sync_values() will do nothing.
     * @param disabled boolean that specifies whether to disable the controller
     * or not.
     */
    public void setControlBindingsDisabled(boolean disabled) {
        try {
            DowncallHandles.gst_object_set_control_bindings_disabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(disabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Change the control-rate for this {@code object}. Audio processing {@link Element}
     * objects will use this rate to sub-divide their processing loop and call
     * gst_object_sync_values() in between. The length of the processing segment
     * should be up to {@code control}-rate nanoseconds.
     * <p>
     * The control-rate should not change if the element is in {@link State#PAUSED} or
     * {@link State#PLAYING}.
     * @param controlRate the new control-rate in nanoseconds.
     */
    public void setControlRate(org.gstreamer.gst.ClockTime controlRate) {
        try {
            DowncallHandles.gst_object_set_control_rate.invokeExact(
                    handle(),
                    controlRate.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of {@code object}, or gives {@code object} a guaranteed unique
     * name (if {@code name} is {@code null}).
     * This function makes a copy of the provided name, so the caller
     * retains ownership of the name it sent.
     * @param name new name of object
     * @return {@code true} if the name could be set. Since Objects that have
     * a parent cannot be renamed, this function returns {@code false} in those
     * cases.
     * <p>
     * MT safe.  This function grabs and releases {@code object}'s LOCK.
     */
    public boolean setName(@Nullable java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the parent of {@code object} to {@code parent}. The object's reference count will
     * be incremented, and any floating reference will be removed (see gst_object_ref_sink()).
     * @param parent new parent of object
     * @return {@code true} if {@code parent} could be set or {@code false} when {@code object}
     * already had a parent or {@code object} and {@code parent} are the same.
     * <p>
     * MT safe. Grabs and releases {@code object}'s LOCK.
     */
    public boolean setParent(org.gstreamer.gst.GstObject parent) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_set_parent.invokeExact(
                    handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns a suggestion for timestamps where buffers should be split
     * to get best controller results.
     * @return Returns the suggested timestamp or {@code GST_CLOCK_TIME_NONE}
     * if no control-rate was set.
     */
    public org.gstreamer.gst.ClockTime suggestNextSync() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_object_suggest_next_sync.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Sets the properties of the object, according to the {@code GstControlSources} that
     * (maybe) handle them and for the given timestamp.
     * <p>
     * If this function fails, it is most likely the application developers fault.
     * Most probably the control sources are not setup correctly.
     * @param timestamp the time that should be processed
     * @return {@code true} if the controller values could be applied to the object
     * properties, {@code false} otherwise
     */
    public boolean syncValues(org.gstreamer.gst.ClockTime timestamp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_sync_values.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Clear the parent of {@code object}, removing the associated reference.
     * This function decreases the refcount of {@code object}.
     * <p>
     * MT safe. Grabs and releases {@code object}'s lock.
     */
    public void unparent() {
        try {
            DowncallHandles.gst_object_unparent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decrements the reference count on {@code object}.  If reference count hits
     * zero, destroy {@code object}. This function does not take the lock
     * on {@code object} as it relies on atomic refcounting.
     * <p>
     * The unref method should never be called with the LOCK held since
     * this might deadlock the dispose function.
     */
    public void unref() {
        try {
            DowncallHandles.gst_object_unref.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gst_object_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Checks to see if there is any object named {@code name} in {@code list}. This function
     * does not do any locking of any kind. You might want to protect the
     * provided list with the lock of the owner of the list. This function
     * will lock each {@link GstObject} in the list to compare the name, so be
     * careful when passing a list with a locked object.
     * @param list a list of {@link GstObject} to
     *      check through
     * @param name the name to search for
     * @return {@code true} if a {@link GstObject} named {@code name} does not appear in {@code list},
     * {@code false} if it does.
     * <p>
     * MT safe. Grabs and releases the LOCK of each object in the list.
     */
    public static boolean checkUniqueness(org.gtk.glib.List list, java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_check_uniqueness.invokeExact(
                    list.handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A default deep_notify signal callback for an object. The user data
     * should contain a pointer to an array of strings that should be excluded
     * from the notify. The default handler will print the new value of the property
     * using g_print.
     * <p>
     * MT safe. This function grabs and releases {@code object}'s LOCK for getting its
     *          path string.
     * @param object the {@link org.gtk.gobject.GObject} that signalled the notify.
     * @param orig a {@link GstObject} that initiated the notify.
     * @param pspec a {@link org.gtk.gobject.ParamSpec} of the property.
     * @param excludedProps a set of user-specified properties to exclude or {@code null} to show
     *     all changes.
     */
    public static void defaultDeepNotify(org.gtk.gobject.GObject object, org.gstreamer.gst.GstObject orig, org.gtk.gobject.ParamSpec pspec, @Nullable java.lang.String[] excludedProps) {
        try {
            DowncallHandles.gst_object_default_deep_notify.invokeExact(
                    object.handle(),
                    orig.handle(),
                    pspec.handle(),
                    (Addressable) (excludedProps == null ? MemoryAddress.NULL : Interop.allocateNativeArray(excludedProps, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increase the reference count of {@code object}, and possibly remove the floating
     * reference, if {@code object} has a floating reference.
     * <p>
     * In other words, if the object is floating, then this call "assumes ownership"
     * of the floating reference, converting it to a normal reference by clearing
     * the floating flag while leaving the reference count unchanged. If the object
     * is not floating, then this call adds a new normal reference increasing the
     * reference count by one.
     * <p>
     * For more background on "floating references" please see the {@link org.gtk.gobject.GObject}
     * documentation.
     * @param object a {@link GstObject} to sink
     */
    public static @Nullable java.lang.foreign.MemoryAddress refSink(@Nullable java.lang.foreign.MemoryAddress object) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_object_ref_sink.invokeExact(
                    (Addressable) (object == null ? MemoryAddress.NULL : (Addressable) object));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Atomically modifies a pointer to point to a new object.
     * The reference count of {@code oldobj} is decreased and the reference count of
     * {@code newobj} is increased.
     * <p>
     * Either {@code newobj} and the value pointed to by {@code oldobj} may be {@code null}.
     * @param oldobj pointer to a place of
     *     a {@link GstObject} to replace
     * @param newobj a new {@link GstObject}
     * @return {@code true} if {@code newobj} was different from {@code oldobj}
     */
    public static boolean replace(@Nullable Out<org.gstreamer.gst.GstObject> oldobj, @Nullable org.gstreamer.gst.GstObject newobj) {
        MemorySegment oldobjPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_object_replace.invokeExact(
                    (Addressable) (oldobj == null ? MemoryAddress.NULL : (Addressable) oldobjPOINTER.address()),
                    (Addressable) (newobj == null ? MemoryAddress.NULL : newobj.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (oldobj != null) oldobj.set((org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(oldobjPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gst.GstObject.fromAddress).marshal(oldobjPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    @FunctionalInterface
    public interface DeepNotify {
        void run(org.gstreamer.gst.GstObject propObject, org.gtk.gobject.ParamSpec prop);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGstObject, MemoryAddress propObject, MemoryAddress prop) {
            run((org.gstreamer.gst.GstObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(propObject)), org.gstreamer.gst.GstObject.fromAddress).marshal(propObject, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(prop)), org.gtk.gobject.ParamSpec.fromAddress).marshal(prop, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeepNotify.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The deep notify signal is used to be notified of property changes. It is
     * typically attached to the toplevel bin to receive notifications from all
     * the elements contained in that bin.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GstObject.DeepNotify> onDeepNotify(@Nullable String detail, GstObject.DeepNotify handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("deep-notify" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GstObject.Builder} object constructs a {@link GstObject} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GstObject.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.InitiallyUnowned.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GstObject} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GstObject}.
         * @return A new instance of {@code GstObject} with the properties 
         *         that were set in the Builder object.
         */
        public GstObject build() {
            return (GstObject) org.gtk.gobject.GObject.newWithProperties(
                GstObject.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The parent of the object. Please note, that when changing the 'parent'
         * property, we don't emit {@link org.gtk.gobject.GObject}::notify and {@link GstObject}::deep-notify
         * signals due to locking issues. In some cases one can use
         * {@link Bin}::element-added or {@link Bin}::element-removed signals on the parent to
         * achieve a similar effect.
         * @param parent The value for the {@code parent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.GstObject parent) {
            names.add("parent");
            values.add(org.gtk.gobject.Value.create(parent));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_object_add_control_binding = Interop.downcallHandle(
            "gst_object_add_control_binding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_default_error = Interop.downcallHandle(
            "gst_object_default_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_control_binding = Interop.downcallHandle(
            "gst_object_get_control_binding",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_control_rate = Interop.downcallHandle(
            "gst_object_get_control_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_g_value_array = Interop.downcallHandle(
            "gst_object_get_g_value_array",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_name = Interop.downcallHandle(
            "gst_object_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_parent = Interop.downcallHandle(
            "gst_object_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_path_string = Interop.downcallHandle(
            "gst_object_get_path_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_value = Interop.downcallHandle(
            "gst_object_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_object_get_value_array = Interop.downcallHandle(
            "gst_object_get_value_array",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_has_active_control_bindings = Interop.downcallHandle(
            "gst_object_has_active_control_bindings",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_has_ancestor = Interop.downcallHandle(
            "gst_object_has_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_has_as_ancestor = Interop.downcallHandle(
            "gst_object_has_as_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_has_as_parent = Interop.downcallHandle(
            "gst_object_has_as_parent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_ref = Interop.downcallHandle(
            "gst_object_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_remove_control_binding = Interop.downcallHandle(
            "gst_object_remove_control_binding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_set_control_binding_disabled = Interop.downcallHandle(
            "gst_object_set_control_binding_disabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_object_set_control_bindings_disabled = Interop.downcallHandle(
            "gst_object_set_control_bindings_disabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_object_set_control_rate = Interop.downcallHandle(
            "gst_object_set_control_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_object_set_name = Interop.downcallHandle(
            "gst_object_set_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_set_parent = Interop.downcallHandle(
            "gst_object_set_parent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_suggest_next_sync = Interop.downcallHandle(
            "gst_object_suggest_next_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_sync_values = Interop.downcallHandle(
            "gst_object_sync_values",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_object_unparent = Interop.downcallHandle(
            "gst_object_unparent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_unref = Interop.downcallHandle(
            "gst_object_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_get_type = Interop.downcallHandle(
            "gst_object_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_object_check_uniqueness = Interop.downcallHandle(
            "gst_object_check_uniqueness",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_default_deep_notify = Interop.downcallHandle(
            "gst_object_default_deep_notify",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_ref_sink = Interop.downcallHandle(
            "gst_object_ref_sink",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_object_replace = Interop.downcallHandle(
            "gst_object_replace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
