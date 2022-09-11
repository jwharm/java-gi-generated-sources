package org.gtk.gio;

/**
 * This function type is used by g_vfs_register_uri_scheme() to make it
 * possible for a client to associate an URI scheme to a different #GFile
 * implementation.
 * 
 * The client should return a reference to the new file that has been
 * created for @uri, or %NULL to continue with the default implementation.
 */
@FunctionalInterface
public interface VfsFileLookupFunc {
        File onVfsFileLookupFunc(Vfs vfs, java.lang.String identifier);
}
