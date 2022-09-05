package org.gtk.glib;

/**
 * The type of file to return the filename for, when used with
 * g_test_build_filename().
 * 
 * These two options correspond rather directly to the 'dist' and
 * 'built' terminology that automake uses and are explicitly used to
 * distinguish between the 'srcdir' and 'builddir' being separate.  All
 * files in your project should either be dist (in the
 * `EXTRA_DIST` or `dist_schema_DATA`
 * sense, in which case they will always be in the srcdir) or built (in
 * the `BUILT_SOURCES` sense, in which case they will
 * always be in the builddir).
 * 
 * Note: as a general rule of automake, files that are generated only as
 * part of the build-from-git process (but then are distributed with the
 * tarball) always go in srcdir (even if doing a srcdir != builddir
 * build from git) and are considered as distributed files.
 */
public enum TestFileType {

    /**
     * a file that was included in the distribution tarball
     */
    DIST,
    
    /**
     * a file that was built on the compiling machine
     */
    BUILT;
    
    public static TestFileType fromValue(int value) {
        return switch(value) {
            case 0 -> DIST;
            case 1 -> BUILT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DIST -> 0;
            case BUILT -> 1;
        };
    }

}
