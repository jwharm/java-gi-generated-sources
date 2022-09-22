package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The GKeyFile struct contains only private data
 * and should not be accessed directly.
 */
public class KeyFile extends io.github.jwharm.javagi.ResourceBase {

    public KeyFile(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_key_file_new(), true);
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
    }
    
    /**
     * Clears all keys and groups from {@code key_file}, and decreases the
     * reference count by 1. If the reference count reaches zero,
     * frees the key file and all its allocated memory.
     */
    public void free() {
        gtk_h.g_key_file_free(handle());
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * boolean.
     * <p>
     * If {@code key} cannot be found then <code>false</code> is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value
     * associated with {@code key} cannot be interpreted as a boolean then <code>false</code>
     * is returned and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public boolean getBoolean(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_boolean(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Retrieves a comment above {@code key} from {@code group_name}.
     * If {@code key} is <code>null</code> then {@code comment} will be read from above
     * {@code group_name}. If both {@code key} and {@code group_name} are <code>null</code>, then
     * {@code comment} will be read from above the first group in the file.
     * <p>
     * Note that the returned string does not include the '#' comment markers,
     * but does include any whitespace after them (on each line). It includes
     * the line breaks between lines, but does not include the final line break.
     */
    public java.lang.String getComment(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_comment(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a
     * double. If {@code group_name} is <code>null</code>, the start_group is used.
     * <p>
     * If {@code key} cannot be found then 0.0 is returned and {@code error} is set to
     * {@link KeyFileError#KEY_NOT_FOUND}. Likewise, if the value associated
     * with {@code key} cannot be interpreted as a double then 0.0 is returned
     * and {@code error} is set to {@link KeyFileError#INVALID_VALUE}.
     */
    public double getDouble(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_double(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as a signed
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * 64-bit results without truncation.
     */
    public long getInt64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_int64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public int getInteger(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_integer(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public java.lang.String getLocaleForKey(java.lang.String groupName, java.lang.String key, java.lang.String locale) {
        var RESULT = gtk_h.g_key_file_get_locale_for_key(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name}
     * translated in the given {@code locale} if available.  If {@code locale} is
     * <code>null</code> then the current locale is assumed.
     * <p>
     * If {@code locale} is to be non-<code>null</code>, or if the current locale will change over
     * the lifetime of the {@link KeyFile}, it must be loaded with
     * {@link KeyFileFlags#KEEP_TRANSLATIONS} in order to load strings for all locales.
     * <p>
     * If {@code key} cannot be found then <code>null</code> is returned and {@code error} is set
     * to {@link KeyFileError#KEY_NOT_FOUND}. If the value associated
     * with {@code key} cannot be interpreted or no suitable translation can
     * be found then the untranslated value is returned.
     */
    public java.lang.String getLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_locale_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the name of the start group of the file.
     */
    public java.lang.String getStartGroup() {
        var RESULT = gtk_h.g_key_file_get_start_group(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the string value associated with {@code key} under {@code group_name}.
     * Unlike g_key_file_get_value(), this function handles escape sequences
     * like \\s.
     * <p>
     * In the event the key cannot be found, <code>null</code> is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, <code>null</code> is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public java.lang.String getString(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value associated with {@code key} under {@code group_name} as an unsigned
     * 64-bit integer. This is similar to g_key_file_get_integer() but can return
     * large positive results without truncation.
     */
    public long getUint64(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_uint64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Returns the raw value associated with {@code key} under {@code group_name}.
     * Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * <p>
     * In the event the key cannot be found, <code>null</code> is returned and
     * {@code error} is set to {@link KeyFileError#KEY_NOT_FOUND}.  In the
     * event that the {@code group_name} cannot be found, <code>null</code> is returned
     * and {@code error} is set to {@link KeyFileError#GROUP_NOT_FOUND}.
     */
    public java.lang.String getValue(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_get_value(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Looks whether the key file has the group {@code group_name}.
     */
    public boolean hasGroup(java.lang.String groupName) {
        var RESULT = gtk_h.g_key_file_has_group(handle(), Interop.allocateNativeString(groupName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks whether the key file has the key {@code key} in the group
     * {@code group_name}.
     * <p>
     * Note that this function does not follow the rules for {@link Error} strictly;
     * the return value both carries meaning and signals an error.  To use
     * this function, you must pass a {@link Error} pointer in {@code error}, and check
     * whether it is not <code>null</code> to see if an error occurred.
     * <p>
     * Language bindings should use g_key_file_get_value() to test whether
     * or not a key exists.
     */
    public boolean hasKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_has_key(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Loads a key file from the data in {@code bytes} into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     */
    public boolean loadFromBytes(Bytes bytes, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_load_from_bytes(handle(), bytes.handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Loads a key file from memory into an empty {@link KeyFile} structure.
     * If the object cannot be created then {@code error} is set to a {@link KeyFileError}.
     */
    public boolean loadFromData(java.lang.String data, long length, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_load_from_data(handle(), Interop.allocateNativeString(data).handle(), length, flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * This function looks for a key file named {@code file} in the paths
     * returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into {@code key_file} and returns the file's full path in
     * {@code full_path}.  If the file could not be loaded then an {@code error} is
     * set to either a {@link FileError} or {@link KeyFileError}.
     */
    public boolean loadFromDataDirs(java.lang.String file, java.lang.String[] fullPath, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_load_from_data_dirs(handle(), Interop.allocateNativeString(file).handle(), Interop.allocateNativeArray(fullPath).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
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
     */
    public boolean loadFromDirs(java.lang.String file, java.lang.String[] searchDirs, java.lang.String[] fullPath, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_load_from_dirs(handle(), Interop.allocateNativeString(file).handle(), Interop.allocateNativeArray(searchDirs).handle(), Interop.allocateNativeArray(fullPath).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
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
     */
    public boolean loadFromFile(java.lang.String file, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_load_from_file(handle(), Interop.allocateNativeString(file).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count of {@code key_file}.
     */
    public KeyFile ref() {
        var RESULT = gtk_h.g_key_file_ref(handle());
        return new KeyFile(References.get(RESULT, true));
    }
    
    /**
     * Removes a comment above {@code key} from {@code group_name}.
     * If {@code key} is <code>null</code> then {@code comment} will be removed above {@code group_name}.
     * If both {@code key} and {@code group_name} are <code>null</code>, then {@code comment} will
     * be removed above the first group in the file.
     */
    public boolean removeComment(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_remove_comment(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes the specified group, {@code group_name},
     * from the key file.
     */
    public boolean removeGroup(java.lang.String groupName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_remove_group(handle(), Interop.allocateNativeString(groupName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes {@code key} in {@code group_name} from the key file.
     */
    public boolean removeKey(java.lang.String groupName, java.lang.String key) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_remove_key(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
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
        var RESULT = gtk_h.g_key_file_save_to_file(handle(), Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Associates a new boolean value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setBoolean(java.lang.String groupName, java.lang.String key, boolean value) {
        gtk_h.g_key_file_set_boolean(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
    }
    
    /**
     * Associates a list of boolean values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} is <code>null</code>, the start_group is used.
     */
    public void setBooleanList(java.lang.String groupName, java.lang.String key, boolean[] list, long length) {
        gtk_h.g_key_file_set_boolean_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Places a comment above {@code key} from {@code group_name}.
     * <p>
     * If {@code key} is <code>null</code> then {@code comment} will be written above {@code group_name}.
     * If both {@code key} and {@code group_name}  are <code>null</code>, then {@code comment} will be
     * written above the first group in the file.
     * <p>
     * Note that this function prepends a '#' comment marker to
     * each line of {@code comment}.
     */
    public boolean setComment(java.lang.String groupName, java.lang.String key, java.lang.String comment) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_key_file_set_comment(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(comment).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Associates a new double value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setDouble(java.lang.String groupName, java.lang.String key, double value) {
        gtk_h.g_key_file_set_double(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a list of double values with {@code key} under
     * {@code group_name}.  If {@code key} cannot be found then it is created.
     */
    public void setDoubleList(java.lang.String groupName, java.lang.String key, double[] list, long length) {
        gtk_h.g_key_file_set_double_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_DOUBLE, list)).handle(), length);
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setInt64(java.lang.String groupName, java.lang.String key, long value) {
        gtk_h.g_key_file_set_int64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setInteger(java.lang.String groupName, java.lang.String key, int value) {
        gtk_h.g_key_file_set_integer(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a list of integer values with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setIntegerList(java.lang.String groupName, java.lang.String key, int[] list, long length) {
        gtk_h.g_key_file_set_integer_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, list)).handle(), length);
    }
    
    /**
     * Sets the character which is used to separate
     * values in lists. Typically ';' or ',' are used
     * as separators. The default list separator is ';'.
     */
    public void setListSeparator(byte separator) {
        gtk_h.g_key_file_set_list_separator(handle(), separator);
    }
    
    /**
     * Associates a string value for {@code key} and {@code locale} under {@code group_name}.
     * If the translation for {@code key} cannot be found then it is created.
     */
    public void setLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String string) {
        gtk_h.g_key_file_set_locale_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Associates a list of string values for {@code key} and {@code locale} under
     * {@code group_name}.  If the translation for {@code key} cannot be found then
     * it is created.
     */
    public void setLocaleStringList(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String[] list, long length) {
        gtk_h.g_key_file_set_locale_string_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Associates a new string value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     * Unlike g_key_file_set_value(), this function handles characters
     * that need escaping, such as newlines.
     */
    public void setString(java.lang.String groupName, java.lang.String key, java.lang.String string) {
        gtk_h.g_key_file_set_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Associates a list of string values for {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     * If {@code group_name} cannot be found then it is created.
     */
    public void setStringList(java.lang.String groupName, java.lang.String key, java.lang.String[] list, long length) {
        gtk_h.g_key_file_set_string_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Associates a new integer value with {@code key} under {@code group_name}.
     * If {@code key} cannot be found then it is created.
     */
    public void setUint64(java.lang.String groupName, java.lang.String key, long value) {
        gtk_h.g_key_file_set_uint64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a new value with {@code key} under {@code group_name}.
     * <p>
     * If {@code key} cannot be found then it is created. If {@code group_name} cannot
     * be found then it is created. To set an UTF-8 string which may contain
     * characters that need escaping (such as newlines or spaces), use
     * g_key_file_set_string().
     */
    public void setValue(java.lang.String groupName, java.lang.String key, java.lang.String value) {
        gtk_h.g_key_file_set_value(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Decreases the reference count of {@code key_file} by 1. If the reference count
     * reaches zero, frees the key file and all its allocated memory.
     */
    public void unref() {
        gtk_h.g_key_file_unref(handle());
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_key_file_error_quark();
        return new Quark(RESULT);
    }
    
}
