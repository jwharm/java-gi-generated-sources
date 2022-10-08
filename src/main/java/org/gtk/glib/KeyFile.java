package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GKeyFile struct contains only private data
 * and should not be accessed directly.
 */
public class KeyFile extends io.github.jwharm.javagi.ResourceBase {

    public KeyFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_key_file_new = Interop.downcallHandle(
        "g_key_file_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_key_file_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@link KeyFile} object. Use
     * g_key_file_load_from_file(), g_key_file_load_from_data(),
     * g_key_file_load_from_dirs() or g_key_file_load_from_data_dirs() to
     * read an existing key file.
     */
    public KeyFile() {
        super(constructNew());
    }
    
    static final MethodHandle g_key_file_free = Interop.downcallHandle(
        "g_key_file_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears all keys and groups from {@code key_file}, and decreases the
     * reference count by 1. If the reference count reaches zero,
     * frees the key file and all its allocated memory.
     */
    public void free() {
        try {
            g_key_file_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_boolean = Interop.downcallHandle(
        "g_key_file_get_boolean",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * boolean.
     * <p>
     * If {@code key} cannot be found then {@code false} is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value
     * associated with {@code key} cannot be interpreted as a boolean then {@code false}
     * is returned and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public boolean getBoolean(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_get_boolean.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_boolean_list = Interop.downcallHandle(
        "g_key_file_get_boolean_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * booleans.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as booleans then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public PointerBoolean getBooleanList(java.lang.String groupName, java.lang.String key, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_boolean_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerBoolean(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_comment = Interop.downcallHandle(
        "g_key_file_get_comment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a comment above {@code key} from {@code group_name}.
     * If {@code key} is {@code null} then {@code comment} will be read from above
     * {@code group_name}. If both {@code key} and {@code group_name} are {@code null}, then
     * {@code comment} will be read from above the first group in the file.
     * <p>
     * Note that the returned string does not include the '#' comment markers,
     * but does include any whitespace after them (on each line). It includes
     * the line breaks between lines, but does not include the final line break.
     */
    public java.lang.String getComment(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_comment.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_double = Interop.downcallHandle(
        "g_key_file_get_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * double. If {@code group_name} is {@code null}, the start_group is used.
     * <p>
     * If {@code key} cannot be found then 0.0 is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value associated
     * with {@code key} cannot be interpreted as a double then 0.0 is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public double getDouble(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (double) g_key_file_get_double.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_double_list = Interop.downcallHandle(
        "g_key_file_get_double_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * doubles.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as doubles then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public PointerDouble getDoubleList(java.lang.String groupName, java.lang.String key, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_double_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerDouble(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_groups = Interop.downcallHandle(
        "g_key_file_get_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all groups in the key file loaded with {@code key_file}.
     * The array of returned groups will be {@code null}-terminated, so
     * {@code length} may optionally be {@code null}.
     */
    public PointerString getGroups(PointerLong length) {
        try {
            var RESULT = (MemoryAddress) g_key_file_get_groups.invokeExact(handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_int64 = Interop.downcallHandle(
        "g_key_file_get_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a signed
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * 64-bit results without truncation.
     */
    public long getInt64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_key_file_get_int64.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_integer = Interop.downcallHandle(
        "g_key_file_get_integer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as an
     * integer.
     * <p>
     * If {@code key} cannot be found then 0 is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value associated
     * with {@code key} cannot be interpreted as an integer, or is out of range
     * for a {@code gint}, then 0 is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public int getInteger(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_get_integer.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_integer_list = Interop.downcallHandle(
        "g_key_file_get_integer_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * integers.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as integers, or are out of range for
     * {@code gint}, then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public PointerInteger getIntegerList(java.lang.String groupName, java.lang.String key, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_integer_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_keys = Interop.downcallHandle(
        "g_key_file_get_keys",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all keys for the group name {@code group_name}.  The array of
     * returned keys will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}. In the event that the {@code group_name} cannot
     * be found, {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public PointerString getKeys(java.lang.String groupName, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_keys.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_locale_for_key = Interop.downcallHandle(
        "g_key_file_get_locale_for_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the actual locale which the result of
     * g_key_file_get_locale_string() or g_key_file_get_locale_string_list()
     * came from.
     * <p>
     * If calling g_key_file_get_locale_string() or
     * g_key_file_get_locale_string_list() with exactly the same {@code key_file},
     * {@code group_name}, {@code key} and {@code locale}, the result of those functions will
     * have originally been tagged with the locale that is the result of
     * this function.
     */
    public java.lang.String getLocaleForKey(java.lang.String groupName, java.lang.String key, java.lang.String locale) {
        try {
            var RESULT = (MemoryAddress) g_key_file_get_locale_for_key.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_locale_string = Interop.downcallHandle(
        "g_key_file_get_locale_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name}
     * translated in the given {@code locale} if available.  If {@code locale} is
     * {@code null} then the current locale is assumed.
     * <p>
     * If {@code locale} is to be non-{@code null}, or if the current locale will change over
     * the lifetime of the {@link KeyFile}, it must be loaded with
     * {@link KeyFileFlags#KEEP_TRANSLATIONS} in order to load strings for all locales.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. If the value associated
     * with {@code key} cannot be interpreted or no suitable translation can
     * be found then the untranslated value is returned.
     */
    public java.lang.String getLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_locale_string.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_locale_string_list = Interop.downcallHandle(
        "g_key_file_get_locale_string_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the values associated with {@code key} under {@code group_name}
     * translated in the given {@code locale} if available.  If {@code locale} is
     * {@code null} then the current locale is assumed.
     * <p>
     * If {@code locale} is to be non-{@code null}, or if the current locale will change over
     * the lifetime of the {@link KeyFile}, it must be loaded with
     * {@link KeyFileFlags#KEEP_TRANSLATIONS} in order to load strings for all locales.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. If the values associated
     * with {@code key} cannot be interpreted or no suitable translations
     * can be found then the untranslated values are returned. The
     * returned array is {@code null}-terminated, so {@code length} may optionally
     * be {@code null}.
     */
    public PointerString getLocaleStringList(java.lang.String groupName, java.lang.String key, java.lang.String locale, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_locale_string_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_start_group = Interop.downcallHandle(
        "g_key_file_get_start_group",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the start group of the file.
     */
    public java.lang.String getStartGroup() {
        try {
            var RESULT = (MemoryAddress) g_key_file_get_start_group.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_string = Interop.downcallHandle(
        "g_key_file_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the string value associated with {@code key} under {@code group_name}.
     * Unlike g_key_file_get_value(), this function handles escape sequences
     * like \\s.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public java.lang.String getString(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_string.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_string_list = Interop.downcallHandle(
        "g_key_file_get_string_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the values associated with {@code key} under {@code group_name}.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public PointerString getStringList(java.lang.String groupName, java.lang.String key, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_string_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_uint64 = Interop.downcallHandle(
        "g_key_file_get_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as an unsigned
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * large positive results without truncation.
     */
    public long getUint64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_key_file_get_uint64.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_get_value = Interop.downcallHandle(
        "g_key_file_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the raw value associated with {@code key} under {@code group_name}.
     * Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public java.lang.String getValue(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_get_value.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_has_group = Interop.downcallHandle(
        "g_key_file_has_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the key file has the group {@code group_name}.
     */
    public boolean hasGroup(java.lang.String groupName) {
        try {
            var RESULT = (int) g_key_file_has_group.invokeExact(handle(), Interop.allocateNativeString(groupName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_has_key = Interop.downcallHandle(
        "g_key_file_has_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the key file has the key {@code key} in the group
     * {@code group_name}.
     * <p>
     * Note that this function does not follow the rules for {@link Error} strictly;
     * the return value both carries meaning and signals an error.  To use
     * this function, you must pass a {@link Error} pointer in {@code error}, and check
     * whether it is not {@code null} to see if an error occurred.
     * <p>
     * Language bindings should use g_key_file_get_value() to test whether
     * or not a key exists.
     */
    public boolean hasKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_has_key.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_load_from_bytes = Interop.downcallHandle(
        "g_key_file_load_from_bytes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a key file from the data in {@code bytes} into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     */
    public boolean loadFromBytes(Bytes bytes, KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_load_from_bytes.invokeExact(handle(), bytes.handle(), flags.getValue(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_load_from_data = Interop.downcallHandle(
        "g_key_file_load_from_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a key file from memory into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     */
    public boolean loadFromData(java.lang.String data, long length, KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_load_from_data.invokeExact(handle(), Interop.allocateNativeString(data).handle(), length, flags.getValue(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_load_from_data_dirs = Interop.downcallHandle(
        "g_key_file_load_from_data_dirs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This function looks for a key file named {@code file} in the paths
     * returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into {@code key_file} and returns the file's full path in
     * {@code full_path}.  If the file could not be loaded then an {@code error} is
     * set to either a {@link FileError} or {@link KeyFileError}.
     */
    public boolean loadFromDataDirs(java.lang.String file, PointerString fullPath, KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_load_from_data_dirs.invokeExact(handle(), Interop.allocateNativeString(file).handle(), fullPath.handle(), flags.getValue(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_load_from_dirs = Interop.downcallHandle(
        "g_key_file_load_from_dirs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This function looks for a key file named {@code file} in the paths
     * specified in {@code search_dirs}, loads the file into {@code key_file} and
     * returns the file's full path in {@code full_path}.
     * <p>
     * If the file could not be found in any of the {@code search_dirs},
     * {@link KeyFileError#NOT_FOUND} is returned. If
     * the file is found but the OS returns an error when opening or reading the
     * file, a {@code G_FILE_ERROR} is returned. If there is a problem parsing the file, a
     * {@code G_KEY_FILE_ERROR} is returned.
     */
    public boolean loadFromDirs(java.lang.String file, java.lang.String[] searchDirs, PointerString fullPath, KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_load_from_dirs.invokeExact(handle(), Interop.allocateNativeString(file).handle(), Interop.allocateNativeArray(searchDirs).handle(), fullPath.handle(), flags.getValue(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_load_from_file = Interop.downcallHandle(
        "g_key_file_load_from_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a key file into an empty {@link KeyFile} structure.
     * <p>
     * If the OS returns an error when opening or reading the file, a
     * {@code G_FILE_ERROR} is returned. If there is a problem parsing the file, a
     * {@code G_KEY_FILE_ERROR} is returned.
     * <p>
     * This function will never return a {@link KeyFileError#NOT_FOUND} error. If the
     * {@code file} is not found, {@link FileError#NOENT} is returned.
     */
    public boolean loadFromFile(java.lang.String file, KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_load_from_file.invokeExact(handle(), Interop.allocateNativeString(file).handle(), flags.getValue(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_ref = Interop.downcallHandle(
        "g_key_file_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code key_file}.
     */
    public KeyFile ref() {
        try {
            var RESULT = (MemoryAddress) g_key_file_ref.invokeExact(handle());
            return new KeyFile(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_remove_comment = Interop.downcallHandle(
        "g_key_file_remove_comment",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a comment above {@code key} from {@code group_name}.
     * If {@code key} is {@code null} then {@code comment} will be removed above {@code group_name}.
     * If both {@code key} and {@code group_name} are {@code null}, then {@code comment} will
     * be removed above the first group in the file.
     */
    public boolean removeComment(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_remove_comment.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_remove_group = Interop.downcallHandle(
        "g_key_file_remove_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the specified group, {@code group_name},
     * from the key file.
     */
    public boolean removeGroup(java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_remove_group.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_remove_key = Interop.downcallHandle(
        "g_key_file_remove_key",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code key} in {@code group_name} from the key file.
     */
    public boolean removeKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_remove_key.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_save_to_file = Interop.downcallHandle(
        "g_key_file_save_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Writes the contents of {@code key_file} to {@code filename} using
     * g_file_set_contents(). If you need stricter guarantees about durability of
     * the written file than are provided by g_file_set_contents(), use
     * g_file_set_contents_full() with the return value of g_key_file_to_data().
     * <p>
     * This function can fail for any of the reasons that
     * g_file_set_contents() may fail.
     */
    public boolean saveToFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_save_to_file.invokeExact(handle(), Interop.allocateNativeString(filename).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_boolean = Interop.downcallHandle(
        "g_key_file_set_boolean",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Associates a new boolean value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setBoolean(java.lang.String groupName, java.lang.String key, boolean value) {
        try {
            g_key_file_set_boolean.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_boolean_list = Interop.downcallHandle(
        "g_key_file_set_boolean_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a list of boolean values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} is {@code null}, the start_group is used.
     */
    public void setBooleanList(java.lang.String groupName, java.lang.String key, boolean[] list, long length) {
        try {
            g_key_file_set_boolean_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_comment = Interop.downcallHandle(
        "g_key_file_set_comment",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Places a comment above {@code key} from {@code group_name}.
     * <p>
     * If {@code key} is {@code null} then {@code comment} will be written above {@code group_name}.
     * If both {@code key} and {@code group_name}  are {@code null}, then {@code comment} will be
     * written above the first group in the file.
     * <p>
     * Note that this function prepends a '#' comment marker to
     * each line of {@code comment}.
     */
    public boolean setComment(java.lang.String groupName, java.lang.String key, java.lang.String comment) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_key_file_set_comment.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(comment).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_double = Interop.downcallHandle(
        "g_key_file_set_double",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Associates a new double value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setDouble(java.lang.String groupName, java.lang.String key, double value) {
        try {
            g_key_file_set_double.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_double_list = Interop.downcallHandle(
        "g_key_file_set_double_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a list of double values with {@code key} under
     * {@code group_name}.  If {@code key} cannot be found then it is created.
     */
    public void setDoubleList(java.lang.String groupName, java.lang.String key, double[] list, long length) {
        try {
            g_key_file_set_double_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_int64 = Interop.downcallHandle(
        "g_key_file_set_int64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setInt64(java.lang.String groupName, java.lang.String key, long value) {
        try {
            g_key_file_set_int64.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_integer = Interop.downcallHandle(
        "g_key_file_set_integer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setInteger(java.lang.String groupName, java.lang.String key, int value) {
        try {
            g_key_file_set_integer.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_integer_list = Interop.downcallHandle(
        "g_key_file_set_integer_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a list of integer values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setIntegerList(java.lang.String groupName, java.lang.String key, int[] list, long length) {
        try {
            g_key_file_set_integer_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_list_separator = Interop.downcallHandle(
        "g_key_file_set_list_separator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Sets the character which is used to separate
     * values in lists. Typically ';' or ',' are used
     * as separators. The default list separator is ';'.
     */
    public void setListSeparator(byte separator) {
        try {
            g_key_file_set_list_separator.invokeExact(handle(), separator);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_locale_string = Interop.downcallHandle(
        "g_key_file_set_locale_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associates a string value for {@code key} and {@code locale} under {@code group_name}.
     * If the translation for {@code key} cannot be found then it is created.
     */
    public void setLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String string) {
        try {
            g_key_file_set_locale_string.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeString(string).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_locale_string_list = Interop.downcallHandle(
        "g_key_file_set_locale_string_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a list of string values for {@code key} and {@code locale} under
     * {@code group_name}.  If the translation for {@code key} cannot be found then
     * it is created.
     */
    public void setLocaleStringList(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String[] list, long length) {
        try {
            g_key_file_set_locale_string_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeArray(list).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_string = Interop.downcallHandle(
        "g_key_file_set_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associates a new string value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     * Unlike g_key_file_set_value(), this function handles characters
     * that need escaping, such as newlines.
     */
    public void setString(java.lang.String groupName, java.lang.String key, java.lang.String string) {
        try {
            g_key_file_set_string.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(string).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_string_list = Interop.downcallHandle(
        "g_key_file_set_string_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a list of string values for {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     */
    public void setStringList(java.lang.String groupName, java.lang.String key, java.lang.String[] list, long length) {
        try {
            g_key_file_set_string_list.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_uint64 = Interop.downcallHandle(
        "g_key_file_set_uint64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setUint64(java.lang.String groupName, java.lang.String key, long value) {
        try {
            g_key_file_set_uint64.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_set_value = Interop.downcallHandle(
        "g_key_file_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associates a new value with {@code key} under {@code group_name}.
     * <p>
     * If {@code key} cannot be found then it is created. If {@code group_name} cannot
     * be found then it is created. To set an UTF-8 string which may contain
     * characters that need escaping (such as newlines or spaces), use
     * g_key_file_set_string().
     */
    public void setValue(java.lang.String groupName, java.lang.String key, java.lang.String value) {
        try {
            g_key_file_set_value.invokeExact(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_to_data = Interop.downcallHandle(
        "g_key_file_to_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function outputs {@code key_file} as a string.
     * <p>
     * Note that this function never reports an error,
     * so it is safe to pass {@code null} as {@code error}.
     */
    public java.lang.String toData(PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_key_file_to_data.invokeExact(handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_unref = Interop.downcallHandle(
        "g_key_file_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code key_file} by 1. If the reference count
     * reaches zero, frees the key file and all its allocated memory.
     */
    public void unref() {
        try {
            g_key_file_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_key_file_error_quark = Interop.downcallHandle(
        "g_key_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark errorQuark() {
        try {
            var RESULT = (int) g_key_file_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
