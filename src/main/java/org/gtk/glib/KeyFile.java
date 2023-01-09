package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GKeyFile struct contains only private data
 * and should not be accessed directly.
 */
public class KeyFile extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GKeyFile";
    
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
     * Allocate a new {@link KeyFile}
     * @return A new, uninitialized @{link KeyFile}
     */
    public static KeyFile allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        KeyFile newInstance = new KeyFile(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a KeyFile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected KeyFile(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, KeyFile> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new KeyFile(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_key_file_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link KeyFile} object. Use
     * g_key_file_load_from_file(), g_key_file_load_from_data(),
     * g_key_file_load_from_dirs() or g_key_file_load_from_data_dirs() to
     * read an existing key file.
     */
    public KeyFile() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Clears all keys and groups from {@code key_file}, and decreases the
     * reference count by 1. If the reference count reaches zero,
     * frees the key file and all its allocated memory.
     */
    public void free() {
        try {
            DowncallHandles.g_key_file_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * boolean.
     * <p>
     * If {@code key} cannot be found then {@code false} is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value
     * associated with {@code key} cannot be interpreted as a boolean then {@code false}
     * is returned and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as a boolean,
     *    or {@code false} if the key was not found or could not be parsed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getBoolean(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_get_boolean.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * booleans.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as booleans then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @param length the number of booleans returned
     * @return the values associated with the key as a list of booleans, or {@code null} if the
     *    key was not found or could not be parsed. The returned list of booleans
     *    should be freed with g_free() when no longer needed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean[] getBooleanList(java.lang.String groupName, java.lang.String key, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_boolean_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) lengthPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            boolean[] resultARRAY = new boolean[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.C_INT, I);
                resultARRAY[I] = Marshal.integerToBoolean.marshal(OBJ, null).booleanValue();
            }
            return resultARRAY;
        }
    }
    
    /**
     * Retrieves a comment above {@code key} from {@code group_name}.
     * If {@code key} is {@code null} then {@code comment} will be read from above
     * {@code group_name}. If both {@code key} and {@code group_name} are {@code null}, then
     * {@code comment} will be read from above the first group in the file.
     * <p>
     * Note that the returned string does not include the '{@code '} comment markers,
     * but does include any whitespace after them (on each line). It includes
     * the line breaks between lines, but does not include the final line break.
     * @param groupName a group name, or {@code null}
     * @param key a key
     * @return a comment that should be freed with g_free()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getComment(@Nullable java.lang.String groupName, @Nullable java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_comment.invokeExact(
                        handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)),
                        (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * double. If {@code group_name} is {@code null}, the start_group is used.
     * <p>
     * If {@code key} cannot be found then 0.0 is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value associated
     * with {@code key} cannot be interpreted as a double then 0.0 is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as a double, or
     *     0.0 if the key was not found or could not be parsed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public double getDouble(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            double RESULT;
            try {
                RESULT = (double) DowncallHandles.g_key_file_get_double.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * doubles.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as doubles then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @param length the number of doubles returned
     * @return the values associated with the key as a list of doubles, or {@code null} if the
     *     key was not found or could not be parsed. The returned list of doubles
     *     should be freed with g_free() when no longer needed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public double[] getDoubleList(java.lang.String groupName, java.lang.String key, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_double_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) lengthPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_DOUBLE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_DOUBLE);
        }
    }
    
    /**
     * Returns all groups in the key file loaded with {@code key_file}.
     * The array of returned groups will be {@code null}-terminated, so
     * {@code length} may optionally be {@code null}.
     * @param length return location for the number of returned groups, or {@code null}
     * @return a newly-allocated {@code null}-terminated array of strings.
     *   Use g_strfreev() to free it.
     */
    public PointerString getGroups(Out<Long> length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_groups.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a signed
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * 64-bit results without truncation.
     * @param groupName a non-{@code null} group name
     * @param key a non-{@code null} key
     * @return the value associated with the key as a signed 64-bit integer, or
     * 0 if the key was not found or could not be parsed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long getInt64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_key_file_get_int64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as an
     * integer.
     * <p>
     * If {@code key} cannot be found then 0 is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value associated
     * with {@code key} cannot be interpreted as an integer, or is out of range
     * for a {@code gint}, then 0 is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @return the value associated with the key as an integer, or
     *     0 if the key was not found or could not be parsed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int getInteger(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_get_integer.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns the values associated with {@code key} under {@code group_name} as
     * integers.
     * <p>
     * If {@code key} cannot be found then {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the values associated
     * with {@code key} cannot be interpreted as integers, or are out of range for
     * {@code gint}, then {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     * @param groupName a group name
     * @param key a key
     * @param length the number of integers returned
     * @return the values associated with the key as a list of integers, or {@code null} if
     *     the key was not found or could not be parsed. The returned list of
     *     integers should be freed with g_free() when no longer needed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int[] getIntegerList(java.lang.String groupName, java.lang.String key, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_integer_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) lengthPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Returns all keys for the group name {@code group_name}.  The array of
     * returned keys will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}. In the event that the {@code group_name} cannot
     * be found, {@code null} is returned and {@code error} is set to
     * {@link KeyFileError#GROUP_NOT_FOUND}.
     * @param groupName a group name
     * @param length return location for the number of keys returned, or {@code null}
     * @return a newly-allocated {@code null}-terminated array of strings.
     *     Use g_strfreev() to free it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public PointerString getKeys(java.lang.String groupName, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_keys.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return new PointerString(RESULT);
        }
    }
    
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
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier or {@code null}
     * @return the locale from the file, or {@code null} if the key was not
     *   found or the entry in the file was was untranslated
     */
    public @Nullable java.lang.String getLocaleForKey(java.lang.String groupName, java.lang.String key, @Nullable java.lang.String locale) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_locale_for_key.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (locale == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(locale, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
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
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier or {@code null}
     * @return a newly allocated string or {@code null} if the specified
     *   key cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getLocaleString(java.lang.String groupName, java.lang.String key, @Nullable java.lang.String locale) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_locale_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (locale == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(locale, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
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
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier or {@code null}
     * @param length return location for the number of returned strings or {@code null}
     * @return a newly allocated {@code null}-terminated string array
     *   or {@code null} if the key isn't found. The string array should be freed
     *   with g_strfreev().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String[] getLocaleStringList(java.lang.String groupName, java.lang.String key, @Nullable java.lang.String locale, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_locale_string_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (locale == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(locale, SCOPE)),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Returns the name of the start group of the file.
     * @return The start group of the key file.
     */
    public @Nullable java.lang.String getStartGroup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_start_group.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the string value associated with {@code key} under {@code group_name}.
     * Unlike g_key_file_get_value(), this function handles escape sequences
     * like \\s.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     * @param groupName a group name
     * @param key a key
     * @return a newly allocated string or {@code null} if the specified
     *   key cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getString(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Returns the values associated with {@code key} under {@code group_name}.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     * @param groupName a group name
     * @param key a key
     * @param length return location for the number of returned strings, or {@code null}
     * @return a {@code null}-terminated string array or {@code null} if the specified
     *  key cannot be found. The array should be freed with g_strfreev().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String[] getStringList(java.lang.String groupName, java.lang.String key, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_string_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as an unsigned
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * large positive results without truncation.
     * @param groupName a non-{@code null} group name
     * @param key a non-{@code null} key
     * @return the value associated with the key as an unsigned 64-bit integer,
     * or 0 if the key was not found or could not be parsed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long getUint64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_key_file_get_uint64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Returns the raw value associated with {@code key} under {@code group_name}.
     * Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * <p>
     * In the event the key cannot be found, {@code null} is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, {@code null} is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     * @param groupName a group name
     * @param key a key
     * @return a newly allocated string or {@code null} if the specified
     *  key cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getValue(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_get_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks whether the key file has the group {@code group_name}.
     * @param groupName a group name
     * @return {@code true} if {@code group_name} is a part of {@code key_file}, {@code false}
     * otherwise.
     */
    public boolean hasGroup(java.lang.String groupName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_has_group.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param groupName a group name
     * @param key a key name
     * @return {@code true} if {@code key} is a part of {@code group_name}, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean hasKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_has_key.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Loads a key file from the data in {@code bytes} into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     * @param bytes a {@link Bytes}
     * @param flags flags from {@link KeyFileFlags}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromBytes(org.gtk.glib.Bytes bytes, org.gtk.glib.KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_load_from_bytes.invokeExact(
                        handle(),
                        bytes.handle(),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Loads a key file from memory into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     * @param data key file loaded in memory
     * @param length the length of {@code data} in bytes (or (gsize)-1 if data is nul-terminated)
     * @param flags flags from {@link KeyFileFlags}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromData(java.lang.String data, long length, org.gtk.glib.KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_load_from_data.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(data, SCOPE),
                        length,
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * This function looks for a key file named {@code file} in the paths
     * returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into {@code key_file} and returns the file's full path in
     * {@code full_path}.  If the file could not be loaded then an {@code error} is
     * set to either a {@link FileError} or {@link KeyFileError}.
     * @param file a relative path to a filename to open and parse
     * @param fullPath return location for a string containing the full path
     *   of the file, or {@code null}
     * @param flags flags from {@link KeyFileFlags}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromDataDirs(java.lang.String file, @Nullable Out<java.lang.String> fullPath, org.gtk.glib.KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment fullPathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_load_from_data_dirs.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        (Addressable) (fullPath == null ? MemoryAddress.NULL : (Addressable) fullPathPOINTER.address()),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (fullPath != null) fullPath.set(Marshal.addressToString.marshal(fullPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param file a relative path to a filename to open and parse
     * @param searchDirs {@code null}-terminated array of directories to search
     * @param fullPath return location for a string containing the full path
     *   of the file, or {@code null}
     * @param flags flags from {@link KeyFileFlags}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromDirs(java.lang.String file, java.lang.String[] searchDirs, @Nullable Out<java.lang.String> fullPath, org.gtk.glib.KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment fullPathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_load_from_dirs.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        Interop.allocateNativeArray(searchDirs, false, SCOPE),
                        (Addressable) (fullPath == null ? MemoryAddress.NULL : (Addressable) fullPathPOINTER.address()),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (fullPath != null) fullPath.set(Marshal.addressToString.marshal(fullPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Loads a key file into an empty {@link KeyFile} structure.
     * <p>
     * If the OS returns an error when opening or reading the file, a
     * {@code G_FILE_ERROR} is returned. If there is a problem parsing the file, a
     * {@code G_KEY_FILE_ERROR} is returned.
     * <p>
     * This function will never return a {@link KeyFileError#NOT_FOUND} error. If the
     * {@code file} is not found, {@link FileError#NOENT} is returned.
     * @param file the path of a filename to load, in the GLib filename encoding
     * @param flags flags from {@link KeyFileFlags}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromFile(java.lang.String file, org.gtk.glib.KeyFileFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_load_from_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Increases the reference count of {@code key_file}.
     * @return the same {@code key_file}.
     */
    public org.gtk.glib.KeyFile ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_key_file_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.KeyFile.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Removes a comment above {@code key} from {@code group_name}.
     * If {@code key} is {@code null} then {@code comment} will be removed above {@code group_name}.
     * If both {@code key} and {@code group_name} are {@code null}, then {@code comment} will
     * be removed above the first group in the file.
     * @param groupName a group name, or {@code null}
     * @param key a key
     * @return {@code true} if the comment was removed, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeComment(@Nullable java.lang.String groupName, @Nullable java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_remove_comment.invokeExact(
                        handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)),
                        (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes the specified group, {@code group_name},
     * from the key file.
     * @param groupName a group name
     * @return {@code true} if the group was removed, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeGroup(java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_remove_group.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes {@code key} in {@code group_name} from the key file.
     * @param groupName a group name
     * @param key a key name to remove
     * @return {@code true} if the key was removed, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_remove_key.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Writes the contents of {@code key_file} to {@code filename} using
     * g_file_set_contents(). If you need stricter guarantees about durability of
     * the written file than are provided by g_file_set_contents(), use
     * g_file_set_contents_full() with the return value of g_key_file_to_data().
     * <p>
     * This function can fail for any of the reasons that
     * g_file_set_contents() may fail.
     * @param filename the name of the file to write to
     * @return {@code true} if successful, else {@code false} with {@code error} set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_save_to_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Associates a new boolean value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param value {@code true} or {@code false}
     */
    public void setBoolean(java.lang.String groupName, java.lang.String key, boolean value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_boolean.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.booleanToInteger.marshal(value, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a list of boolean values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} is {@code null}, the start_group is used.
     * @param groupName a group name
     * @param key a key
     * @param list an array of boolean values
     * @param length length of {@code list}
     */
    public void setBooleanList(java.lang.String groupName, java.lang.String key, boolean[] list, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_boolean_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Interop.allocateNativeArray(list, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Places a comment above {@code key} from {@code group_name}.
     * <p>
     * If {@code key} is {@code null} then {@code comment} will be written above {@code group_name}.
     * If both {@code key} and {@code group_name}  are {@code null}, then {@code comment} will be
     * written above the first group in the file.
     * <p>
     * Note that this function prepends a '{@code '} comment marker to
     * each line of {@code comment}.
     * @param groupName a group name, or {@code null}
     * @param key a key
     * @param comment a comment
     * @return {@code true} if the comment was written, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setComment(@Nullable java.lang.String groupName, @Nullable java.lang.String key, java.lang.String comment) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_key_file_set_comment.invokeExact(
                        handle(),
                        (Addressable) (groupName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(groupName, SCOPE)),
                        (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, SCOPE)),
                        Marshal.stringToAddress.marshal(comment, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Associates a new double value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param value a double value
     */
    public void setDouble(java.lang.String groupName, java.lang.String key, double value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_double.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a list of double values with {@code key} under
     * {@code group_name}.  If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param list an array of double values
     * @param length number of double values in {@code list}
     */
    public void setDoubleList(java.lang.String groupName, java.lang.String key, double[] list, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_double_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Interop.allocateNativeArray(list, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     */
    public void setInt64(java.lang.String groupName, java.lang.String key, long value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_int64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     */
    public void setInteger(java.lang.String groupName, java.lang.String key, int value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_integer.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a list of integer values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param list an array of integer values
     * @param length number of integer values in {@code list}
     */
    public void setIntegerList(java.lang.String groupName, java.lang.String key, int[] list, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_integer_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Interop.allocateNativeArray(list, false, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the character which is used to separate
     * values in lists. Typically ';' or ',' are used
     * as separators. The default list separator is ';'.
     * @param separator the separator
     */
    public void setListSeparator(byte separator) {
        try {
            DowncallHandles.g_key_file_set_list_separator.invokeExact(
                    handle(),
                    separator);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Associates a string value for {@code key} and {@code locale} under {@code group_name}.
     * If the translation for {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier
     * @param string a string
     */
    public void setLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_locale_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(locale, SCOPE),
                        Marshal.stringToAddress.marshal(string, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a list of string values for {@code key} and {@code locale} under
     * {@code group_name}.  If the translation for {@code key} cannot be found then
     * it is created.
     * @param groupName a group name
     * @param key a key
     * @param locale a locale identifier
     * @param list a {@code null}-terminated array of locale string values
     * @param length the length of {@code list}
     */
    public void setLocaleStringList(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String[] list, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_locale_string_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(locale, SCOPE),
                        Interop.allocateNativeArray(list, true, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a new string value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     * Unlike g_key_file_set_value(), this function handles characters
     * that need escaping, such as newlines.
     * @param groupName a group name
     * @param key a key
     * @param string a string
     */
    public void setString(java.lang.String groupName, java.lang.String key, java.lang.String string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_string.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(string, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a list of string values for {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param list an array of string values
     * @param length number of string values in {@code list}
     */
    public void setStringList(java.lang.String groupName, java.lang.String key, java.lang.String[] list, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_string_list.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Interop.allocateNativeArray(list, true, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * @param groupName a group name
     * @param key a key
     * @param value an integer value
     */
    public void setUint64(java.lang.String groupName, java.lang.String key, long value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_uint64.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        value);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Associates a new value with {@code key} under {@code group_name}.
     * <p>
     * If {@code key} cannot be found then it is created. If {@code group_name} cannot
     * be found then it is created. To set an UTF-8 string which may contain
     * characters that need escaping (such as newlines or spaces), use
     * g_key_file_set_string().
     * @param groupName a group name
     * @param key a key
     * @param value a string
     */
    public void setValue(java.lang.String groupName, java.lang.String key, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_key_file_set_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(groupName, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * This function outputs {@code key_file} as a string.
     * <p>
     * Note that this function never reports an error,
     * so it is safe to pass {@code null} as {@code error}.
     * @param length return location for the length of the
     *   returned string, or {@code null}
     * @return a newly allocated string holding
     *   the contents of the {@link KeyFile}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String toData(Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_key_file_to_data.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Decreases the reference count of {@code key_file} by 1. If the reference count
     * reaches zero, frees the key file and all its allocated memory.
     */
    public void unref() {
        try {
            DowncallHandles.g_key_file_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_key_file_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_key_file_new = Interop.downcallHandle(
                "g_key_file_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_free = Interop.downcallHandle(
                "g_key_file_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_boolean = Interop.downcallHandle(
                "g_key_file_get_boolean",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_boolean_list = Interop.downcallHandle(
                "g_key_file_get_boolean_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_comment = Interop.downcallHandle(
                "g_key_file_get_comment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_double = Interop.downcallHandle(
                "g_key_file_get_double",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_double_list = Interop.downcallHandle(
                "g_key_file_get_double_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_groups = Interop.downcallHandle(
                "g_key_file_get_groups",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_int64 = Interop.downcallHandle(
                "g_key_file_get_int64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_integer = Interop.downcallHandle(
                "g_key_file_get_integer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_integer_list = Interop.downcallHandle(
                "g_key_file_get_integer_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_keys = Interop.downcallHandle(
                "g_key_file_get_keys",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_locale_for_key = Interop.downcallHandle(
                "g_key_file_get_locale_for_key",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_locale_string = Interop.downcallHandle(
                "g_key_file_get_locale_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_locale_string_list = Interop.downcallHandle(
                "g_key_file_get_locale_string_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_start_group = Interop.downcallHandle(
                "g_key_file_get_start_group",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_string = Interop.downcallHandle(
                "g_key_file_get_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_string_list = Interop.downcallHandle(
                "g_key_file_get_string_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_uint64 = Interop.downcallHandle(
                "g_key_file_get_uint64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_get_value = Interop.downcallHandle(
                "g_key_file_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_has_group = Interop.downcallHandle(
                "g_key_file_has_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_has_key = Interop.downcallHandle(
                "g_key_file_has_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_load_from_bytes = Interop.downcallHandle(
                "g_key_file_load_from_bytes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_load_from_data = Interop.downcallHandle(
                "g_key_file_load_from_data",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_load_from_data_dirs = Interop.downcallHandle(
                "g_key_file_load_from_data_dirs",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_load_from_dirs = Interop.downcallHandle(
                "g_key_file_load_from_dirs",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_load_from_file = Interop.downcallHandle(
                "g_key_file_load_from_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_ref = Interop.downcallHandle(
                "g_key_file_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_remove_comment = Interop.downcallHandle(
                "g_key_file_remove_comment",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_remove_group = Interop.downcallHandle(
                "g_key_file_remove_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_remove_key = Interop.downcallHandle(
                "g_key_file_remove_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_save_to_file = Interop.downcallHandle(
                "g_key_file_save_to_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_set_boolean = Interop.downcallHandle(
                "g_key_file_set_boolean",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_key_file_set_boolean_list = Interop.downcallHandle(
                "g_key_file_set_boolean_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_comment = Interop.downcallHandle(
                "g_key_file_set_comment",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_set_double = Interop.downcallHandle(
                "g_key_file_set_double",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle g_key_file_set_double_list = Interop.downcallHandle(
                "g_key_file_set_double_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_int64 = Interop.downcallHandle(
                "g_key_file_set_int64",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_integer = Interop.downcallHandle(
                "g_key_file_set_integer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_key_file_set_integer_list = Interop.downcallHandle(
                "g_key_file_set_integer_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_list_separator = Interop.downcallHandle(
                "g_key_file_set_list_separator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle g_key_file_set_locale_string = Interop.downcallHandle(
                "g_key_file_set_locale_string",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_set_locale_string_list = Interop.downcallHandle(
                "g_key_file_set_locale_string_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_string = Interop.downcallHandle(
                "g_key_file_set_string",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_set_string_list = Interop.downcallHandle(
                "g_key_file_set_string_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_uint64 = Interop.downcallHandle(
                "g_key_file_set_uint64",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_key_file_set_value = Interop.downcallHandle(
                "g_key_file_set_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_to_data = Interop.downcallHandle(
                "g_key_file_to_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_unref = Interop.downcallHandle(
                "g_key_file_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_key_file_error_quark = Interop.downcallHandle(
                "g_key_file_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
