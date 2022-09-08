package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkDevicePad` is an interface implemented by devices of type
 * %GDK_SOURCE_TABLET_PAD
 * 
 * It allows querying the features provided by the pad device.
 * 
 * Tablet pads may contain one or more groups, each containing a subset
 * of the buttons/rings/strips available. [method@Gdk.DevicePad.get_n_groups]
 * can be used to obtain the number of groups, [method@Gdk.DevicePad.get_n_features]
 * and [method@Gdk.DevicePad.get_feature_group] can be combined to find out
 * the number of buttons/rings/strips the device has, and how are they grouped.
 * 
 * Each of those groups have different modes, which may be used to map each
 * individual pad feature to multiple actions. Only one mode is effective
 * (current) for each given group, different groups may have different
 * current modes. The number of available modes in a group can be found
 * out through [method@Gdk.DevicePad.get_group_n_modes], and the current mode
 * for a given group will be notified through events of type `GDK_PAD_GROUP_MODE`.
 */
public interface DevicePad extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns the group the given @feature and @idx belong to.
     * 
     * f the feature or index do not exist in @pad, -1 is returned.
     */
    public default int getFeatureGroup(DevicePadFeature feature, int featureIdx) {
        var RESULT = gtk_h.gdk_device_pad_get_feature_group(handle(), feature.getValue(), featureIdx);
        return RESULT;
    }
    
    /**
     * Returns the number of modes that @group may have.
     */
    public default int getGroupNModes(int groupIdx) {
        var RESULT = gtk_h.gdk_device_pad_get_group_n_modes(handle(), groupIdx);
        return RESULT;
    }
    
    /**
     * Returns the number of features a tablet pad has.
     */
    public default int getNFeatures(DevicePadFeature feature) {
        var RESULT = gtk_h.gdk_device_pad_get_n_features(handle(), feature.getValue());
        return RESULT;
    }
    
    /**
     * Returns the number of groups this pad device has.
     * 
     * Pads have at least one group. A pad group is a subcollection of
     * buttons/strip/rings that is affected collectively by a same
     * current mode.
     */
    public default int getNGroups() {
        var RESULT = gtk_h.gdk_device_pad_get_n_groups(handle());
        return RESULT;
    }
    
    class DevicePadImpl extends org.gtk.gobject.Object implements DevicePad {
        public DevicePadImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
