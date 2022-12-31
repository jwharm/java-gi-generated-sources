package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface offers methods to query and manipulate parameter preset sets.
 * A preset is a bunch of property settings, together with meta data and a name.
 * The name of a preset serves as key for subsequent method calls to manipulate
 * single presets.
 * All instances of one type will share the list of presets. The list is created
 * on demand, if presets are not used, the list is not created.
 * <p>
 * The interface comes with a default implementation that serves most plugins.
 * Wrapper plugins will override most methods to implement support for the
 * native preset format of those wrapped plugins.
 * One method that is useful to be overridden is gst_preset_get_property_names().
 * With that one can control which properties are saved and in which order.
 * When implementing support for read-only presets, one should set the vmethods
 * for gst_preset_save_preset() and gst_preset_delete_preset() to {@code null}.
 * Applications can use gst_preset_is_editable() to check for that.
 * <p>
 * The default implementation supports presets located in a system directory,
 * application specific directory and in the users home directory. When getting
 * a list of presets individual presets are read and overlaid in 1) system,
 * 2) application and 3) user order. Whenever an earlier entry is newer, the
 * later entries will be updated. Since 1.8 you can also provide extra paths
 * where to find presets through the GST_PRESET_PATH environment variable.
 * Presets found in those paths will be considered as "app presets".
 */
public interface Preset extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PresetImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PresetImpl(input, ownership);
    
    /**
     * Delete the given preset.
     * @param name preset name to remove
     * @return {@code true} for success, {@code false} if e.g. there is no preset with that {@code name}
     */
    default boolean deletePreset(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_delete_preset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@code value} for an existing meta data {@code tag}. Meta data {@code tag} names can be
     * something like e.g. "comment". Returned values need to be released when done.
     * @param name preset name
     * @param tag meta data item name
     * @param value value
     * @return {@code true} for success, {@code false} if e.g. there is no preset with that {@code name}
     * or no value for the given {@code tag}
     */
    default boolean getMeta(java.lang.String name, java.lang.String tag, Out<java.lang.String> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_get_meta.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(tag, null),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Marshal.addressToString.marshal(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get a copy of preset names as a {@code null} terminated string array.
     * @return list with names, use g_strfreev() after usage.
     */
    default PointerString getPresetNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_preset_get_preset_names.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Get a the names of the GObject properties that can be used for presets.
     * @return an
     *   array of property names which should be freed with g_strfreev() after use.
     */
    default PointerString getPropertyNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_preset_get_property_names.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Check if one can add new presets, change existing ones and remove presets.
     * @return {@code true} if presets are editable or {@code false} if they are static
     */
    default boolean isEditable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_is_editable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Load the given preset.
     * @param name preset name to load
     * @return {@code true} for success, {@code false} if e.g. there is no preset with that {@code name}
     */
    default boolean loadPreset(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_load_preset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Renames a preset. If there is already a preset by the {@code new_name} it will be
     * overwritten.
     * @param oldName current preset name
     * @param newName new preset name
     * @return {@code true} for success, {@code false} if e.g. there is no preset with {@code old_name}
     */
    default boolean renamePreset(java.lang.String oldName, java.lang.String newName) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_rename_preset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(oldName, null),
                    Marshal.stringToAddress.marshal(newName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Save the current object settings as a preset under the given name. If there
     * is already a preset by this {@code name} it will be overwritten.
     * @param name preset name to save
     * @return {@code true} for success, {@code false}
     */
    default boolean savePreset(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_save_preset.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets a new {@code value} for an existing meta data item or adds a new item. Meta
     * data {@code tag} names can be something like e.g. "comment". Supplying {@code null} for the
     * {@code value} will unset an existing value.
     * @param name preset name
     * @param tag meta data item name
     * @param value new value
     * @return {@code true} for success, {@code false} if e.g. there is no preset with that {@code name}
     */
    default boolean setMeta(java.lang.String name, java.lang.String tag, @Nullable java.lang.String value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_set_meta.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(tag, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
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
            RESULT = (long) DowncallHandles.gst_preset_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the directory for application specific presets if set by the
     * application.
     * @return the directory or {@code null}, don't free or modify
     * the string
     */
    public static @Nullable java.lang.String getAppDir() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_preset_get_app_dir.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets an extra directory as an absolute path that should be considered when
     * looking for presets. Any presets in the application dir will shadow the
     * system presets.
     * @param appDir the application specific preset dir
     * @return {@code true} for success, {@code false} if the dir already has been set
     */
    public static boolean setAppDir(java.lang.String appDir) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_preset_set_app_dir.invokeExact(
                    Marshal.stringToAddress.marshal(appDir, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_delete_preset = Interop.downcallHandle(
            "gst_preset_delete_preset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_get_meta = Interop.downcallHandle(
            "gst_preset_get_meta",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_get_preset_names = Interop.downcallHandle(
            "gst_preset_get_preset_names",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_get_property_names = Interop.downcallHandle(
            "gst_preset_get_property_names",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_is_editable = Interop.downcallHandle(
            "gst_preset_is_editable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_load_preset = Interop.downcallHandle(
            "gst_preset_load_preset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_rename_preset = Interop.downcallHandle(
            "gst_preset_rename_preset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_save_preset = Interop.downcallHandle(
            "gst_preset_save_preset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_set_meta = Interop.downcallHandle(
            "gst_preset_set_meta",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_get_type = Interop.downcallHandle(
            "gst_preset_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_get_app_dir = Interop.downcallHandle(
            "gst_preset_get_app_dir",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_preset_set_app_dir = Interop.downcallHandle(
            "gst_preset_set_app_dir",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class PresetImpl extends org.gtk.gobject.GObject implements Preset {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        public PresetImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
