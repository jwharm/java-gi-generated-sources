package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
     * Creates a new empty #GKeyFile object. Use
     * g_key_file_load_from_file(), g_key_file_load_from_data(),
     * g_key_file_load_from_dirs() or g_key_file_load_from_data_dirs() to
     * read an existing key file.
     */
    public KeyFile() {
        super(constructNew());
    }
    
    /**
     * Clears all keys and groups from @key_file, and decreases the
     * reference count by 1. If the reference count reaches zero,
     * frees the key file and all its allocated memory.
     */
    public void free() {
        gtk_h.g_key_file_free(handle());
    }
    
    /**
     * Returns the value associated with @key under @group_name as a
     * boolean.
     * 
     * If @key cannot be found then <code>false</code> is returned and @error is set
     * to <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code> Likewise, if the value
     * associated with @key cannot be interpreted as a boolean then <code>FALSE
     * is</code> returned and @error is set to returned and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
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
     * Retrieves a comment above @key from @group_name.
     * If @key is <code>null</code> then @comment will be read from above
     * @group_name. If both @key and @group_name are <code>NULL,</code> then
     * @comment will be read from above the first group in the file.
     * 
     * Note that the returned string does not include the &#39;#&#39; comment markers,
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
     * Returns the value associated with @key under @group_name as a
     * double. If @group_name is <code>NULL,</code> the start_group is used.
     * 
     * If @key cannot be found then 0.0 is returned and @error is set to
     * <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code> Likewise, if the value associated
     * with @key cannot be interpreted as a double then 0.0 is returned
     * and @error is set to Likewise, if the value associated
     * with @key cannot be interpreted as a double then 0.0 is returned
     * and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
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
     * Returns the value associated with @key under @group_name as a signed
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
     * Returns the value associated with @key under @group_name as an
     * integer.
     * 
     * If @key cannot be found then 0 is returned and @error is set to
     * <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code> Likewise, if the value associated
     * with @key cannot be interpreted as an integer, or is out of range
     * for a #gint, then 0 is returned
     * and @error is set to Likewise, if the value associated
     * with @key cannot be interpreted as an integer, or is out of range
     * for a #gint, then 0 is returned
     * and @error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
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
     * 
     * If calling g_key_file_get_locale_string() or
     * g_key_file_get_locale_string_list() with exactly the same @key_file,
     * @group_name, @key and @locale, the result of those functions will
     * have originally been tagged with the locale that is the result of
     * this function.
     */
    public java.lang.String getLocaleForKey(java.lang.String groupName, java.lang.String key, java.lang.String locale) {
        var RESULT = gtk_h.g_key_file_get_locale_for_key(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the value associated with @key under @group_name
     * translated in the given @locale if available.  If @locale is
     * <code>null</code> then the current locale is assumed.
     * 
     * If @locale is to be non-<code>NULL,</code> or if the current locale will change over
     * the lifetime of the #GKeyFile, it must be loaded with
     * {@link org.gtk.glib.KeyFileFlags#KEEP_TRANSLATIONS} in order to load strings for all locales.
     * 
     * If @key cannot be found then <code>null</code> is returned and @error is set
     * to <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code> If the value associated
     * with @key cannot be interpreted or no suitable translation can
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
     * Returns the string value associated with @key under @group_name.
     * Unlike g_key_file_get_value(), this function handles escape sequences
     * like \\s.
     * 
     * In the event the key cannot be found, <code>null</code> is returned and
     * @error is set to <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code>  In the
     * event that the @group_name cannot be found, <code>null</code> is returned
     * and @error is set to is returned
     * and @error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
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
     * Returns the value associated with @key under @group_name as an unsigned
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
     * Returns the raw value associated with @key under @group_name.
     * Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * 
     * In the event the key cannot be found, <code>null</code> is returned and
     * @error is set to <code>G_KEY_FILE_ERROR_KEY_NOT_FOUND.</code>  In the
     * event that the @group_name cannot be found, <code>null</code> is returned
     * and @error is set to is returned
     * and @error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
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
     * Looks whether the key file has the group @group_name.
     */
    public boolean hasGroup(java.lang.String groupName) {
        var RESULT = gtk_h.g_key_file_has_group(handle(), Interop.allocateNativeString(groupName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Looks whether the key file has the key @key in the group
     * @group_name.
     * 
     * Note that this function does not follow the rules for #GError strictly;
     * the return value both carries meaning and signals an error.  To use
     * this function, you must pass a #GError pointer in @error, and check
     * whether it is not <code>null</code> to see if an error occurred.
     * 
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
     * Loads a key file from the data in @bytes into an empty #GKeyFile structure.
     * If the object cannot be created then <code>error</code> is set to a #GKeyFileError.
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
     * Loads a key file from memory into an empty #GKeyFile structure.
     * If the object cannot be created then <code>error</code> is set to a #GKeyFileError.
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
     * This function looks for a key file named @file in the paths
     * returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into @key_file and returns the file&#39;s full path in
     * @full_path.  If the file could not be loaded then an <code>error</code> is
     * set to either a #GFileError or #GKeyFileError.
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
     * This function looks for a key file named @file in the paths
     * specified in @search_dirs, loads the file into @key_file and
     * returns the file&#39;s full path in @full_path.
     * 
     * If the file could not be found in any of the @search_dirs,
     * {@link org.gtk.glib.KeyFileError#NOT_FOUND} is returned. If
     * the file is found but the OS returns an error when opening or reading the
     * file, a <code>G_FILE_ERROR</code> is returned. If there is a problem parsing the file, a
     * <code>G_KEY_FILE_ERROR</code> is returned.
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
     * Loads a key file into an empty #GKeyFile structure.
     * 
     * If the OS returns an error when opening or reading the file, a
     * <code>G_FILE_ERROR</code> is returned. If there is a problem parsing the file, a
     * <code>G_KEY_FILE_ERROR</code> is returned.
     * 
     * This function will never return a {@link org.gtk.glib.KeyFileError#NOT_FOUND} error. If the
     * @file is not found, {@link org.gtk.glib.FileError#NOENT} is returned.
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
     * Increases the reference count of @key_file.
     */
    public KeyFile ref() {
        var RESULT = gtk_h.g_key_file_ref(handle());
        return new KeyFile(References.get(RESULT, true));
    }
    
    /**
     * Removes a comment above @key from @group_name.
     * If @key is <code>null</code> then @comment will be removed above @group_name.
     * If both @key and @group_name are <code>NULL,</code> then @comment will
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
     * Removes the specified group, @group_name,
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
     * Removes @key in @group_name from the key file.
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
     * Writes the contents of @key_file to @filename using
     * g_file_set_contents(). If you need stricter guarantees about durability of
     * the written file than are provided by g_file_set_contents(), use
     * g_file_set_contents_full() with the return value of g_key_file_to_data().
     * 
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
     * Associates a new boolean value with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setBoolean(java.lang.String groupName, java.lang.String key, boolean value) {
        gtk_h.g_key_file_set_boolean(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value ? 1 : 0);
    }
    
    /**
     * Associates a list of boolean values with @key under @group_name.
     * If @key cannot be found then it is created.
     * If @group_name is <code>NULL,</code> the start_group is used.
     */
    public void setBooleanList(java.lang.String groupName, java.lang.String key, boolean[] list, long length) {
        gtk_h.g_key_file_set_boolean_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Places a comment above @key from @group_name.
     * 
     * If @key is <code>null</code> then @comment will be written above @group_name.
     * If both @key and @group_name  are <code>NULL,</code> then @comment will be
     * written above the first group in the file.
     * 
     * Note that this function prepends a &#39;#&#39; comment marker to
     * each line of @comment.
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
     * Associates a new double value with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setDouble(java.lang.String groupName, java.lang.String key, double value) {
        gtk_h.g_key_file_set_double(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a list of double values with @key under
     * @group_name.  If @key cannot be found then it is created.
     */
    public void setDoubleList(java.lang.String groupName, java.lang.String key, double[] list, long length) {
        gtk_h.g_key_file_set_double_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_DOUBLE, list)).handle(), length);
    }
    
    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setInt64(java.lang.String groupName, java.lang.String key, long value) {
        gtk_h.g_key_file_set_int64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setInteger(java.lang.String groupName, java.lang.String key, int value) {
        gtk_h.g_key_file_set_integer(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a list of integer values with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setIntegerList(java.lang.String groupName, java.lang.String key, int[] list, long length) {
        gtk_h.g_key_file_set_integer_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, list)).handle(), length);
    }
    
    /**
     * Sets the character which is used to separate
     * values in lists. Typically &#39;;&#39; or &#39;,&#39; are used
     * as separators. The default list separator is &#39;;&#39;.
     */
    public void setListSeparator(byte separator) {
        gtk_h.g_key_file_set_list_separator(handle(), separator);
    }
    
    /**
     * Associates a string value for @key and @locale under @group_name.
     * If the translation for @key cannot be found then it is created.
     */
    public void setLocaleString(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String string) {
        gtk_h.g_key_file_set_locale_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Associates a list of string values for @key and @locale under
     * @group_name.  If the translation for @key cannot be found then
     * it is created.
     */
    public void setLocaleStringList(java.lang.String groupName, java.lang.String key, java.lang.String locale, java.lang.String[] list, long length) {
        gtk_h.g_key_file_set_locale_string_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(locale).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Associates a new string value with @key under @group_name.
     * If @key cannot be found then it is created.
     * If @group_name cannot be found then it is created.
     * Unlike g_key_file_set_value(), this function handles characters
     * that need escaping, such as newlines.
     */
    public void setString(java.lang.String groupName, java.lang.String key, java.lang.String string) {
        gtk_h.g_key_file_set_string(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(string).handle());
    }
    
    /**
     * Associates a list of string values for @key under @group_name.
     * If @key cannot be found then it is created.
     * If @group_name cannot be found then it is created.
     */
    public void setStringList(java.lang.String groupName, java.lang.String key, java.lang.String[] list, long length) {
        gtk_h.g_key_file_set_string_list(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeArray(list).handle(), length);
    }
    
    /**
     * Associates a new integer value with @key under @group_name.
     * If @key cannot be found then it is created.
     */
    public void setUint64(java.lang.String groupName, java.lang.String key, long value) {
        gtk_h.g_key_file_set_uint64(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), value);
    }
    
    /**
     * Associates a new value with @key under @group_name.
     * 
     * If @key cannot be found then it is created. If @group_name cannot
     * be found then it is created. To set an UTF-8 string which may contain
     * characters that need escaping (such as newlines or spaces), use
     * g_key_file_set_string().
     */
    public void setValue(java.lang.String groupName, java.lang.String key, java.lang.String value) {
        gtk_h.g_key_file_set_value(handle(), Interop.allocateNativeString(groupName).handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Decreases the reference count of @key_file by 1. If the reference count
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
