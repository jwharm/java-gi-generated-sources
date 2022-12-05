package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Uri} object can be used to parse and split a URI string into its
 * constituent parts. Two {@link Uri} objects can be joined to make a new {@link Uri}
 * using the algorithm described in RFC3986.
 */
public class Uri extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstUri";
    
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
     * Allocate a new {@link Uri}
     * @return A new, uninitialized @{link Uri}
     */
    public static Uri allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Uri newInstance = new Uri(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Uri proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Uri(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@Nullable java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, @Nullable java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_new.invokeExact(
                    (Addressable) (scheme == null ? MemoryAddress.NULL : Interop.allocateNativeString(scheme)),
                    (Addressable) (userinfo == null ? MemoryAddress.NULL : Interop.allocateNativeString(userinfo)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Interop.allocateNativeString(host)),
                    port,
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeString(path)),
                    (Addressable) (query == null ? MemoryAddress.NULL : Interop.allocateNativeString(query)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Interop.allocateNativeString(fragment)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Uri} object with the given URI parts. The path and query
     * strings will be broken down into their elements. All strings should not be
     * escaped except where indicated.
     * @param scheme The scheme for the new URI.
     * @param userinfo The user-info for the new URI.
     * @param host The host name for the new URI.
     * @param port The port number for the new URI or {@code GST_URI_NO_PORT}.
     * @param path The path for the new URI with '/' separating path
     *                      elements.
     * @param query The query string for the new URI with '&amp;' separating
     *                       query elements. Elements containing '&amp;' characters
     *                       should encode them as "&amp;percnt;26".
     * @param fragment The fragment name for the new URI.
     */
    public Uri(@Nullable java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, @Nullable java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        super(constructNew(scheme, userinfo, host, port, path, query, fragment), Ownership.FULL);
    }
    
    /**
     * Append a path onto the end of the path in the URI. The path is not
     * normalized, call {@code gst_uri_normalize}() to normalize the path.
     * @param relativePath Relative path to append to the end of the current path.
     * @return {@code true} if the path was appended successfully.
     */
    public boolean appendPath(@NotNull java.lang.String relativePath) {
        java.util.Objects.requireNonNull(relativePath, "Parameter 'relativePath' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_append_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(relativePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Append a single path segment onto the end of the URI path.
     * @param pathSegment The path segment string to append to the URI path.
     * @return {@code true} if the path was appended successfully.
     */
    public boolean appendPathSegment(@NotNull java.lang.String pathSegment) {
        java.util.Objects.requireNonNull(pathSegment, "Parameter 'pathSegment' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_append_path_segment.invokeExact(
                    handle(),
                    Interop.allocateNativeString(pathSegment));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Compares two {@link Uri} objects to see if they represent the same normalized
     * URI.
     * @param second Second {@link Uri} to compare.
     * @return {@code true} if the normalized versions of the two URI's would be equal.
     */
    public boolean equal(@NotNull org.gstreamer.gst.Uri second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_equal.invokeExact(
                    handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Like gst_uri_from_string() but also joins with a base URI.
     * @param uri The URI string to parse.
     * @return A new {@link Uri} object.
     */
    public @NotNull org.gstreamer.gst.Uri fromStringWithBase(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_from_string_with_base.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the fragment name from the URI or {@code null} if it doesn't exist.
     * If {@code uri} is {@code null} then returns {@code null}.
     * @return The host name from the {@link Uri} object or {@code null}.
     */
    public @Nullable java.lang.String getFragment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_fragment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the host name from the URI or {@code null} if it doesn't exist.
     * If {@code uri} is {@code null} then returns {@code null}.
     * @return The host name from the {@link Uri} object or {@code null}.
     */
    public @Nullable java.lang.String getHost() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_host.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the media fragment table from the URI, as defined by "Media Fragments URI 1.0".
     * Hash table returned by this API is a list of "key-value" pairs, and the each
     * pair is generated by splitting "URI fragment" per "&amp;" sub-delims, then "key"
     * and "value" are split by "=" sub-delims. The "key" returned by this API may
     * be undefined keyword by standard.
     * A value may be {@code null} to indicate that the key should appear in the fragment
     * string in the URI, but does not have a value. Free the returned {@link org.gtk.glib.HashTable}
     * with {@code g_hash_table_unref}() when it is no longer required.
     * Modifying this hash table does not affect the fragment in the URI.
     * <p>
     * See more about Media Fragments URI 1.0 (W3C) at https://www.w3.org/TR/media-frags/
     * @return The
     *          fragment hash table from the URI.
     */
    public @Nullable org.gtk.glib.HashTable getMediaFragmentTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_media_fragment_table.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.HashTable(RESULT, Ownership.FULL);
    }
    
    /**
     * Extract the path string from the URI object.
     * @return The path from the URI. Once finished
     *                                      with the string should be g_free()'d.
     */
    public @Nullable java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get a list of path segments from the URI.
     * @return A {@link org.gtk.glib.List} of path segment
     *          strings or {@code null} if no path segments are available. Free the list
     *          when no longer needed with g_list_free_full(list, g_free).
     */
    public @NotNull org.gtk.glib.List getPathSegments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_path_segments.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Extract the path string from the URI object as a percent encoded URI path.
     * @return The path from the URI. Once finished
     *                                      with the string should be g_free()'d.
     */
    public @Nullable java.lang.String getPathString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_path_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the port number from the URI or {@code GST_URI_NO_PORT} if it doesn't exist.
     * If {@code uri} is {@code null} then returns {@code GST_URI_NO_PORT}.
     * @return The port number from the {@link Uri} object or {@code GST_URI_NO_PORT}.
     */
    public int getPort() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_get_port.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get a list of the query keys from the URI.
     * @return A list of keys from
     *          the URI query. Free the list with g_list_free().
     */
    public @NotNull org.gtk.glib.List getQueryKeys() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_query_keys.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Get a percent encoded URI query string from the {@code uri}.
     * @return A percent encoded query string. Use
     *                                      g_free() when no longer needed.
     */
    public @Nullable java.lang.String getQueryString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_query_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the query table from the URI. Keys and values in the table are freed
     * with g_free when they are deleted. A value may be {@code null} to indicate that
     * the key should appear in the query string in the URI, but does not have a
     * value. Free the returned {@link org.gtk.glib.HashTable} with {@code g_hash_table_unref}() when it is
     * no longer required. Modifying this hash table will modify the query in the
     * URI.
     * @return The query
     *          hash table from the URI.
     */
    public @Nullable org.gtk.glib.HashTable getQueryTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_query_table.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.HashTable(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the value associated with the {@code query_key} key. Will return {@code null} if the
     * key has no value or if the key does not exist in the URI query table. Because
     * {@code null} is returned for both missing keys and keys with no value, you should
     * use gst_uri_query_has_key() to determine if a key is present in the URI
     * query.
     * @param queryKey The key to lookup.
     * @return The value for the given key, or {@code null} if not found.
     */
    public @Nullable java.lang.String getQueryValue(@NotNull java.lang.String queryKey) {
        java.util.Objects.requireNonNull(queryKey, "Parameter 'queryKey' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_query_value.invokeExact(
                    handle(),
                    Interop.allocateNativeString(queryKey));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the scheme name from the URI or {@code null} if it doesn't exist.
     * If {@code uri} is {@code null} then returns {@code null}.
     * @return The scheme from the {@link Uri} object or {@code null}.
     */
    public @Nullable java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_scheme.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the userinfo (usually in the form "username:password") from the URI
     * or {@code null} if it doesn't exist. If {@code uri} is {@code null} then returns {@code null}.
     * @return The userinfo from the {@link Uri} object or {@code null}.
     */
    public @Nullable java.lang.String getUserinfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_userinfo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Tests the {@code uri} to see if it is normalized. A {@code null} {@code uri} is considered to be
     * normalized.
     * @return TRUE if the URI is normalized or is {@code null}.
     */
    public boolean isNormalized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_is_normalized.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if it is safe to write to this {@link Uri}.
     * <p>
     * Check if the refcount of {@code uri} is exactly 1, meaning that no other
     * reference exists to the {@link Uri} and that the {@link Uri} is therefore writable.
     * <p>
     * Modification of a {@link Uri} should only be done after verifying that it is
     * writable.
     * @return {@code true} if it is safe to write to the object.
     */
    public boolean isWritable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_is_writable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Join a reference URI onto a base URI using the method from RFC 3986.
     * If either URI is {@code null} then the other URI will be returned with the ref count
     * increased.
     * @param refUri The reference URI to join onto the
     *                                       base URI.
     * @return A {@link Uri} which represents the base
     *                                      with the reference URI joined on.
     */
    public @Nullable org.gstreamer.gst.Uri join(@Nullable org.gstreamer.gst.Uri refUri) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_join.invokeExact(
                    handle(),
                    (Addressable) (refUri == null ? MemoryAddress.NULL : refUri.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Make the {@link Uri} writable.
     * <p>
     * Checks if {@code uri} is writable, and if so the original object is returned. If
     * not, then a writable copy is made and returned. This gives away the
     * reference to {@code uri} and returns a reference to the new {@link Uri}.
     * If {@code uri} is {@code null} then {@code null} is returned.
     * @return A writable version of {@code uri}.
     */
    public @NotNull org.gstreamer.gst.Uri makeWritable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_make_writable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Like gst_uri_new(), but joins the new URI onto a base URI.
     * @param scheme The scheme for the new URI.
     * @param userinfo The user-info for the new URI.
     * @param host The host name for the new URI.
     * @param port The port number for the new URI or {@code GST_URI_NO_PORT}.
     * @param path The path for the new URI with '/' separating path
     *                      elements.
     * @param query The query string for the new URI with '&amp;' separating
     *                       query elements. Elements containing '&amp;' characters
     *                       should encode them as "&amp;percnt;26".
     * @param fragment The fragment name for the new URI.
     * @return The new URI joined onto {@code base}.
     */
    public @NotNull org.gstreamer.gst.Uri newWithBase(@Nullable java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, @Nullable java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_new_with_base.invokeExact(
                    handle(),
                    (Addressable) (scheme == null ? MemoryAddress.NULL : Interop.allocateNativeString(scheme)),
                    (Addressable) (userinfo == null ? MemoryAddress.NULL : Interop.allocateNativeString(userinfo)),
                    (Addressable) (host == null ? MemoryAddress.NULL : Interop.allocateNativeString(host)),
                    port,
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeString(path)),
                    (Addressable) (query == null ? MemoryAddress.NULL : Interop.allocateNativeString(query)),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Interop.allocateNativeString(fragment)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Normalization will remove extra path segments ("." and "..") from the URI. It
     * will also convert the scheme and host name to lower case and any
     * percent-encoded values to uppercase.
     * <p>
     * The {@link Uri} object must be writable. Check with gst_uri_is_writable() or use
     * gst_uri_make_writable() first.
     * @return TRUE if the URI was modified.
     */
    public boolean normalize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_normalize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if there is a query table entry for the {@code query_key} key.
     * @param queryKey The key to lookup.
     * @return {@code true} if {@code query_key} exists in the URI query table.
     */
    public boolean queryHasKey(@NotNull java.lang.String queryKey) {
        java.util.Objects.requireNonNull(queryKey, "Parameter 'queryKey' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_query_has_key.invokeExact(
                    handle(),
                    Interop.allocateNativeString(queryKey));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Remove an entry from the query table by key.
     * @param queryKey The key to remove.
     * @return {@code true} if the key existed in the table and was removed.
     */
    public boolean removeQueryKey(@NotNull java.lang.String queryKey) {
        java.util.Objects.requireNonNull(queryKey, "Parameter 'queryKey' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_remove_query_key.invokeExact(
                    handle(),
                    Interop.allocateNativeString(queryKey));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the fragment string in the URI. Use a value of {@code null} in {@code fragment} to
     * unset the fragment string.
     * @param fragment The fragment string to set.
     * @return {@code true} if the fragment was set/unset successfully.
     */
    public boolean setFragment(@Nullable java.lang.String fragment) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_fragment.invokeExact(
                    handle(),
                    (Addressable) (fragment == null ? MemoryAddress.NULL : Interop.allocateNativeString(fragment)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set or unset the host for the URI.
     * @param host The new host string to set or {@code null} to unset.
     * @return {@code true} if the host was set/unset successfully.
     */
    public boolean setHost(@NotNull java.lang.String host) {
        java.util.Objects.requireNonNull(host, "Parameter 'host' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_host.invokeExact(
                    handle(),
                    Interop.allocateNativeString(host));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets or unsets the path in the URI.
     * @param path The new path to set with path segments separated by '/', or use {@code null}
     *        to unset the path.
     * @return {@code true} if the path was set successfully.
     */
    public boolean setPath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Replace the path segments list in the URI.
     * @param pathSegments The new
     *                 path list to set.
     * @return {@code true} if the path segments were set successfully.
     */
    public boolean setPathSegments(@Nullable org.gtk.glib.List pathSegments) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_path_segments.invokeExact(
                    handle(),
                    (Addressable) (pathSegments == null ? MemoryAddress.NULL : pathSegments.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pathSegments.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Sets or unsets the path in the URI.
     * @param path The new percent encoded path to set with path segments separated by
     * '/', or use {@code null} to unset the path.
     * @return {@code true} if the path was set successfully.
     */
    public boolean setPathString(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_path_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set or unset the port number for the URI.
     * @param port The new port number to set or {@code GST_URI_NO_PORT} to unset.
     * @return {@code true} if the port number was set/unset successfully.
     */
    public boolean setPort(int port) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_port.invokeExact(
                    handle(),
                    port);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets or unsets the query table in the URI.
     * @param query The new percent encoded query string to use to populate the query
     *        table, or use {@code null} to unset the query table.
     * @return {@code true} if the query table was set successfully.
     */
    public boolean setQueryString(@NotNull java.lang.String query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_query_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(query));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the query table to use in the URI. The old table is unreferenced and a
     * reference to the new one is used instead. A value if {@code null} for {@code query_table}
     * will remove the query string from the URI.
     * @param queryTable The new
     *               query table to use.
     * @return {@code true} if the new table was successfully used for the query table.
     */
    public boolean setQueryTable(@Nullable org.gtk.glib.HashTable queryTable) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_query_table.invokeExact(
                    handle(),
                    (Addressable) (queryTable == null ? MemoryAddress.NULL : queryTable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This inserts or replaces a key in the query table. A {@code query_value} of {@code null}
     * indicates that the key has no associated value, but will still be present in
     * the query string.
     * @param queryKey The key for the query entry.
     * @param queryValue The value for the key.
     * @return {@code true} if the query table was successfully updated.
     */
    public boolean setQueryValue(@NotNull java.lang.String queryKey, @Nullable java.lang.String queryValue) {
        java.util.Objects.requireNonNull(queryKey, "Parameter 'queryKey' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_query_value.invokeExact(
                    handle(),
                    Interop.allocateNativeString(queryKey),
                    (Addressable) (queryValue == null ? MemoryAddress.NULL : Interop.allocateNativeString(queryValue)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set or unset the scheme for the URI.
     * @param scheme The new scheme to set or {@code null} to unset the scheme.
     * @return {@code true} if the scheme was set/unset successfully.
     */
    public boolean setScheme(@NotNull java.lang.String scheme) {
        java.util.Objects.requireNonNull(scheme, "Parameter 'scheme' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_scheme.invokeExact(
                    handle(),
                    Interop.allocateNativeString(scheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set or unset the user information for the URI.
     * @param userinfo The new user-information string to set or {@code null} to unset.
     * @return {@code true} if the user information was set/unset successfully.
     */
    public boolean setUserinfo(@NotNull java.lang.String userinfo) {
        java.util.Objects.requireNonNull(userinfo, "Parameter 'userinfo' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_set_userinfo.invokeExact(
                    handle(),
                    Interop.allocateNativeString(userinfo));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert the URI to a string.
     * <p>
     * Returns the URI as held in this object as a {@code gchar}* nul-terminated string.
     * The caller should g_free() the string once they are finished with it.
     * The string is put together as described in RFC 3986.
     * @return The string version of the URI.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Constructs a URI for a given valid protocol and location.
     * <p>
     * Free-function: g_free
     * @param protocol Protocol for URI
     * @param location Location for URI
     * @return a new string for this URI. Returns {@code null} if the
     *     given URI protocol is not valid, or the given location is {@code null}.
     * @deprecated Use GstURI instead.
     */
    @Deprecated
    public static @NotNull java.lang.String construct(@NotNull java.lang.String protocol, @NotNull java.lang.String location) {
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_construct.invokeExact(
                    Interop.allocateNativeString(protocol),
                    Interop.allocateNativeString(location));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Parses a URI string into a new {@link Uri} object. Will return NULL if the URI
     * cannot be parsed.
     * @param uri The URI string to parse.
     * @return A new {@link Uri} object, or NULL.
     */
    public static @Nullable org.gstreamer.gst.Uri fromString(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_from_string.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Parses a URI string into a new {@link Uri} object. Will return NULL if the URI
     * cannot be parsed. This is identical to gst_uri_from_string() except that
     * the userinfo and fragment components of the URI will not be unescaped while
     * parsing.
     * <p>
     * Use this when you need to extract a username and password from the userinfo
     * such as https://user:password{@code example}.com since either may contain
     * a URI-escaped ':' character. gst_uri_from_string() will unescape the entire
     * userinfo component, which will make it impossible to know which ':'
     * delineates the username and password.
     * <p>
     * The same applies to the fragment component of the URI, such as
     * https://example.com/path{@code fragment} which may contain a URI-escaped '{@code '}.
     * @param uri The URI string to parse.
     * @return A new {@link Uri} object, or NULL.
     */
    public static @Nullable org.gstreamer.gst.Uri fromStringEscaped(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_from_string_escaped.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Uri(RESULT, Ownership.FULL);
    }
    
    /**
     * Extracts the location out of a given valid URI, ie. the protocol and "://"
     * are stripped from the URI, which means that the location returned includes
     * the hostname if one is specified. The returned string must be freed using
     * g_free().
     * <p>
     * Free-function: g_free
     * @param uri A URI string
     * @return the location for this URI. Returns
     *     {@code null} if the URI isn't valid. If the URI does not contain a location, an
     *     empty string is returned.
     */
    public static @Nullable java.lang.String getLocation(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_location.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Extracts the protocol out of a given valid URI. The returned string must be
     * freed using g_free().
     * @param uri A URI string
     * @return The protocol for this URI.
     */
    public static @Nullable java.lang.String getProtocol(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_get_protocol.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if the protocol of a given valid URI matches {@code protocol}.
     * @param uri a URI string
     * @param protocol a protocol string (e.g. "http")
     * @return {@code true} if the protocol matches.
     */
    public static boolean hasProtocol(@NotNull java.lang.String uri, @NotNull java.lang.String protocol) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_has_protocol.invokeExact(
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests if the given string is a valid URI identifier. URIs start with a valid
     * scheme followed by ":" and maybe a string identifying the location.
     * @param uri A URI string
     * @return {@code true} if the string is a valid URI
     */
    public static boolean isValid(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_is_valid.invokeExact(
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This is a convenience function to join two URI strings and return the result.
     * The returned string should be g_free()'d after use.
     * @param baseUri The percent-encoded base URI.
     * @param refUri The percent-encoded reference URI to join to the {@code base_uri}.
     * @return A string representing the percent-encoded join of
     *          the two URIs.
     */
    public static @NotNull java.lang.String joinStrings(@NotNull java.lang.String baseUri, @NotNull java.lang.String refUri) {
        java.util.Objects.requireNonNull(baseUri, "Parameter 'baseUri' must not be null");
        java.util.Objects.requireNonNull(refUri, "Parameter 'refUri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_uri_join_strings.invokeExact(
                    Interop.allocateNativeString(baseUri),
                    Interop.allocateNativeString(refUri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks if an element exists that supports the given URI protocol. Note
     * that a positive return value does not imply that a subsequent call to
     * gst_element_make_from_uri() is guaranteed to work.
     * @param type Whether to check for a source or a sink
     * @param protocol Protocol that should be checked for (e.g. "http" or "smb")
     * @return {@code true}
     */
    public static boolean protocolIsSupported(@NotNull org.gstreamer.gst.URIType type, @NotNull java.lang.String protocol) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_protocol_is_supported.invokeExact(
                    type.getValue(),
                    Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests if the given string is a valid protocol identifier. Protocols
     * must consist of alphanumeric characters, '+', '-' and '.' and must
     * start with a alphabetic character. See RFC 3986 Section 3.1.
     * @param protocol A string
     * @return {@code true} if the string is a valid protocol identifier, {@code false} otherwise.
     */
    public static boolean protocolIsValid(@NotNull java.lang.String protocol) {
        java.util.Objects.requireNonNull(protocol, "Parameter 'protocol' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_protocol_is_valid.invokeExact(
                    Interop.allocateNativeString(protocol));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_uri_new = Interop.downcallHandle(
            "gst_uri_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_append_path = Interop.downcallHandle(
            "gst_uri_append_path",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_append_path_segment = Interop.downcallHandle(
            "gst_uri_append_path_segment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_equal = Interop.downcallHandle(
            "gst_uri_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_from_string_with_base = Interop.downcallHandle(
            "gst_uri_from_string_with_base",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_fragment = Interop.downcallHandle(
            "gst_uri_get_fragment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_host = Interop.downcallHandle(
            "gst_uri_get_host",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_media_fragment_table = Interop.downcallHandle(
            "gst_uri_get_media_fragment_table",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_path = Interop.downcallHandle(
            "gst_uri_get_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_path_segments = Interop.downcallHandle(
            "gst_uri_get_path_segments",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_path_string = Interop.downcallHandle(
            "gst_uri_get_path_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_port = Interop.downcallHandle(
            "gst_uri_get_port",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_query_keys = Interop.downcallHandle(
            "gst_uri_get_query_keys",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_query_string = Interop.downcallHandle(
            "gst_uri_get_query_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_query_table = Interop.downcallHandle(
            "gst_uri_get_query_table",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_query_value = Interop.downcallHandle(
            "gst_uri_get_query_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_scheme = Interop.downcallHandle(
            "gst_uri_get_scheme",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_userinfo = Interop.downcallHandle(
            "gst_uri_get_userinfo",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_is_normalized = Interop.downcallHandle(
            "gst_uri_is_normalized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_is_writable = Interop.downcallHandle(
            "gst_uri_is_writable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_join = Interop.downcallHandle(
            "gst_uri_join",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_make_writable = Interop.downcallHandle(
            "gst_uri_make_writable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_new_with_base = Interop.downcallHandle(
            "gst_uri_new_with_base",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_normalize = Interop.downcallHandle(
            "gst_uri_normalize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_query_has_key = Interop.downcallHandle(
            "gst_uri_query_has_key",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_remove_query_key = Interop.downcallHandle(
            "gst_uri_remove_query_key",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_fragment = Interop.downcallHandle(
            "gst_uri_set_fragment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_host = Interop.downcallHandle(
            "gst_uri_set_host",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_path = Interop.downcallHandle(
            "gst_uri_set_path",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_path_segments = Interop.downcallHandle(
            "gst_uri_set_path_segments",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_path_string = Interop.downcallHandle(
            "gst_uri_set_path_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_port = Interop.downcallHandle(
            "gst_uri_set_port",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_uri_set_query_string = Interop.downcallHandle(
            "gst_uri_set_query_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_query_table = Interop.downcallHandle(
            "gst_uri_set_query_table",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_query_value = Interop.downcallHandle(
            "gst_uri_set_query_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_scheme = Interop.downcallHandle(
            "gst_uri_set_scheme",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_set_userinfo = Interop.downcallHandle(
            "gst_uri_set_userinfo",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_to_string = Interop.downcallHandle(
            "gst_uri_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_construct = Interop.downcallHandle(
            "gst_uri_construct",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_from_string = Interop.downcallHandle(
            "gst_uri_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_from_string_escaped = Interop.downcallHandle(
            "gst_uri_from_string_escaped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_location = Interop.downcallHandle(
            "gst_uri_get_location",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_get_protocol = Interop.downcallHandle(
            "gst_uri_get_protocol",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_has_protocol = Interop.downcallHandle(
            "gst_uri_has_protocol",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_is_valid = Interop.downcallHandle(
            "gst_uri_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_join_strings = Interop.downcallHandle(
            "gst_uri_join_strings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_protocol_is_supported = Interop.downcallHandle(
            "gst_uri_protocol_is_supported",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_uri_protocol_is_valid = Interop.downcallHandle(
            "gst_uri_protocol_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
