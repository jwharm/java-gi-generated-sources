package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SettingsSchemaKey} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class SettingsSchemaKey extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsSchemaKey";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SettingsSchemaKey}
     * @return A new, uninitialized @{link SettingsSchemaKey}
     */
    public static SettingsSchemaKey allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SettingsSchemaKey newInstance = new SettingsSchemaKey(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SettingsSchemaKey proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SettingsSchemaKey(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Gets the default value for {@code key}.
     * <p>
     * Note that this is the default value according to the schema.  System
     * administrator defaults and lockdown are not visible via this API.
     * @return the default value for the key
     */
    public @NotNull org.gtk.glib.Variant getDefaultValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_default_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the description for {@code key}.
     * <p>
     * If no description has been provided in the schema for {@code key}, returns
     * {@code null}.
     * <p>
     * The description can be one sentence to several paragraphs in length.
     * Paragraphs are delimited with a double newline.  Descriptions can be
     * translated and the value returned from this function is is the
     * current locale.
     * <p>
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     * @return the description for {@code key}, or {@code null}
     */
    public @Nullable java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the name of {@code key}.
     * @return the name of {@code key}.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Queries the range of a key.
     * <p>
     * This function will return a {@link org.gtk.glib.Variant} that fully describes the range
     * of values that are valid for {@code key}.
     * <p>
     * The type of {@link org.gtk.glib.Variant} returned is {@code (sv)}. The string describes
     * the type of range restriction in effect. The type and meaning of
     * the value contained in the variant depends on the string.
     * <p>
     * If the string is {@code 'type'} then the variant contains an empty array.
     * The element type of that empty array is the expected type of value
     * and all values of that type are valid.
     * <p>
     * If the string is {@code 'enum'} then the variant contains an array
     * enumerating the possible values. Each item in the array is
     * a possible valid value and no other values are valid.
     * <p>
     * If the string is {@code 'flags'} then the variant contains an array. Each
     * item in the array is a value that may appear zero or one times in an
     * array to be used as the value for this key. For example, if the
     * variant contained the array {@code ['x', 'y']} then the valid values for
     * the key would be {@code []}, {@code ['x']}, {@code ['y']}, {@code ['x', 'y']} and
     * {@code ['y', 'x']}.
     * <p>
     * Finally, if the string is {@code 'range'} then the variant contains a pair
     * of like-typed values -- the minimum and maximum permissible values
     * for this key.
     * <p>
     * This information should not be used by normal programs.  It is
     * considered to be a hint for introspection purposes.  Normal programs
     * should already know what is permitted by their own schema.  The
     * format may change in any way in the future -- but particularly, new
     * forms may be added to the possibilities described above.
     * <p>
     * You should free the returned value with g_variant_unref() when it is
     * no longer needed.
     * @return a {@link org.gtk.glib.Variant} describing the range
     */
    public @NotNull org.gtk.glib.Variant getRange() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_range.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the summary for {@code key}.
     * <p>
     * If no summary has been provided in the schema for {@code key}, returns
     * {@code null}.
     * <p>
     * The summary is a short description of the purpose of the key; usually
     * one short sentence.  Summaries can be translated and the value
     * returned from this function is is the current locale.
     * <p>
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     * @return the summary for {@code key}, or {@code null}
     */
    public @Nullable java.lang.String getSummary() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_summary.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.VariantType} of {@code key}.
     * @return the type of {@code key}
     */
    public @NotNull org.gtk.glib.VariantType getValueType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_get_value_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if the given {@code value} is within the
     * permitted range for {@code key}.
     * <p>
     * It is a programmer error if {@code value} is not of the correct type — you
     * must check for this first.
     * @param value the value to check
     * @return {@code true} if {@code value} is valid for {@code key}
     */
    public boolean rangeCheck(@NotNull org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_settings_schema_key_range_check.invokeExact(
                    handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Increase the reference count of {@code key}, returning a new reference.
     * @return a new reference to {@code key}
     */
    public @NotNull org.gtk.gio.SettingsSchemaKey ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_schema_key_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SettingsSchemaKey(RESULT, Ownership.FULL);
    }
    
    /**
     * Decrease the reference count of {@code key}, possibly freeing it.
     */
    public void unref() {
        try {
            DowncallHandles.g_settings_schema_key_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_settings_schema_key_get_default_value = Interop.downcallHandle(
            "g_settings_schema_key_get_default_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_get_description = Interop.downcallHandle(
            "g_settings_schema_key_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_get_name = Interop.downcallHandle(
            "g_settings_schema_key_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_get_range = Interop.downcallHandle(
            "g_settings_schema_key_get_range",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_get_summary = Interop.downcallHandle(
            "g_settings_schema_key_get_summary",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_get_value_type = Interop.downcallHandle(
            "g_settings_schema_key_get_value_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_range_check = Interop.downcallHandle(
            "g_settings_schema_key_range_check",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_ref = Interop.downcallHandle(
            "g_settings_schema_key_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_settings_schema_key_unref = Interop.downcallHandle(
            "g_settings_schema_key_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SettingsSchemaKey struct;
        
         /**
         * A {@link SettingsSchemaKey.Build} object constructs a {@link SettingsSchemaKey} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SettingsSchemaKey.allocate();
        }
        
         /**
         * Finish building the {@link SettingsSchemaKey} struct.
         * @return A new instance of {@code SettingsSchemaKey} with the fields 
         *         that were set in the Build object.
         */
        public SettingsSchemaKey construct() {
            return struct;
        }
    }
}
