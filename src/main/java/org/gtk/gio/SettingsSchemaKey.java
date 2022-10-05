package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SettingsSchemaKey} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class SettingsSchemaKey extends io.github.jwharm.javagi.ResourceBase {

    public SettingsSchemaKey(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_settings_schema_key_get_default_value = Interop.downcallHandle(
        "g_settings_schema_key_get_default_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default value for {@code key}.
     * <p>
     * Note that this is the default value according to the schema.  System
     * administrator defaults and lockdown are not visible via this API.
     */
    public org.gtk.glib.Variant getDefaultValue() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_default_value.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_get_description = Interop.downcallHandle(
        "g_settings_schema_key_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_get_name = Interop.downcallHandle(
        "g_settings_schema_key_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code key}.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_get_range = Interop.downcallHandle(
        "g_settings_schema_key_get_range",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public org.gtk.glib.Variant getRange() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_range.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_get_summary = Interop.downcallHandle(
        "g_settings_schema_key_get_summary",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public java.lang.String getSummary() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_summary.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_get_value_type = Interop.downcallHandle(
        "g_settings_schema_key_get_value_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.VariantType} of {@code key}.
     */
    public org.gtk.glib.VariantType getValueType() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_get_value_type.invokeExact(handle());
            return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_range_check = Interop.downcallHandle(
        "g_settings_schema_key_range_check",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given {@code value} is within the
     * permitted range for {@code key}.
     * <p>
     * It is a programmer error if {@code value} is not of the correct type — you
     * must check for this first.
     */
    public boolean rangeCheck(org.gtk.glib.Variant value) {
        try {
            var RESULT = (int) g_settings_schema_key_range_check.invokeExact(handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_ref = Interop.downcallHandle(
        "g_settings_schema_key_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of {@code key}, returning a new reference.
     */
    public SettingsSchemaKey ref() {
        try {
            var RESULT = (MemoryAddress) g_settings_schema_key_ref.invokeExact(handle());
            return new SettingsSchemaKey(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_settings_schema_key_unref = Interop.downcallHandle(
        "g_settings_schema_key_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of {@code key}, possibly freeing it.
     */
    public void unref() {
        try {
            g_settings_schema_key_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
