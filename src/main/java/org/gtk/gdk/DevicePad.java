package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    static final MethodHandle gdk_device_pad_get_feature_group = Interop.downcallHandle(
        "gdk_device_pad_get_feature_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the group the given {@code feature} and {@code idx} belong to.
     * <p>
     * f the feature or index do not exist in {@code pad}, -1 is returned.
     */
    public default int getFeatureGroup(DevicePadFeature feature, int featureIdx) {
        try {
            var RESULT = (int) gdk_device_pad_get_feature_group.invokeExact(handle(), feature.getValue(), featureIdx);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_pad_get_group_n_modes = Interop.downcallHandle(
        "gdk_device_pad_get_group_n_modes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the number of modes that {@code group} may have.
     */
    public default int getGroupNModes(int groupIdx) {
        try {
            var RESULT = (int) gdk_device_pad_get_group_n_modes.invokeExact(handle(), groupIdx);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_pad_get_n_features = Interop.downcallHandle(
        "gdk_device_pad_get_n_features",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the number of features a tablet pad has.
     */
    public default int getNFeatures(DevicePadFeature feature) {
        try {
            var RESULT = (int) gdk_device_pad_get_n_features.invokeExact(handle(), feature.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_pad_get_n_groups = Interop.downcallHandle(
        "gdk_device_pad_get_n_groups",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of groups this pad device has.
     * <p>
     * Pads have at least one group. A pad group is a subcollection of
     * buttons/strip/rings that is affected collectively by a same
     * current mode.
     */
    public default int getNGroups() {
        try {
            var RESULT = (int) gdk_device_pad_get_n_groups.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class DevicePadImpl extends org.gtk.gobject.Object implements DevicePad {
        public DevicePadImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
