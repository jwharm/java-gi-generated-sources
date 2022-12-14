package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkDevicePad} is an interface implemented by devices of type
 * {@link InputSource#TABLET_PAD}
 * <p>
 * It allows querying the features provided by the pad device.
 * <p>
 * Tablet pads may contain one or more groups, each containing a subset
 * of the buttons/rings/strips available. {@link DevicePad#getNGroups}
 * can be used to obtain the number of groups, {@link DevicePad#getNFeatures}
 * and {@link DevicePad#getFeatureGroup} can be combined to find out
 * the number of buttons/rings/strips the device has, and how are they grouped.
 * <p>
 * Each of those groups have different modes, which may be used to map each
 * individual pad feature to multiple actions. Only one mode is effective
 * (current) for each given group, different groups may have different
 * current modes. The number of available modes in a group can be found
 * out through {@link DevicePad#getGroupNModes}, and the current mode
 * for a given group will be notified through events of type {@code GDK_PAD_GROUP_MODE}.
 */
public interface DevicePad extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DevicePadImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DevicePadImpl(input);
    
    /**
     * Returns the group the given {@code feature} and {@code idx} belong to.
     * <p>
     * f the feature or index do not exist in {@code pad}, -1 is returned.
     * @param feature the feature type to get the group from
     * @param featureIdx the index of the feature to get the group from
     * @return The group number of the queried pad feature.
     */
    default int getFeatureGroup(org.gtk.gdk.DevicePadFeature feature, int featureIdx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_pad_get_feature_group.invokeExact(
                    handle(),
                    feature.getValue(),
                    featureIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of modes that {@code group} may have.
     * @param groupIdx group to get the number of available modes from
     * @return The number of modes available in {@code group}.
     */
    default int getGroupNModes(int groupIdx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_pad_get_group_n_modes.invokeExact(
                    handle(),
                    groupIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of features a tablet pad has.
     * @param feature a pad feature
     * @return The amount of elements of type {@code feature} that this pad has.
     */
    default int getNFeatures(org.gtk.gdk.DevicePadFeature feature) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_pad_get_n_features.invokeExact(
                    handle(),
                    feature.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of groups this pad device has.
     * <p>
     * Pads have at least one group. A pad group is a subcollection of
     * buttons/strip/rings that is affected collectively by a same
     * current mode.
     * @return The number of button/ring/strip groups in the pad.
     */
    default int getNGroups() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_pad_get_n_groups.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_device_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gdk_device_pad_get_feature_group = Interop.downcallHandle(
                "gdk_device_pad_get_feature_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_device_pad_get_group_n_modes = Interop.downcallHandle(
                "gdk_device_pad_get_group_n_modes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_device_pad_get_n_features = Interop.downcallHandle(
                "gdk_device_pad_get_n_features",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_device_pad_get_n_groups = Interop.downcallHandle(
                "gdk_device_pad_get_n_groups",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gdk_device_pad_get_type = Interop.downcallHandle(
                "gdk_device_pad_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DevicePadImpl type represents a native instance of the DevicePad interface.
     */
    class DevicePadImpl extends org.gtk.gobject.GObject implements DevicePad {
        
        static {
            Gdk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of DevicePad for the provided memory address.
         * @param address the memory address of the instance
         */
        public DevicePadImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_device_pad_get_type != null;
    }
}
