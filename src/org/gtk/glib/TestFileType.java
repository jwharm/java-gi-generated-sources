package org.gtk.glib;

/**
 * The type of file to return the filename for, when used with
 * g_test_build_filename().
 * <p>
 * These two options correspond rather directly to the &#39;dist&#39; and
 * &#39;built&#39; terminology that automake uses and are explicitly used to
 * distinguish between the &#39;srcdir&#39; and &#39;builddir&#39; being separate.  All
 * files in your project should either be dist (in the<code>EXTRA_DIST</code> or <code>dist_schema_DATA</code>
 * sense, in which case they will always be in the srcdir) or built (in
 * the <code>BUILT_SOURCES</code> sense, in which case they will
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
