package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSettingsSchemaKey is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class SettingsSchemaKey extends io.github.jwharm.javagi.interop.ResourceBase {

    public SettingsSchemaKey(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Gets the default value for @key.
     * 
     * Note that this is the default value according to the schema.  System
     * administrator defaults and lockdown are not visible via this API.
     */
    public org.gtk.glib.Variant getDefaultValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_default_value(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the description for @key.
     * 
     * If no description has been provided in the schema for @key, returns
     * %NULL.
     * 
     * The description can be one sentence to several paragraphs in length.
     * Paragraphs are delimited with a double newline.  Descriptions can be
     * translated and the value returned from this function is is the
     * current locale.
     * 
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     */
    public java.lang.String getDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_description(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of @key.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the range of a key.
     * 
     * This function will return a #GVariant that fully describes the range
     * of values that are valid for @key.
     * 
     * The type of #GVariant returned is `(sv)`. The string describes
     * the type of range restriction in effect. The type and meaning of
     * the value contained in the variant depends on the string.
     * 
     * If the string is `'type'` then the variant contains an empty array.
     * The element type of that empty array is the expected type of value
     * and all values of that type are valid.
     * 
     * If the string is `'enum'` then the variant contains an array
     * enumerating the possible values. Each item in the array is
     * a possible valid value and no other values are valid.
     * 
     * If the string is `'flags'` then the variant contains an array. Each
     * item in the array is a value that may appear zero or one times in an
     * array to be used as the value for this key. For example, if the
     * variant contained the array `['x', 'y']` then the valid values for
     * the key would be `[]`, `['x']`, `['y']`, `['x', 'y']` and
     * `['y', 'x']`.
     * 
     * Finally, if the string is `'range'` then the variant contains a pair
     * of like-typed values -- the minimum and maximum permissible values
     * for this key.
     * 
     * This information should not be used by normal programs.  It is
     * considered to be a hint for introspection purposes.  Normal programs
     * should already know what is permitted by their own schema.  The
     * format may change in any way in the future -- but particularly, new
     * forms may be added to the possibilities described above.
     * 
     * You should free the returned value with g_variant_unref() when it is
     * no longer needed.
     */
    public org.gtk.glib.Variant getRange() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_range(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the summary for @key.
     * 
     * If no summary has been provided in the schema for @key, returns
     * %NULL.
     * 
     * The summary is a short description of the purpose of the key; usually
     * one short sentence.  Summaries can be translated and the value
     * returned from this function is is the current locale.
     * 
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     */
    public java.lang.String getSummary() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_summary(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the #GVariantType of @key.
     */
    public org.gtk.glib.VariantType getValueType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_get_value_type(HANDLE());
        return new org.gtk.glib.VariantType(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks if the given @value is within the
     * permitted range for @key.
     * 
     * It is a programmer error if @value is not of the correct type — you
     * must check for this first.
     */
    public boolean rangeCheck(org.gtk.glib.Variant value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_range_check(HANDLE(), value.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Increase the reference count of @key, returning a new reference.
     */
    public SettingsSchemaKey ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_ref(HANDLE());
        return new SettingsSchemaKey(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Decrease the reference count of @key, possibly freeing it.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_settings_schema_key_unref(HANDLE());
    }
    
}
